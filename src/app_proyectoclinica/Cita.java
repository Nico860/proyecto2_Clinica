/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_proyectoclinica;

import java.io.Serializable;

/**
 *
 * @author CHAPTOPS TACTIC
 */
public class Cita implements Serializable{
    private static final long serialVersionUID = 1L;
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
    
    //Compara el estado en la base de datos con el ingresado
    public boolean esEstado(String estado){
        //devuelve true si el estado es el mismo
        return this.estado.equalsIgnoreCase(estado);
    }
    
    //Compara que el atributo fecha no sea null y compara con una recibida por parámetro
    public boolean esFecha(String fecha){
        //devuelve true si la fecha es la misma
        return this.fecha != null && this.fecha.equalsIgnoreCase(fecha);
    }
    
    //Verifica que si la cita pertece a un médigo
    public boolean esMedico(Medico medico){
        //devuelve true si es el mismo  medico
        return this.medico != null && this.medico.esCodigo(medico.getCodigo());
    }
    
    //Verifica si la cita pertenece a un paciente
    public boolean esPaciente(Paciente paciente){
        //devuelve true si es el paciente
        return this.paciente != null && paciente != null && this.paciente.esCodigo(paciente.getCodigo());
    }
    
    //Actualiza el estado de una cita a un nuevo estado
    public boolean cambiarEstado(String estado) {
        //Validación ¿ Cancelado o atendido?
        if (this.estado != null && (this.estado.equalsIgnoreCase("cancelada") || this.estado.equalsIgnoreCase("atendida"))) {
            return false; //No se modifica la cita 
        }
        //Si no, se aplica el nuevo estado;
        this.estado = estado;
        return true; // Asegurar que se realizó con éxito;
    }
    
    //Getters
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
