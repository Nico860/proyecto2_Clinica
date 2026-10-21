/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_proyectoclinica;

import java.util.ArrayList;

/**
 *
 * @author CHAPTOPS TACTIC
 */
public class HistorialAtenciones {
    //se definen los atributos
    private ArrayList<Atencion> atenciones = new ArrayList<>();
    
    //metodos
    
    //método para añadir una atención
    public void agregarAtencion(Atencion atencion){
        this.atenciones.add(atencion);
    }
    
    //métodos para el registro de historial de atenciones
    public ArrayList<Atencion> getAtenciones(){
        return atenciones;
    }
}
