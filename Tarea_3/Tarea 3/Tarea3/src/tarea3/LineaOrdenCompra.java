
package tarea3;


public class LineaOrdenCompra {
    private float cantidad;
    private Productos producto;
    
    public LineaOrdenCompra(float cantidad, Productos producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }
    public float obtenerCantidad(){
        return cantidad;
    }
    
    public float calcularCosto(){
        float costo = producto.obtenerPrecio() * cantidad;
        return costo;
    }
    public String toString(){
        String res = "...........................................................................\n";
        res += "Producto: " + producto + "Cantidad: " + cantidad + "\n"+ "Costo: " + calcularCosto();
        return res;
    }
}
