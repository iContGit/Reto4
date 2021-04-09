
package Reto4;

/**
 *
 * @author Sebastian Gómez
 * @author Andres Penia
 */
public class Clientes {
    
protected int numeroDocumento;
protected String tipoDocumento;
protected String nombreCompleto;

public Clientes (){
    

}
public Clientes(int numeroDocumento,String tipoDocumento,String nombreCompleto){
    this.numeroDocumento=numeroDocumento;
    this.tipoDocumento=tipoDocumento;
    this.nombreCompleto=nombreCompleto;
    
    
}   

public int getNumeroDocumento() {
    return numeroDocumento;
}



public String getTipoDocumento() {
    return tipoDocumento;
}


public String getNombreCompleto() {
    return nombreCompleto;
}


}