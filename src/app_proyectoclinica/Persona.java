/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_proyectoclinica;

/**
 *
 * @author tzulmoran
 */
import java.io.Serializable;

public abstract class Persona implements Serializable {
    //Seriazliación de los objetos 
    private static final long serialVersionUID = 1L;
    
    //Atributos private para su acceso solo en la clase padre
    private String codigo;
    private String nombre;
    private String dpi;
    private String telefono;
    
    //Incialización del constructor
    public Persona(String codigo, String nombre, String dpi, String telefono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.dpi = dpi;
        this.telefono = telefono;
    }
    
    //GETTERS Y SETTERS 
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){ 
        this.codigo = codigo; 
    }
    
    public String getNombre(){ 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }
    
    public String getDpi(){ 
        return dpi; 
    }
    public void setDpi(String dpi) { 
        this.dpi = dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //métodos de validación y busqueda 
    public boolean esCodigo(String codigoBusqueda){
        return this.codigo != null && this.codigo.equalsIgnoreCase(codigoBusqueda);
    }
    
    public boolean coincidenciaCodigo(String codigoBusqueda){
        return this.codigo != null && this.codigo.toLowerCase().contains(codigoBusqueda.toLowerCase());
    }
    
    //Método para mostrar el formato
    public String getInformacionCompleta(){
        return codigo + " - " + nombre + "(DPI: " + dpi + " )";
    }
    
    //Método base para guardar en el archivo de texto
    public String lineaArchivo(){
        return codigo + "|" + nombre + "|" + dpi + "|" + telefono;
    }
    
    //Sobreescritura del método 
    @Override 
    public String toString(){
        return getInformacionCompleta();
    }
}
