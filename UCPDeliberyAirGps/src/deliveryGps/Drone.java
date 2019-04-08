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
    
    private ArrayList<Gps> gps;

    public Drone(Gps pGps) {
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
    
  
    public ArrayList<String> obtenerListadoPath(){
        ArrayList<String> listaPath = null;
        for(Gps gps : this.getGps()){
            String path = gps.getPath();
            listaPath.add(path);
        }
        return listaPath;
    }
    
  
    
    
}
