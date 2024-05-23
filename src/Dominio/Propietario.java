/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author matia
 */
public class Propietario {
    private String nombre;
    private String cedula;
    private int direccion;
    private int celular;
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCedula(String unaCedula){
        cedula = unaCedula;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public void setDireccion(int unaDireccion){
        direccion = unaDireccion;
    }
    
    public int getDireccion(){
        return direccion;
    }
    
    public void setCelular(int unCelular){
        celular = unCelular;
    }
    public int getCelular(){
        return celular;
    }

}
