/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class DatosPedidos   {
    
      
    private String[]platosPed;
    private String fechaPed;
    private String horaPed;
    private int numMesaAsignado;
    private int i;
    
    
    public DatosPedidos(){
    }
    
    public DatosPedidos(int x ,String fechaPed, String horaPed,int numMesaAsignado ){

        this.platosPed = new String[x];
        this.fechaPed = fechaPed;
        this.horaPed = horaPed; 
        this.numMesaAsignado =numMesaAsignado;
        this.i = 0;    

    }

    public void ingresarNombrePlato(){
        Scanner lea = new Scanner(System.in);
        String m;
        for (int v = 0; v < platosPed.length; v++) {
            System.out.println("Ingrese el Nombre del plato a pedir: ");            
            m = lea.next();
            platosPed[v] = m;
        }
    }   

   
    
    
    public String[] getPlatosPed() {
        
        return platosPed;
    }

  

    public String getFechaPed() {
        return fechaPed;
    }

   

    public String getHoraPed() {
        return horaPed;
    }

    

    public int getI() {
        return i;
    }

    
    
    public int getNumMesaAsignado() {
        return numMesaAsignado;
    }

   
    
    
        
    }
    
    
    

