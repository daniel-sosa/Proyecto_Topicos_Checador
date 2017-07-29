/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo
;

   
public class EmpleadoVO {
   private String CodigoEmpleado,
   id_Departamento,
   Nombre ,
   ApellidoPaterno ,
   ApellidoMaterno ,
   Sexo,
   Direccion ,
   NumTel ,
   NumEmergencia ,
   contrato ;

    @Override
    public String toString() {
        return CodigoEmpleado + "," + id_Departamento + "," + Nombre + "," + ApellidoPaterno + "," + ApellidoMaterno + "," + Sexo + "," + Direccion + "," + NumTel + "," + NumEmergencia + "," + contrato ;
    }

    public EmpleadoVO() {
    }

    public EmpleadoVO(String CodigoEmpleado, String id_Departamento, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Sexo, String Direccion, String NumTel, String NumEmergencia, String contrato) {
        this.CodigoEmpleado = CodigoEmpleado;
        this.id_Departamento = id_Departamento;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Sexo = Sexo;
        this.Direccion = Direccion;
        this.NumTel = NumTel;
        this.NumEmergencia = NumEmergencia;
        this.contrato = contrato;
    }

    public String getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public void setCodigoEmpleado(String CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public String getId_Departamento() {
        return id_Departamento;
    }

    public void setId_Departamento(String id_Departamento) {
        this.id_Departamento = id_Departamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNumTel() {
        return NumTel;
    }

    public void setNumTel(String NumTel) {
        this.NumTel = NumTel;
    }

    public String getNumEmergencia() {
        return NumEmergencia;
    }

    public void setNumEmergencia(String NumEmergencia) {
        this.NumEmergencia = NumEmergencia;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
   
}
