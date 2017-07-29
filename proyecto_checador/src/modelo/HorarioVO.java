/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.sql.*;
import org.joda.time.LocalTime;
public class HorarioVO {
    private String CodigoEmpleado;
    private Time HELunes, HSLunes , 
  HEMartes ,  HSMartes,
  HEMiercoles , HSMiercoles,  
  HEJueves ,  HSJueves,
  HEViernes ,HSViernes ;
;
    
    public HorarioVO(String CodigoEmpleado, Time HELunes, Time HEMartes, Time HEMiercoles, Time HEJueves, Time HEViernes) {
        this.CodigoEmpleado = CodigoEmpleado;
        this.HELunes = HELunes;
        this.HEMartes = HEMartes;
        this.HEMiercoles = HEMiercoles;
        this.HEJueves = HEJueves;
        this.HEViernes = HEViernes;
    }
    public String getHorasDeSalida(){
        String aux=null;
        try {
            HSLunes= sumHora(HELunes,8);
        HSMartes= sumHora(HEMartes,8);
        HSMiercoles= sumHora(HEMiercoles,8);
        HSJueves= sumHora(HEJueves,8);
        HSViernes= sumHora(HEViernes,8);        
        aux=HSLunes + "," + HSMartes + "," + HSMiercoles + "," + HSJueves + "," + HSViernes ;

        } catch (Exception e) {
            
        }
        
       return  aux;
    
    
    }
    
    public Time sumHora(Time hora,int nh){
        //System.out.println(hora);
        String [] a= hora.toString().split(":");
        
        //System.out.println(a[0]+" "+a[1]);
        LocalTime lt = new LocalTime(Integer.parseInt(a[0]),Integer.parseInt(a[1]),00, 678);
        lt=lt.plusHours(nh);
        long millis = lt.toDateTimeToday().withDate(1970, 1, 1).getMillis();
        java.sql.Time time = new java.sql.Time(millis);
        
        return time;
    }
    @Override
    public String toString() {
        return  CodigoEmpleado+ ","+ HELunes + "," + HEMartes + "," + HEMiercoles + "," + HEJueves + "," + HEViernes ;
    }

    public HorarioVO() {
        
        
    }

    public String getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public void setCodigoEmpleado(String CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public Time getHELunes() {
        return HELunes;
    }

    public void setHELunes(Time HELunes) {
        this.HELunes = HELunes;
    }

    public Time getHEMartes() {
        return HEMartes;
    }

    public void setHEMartes(Time HEMartes) {
        this.HEMartes = HEMartes;
    }

    public Time getHEMiercoles() {
        return HEMiercoles;
    }

    public void setHEMiercoles(Time HEMiercoles) {
        this.HEMiercoles = HEMiercoles;
    }

    public Time getHEJueves() {
        return HEJueves;
    }

    public void setHEJueves(Time HEJueves) {
        this.HEJueves = HEJueves;
    }

    public Time getHEViernes() {
        return HEViernes;
    }

    public void setHEViernes(Time HEViernes) {
        this.HEViernes = HEViernes;
    }
    
    public  Object[][] formato_dia_Hentrada_Hsalida(){
        String [] dia="Lunes,Martes,Miercoles,Jueves,Viernes".split(",");
        Object [][] aux= new Object[dia.length][];        
        String []he=toString().split(",");
        String []hs= getHorasDeSalida().split(",");
        
        for (int i = 0; i <dia.length; i++) 
            aux[i]= (dia[i]+","+he[i+1]+","+hs[i]).split(",");
            
      return aux; 
    
    }

    
    
            

}
