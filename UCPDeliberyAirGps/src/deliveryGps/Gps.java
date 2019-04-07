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
    private String type;
    private String latitud;
    private String longitud;
    private String timeUTC;
    private double speed;
    
    
    public Gps(String path){
        this.setPath(path);
        this.tryParser();
    }
    
    private void tryParser(){
        //String parser = "$GPRMC,150745.532,V,3354.928,N,07602.498,W,81.4,2.42,070419,,E*43";
        String path = this.getPath();
        String[] pathSplit = path.split(",");
        this.setType(pathSplit[0].replace("$GP",""));
    }
    
    /* geters y seters  */
    private void setPath(String path){
        this.path = path;
    }
    
    public String getPath(){
        return this.path;
    }

    public String getLatitud() {
        return latitud;
    }

    private void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    private void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getTimeUTC() {
        return timeUTC;
    }

    private void setTimeUTC(String timeUTC) {
        this.timeUTC = timeUTC;
    }

    public double getSpeed() {
        return speed;
    }

    private void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }
    
}
