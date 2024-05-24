/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author matia
 */
public class Obra {
    
    //Capas hay una forma de reducir el tamaño de los private?
    
    private Propietario propietario;
    private Capataz capataz;
    private Rubro rubro;
    private int permiso;
    private String direccion;
    private int mes;
    private int año;
    private int montoEstimado;
    
    public Obra(Propietario unPropietario,Capataz unCapataz,Rubro unRubro,int unPermiso,String unaDireccion,int unAño,int unMes){
        
        propietario = unPropietario;
        capataz = unCapataz;
        rubro = unRubro;
        setPermiso(unPermiso);
        setDireccion(unaDireccion);
        setAño(unAño);
        setMes(unMes);
        montoEstimado = 0;
    }
        
    public void setPermiso(int unPermiso){
        permiso = unPermiso;
    }
    
    public int getPermiso(){
        return permiso;
    }
    
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setMes(int unMes){
        mes = unMes;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setAño(int unAño){
        año = unAño;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setMontoEstimado(int unMonto){
        montoEstimado += unMonto;
    }
    public int getMontoEstimado(){
        return montoEstimado;
    }
    
    
    
}
