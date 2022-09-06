
package tarea3;

public class Productos {
    public static int consecutivo = 1;
    private int codigo;
    private String nombre;
    private float precio;
    private String unidad;
    private float existencias;
    
    public Productos(String nombre, float precio, String unidad, float existencias){
        this.nombre = nombre;
        this.precio = precio;
        this.unidad = unidad;
        this.existencias = existencias;
        codigo = consecutivo;
        consecutivo++;
    
    }
    public void retirarExistencias(float cantidad){
        existencias -= cantidad;
    }
    public void agregarExistencias(float cantidad){
        existencias += cantidad;
    }
    
    public float obtenerPrecio(){ 
        return precio;
    }
    
    public int obtenerCodigo(){
        return codigo;
    }
    
    
    
    
    public String toString(){
        String res;
        res = "........................................................\n";
        res += "Producto:" + nombre + "\n";
        res += "Precio: " + precio + "\n";
        res += "Unidad de medida: " + unidad + "\n";
        res += "Existencias: " + existencias + "\n";
        return res;
    }
}



