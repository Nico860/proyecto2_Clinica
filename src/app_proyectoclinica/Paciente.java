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
    
    //Inicializar una lista de tipo atención
    private ArrayList<Atencion> atenciones;
    
    //Llamar al constructor de la clase padre persona
    public Paciente(String codigo, String nombre, String dpi, String telefono){
        super(codigo, nombre, dpi, telefono);
        this.atenciones = new ArrayList<>();
    }
    //métodos para el registro de historial de atenciones
    public ArrayList<Atencion> getAtenciones(){
        return atenciones;
    }
    
    //método para añadir un paciente
    public void agregarAtencion(Atencion atencion){
        this.atenciones.add(atencion);
    }
    
    //MétodO para calcular los costos totales por antención
    public double calcularCostoTotalAtenciones(){
        //Acumulador 
        double total = 0.0;
        for(Atencion a : atenciones){
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
