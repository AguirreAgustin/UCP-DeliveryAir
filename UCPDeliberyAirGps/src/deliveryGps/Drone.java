/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliveryGps;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos
 */
public class Drone {
    
    private ArrayList<Gps> gps;
    
    public Drone() {
        this.setGps(new ArrayList());
    }

  
    private void setGps(ArrayList pGps){
        this.gps = pGps;
    }
    
    public ArrayList<Gps> getGps(){
        return this.gps;
    }
    
    public void agregarGPS(Gps pGps){
        this.getGps().add(pGps);
    }
    public String obtenerPosicionActual(){
        
        int i;
        String posicionActual = "";
        for(i=0;i<this.getGps().size();i++){
            
            posicionActual = this.getGps().get(i).getPath();
            
        }
        return posicionActual;
    }
    /*public ArrayList obtenerListadoPath(){
    
        this.getGps().l
    }*/
    
    /*public obtenerListaPath(){
    }*/
    
    /* prueba de configuracion de usuarios*/
    private String entregaId;
}
