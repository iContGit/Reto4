/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

public class DatosVentas extends Clientes {
    
    private String nombrePlatoVendido;
    private String fecha;
    private int cantidadVendida;
    private int precioPagado;
    
    
public DatosVentas (){   
    


}

public DatosVentas(String nombrePlatoVendido, String fecha,int cantidadVendida
                    ,int precioPagado,int numeroDocumento, String tipoDocumento){
    
    this.nombrePlatoVendido = nombrePlatoVendido;
    this.fecha = fecha;
    this.cantidadVendida=cantidadVendida;
    this.precioPagado =precioPagado;
    this.numeroDocumento =numeroDocumento;
    this.tipoDocumento = tipoDocumento;

            

}

    public String getNombrePlatoVendido() {
        return nombrePlatoVendido;
    }

    

    public String getFecha() {
        return fecha;
    }

   

    public int getCantidadVendida() {
        return cantidadVendida;
    }

   
    public int getPrecioPagado() {
        return precioPagado;
    }

    
    
    
}
