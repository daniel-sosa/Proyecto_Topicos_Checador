/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexionBD.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import modelo.ChequeoXDiaDAO;
import modelo.ChequeoXDiaVO;
import modelo.DepartamentoDAO;
import modelo.DepartamentoVO;
import modelo.*;
import org.joda.time.LocalTime;


/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
      
//        HorarioDAO hdao= new  HorarioDAO();
//        HorarioVO h= hdao.ConsultaHorarioXCodigo(1001+""),h1;
//        System.out.println(h.toString());
//        h.setHELunes(new java.sql.Time(555415));
//        
//        
//        h1=h;
//        System.out.println(h1.toString());
//        hdao.actualizarHorario(h1, h);
//        System.out.println(hdao.ConsultaHorarioXCodigo(1001+"").toString());
//        EmpleadoDAO edao= new EmpleadoDAO();
//        EmpleadoVO e=edao.consultarEmpleado(1003);
//        HorarioDAO hdao= new  HorarioDAO();
//        HorarioVO h= hdao.ConsultaHorarioXCodigo(1003+""),h1;
//        System.out.println(h.getHorasDeSalida());
        ChequeoXDiaDAO cdao= new  ChequeoXDiaDAO();
        ArrayList <ChequeoXDiaVO> c= cdao.control_de_F_A_R_xEmpleadoNom("1016","falta");
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).tostring());
        }
    
    
    }
    
}
