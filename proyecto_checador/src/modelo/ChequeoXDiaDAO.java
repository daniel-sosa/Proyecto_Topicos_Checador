/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import conexionBD.DbConnection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ChequeoXDiaDAO {
     public void registrarChequeoXDia(ChequeoXDiaVO h) 
 {
  DbConnection conex= new DbConnection();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   int codigo= Integer.parseInt(h.getCodigoEmpleado());
   String descri;
   descri= h.getDescripcion();
   Date d= h.getFechaLab();
  
   estatuto.executeUpdate("INSERT INTO departamento (CodigoEmpleado,FechaLab, Descripcion  )"
                        + "VALUES ("+codigo+",'"+ "d"+"','"+descri+ "')");
   
   
   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   estatuto.close();
   conex.desconectar();
    
  } catch (SQLException e) {
            System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "No se Registro la persona");
  }
 }

    public ArrayList <ChequeoXDiaVO> ConsultaChequeoXDia(String Codigo){
        ArrayList <ChequeoXDiaVO> arDepar= new ArrayList<ChequeoXDiaVO>();
        DbConnection conex= new DbConnection();
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM ChequeoXdia WHERE CodigoEmpleado ="+Codigo+";");
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 ChequeoXDiaVO aux= new ChequeoXDiaVO();
                 aux.setCodigoEmpleado(res.getNString("id_Departamento"));
                 aux.setFechaLab(res.getDate("FechaLab"));
                 aux.setDescripcion(res.getNString("Descripcion"));
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
   public ArrayList <ChequeoXDiaVO> listarChequeoXDia(){
        ArrayList <ChequeoXDiaVO> arDepar= new ArrayList<ChequeoXDiaVO>();
        DbConnection conex= new DbConnection();
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM ChequeoXdia ;");
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 ChequeoXDiaVO aux= new ChequeoXDiaVO();
                 aux.setCodigoEmpleado(res.getNString("id_Departamento"));
                 aux.setFechaLab(res.getDate("FechaLab"));
                 aux.setDescripcion(res.getNString("Descripcion"));
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
   //---------------------------------------------------------------------------------------------------------------------
   public ChequeoXDiaVO consultaXcodigoEmpleado(String consultar, int codigo){
       ChequeoXDiaVO arDepar= new ChequeoXDiaVO();
        DbConnection conex= new DbConnection();
        String c= "SELECT * FROM (*****) " +
                  "AS aux"+
                  "WHERE aux.codigoempleado = +++++;";
        System.out.println( c.replace("*****",consultar).replace("+++++",codigo+";"));

        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement(c.replace("*****",consultar).replace("+++++",codigo+";"));
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 ChequeoXDiaVO aux= new ChequeoXDiaVO();
                 aux.setCodigoEmpleado(res.getString("id_Departamento"));
                 aux.setNombre(res.getString("nombre")+" "+res.getString("apellidopaterno")+" "+res.getString("apellidomaterno"));
                 aux.setFechaLab(res.getDate("FechaLab"));
                 aux.setDescripcion(res.getNString("Descripcion"));
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
   //---------------------------------------------------------------------------------------------------------------------
   public ChequeoXDiaVO consultaXcodigoEmpleado(String consultar){
       ChequeoXDiaVO arDepar= new ChequeoXDiaVO();
        DbConnection conex= new DbConnection();
        
        
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement(consultar);
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 ChequeoXDiaVO aux= new ChequeoXDiaVO();
                 aux.setCodigoEmpleado(res.getString("id_Departamento"));
                 aux.setNombre(res.getString("nombre")+" "+res.getString("apellidopaterno")+" "+res.getString("apellidomaterno"));
                 aux.setFechaLab(res.getDate("FechaLab"));
                 aux.setDescripcion(res.getNString("Descripcion"));
                 arDepar=aux;
             }
             res.close();
             consulta.close();
             conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e.toString());
        }
    return arDepar;  
   }
   
   public ArrayList <ChequeoXDiaVO> control_de_F_A_R_xEmpleadoCod(String codigo,String op){
        ArrayList <ChequeoXDiaVO> arDepar= new ArrayList<ChequeoXDiaVO>();
        DbConnection conex= new DbConnection();
        String consultar=" SELECT codigoempleado,nombre,apellidopaterno,apellidomaterno,descripcion,fechalab "+
                        " FROM( "+
                        " SELECT codigoempleado,nombre,apellidopaterno,apellidomaterno,descripcion,fechalab "+
                        " FROM  empleado.chequeoxdia natural join empleado.empleado "+
                        " WHERE  descripcion LIKE '%++++%') AS aux "+
                        " WHERE aux.codigoempleado =****; ";
        consultar= consultar.replace("++++", op).replace("****", codigo);
        System.out.println(consultar);
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement(consultar);
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 ChequeoXDiaVO aux= new ChequeoXDiaVO();
                 aux.setCodigoEmpleado(res.getString("codigoempleado"));
                 aux.setNombre(res.getString("nombre")+" "+res.getString("apellidopaterno")+" "+res.getString("apellidomaterno"));
                 aux.setFechaLab(res.getDate("FechaLab"));
                 aux.setDescripcion(res.getString("Descripcion"));
                 arDepar.add(aux);
             }
             res.close();
             consulta.close();
             conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e.toString());
        }
    return arDepar;  
   
   
   
   }
   public ArrayList <ChequeoXDiaVO> control_de_F_A_R_xEmpleadoNom(String codigo,String op){
        ArrayList <ChequeoXDiaVO> arDepar= new ArrayList<ChequeoXDiaVO>();
        DbConnection conex= new DbConnection();
        String consultar=" SELECT codigoempleado,nombre,apellidopaterno,apellidomaterno,descripcion,fechalab "+
                        " FROM( "+
                        " SELECT codigoempleado,nombre,apellidopaterno,apellidomaterno,descripcion,fechalab "+
                        " FROM  empleado.chequeoxdia natural join empleado.empleado "+
                        " WHERE  descripcion LIKE '%++++%') AS aux "+
                        " WHERE aux.nombre ILIKE  '%****%'"+
                        " ORDER BY aux.nombre; ";
        consultar= consultar.replace("++++", op).replace("****", codigo);
        System.out.println(consultar);
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement(consultar);
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 ChequeoXDiaVO aux= new ChequeoXDiaVO();
                 aux.setCodigoEmpleado(res.getString("codigoempleado"));
                 aux.setNombre(res.getString("nombre")+" "+res.getString("apellidopaterno")+" "+res.getString("apellidomaterno"));
                 aux.setFechaLab(res.getDate("FechaLab"));
                 aux.setDescripcion(res.getString("Descripcion"));
                 arDepar.add(aux);
             }
             res.close();
             consulta.close();
             conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e.toString());
        }
    return arDepar;  
   
   
   
   }
   
   public ArrayList <ChequeoXDiaVO> control_F_R_A_deTodosLosEmpleados(String op){//-------------contrato 
        ArrayList <ChequeoXDiaVO> arDepar= new ArrayList<ChequeoXDiaVO>();
        DbConnection conex= new DbConnection();
        String contrato="activo";
        String consultar=" SELECT codigoempleado,nombre,apellidopaterno,apellidomaterno,****"+
                         " FROM ("+
                         " SELECT codigoempleado,COUNT('****')AS ****"+
                         " FROM  empleado.chequeoxdia natural join empleado.empleado"+
                         " WHERE  descripcion ILIKE '%****%'"+
                         " GROUP BY  codigoempleado)as aux NATURAL JOIN empleado.empleado"+
                         " WHERE contrato ILIKE '%$$$$%'"+
                         "ORDER BY codigoempleado;";
        consultar= consultar.replace("****", op).replace("$$$$", contrato);
        System.out.println(consultar);
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement(consultar);
             ResultSet res = consulta.executeQuery();
             while(res.next()){
                 ChequeoXDiaVO aux= new ChequeoXDiaVO();
                 aux.setCodigoEmpleado(res.getString("codigoempleado"));
                 aux.setNombre(res.getString("nombre")+" "+res.getString("apellidopaterno")+" "+res.getString("apellidomaterno"));
                 //aux.setCantidad(res.getString(op));
                 aux.setDescripcion(res.getString(op));
                 arDepar.add(aux);
             }
             res.close();
             consulta.close();
             conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e.toString());
        }
    return arDepar;  
   
   
   
   }

}
