
package Reto4;

/**
 *
 * @author Sebastian
 * @author Andres Penia
 */
import java.util.Scanner;
public class MainRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n; 
    String nombrePlato;
    String descripcion;
    int costoPlato;
    int precioPlato;
    int numPlatosProm;
    String tipoComida;
    int numeroDocumento;
    String tipoDocumento;
    String nombreCompleto;
    String nombrePlatoVendido;
    String fecha;
    int cantidadVendida;
    int precioPagado;
    int m=0;
    int s=0;
    int r=0;
    int p=0;
    int x=0;
    int o =0;    
    int numMesaAsignado;
    String fechaPed;
    String horaPed;
    int q;    
    String descripcionMesa;   
    
    System.out.println("************** 1. REGISTRO DE LOS PLATOS *************");
    Scanner readme = new Scanner(System.in);
    System.out.println("Ingresa el número de platos que "+
                "tendrá tu restaurante:");
    n = readme.nextInt();    
    Restaurante rest1 = new Restaurante(n,m,s,p,r);
    
        for (int i = 0; i < n ; i++) {           
        
              
        
        System.out.println("Ingrese el nombre del plato "+ (i+1)+":");
        nombrePlato = readme.next();
        readme.nextLine();
        System.out.println("Ingrese una descripción del plato "+ (i+1)+":");
        descripcion = readme.nextLine();        
        System.out.println("Ingrese costo del plato "+ (i+1)+":");
        costoPlato =readme.nextInt();
        System.out.println("Ingrese precio del plato " + (i+1)+":");
        precioPlato = readme.nextInt();
        System.out.println("Numero de Ventas promedio de este plato por dia: ");
        numPlatosProm = readme.nextInt();
        System.out.println("Este plato es: Desayuno, Almuerzo o cena: ");
        tipoComida = readme.next();       
        rest1.registrarDatosPlato(nombrePlato, descripcion, costoPlato, precioPlato, numPlatosProm, tipoComida);
        
        }       
        
        
        rest1.mostrarArreglodePLatos();
        System.out.println("**************** 3. REGISTRAR CLIENTES ********************");
        System.out.println("Ingresa el número de clientes: ");                      
        m = readme.nextInt();
        
        rest1 = new Restaurante(n,m,s,p,r);
        
        
        for (int h = 0; h < m; h++) {           
        
            System.out.println("Ingrese el número de documento del cliente " + (h+1)+":");
            numeroDocumento=readme.nextInt();
            System.out.println("Ingrese el tipo de documento del cliente "+ (h+1)+":");        
            tipoDocumento=readme.next();
            readme.nextLine();
            System.out.println("Ingrese el nombre completo del cliente " + (h+1)+":");
            nombreCompleto = readme.nextLine();
            rest1.registrarCliente(numeroDocumento, tipoDocumento, nombreCompleto);
       }
   
       rest1.mostrarArreglodeClientes();
       System.out.println("******************** 2. REGISTRO DE VENTAS ********************");
       System.out.println("Ingresa numero de ventas a registrar: ");                      
       s = readme.nextInt();
       rest1 = new Restaurante(n,m,s,p,r);

        for (int j = 0; j < s; j++) {
            
            readme.nextLine();
            System.out.println("Ingrese el nombre del plato de la venta "+ (j+1)+":");
            nombrePlatoVendido=readme.nextLine();
            System.out.println("Ingrese la fecha del plato de la venta "+ (j+1)+":");
            fecha = readme.next();
            System.out.println("Ingrese cantidad vendida del plato :");
            cantidadVendida = readme.nextInt();
            System.out.println("Ingrese precio pagado del plato  de la venta "+(j+1)+":");
            precioPagado = readme.nextInt();
            System.out.println("Ingrese numero de documento del cliente de la venta "+(j+1)+":");
            numeroDocumento = readme.nextInt();
            System.out.println("Ingrese el tipo de documento del cliente de la venta "+(j+1)+":");
            tipoDocumento=readme.next();
        
        
        rest1.registrarDatosVentas(nombrePlatoVendido,fecha,cantidadVendida,precioPagado,numeroDocumento,tipoDocumento);
            
        }
        rest1.mostrarArregloVentas();
       System.out.println("************************* 5. REGISTRO DE MESAS **********************"); 
       System.out.println("Ingresa numero Maximo de mesas: ");                      
       p = readme.nextInt();
       rest1 = new Restaurante(n,m,s,p,r);

        for (int l = 0; l < p; l++) {            
            
        System.out.println("Ingrese número de la mesa " +(l+1)+":");
        q=readme.nextInt();
        System.out.println("Ingrese la cantidad de puestos para esta mesa:");
        o = readme.nextInt();
        readme.nextLine();
        System.out.println("Ingrese una descripcion de la mesa " +(l+1)+":");        
        descripcionMesa = readme.nextLine();
        
                
        
        rest1.registrarMesas(p,q,descripcionMesa,o);
            
        }
        rest1.mostrarArregloMesas();
        
        System.out.println("*********************4. REGISTRO DE PEDIDOS *******************************");
        System.out.println("Ingresa el numero de pedidos que se realizaron:");                      
        r = readme.nextInt();
        System.out.println("Mesas disponibles: ");
        rest1.mostrarNumeroDeMesas();
        System.out.println("");
        rest1 = new Restaurante(n,m,s,p,r);        
        
          for (int i = 0; i < r; i++) {
            
            System.out.println("Ingrese número de platos del pedido "+ (i+1)+":");                      
            x = readme.nextInt();             
            System.out.println("Ingrese la fecha del pedido  "+ (i+1)+":");
            fechaPed=readme.next();
            System.out.println("Ingrese la hora del pedido "+  (i+1)+":");
            horaPed = readme.next();
            System.out.println("Asigne una mesa al pedido " +(i+1)+":");
            numMesaAsignado = readme.nextInt();        
            rest1.registrarDatosPedidos(x,fechaPed,horaPed, numMesaAsignado);
            
    }
          
          rest1.mostrarArregloDatosPedidos();
          
          
       
          
        
        
    
       
       
       
        
        
        
        
        
        
        
        
        
    }
    
}
