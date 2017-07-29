/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DepartamentoVO {

    @Override
    public String toString() {
        return  id_Departamento + "," + Ubicacion + "," + NombreDepartamento ;
    }
    private String id_Departamento, Ubicacion, NombreDepartamento;

    public DepartamentoVO(String id_Departamento, String Ubicacion, String NombreDepartamento) {
        this.id_Departamento = id_Departamento;
        this.Ubicacion = Ubicacion;
        this.NombreDepartamento = NombreDepartamento;
    }

    public String getId_Departamento() {
        return id_Departamento;
    }

    public DepartamentoVO() {
    }

    public void setId_Departamento(String id_Departamento) {
        this.id_Departamento = id_Departamento;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombreDepartamento() {
        return NombreDepartamento;
    }

    public void setNombreDepartamento(String NombreDepartamento) {
        this.NombreDepartamento = NombreDepartamento;
    }




}