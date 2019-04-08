/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliveryGps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Carlos
 */
public class Drone {
    private boolean estado;
    private ArrayList<Gps> gps;

    public Drone(Gps pGps) {
        this.setGps(new ArrayList());
        this.setEstado(false);
    }
    /**
     * @return the estado
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the entregaId
     */
   
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

    public boolean obtenerEstadoDeEntrega(){
        
        return this.getEstado();
    }
  
    public ArrayList<String> obtenerListadoPath(){
        ArrayList<String> listaPath = null;
        for(Gps gps : this.getGps()){
            String path = gps.getPath();
            listaPath.add(path);
        }
        return listaPath;
    }
    
  
    
    
}
