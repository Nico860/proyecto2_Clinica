/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_proyectoclinica;

/**
 *
 * @author CHAPTOPS TACTIC
 */
public class Medico extends Persona{
    
    private String especialidad;
    
    public Medico(String especialidad,String codigo, String nombre, String dpi, String telefono){
        super(codigo, nombre, dpi, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //Sobreescritura del método lineaArchivo
    @Override
    public String lineaArchivo(){
        return ("M|" + super.lineaArchivo() + "|" + especialidad);
    }
}