/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import conexionBD.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DepartamentoDAO {

    
    //---------------------------------------------------------------------------------
    public void actualizarDepartamento(DepartamentoVO departamentoAct, DepartamentoVO departamentoNoAct) 
 {
  DbConnection conex= new DbConnection();
  String [] pa= departamentoAct.toString().split(",");
  String [] pna= departamentoNoAct.toString().split(",");
  String [] regi= "id_Departamento,Ubicacion,NombreDepartamento ".split(",");
  String update= "UPDATE empleado.departamento SET nomRe** = 'act**'  WHERE id_departamento = 'act1**'; ";
  
  try {
   Statement estatuto = conex.getConnection().createStatement();
      for (int i = 0; i < pa.length; i++) {  
          System.out.println(update.replace("nomRe**", regi[i]).replace("act**", pa[i]).replace("act1**", pna[0]));
          estatuto.executeUpdate(update.replace("nomRe**", regi[i]).replace("act**", pa[i]).replace("act1**", pna[0]));
      }
  
   
   JOptionPane.showMessageDialog(null, "Se ha actualizado  Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   estatuto.close();
   conex.desconectar();
    
  } catch (SQLException e) {
           
   JOptionPane.showMessageDialog(null, "No se Registro la persona"+e.getMessage());
  }
 }
    //---------------------------------------------------------------------------------
    public void registrarDepartamento(DepartamentoVO h) 
 {
  DbConnection conex= new DbConnection();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   int codigo= Integer.parseInt(h.getId_Departamento());
   String ubicacion,nombre;
   ubicacion= h.getUbicacion();
   nombre=h.getNombreDepartamento();
   estatuto.executeUpdate("INSERT INTO departamento (id_Departamento,Ubicacion ,NombreDepartamento )"
                        + "VALUES ("+codigo+",'"+ "nombre"+"','"+ubicacion+ "')");
   
   
   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   estatuto.close();
   conex.desconectar();
    
  } catch (SQLException e) {
            System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "No se Registro la persona");
  }
 }

    public DepartamentoVO ConsultaDepartamentoXCodigo(String Codigo){// aqui me quede 
      DepartamentoVO arDepar= new DepartamentoVO();
        DbConnection conex= new DbConnection();
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empleado.departamento WHERE id_Departamento ='"+Codigo+"';");
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 DepartamentoVO aux= new DepartamentoVO();
                 aux.setId_Departamento(res.getString("id_departamento"));
                 aux.setNombreDepartamento(res.getString("Nombredepartamento"));
                 aux.setUbicacion(res.getString("ubicacion"));
                 arDepar=aux;
             }
             res.close();
             consulta.close();
             conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
        }
    return arDepar;
    }
    public ArrayList <DepartamentoVO> ListarDepartamento(){
        ArrayList <DepartamentoVO> arDepar= new ArrayList<DepartamentoVO>();
        DbConnection conex= new DbConnection();
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empleado.departamento ORDER BY id_departamento ;");
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 DepartamentoVO aux= new DepartamentoVO();
                 aux.setId_Departamento(res.getString("id_Departamento"));
                 aux.setNombreDepartamento(res.getString("NombreDepartamento"));
                 aux.setUbicacion(res.getString("Ubicacion"));
                 arDepar.add(aux);
             }
             res.close();
             consulta.close();
             conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
        }
    return arDepar;
    }
}
