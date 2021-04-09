
package Reto4;


public class Mesas {
    
    private int mesaNumero;
    private int numMaxi;    // capacida maxima de mesas 
    private int numPuestos; // Puestos max por mesa
    private String descripcionMesa;
    private int numeroMesaAsignado;


    public Mesas(){


    }
    public Mesas (int p, int q, String descripcionMesa, int o){
    this.numMaxi = p;     
    this.mesaNumero = q;
    this.descripcionMesa = descripcionMesa;
    this.numPuestos = o;

}

    public int getMesa() {
        return mesaNumero;
    }

  
    public int getNumMaxi() {
        return numMaxi;
    }

    
    public String getDescripcionMesa() {
        return descripcionMesa;
    }

 
    public int getMesaNumero() {
        return mesaNumero;
    }

  
    public int getNumPuestos() {
        return numPuestos;
    }



    public int getNumeroMesaAsignado() {
        return numeroMesaAsignado;
    }

 

}


