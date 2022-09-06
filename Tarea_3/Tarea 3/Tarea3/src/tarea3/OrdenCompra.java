
package tarea3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrdenCompra {
    public static int consecutivo = 1;
    public float IV = 0.13f;
    private int numero;      // ¿<<Property>> indica en Diagrama UML indica actor o comunicación?
    private LocalDateTime fechaHora;
    private Cliente cliente;
    protected EstadoCompra estado;
    private ArrayList<LineaOrdenCompra> lineas;
    
    
    public OrdenCompra(Cliente cliente){
        this.cliente = cliente;
        this.numero = consecutivo;
        consecutivo++;
        fechaHora = LocalDateTime.now();
        lineas = new ArrayList<LineaOrdenCompra>();
        estado = EstadoCompra.INICIADA;
        
        
    }
    public ArrayList<LineaOrdenCompra> obtenerLineas(){
        return lineas;
    }
    
    public void agregarLinea(float cantidad, Productos producto){
        lineas.add( new LineaOrdenCompra(cantidad,producto));
    }
    
    public int obtenerNumeroOrdenCompra(){
        return numero;
    }
    public float calcularCosto(){
        float res = 0;
        for(int i = 0; i <= lineas.size();i++){
        res += lineas.get(i).calcularCosto();
        }
        return res;
    }
    public float calcularImpuesto(){
        float res = 0;
        for(int i = 0; i <= lineas.size();i++){
        res += lineas.get(i).calcularCosto() * IV;
        }
        return res;
    }
    
    public EstadoCompra obtenerEstado(){     
        return estado;
    }
    
        
    public float calcularTotal(){
        return calcularCosto()+ calcularImpuesto();
    }
    public String toString(){
        String res = ".............................................................\n";
        
        res +=  "Número de Orden: " + numero +"\n";
        res +=  "Fecha y Hora: " + fechaHora + "\n";
        res +=  "Cliente:" + cliente + "\n";
        res +=  "Estado de la Compra: " + estado + "\n";
        return res;
    }      

    public Object get(int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

