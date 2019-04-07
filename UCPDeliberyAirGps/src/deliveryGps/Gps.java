/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliveryGps;

/**
 *
 * @author Juan Carlos
 */
public class Gps {
    
    private String path;
    
    public Gps(String path){
        setPath(path);
    }
    
    /* geters y seters  */
    private void setPath(String path){
        this.path = path;
    }
    
    public String getPath(){
        return this.path;
    }
}
