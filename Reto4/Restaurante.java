/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;


public class Restaurante  {
    
    private String nombreRestaurante;
    private String nit;
    private String direccion;    
    private DatosPlatos[] datosPlatos;
    private Clientes[]clientes;
    private DatosVentas[] datosVentas;
    private DatosPedidos[] datosPedidos;
    private Mesas[]datosMesas;
    private  int i;   
     
  
    public Restaurante(){
    
     
    }
    public Restaurante(int n,int m, int s, int p, int r){     
      this.nombreRestaurante ="La Ardilla";
      this.nit = "8002263788";
      this.direccion = "Cra 80 # 35-40";  
      this.i =0;
      this.datosPlatos = new DatosPlatos[n];          
      this.clientes = new Clientes[m];
      this.datosVentas = new DatosVentas[s];
      this.datosMesas = new Mesas[p];
      this.datosPedidos = new DatosPedidos[r];
    }   
    
    
   public void registrarDatosPlato(String nombrePlato,String descripcion,
            int costoPlato,int precioPlato,int numPlatosProm, String tipoComida){       
               
        
            DatosPlatos objPlato = new  DatosPlatos(nombrePlato,descripcion,costoPlato,precioPlato,numPlatosProm,tipoComida);
            datosPlatos[i++] = objPlato;
               
    }
   
    public void construirInventarioplatos(){
    
    
    }
    
    public void mostrarArreglodePLatos(){
        for (int k = 0; k < this.datosPlatos.length; k++) {
            System.out.println(datosPlatos[k].getNombrePlato());
            System.out.println(datosPlatos[k].getDescripción());
            System.out.println(datosPlatos[k].getCostoPlato());
            System.out.println(datosPlatos[k].getPrecioPlato());
            System.out.println(datosPlatos[k].getNumPlatosProm());
            System.out.println(datosPlatos[k].getTipoComida());
            System.out.println("");       
        }  
       
    }
    public void registrarCliente(int numeroDocumento,String tipoDocumento,String nombreCompleto){       
               
            Clientes objCliente = new  Clientes(numeroDocumento,tipoDocumento,nombreCompleto);
            clientes[i++] = objCliente;
                
    }
    public void mostrarArreglodeClientes(){
        for (int k = 0; k < this.clientes.length; k++) {
            System.out.println(clientes[k].getNumeroDocumento());
            System.out.println(clientes[k].getTipoDocumento());
            System.out.println(clientes[k].getNombreCompleto());
        } 
    
    }    
    
    public void mostrarArregloDatosPedidos(){
            
            for (int k = 0; k < datosPedidos.length; k++) {
              
                System.out.println(datosPedidos[k].getFechaPed());
                System.out.println(datosPedidos[k].getHoraPed());                               
                for (int j = 0; j < datosPedidos[k].getPlatosPed().length; j++) {
                    System.out.println(datosPedidos[k].getPlatosPed()[j]); 
                }
                System.out.println("numero de mesa asignado : " + datosPedidos[k].getNumMesaAsignado()); 
             }   
    
    }
    
    public void mostrarArregloMesas(){
            
            for (int k = 0; k < datosMesas.length; k++) {
              
            System.out.println("Numero maximo de mesas: " + datosMesas[k].getNumMaxi());
            System.out.println("Numero de mesa : "+datosMesas[k].getMesa());
            System.out.println("Capacidad maxima:  " + datosMesas[k].getNumMaxi());
            System.out.println("Descripcion de la mesa : " + datosMesas[k].getDescripcionMesa());
              
            
        } 
    
    }
    
    public void mostrarNumeroDeMesas(){
        for (int k = 0; k < this.datosMesas.length; k++) {
            System.out.print(datosMesas[k].getMesa()+" ");
           
        } 
    
   } 
    
    
    
    public void registrarDatosVentas(String nombrePlatoVendido, String fecha,int cantidadVendida,
                    int precioPagado,int numeroDocumento, String tipoDocumento){       
               
        
        DatosVentas objDatoV = new  DatosVentas(nombrePlatoVendido,fecha,cantidadVendida,precioPagado,numeroDocumento,tipoDocumento);
        datosVentas[i++] = objDatoV;
               
    }
    
    
    public void mostrarArregloVentas(){
        for (int k = 0; k < this.datosVentas.length; k++) {
            System.out.println(datosVentas[k].getNombrePlatoVendido());
            System.out.println(datosVentas[k].getFecha());
            System.out.println(datosVentas[k].getCantidadVendida());
            System.out.println(datosVentas[k].getPrecioPagado());
            System.out.println(datosVentas[k].getNumeroDocumento());
            System.out.println(datosVentas[k].getTipoDocumento());

        } 
    }
    
    public void registrarDatosPedidos(int x ,String fechaPed, String horaPed, int numMesaAsignado){        
        DatosPedidos objPed = new DatosPedidos(x,fechaPed,horaPed,numMesaAsignado);        
        objPed.ingresarNombrePlato();        
        datosPedidos[i++]= objPed;
       
    }
    
    public void registrarMesas(int p, int q, String descripcionMesa, int o){      
               
        Mesas objMesa = new  Mesas(p,q,descripcionMesa,o);
        datosMesas[i++] = objMesa;
    }
       

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public DatosPlatos[] getDatosPlatos() {
        return datosPlatos;
    }

    public void setDatosPlatos(DatosPlatos[] datosPlatos) {
        this.datosPlatos = datosPlatos;
    }

    public Clientes[] getClientes() {
        return clientes;
    }

    public void setClientes(Clientes[] clientes) {
        this.clientes = clientes;
    }

    public DatosVentas[] getDatosVentas() {
        return datosVentas;
    }

    public void setDatosVentas(DatosVentas[] datosVentas) {
        this.datosVentas = datosVentas;
    }

  

  

   
    
    
   
      
        
   
    
}
