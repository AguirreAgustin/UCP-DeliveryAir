/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliveryGps;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Juan Carlos
 */
public class Gps {
    
    private String path;
    private String type;
    private String latitud;
    private String longitud;
    private GregorianCalendar time;
    private double speed;
    
    
    public Gps(String path){
        this.setPath(path);
        this.tryParser();
    }
    
    //From page http://aprs.gids.nl/nmea/
    private void tryParser(){
        //String parser = "$GPRMC,130745.532,V,3354.928,N,07602.498,W,81.4,2.42,070419,,E*43";
        String[] pathSplit = this.getPath().split(",");
        String type = pathSplit[0].replace("$GP","");
        this.setType(type);
        //parser TimeUTC
        if(type.equals("RMC")){
            //Parser Date Time to GregorianCalendar
            String hora = pathSplit[1].substring(0,2);
            String minuto = pathSplit[1].substring(2,4);
            String segundo = pathSplit[1].substring(4,6);
            String milisegundos = pathSplit[1].substring(7);
            Date date = new Date();
            date.setDate(Integer.parseInt(pathSplit[9].substring(0,2)));
            date.setMonth(Integer.parseInt(pathSplit[9].substring(2,4)));
            date.setYear(Integer.parseInt(pathSplit[9].substring(4)));
            GregorianCalendar calendar = new GregorianCalendar(Locale.US);
            calendar.setGregorianChange(date);
            calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hora)); 
            calendar.set(Calendar.MINUTE, Integer.parseInt(minuto));
            calendar.set(Calendar.SECOND, Integer.parseInt(segundo));
            calendar.set(Calendar.MILLISECOND, Integer.parseInt(milisegundos));
            
            this.setTime(calendar);
            
           //parser lat y lng to Degrees
           this.setLatitud(Float.toString(this.getDecimalLatitude()));
           this.setLongitud(Float.toString(this.getDecimalLongitude()));
           
           //parser Speed
           this.setSpeed(Double.parseDouble(pathSplit[7]));
        }
    }
    
    
    public float getDecimalLatitude() {
        String[] pathSplit = this.getPath().split(",");
        if(this.type.equals("RMC")){
            String lat = pathSplit[3], NS = pathSplit[4];
            float med = Float.parseFloat(lat.substring(2))/60.0f;
            med +=  Float.parseFloat(lat.substring(0, 2));
            if(NS.startsWith("S")) {
                    med = -med;
            }
            return med;
        }
        return -1;
    }

    public float getDecimalLongitude() {
        String[] pathSplit = this.getPath().split(",");
        if(this.type.equals("RMC")){
            String lon = pathSplit[5], WE = pathSplit[6];
            float med = Float.parseFloat(lon.substring(3))/60.0f;
            med +=  Float.parseFloat(lon.substring(0, 3));
            if(WE.startsWith("W")) {
                    med = -med;
            }
            return med;
        }
        return -1;
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

    public GregorianCalendar getTime() {
        return time;
    }

    private void setTime(GregorianCalendar time) {
        this.time = time;
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
    
    public String getTimeUTC() {
        //Convert date into UTC
        SimpleDateFormat dateFormatter = new SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String strUTCDate = dateFormatter.format(this.getTime().getTime());
        return strUTCDate;
    }

    
}
