/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_proyectoclinica;

import javax.print.attribute.standard.Media;

/**
 *
 * @author CHAPTOPS TACTIC
 */
public class Cita {
    //atributos
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String motivo;
    private String estado;
    private String hora;
    
    //constructor

    public Cita(Paciente paciente, Medico medico, String fecha, String motivo, String estado, String hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.motivo = motivo;
        this.estado = estado;
        this.hora = hora;
    }
    
    //metodos
    public boolean esEstado(String estado){
        //devuelve true si el estado es el mismo
        if(this.estado != estado)
            return false;
        
        return true;
    }
    
    public boolean esFecha(String fecha){
        //devuelve true si la fecha es la misma
        if(this.fecha != fecha)
            return false;
        
        return true;
    }
    
    public boolean esMedico(Medico medico){
        //devuelve true si es el mismo  medico
        if(!this.medico.esCodigo(medico.getCodigo()))
            return false;
        
        return true;
    }
    
    public boolean esPaciente(Paciente paciente){
        //devuelve true si es el paciente
        if(!this.paciente.esCodigo(paciente.getCodigo()))
            return false;
        
        return true;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getEstado() {
        return estado;
    }

    public String getHora() {
        return hora;
    }
    
    
}
