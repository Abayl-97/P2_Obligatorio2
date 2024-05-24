package Dominio;

public class Rubro {
    private String nombre;
    private String descripcion;
    private int monto;
    
    public Rubro(String unNombre, String unaDescripcion) {
        this.setNombre(unNombre);
        this.setDescripcion(unaDescripcion);
        monto = 0;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
        
    }
    
    public void setDescripcion(String unaDescripcion) { 
        descripcion = unaDescripcion;
    }
    public void setMonto(int unMonto){
        monto = unMonto;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public int getMonto(){
        return monto;
    }
    
    public String toString(){
        return nombre + ":" + descripcion;
    }
            
    
    
}
