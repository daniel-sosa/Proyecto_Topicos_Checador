/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ChequeoXDiaVO {
    private String CodigoEmpleado,nombre,Descripcion,cantidad;
    private int num;
    private Date FechaLab ;

    public ChequeoXDiaVO() {
    }

   

    

    @Override
    public String toString() {
       // Codigo,Nombre,descripcion,fecha laboral
        return  CodigoEmpleado + "," + nombre + "," + Descripcion+ "," + FechaLab;
    }
    public String tostring() {
       // Codigo,Nombre,descripcion,fecha laboral
        return  CodigoEmpleado + "," + nombre + ","+ Descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public ChequeoXDiaVO(String CodigoEmpleado, String Descripcion, Date FechaLab) {
        this.CodigoEmpleado = CodigoEmpleado;
        this.Descripcion = Descripcion;
        this.FechaLab = FechaLab;
    }

    public void setCodigoEmpleado(String CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaLab() {
        return FechaLab;
    }

    public void setFechaLab(Date FechaLab) {
        this.FechaLab = FechaLab;
    }

    void setCantidad(String cantidad) {
       this.cantidad =cantidad+"";
        }
    public String getCantidad() {
        return cantidad;
    }
   
}
