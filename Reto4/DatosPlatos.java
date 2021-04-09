
package Reto4;


public class DatosPlatos {
    
    protected String nombrePlato;
    protected String descripcion;
    protected int costoPlato;
    protected int precioPlato;
    protected int numPlatosProm;
    protected String tipoComida;
    
 public DatosPlatos(){     
     
 
 }
 public DatosPlatos(String nombrePlato,String descripcion,
            int costoPlato,int precioPlato,int numPlatosProm, String tipoComida){
     
     this.nombrePlato = nombrePlato;
     this.descripcion = descripcion;
     this.costoPlato = costoPlato;
     this.precioPlato = precioPlato;
     this.numPlatosProm = numPlatosProm;
     this.tipoComida = tipoComida;
 
 
 }
   
 
    public String getNombrePlato() {
        return nombrePlato;
    }

   

    public String getDescripción() {
        return descripcion;
    }

  
    public int getCostoPlato() {
        return costoPlato;
    }

   

    public int getPrecioPlato() {
        return precioPlato;
    }

   

    public int getNumPlatosProm() {
        return numPlatosProm;
    }

   

    public String getTipoComida() {
        return tipoComida;
    }

  
 

    
    
    
}
