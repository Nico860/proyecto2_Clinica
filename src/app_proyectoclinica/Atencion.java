/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_proyectoclinica;

/**
 *
 * @author tzulmoran
 */
public class Atencion implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    //código del paciente al que pertenece la atención
    private String codigoPaciente;
    private String fecha;
    private String diagnostico;
    private double costo;
    
    public Atencion(String codigoPaciente, String fecha, String diagnostico, double costo){
        this.codigoPaciente = codigoPaciente;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.costo = costo;
    }

    public Atencion(String fecha, String diagnostico, double costo){
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.costo = costo;
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public double getCosto() {
        return costo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
