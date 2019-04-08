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
    private String id;
    private String latitud;
    private String longitud;
    
    private ArrayList<Gps> gps;
    
    public Drone(Gps gps) {
        this.setGps(new ArrayList());
    }
    
    /*SETERS Y GETERS*/
    private void setId(String id){
        this.id = id;
    }
    
    private void setLatitud(String latitud){
        this.latitud = latitud;
    }
    
    private void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    
    private void setGps(ArrayList pGps){
        this.gps = pGps;
    }
    
    public String getId(){
        return id;
    }
    
    public String getLatitud(){
        return latitud;
    }
    
    public String getLongitud(){
        return longitud;
    }
    
    public ArrayList<Gps> getGps(){
        return this.gps;
    }
    
    public void agregarGPS(Gps pGps){
        this.getGps().add(pGps);
    }
    
    public void generarEntrega(String id, String latitud, String longitud){
        this.setId(id);
        this.setLatitud(latitud);
        this.setLongitud(longitud);
    
    }
    
    /*public obtenerListaPath(){
    }*/
    
    /* prueba de configuracion de usuarios*/
    

    
}
