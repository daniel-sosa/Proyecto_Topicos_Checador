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
 
 
/**
 * Clase que permite el acceso a la base de datos
 * @author chenao
 *
 */
public class EmpleadoDAO 
{
 Object [][] datos;

    public Object[][] getDatos() {
        return datos;
    }
 
 public void registrarEmpleado(EmpleadoVO persona) 
 {
  DbConnection conex= new DbConnection();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("INSERT INTO empleado.empleado (codigoempleado ,id_departamento,Nombre,ApellidoPaterno,ApellidoMaterno,Sexo,Direccion,NumTel,NumEmergencia,contrato)"
           + " VALUES ('"+Integer.parseInt(persona.getCodigoEmpleado())+"', '"
     +Integer.parseInt(persona.getId_Departamento())+"', '"+persona.getNombre()+"', '"+persona.getApellidoPaterno()+"', '"
     +persona.getApellidoMaterno()+"', '"+persona.getSexo()+"', '"
     +persona.getDireccion()+"', '"+persona.getNumTel()+"', '"+persona.getNumEmergencia()+"','"+persona.getContrato()+"');");
   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   estatuto.close();
   conex.desconectar();
    
  } catch (SQLException e) {
           
   JOptionPane.showMessageDialog(null, "No se Registro la persona"+e.getMessage());
  }
 }
 //-------------------------------------------------------------------------------------------------------------------
 public void actualizarEmpleado(EmpleadoVO personaAct, EmpleadoVO personaNoAct) 
 {
  DbConnection conex= new DbConnection();
  String [] pa= personaAct.toString().split(",");
  String [] pna= personaNoAct.toString().split(",");
  String [] regi= "codigoempleado,id_departamento,nombre,apellidopaterno,apellidomaterno,sexo,direccion,numTel,numEmergencia,contrato".split(",");
  
  String update= "UPDATE empleado.empleado SET nomRe** = 'act**'  WHERE codigoempleado = act1**; ";
  
  try {
   Statement estatuto = conex.getConnection().createStatement();
      for (int i = 1; i < pa.length; i++) {  
          System.out.println(update.replace("nomRe**", regi[i]).replace("act**", pa[i]).replace("act1**", pna[0]));
          estatuto.executeUpdate(update.replace("nomRe**", regi[i]).replace("act**", pa[i]).replace("act1**", pna[0]));
      }
  
   
   JOptionPane.showMessageDialog(null, "Se ha actualizado  Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   estatuto.close();
   conex.desconectar();
    
  } catch (SQLException e) {
           
   JOptionPane.showMessageDialog(null, "No se ......Registro la persona"+e.getMessage());
  }
 }
 //-------------------------------------------------------------------------------------------------------------------
    

public EmpleadoVO consultarEmpleado(int documento) {
  EmpleadoVO miEmpleado = new EmpleadoVO();
  DbConnection conex= new DbConnection();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empleado.empleado WHERE empleado.CodigoEmpleado= ?;" );
   consulta.setInt(1, documento);
   ResultSet res = consulta.executeQuery();
   
  if(res.next()){
    EmpleadoVO persona= new EmpleadoVO ();
    persona.setCodigoEmpleado(res.getString("CodigoEmpleado"));
    persona.setId_Departamento(res.getString("id_departamento")); 
    persona.setNombre(res.getString("Nombre"));
    persona.setApellidoPaterno(res.getString("ApellidoPaterno"));
    persona.setApellidoMaterno(res.getString("ApellidoMaterno"));
    persona.setSexo(res.getString("Sexo"));
    persona.setDireccion(res.getString("Direccion"));
    persona.setNumTel(res.getString("NumTel"));
    persona.setNumEmergencia(res.getString("NumEmergencia"));
    persona.setContrato(res.getString("contrato"));
    
//    datos[0][1]= res.getString("CodigoEmpleado");
//    datos[0][2]=res.getString("id_Departamento");
//    datos[0][3]=res.getString("Nombre");
//    datos[0][4]=res.getString("ApellidoPaterno");
//    datos[0][5]=res.getString("ApellidoMaterno");
//    datos[0][6]=res.getString("Sexo");
//    datos[0][7]=res.getString("Direccion");
//    datos[0][8]=res.getString("NumTel");
//    datos[0][9]=res.getString("NumEmergencia");
    
    miEmpleado=persona;
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar sobre el empleado\n"+e);
  }
  return miEmpleado;
 }
 
/**
 * permite consultar la lista de empleados
 * @return
 */
public ArrayList< EmpleadoVO> listaDeEmpleadoDesActivos() {
    
  EmpleadoVO miEmpleado = new EmpleadoVO();
  DbConnection conex= new DbConnection();
  ArrayList<EmpleadoVO> arEmpleado= new ArrayList<EmpleadoVO>(); 
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empleado.empleado WHERE contrato LIKE '%no activo%' ORDER BY codigoempleado;" );
   //consulta.setString(1, documento);
   ResultSet res = consulta.executeQuery();
   
  while(res.next()){
    EmpleadoVO persona= new EmpleadoVO ();
    persona.setCodigoEmpleado(res.getString("CodigoEmpleado"));
    persona.setId_Departamento(res.getString("id_departamento")); 
    persona.setNombre(res.getString("Nombre"));
    persona.setApellidoPaterno(res.getString("ApellidoPaterno"));
    persona.setApellidoMaterno(res.getString("ApellidoMaterno"));
    persona.setSexo(res.getString("Sexo"));
    persona.setDireccion(res.getString("Direccion"));
    persona.setNumTel(res.getString("NumTel"));
    persona.setNumEmergencia(res.getString("NumEmergencia"));
    persona.setContrato(res.getString("contrato"));
    

    
    arEmpleado.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar sobre el empleado\n"+e);
  }
  return arEmpleado;
 }
public ArrayList< EmpleadoVO> listaDeEmpleadosActivos() {
    
  EmpleadoVO miEmpleado = new EmpleadoVO();
  DbConnection conex= new DbConnection();
  ArrayList<EmpleadoVO> arEmpleado= new ArrayList<EmpleadoVO>(); 
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empleado.empleado WHERE contrato LIKE '%Activo%' ORDER BY codigoempleado;" );
   //consulta.setString(1, documento);
   ResultSet res = consulta.executeQuery();
   
  while(res.next()){
    EmpleadoVO persona= new EmpleadoVO ();
    persona.setCodigoEmpleado(res.getString("CodigoEmpleado"));
    persona.setId_Departamento(res.getString("id_departamento")); 
    persona.setNombre(res.getString("Nombre"));
    persona.setApellidoPaterno(res.getString("ApellidoPaterno"));
    persona.setApellidoMaterno(res.getString("ApellidoMaterno"));
    persona.setSexo(res.getString("Sexo"));
    persona.setDireccion(res.getString("Direccion"));
    persona.setNumTel(res.getString("NumTel"));
    persona.setNumEmergencia(res.getString("NumEmergencia"));
    persona.setContrato(res.getString("contrato"));
    

    
    arEmpleado.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar sobre el empleado\n"+e);
  }
  return arEmpleado;
 }
public ArrayList< EmpleadoVO> listaDeEmpleado() {
    
  EmpleadoVO miEmpleado = new EmpleadoVO();
  DbConnection conex= new DbConnection();
  ArrayList<EmpleadoVO> arEmpleado= new ArrayList<EmpleadoVO>(); 
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empleado.empleado ORDER BY codigoempleado;" );
   //consulta.setString(1, documento);
   ResultSet res = consulta.executeQuery();
   
  while(res.next()){
    EmpleadoVO persona= new EmpleadoVO ();
    persona.setCodigoEmpleado(res.getString("CodigoEmpleado"));
    persona.setId_Departamento(res.getString("id_departamento")); 
    persona.setNombre(res.getString("Nombre"));
    persona.setApellidoPaterno(res.getString("ApellidoPaterno"));
    persona.setApellidoMaterno(res.getString("ApellidoMaterno"));
    persona.setSexo(res.getString("Sexo"));
    persona.setDireccion(res.getString("Direccion"));
    persona.setNumTel(res.getString("NumTel"));
    persona.setNumEmergencia(res.getString("NumEmergencia"));
    persona.setContrato(res.getString("contrato"));
    

    
    arEmpleado.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar sobre el empleado\n"+e);
  }
  return arEmpleado;
 }

public ArrayList<EmpleadoVO> consultarEmpleado(String nombre) {
  EmpleadoVO miEmpleado = new EmpleadoVO();
  DbConnection conex= new DbConnection();
  ArrayList<EmpleadoVO> arEmpleado= new ArrayList<EmpleadoVO>(); 
  try {
         //PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM empleado.empleado WHERE empleado.nombre ILIKE '%"+nombre+"%';" );

   PreparedStatement consulta = conex.getConnection().prepareStatement("select * FROM empleado.empleado AS e WHERE e.nombre ILIKE '%"+nombre+"%';" );
   //consulta.setString(1, documento);
   ResultSet res = consulta.executeQuery();
   
  while(res.next()){
    EmpleadoVO persona= new EmpleadoVO ();
    persona.setCodigoEmpleado(res.getString("CodigoEmpleado"));
    persona.setId_Departamento(res.getString("id_departamento")); 
    persona.setNombre(res.getString("Nombre"));
    persona.setApellidoPaterno(res.getString("ApellidoPaterno"));
    persona.setApellidoMaterno(res.getString("ApellidoMaterno"));
    persona.setSexo(res.getString("Sexo"));
    persona.setDireccion(res.getString("Direccion"));
    persona.setNumTel(res.getString("NumTel"));
    persona.setNumEmergencia(res.getString("NumEmergencia"));
    persona.setContrato(res.getString("contrato"));
    
//    datos[0][1]= res.getString("CodigoEmpleado");
//    datos[0][2]=res.getString("id_Departamento");
//    datos[0][3]=res.getString("Nombre");
//    datos[0][4]=res.getString("ApellidoPaterno");
//    datos[0][5]=res.getString("ApellidoMaterno");
//    datos[0][6]=res.getString("Sexo");
//    datos[0][7]=res.getString("Direccion");
//    datos[0][8]=res.getString("NumTel");
//    datos[0][9]=res.getString("NumEmergencia");
    
    arEmpleado.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar sobre el empleado\n"+e);
  }
  return arEmpleado;
 }

    public int dameCodigoMayor() {
     int may=0;
     DbConnection conex= new DbConnection();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("select max(codigoempleado) as max from empleado.empleado;" );
   //consulta.setInt(1, documento);
   ResultSet res = consulta.executeQuery();
   while(res.next())
    may=res.getInt("max");
  
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar sobre el empleado\n"+e);
  }
  return may;
        
        
    }


}
