
package tarea3;

import java.util.ArrayList;
public class Cliente {
    public static int consecutivo= 1;
    private int numero;
    private String nombre;
    private String email;
    private ArrayList<OrdenCompra> ordenes;
    
    
    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
        numero = consecutivo;
        consecutivo++;
        ordenes = new ArrayList<OrdenCompra>();    
    }
    public int obtenerNumeroCliente(){                   // Función que regresa el numero o código de cliente.
        return numero;
    }
    
    public void agregarOrden(OrdenCompra orden){
         ordenes.add(orden);
    }
    
    public ArrayList<OrdenCompra> obtenerOrdenTodas(){
        return ordenes;
    }
    
    
    private ArrayList<OrdenCompra> obtenerOrdenesFiltradas( EstadoCompra estado){
        ArrayList<OrdenCompra> ordenesFiltradas = new ArrayList();
        for(OrdenCompra orden : ordenes){
            if(orden.obtenerEstado() == EstadoCompra.FILTRADA){
                ordenesFiltradas.add(orden);
            }
        }
        return ordenesFiltradas;
    }
   
    public ArrayList<OrdenCompra> obtenerOrdenesIniciadas(){
        ArrayList<OrdenCompra> ordenesIniciadas = new ArrayList();
        for(OrdenCompra orden : ordenes){
            if(orden.obtenerEstado() == EstadoCompra.INICIADA){
                ordenesIniciadas.add(orden);  
            }
        }
        return ordenesIniciadas;
    }
    
    
    public ArrayList<OrdenCompra> obtenerOrdenesPendientes(){
        ArrayList<OrdenCompra> ordenesPendientes = new ArrayList();
        for(OrdenCompra orden : ordenes){
            if(orden.obtenerEstado() == EstadoCompra.PAGO_PENDIENTE){
                ordenesPendientes.add(orden);
                
            }
        }
        return ordenesPendientes;
    }
    
    public ArrayList<OrdenCompra> obtenerOrdenesCompletadas(){
        ArrayList<OrdenCompra> ordenesCompletadas = new ArrayList();
         for (OrdenCompra orden : ordenes) {
            if(orden.obtenerEstado() == EstadoCompra.COMPLETADA){
                ordenesCompletadas.add(orden);  
            }
         } 
         return ordenesCompletadas;
    }
    
    public String toString(){
        String res = "..........................................\n";
        res += "Nombre:" + nombre + "\n";
        res += "Email: " + email + "\n";
        return res;
    }
}
