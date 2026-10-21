/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_proyectoclinica;
import java.util.ArrayList;



/**
 *
 * @author tzulmoran
 */
//Clase hija extendida de persona
public class Paciente extends Persona{
    private static final long serialVersionUID = 1L;
    
    //Inicializar de un objeto para el registro de atenciones
    private HistorialAtenciones historialAtenciones = new HistorialAtenciones();
    
    //Llamar al constructor de la clase padre persona
    public Paciente(String codigo, String nombre, String dpi, String telefono){
        super(codigo, nombre, dpi, telefono);
    }
    
    //Devuelve el historial de atenciones 
    public HistorialAtenciones getHistorialAtenciones(){
        return historialAtenciones;
    }
    
    //MétodO para calcular los costos totales por antención
    public double calcularCostoTotalAtenciones(){
        //Acumulador 
        double total = 0.0;
        for(Atencion a : historialAtenciones.getAtenciones()){
            total += a.getCosto();
        } return total;
    }
    
    //Sobreescritura de los metodos
    @Override
    public String getInformacionCompleta(){
        return "Paciente " + getCodigo() + " - " + getNombre() + " | Tel: " + getTelefono();
    }
    
    @Override
    public String lineaArchivo(){
        return ("P|" + super.lineaArchivo());
    }
}
