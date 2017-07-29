/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import conexionBD.DbConnection;
import java.sql.Connection;
import java.sql.Time;


public class HorarioDAO {
    
    public void registrarHorario(HorarioVO h) 
 {
  DbConnection conex= new DbConnection();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   int codigo= Integer.parseInt(h.getCodigoEmpleado());
   Time []t={h.getHELunes(),h.getHEMartes(),h.getHEMiercoles(),h.getHEJueves(),h.getHEViernes()};
   String consulta="INSERT INTO empleado.horario (CodigoEmpleado,HELunes,HEMartes,HEMiercoles,HEJueves,HEViernes)"
                        + "VALUES ('"+codigo+"','"+ t[0]+ "','" + t[1] + "','" + t[2] + "','" + t[3] + "','" + t[4] + "');";
      System.out.println(consulta);
   estatuto.executeUpdate(consulta);
   
   
   //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   estatuto.close();
   conex.desconectar();
    
  } catch (SQLException e) {
            System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "No se Registro El horario ");
  }
 }
  //---------------------------------------------------------------------------------
    public void actualizarHorario(HorarioVO horarioAct, HorarioVO horarioNoAct) {
  DbConnection conex= new DbConnection();
  String [] pa= horarioAct.toString().split(",");
  String [] pna= horarioNoAct.toString().split(",");
  String [] regi= "codigoempleado,helunes,hemartes,hemiercoles,hejueves,heviernes".split(",");
  String update= "UPDATE empleado.horario SET nomRe** = 'act**'  WHERE codigoempleado = 'act1**'; ";
  
  try {
   Statement estatuto = conex.getConnection().createStatement();
      for (int i = 0; i < pa.length; i++) {  
          //System.out.println(update.replace("nomRe**", regi[i]).replace("act**", pa[i]).replace("act1**", pna[0]));
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
    public HorarioVO ConsultaHorarioXCodigo(String CodigoEmpleado){
        HorarioVO arhorario= new HorarioVO();
        DbConnection conex= new DbConnection();
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empleado.horario WHERE CodigoEmpleado ="+CodigoEmpleado+";");
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 HorarioVO aux= new HorarioVO();
                 aux.setCodigoEmpleado(res.getString("CodigoEmpleado"));
                 aux.setHELunes(res.getTime("HELunes"));
                 aux.setHEMartes(res.getTime("HEMartes"));
                 aux.setHEMiercoles(res.getTime("HEMiercoles"));
                 aux.setHEJueves(res.getTime("HEJueves"));
                 aux.setHEViernes(res.getTime("HEViernes"));
                 arhorario=aux;
             }
             res.close();
             consulta.close();
             conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar el horario\n"+e);
        }
    return arhorario;
    }
    public ArrayList <HorarioVO> listarHorarios(){
        ArrayList <HorarioVO> arhorario= new ArrayList<HorarioVO>();
        DbConnection conex= new DbConnection();
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM horario");
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 HorarioVO aux= new HorarioVO();
                 aux.setCodigoEmpleado(res.getNString("CodigoEmpleado"));
                 aux.setHELunes(res.getTime("HELunes"));
                 aux.setHEMartes(res.getTime("HEMartes"));
                 aux.setHEMiercoles(res.getTime("HEMiercoles"));
                 aux.setHEJueves(res.getTime("HEJueves"));
                 aux.setHEViernes(res.getTime("HEViernes"));
                 arhorario.add(aux);
             }
             res.close();
             consulta.close();
             conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
        }
    return arhorario;
    }
//------------------------------------------------------------------------------------------
    public void eliminarHorario(String codigo) { 
       DbConnection conex= new DbConnection();
       String elimina= "DELETE FROM empleado.horario WHERE codigoempleado = ' *** ';".replace("***",codigo);
       int a=5785785;
        try {
           Statement st= conex.getConnection().createStatement();
           
           a = st.executeUpdate(elimina);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          System.out.println(a+"");

    }
    //---------------------------------------------------------------------------------
}


