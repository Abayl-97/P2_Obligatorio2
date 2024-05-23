package Dominio;

public class Rubro {
    private String nombre;
    private String descripcion;
    
    public Rubro(String unNombre, String unaDescripcion) {
        this.setNombre(unNombre);
        this.setDescripcion(unaDescripcion);
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
        
    }
    
    public void setDescripcion(String unaDescripcion) { 
        descripcion = unaDescripcion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public String toString(){
        return nombre + ":" + descripcion;
    }
            
    
    
}
