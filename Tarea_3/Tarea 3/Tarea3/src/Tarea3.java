/*
Estudiante: Ronaldo Vindas Barboza
Carné 2018238697
 */
import java.util.ArrayList;
import tarea3.Cliente;
import tarea3.OrdenCompra;
import tarea3.Productos;

package tarea3;
    

public class Tarea3 {
    private ArrayList<Cliente> clientes;
    private ArrayList<Productos> productos;
    private ArrayList<OrdenCompra> ordenes;
    
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Productos> productos = new ArrayList<Productos>();
        ArrayList<OrdenCompra> ordenes = new ArrayList<OrdenCompra>();
    
      Cliente cliente1 = new Cliente("Elsa Pato", "ElsaPato@El_TribilínPinpín.com");
      Cliente cliente2 = new Cliente("Anthony Edward Stark", "ImIronMan@StarkIndustries.com");
      Cliente cliente3 = new Cliente("Elmar Ciano", "Ovni@Area51.com");
      Cliente cliente4 = new Cliente("Robert E.O. SpeedWagon", "Robert@SpeedWagonOilCompany.com");
      Cliente cliente5 = new Cliente("Todd Howard", "Megaton@VaultTec.com");
      
      
      Productos Pina = new Productos("Piña", 700 , "Kg", 15 );
      Productos Manzana = new Productos("Manzana", 250 , "Kg", 20 );
      Productos NukaCola = new Productos("Nuka-Cola", 600 , "ml", 40 );
      Productos TostaRicas = new Productos("TostaRicas", 100 , "g", 15 );
      Productos ChiclesBum = new Productos("ChiclesBum", 50 , "Kg", 70 );
      Productos SunsetSarsaparrilla = new Productos("SunsetSarsaparrilla", 500 , "ml", 20 );

      ////////////////////////////////////////////////////////////////////////////////////
      productos.add(Pina);
      productos.add(Manzana);
      productos.add(NukaCola);
      productos.add(TostaRicas);
      productos.add(ChiclesBum);
      productos.add(SunsetSarsaparrilla);
      ////////////////////////////////////////////////////////////////////////////////////

      
      OrdenCompra orden1 = new OrdenCompra(cliente1);
      OrdenCompra orden2 = new OrdenCompra(cliente2);
      OrdenCompra orden3 = new OrdenCompra(cliente3);
      OrdenCompra orden4 = new OrdenCompra(cliente4);
      OrdenCompra orden5 = new OrdenCompra(cliente5);


      orden1.agregarLinea(2, Pina);
      
      
      orden2.agregarLinea(3, NukaCola);
      orden2.agregarLinea(7, TostaRicas);

      orden3.agregarLinea(1, Manzana);
      orden3.agregarLinea(1, NukaCola);
      orden3.agregarLinea(4, ChiclesBum );
      
      orden4.agregarLinea(5, ChiclesBum);
      orden4.agregarLinea(1, Pina);
      orden4.agregarLinea(3, SunsetSarsaparrilla);
      orden4.agregarLinea(1, NukaCola);

      orden5.agregarLinea(8, Manzana);
      orden5.agregarLinea(4, TostaRicas);
      orden5.agregarLinea(3, NukaCola);
      orden5.agregarLinea(10, ChiclesBum);
      orden5.agregarLinea(1, Pina);
      
      ///////////////////////////////////////////////////////////////////////////////////
      
      ordenes.add(orden1);
      ordenes.add(orden2);
      ordenes.add(orden3);
      ordenes.add(orden4);
      ordenes.add(orden5);
      
      //////////////////////////////////////////////////////////////////////////////////
      cliente1.agregarOrden(orden1);
      cliente2.agregarOrden(orden2);
      cliente3.agregarOrden(orden3);
      cliente4.agregarOrden(orden4);
      cliente5.agregarOrden(orden5);
      
      //////////////////////////////////////////////////////////////////////////////////
      clientes.add(cliente1);
      clientes.add(cliente2);
      clientes.add(cliente3);
      clientes.add(cliente4);
      clientes.add(cliente5);
      //////////////////////////////////////////////////////////////////////////////////
           for(Cliente cliente: clientes){
             System.out.println(cliente.toString());
           }
           for(OrdenCompra orden: ordenes){
             System.out.println(orden.toString());
           }
           for(Productos producto: productos){
             System.out.println(producto.toString());
           }
}
}