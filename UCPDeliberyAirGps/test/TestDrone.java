/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import deliveryGps.Drone;
import deliveryGps.Gps;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VersaSH
 */
public class TestDrone {
    
    public TestDrone() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void generarEntrega(){
        
        Gps gps = new Gps("");
        Drone drone = new Drone(gps);
        
        drone.generarEntrega("id ", "lat", "long");
        assertNotNull(drone.getId());
        assertNotNull(drone.getLatitud());
        assertNotNull(drone.getLongitud());
    }
    
    @Test
    public void crearDrone(){
        Gps gps = new Gps("");
        Drone drone = new Drone(gps);
        
        assertNotNull(drone);
   
    }
   
    @Test
    public void agregarGPS(){
        
        Gps gps = new Gps("");
        Drone drone = new Drone(gps);
        
        drone.agregarGPS(gps);
        
        assertEquals(drone.getGps().size(), 2);
   
    }
    @Test
    public void agregarVariosGps(){
        
        Gps gpsConPathl = new Gps("$GPRMC,231220.479,V,3354.928,N,08002.498,W,40.6,2.37,060419,,E*4A");
        
        Drone drone = new Drone(gpsConPathl);
        int i;
       
        for(i=0;i<10;i++){
            drone.agregarGPS(gpsConPathl);
        }
        
        for(i=0;i< drone.getGps().size();i++){
            assertNotNull(drone.getGps().get(i).getLatitud());
            System.out.println(i+1 + " : " +drone.getGps().get(i).getPath());
            assertNotNull(drone.getGps().get(i).getLongitud());
        }
        
        
        
    }
    
    @Test
    public void obtenerPosicionActual(){
        
        Gps gpsConPathl = new Gps("$GPRMC,231220.479,V,3354.928,N,08002.498,W,40.6,2.37,060419,,E*4A");
        Gps gpsUltimo = new Gps("$GPRMC,160657.949,V,3354.929,N,08202.496,W,93.8,1.19,080419,,E*4B");
        Drone drone = new Drone(gpsConPathl);
        int i;
       
        for(i=0;i<10;i++){
            drone.agregarGPS(gpsConPathl);
        }
        drone.agregarGPS(gpsUltimo);
        String posicionActual = ""; 
        String posicionEsperada = gpsUltimo.getPath();
        for(i=0;i< drone.getGps().size();i++){
            posicionActual = drone.getGps().get(i).getPath();
            System.out.println(i+1 + " - " +drone.getGps().get(i).getPath());
        }
        assertEquals(posicionActual,posicionEsperada);
    
    }
    
    @Test
    public void obtenerListadoPath(){
        
        Gps gps = new Gps("uno");
      
  
        Drone drone = new Drone(gps);
     
         assertEquals(drone.obtenerListadoPath().size(), 1);
   
    }
    
    @Test
    public void obtenerEstadoEntrega(){
         Gps gps = new Gps("$GPRMC,231220.479,V,3354.928,N,08002.498,W,40.6,2.37,060419,,E*4A");
         Drone drone = new Drone(gps);
         System.out.println("Latitud: " + drone.getGps().get(0).getLatitud());
         System.out.println("Longitud: "+ drone.getGps().get(0).getLongitud());
        // drone.generarEntrega("paquete", "3354.928,N", "08002.498,W");
         drone.generarEntrega("paquete", "33.915466", "-80.04163");
     
         assertEquals(drone.obtenerEstadoDeEntrega("paquete"), "entregado");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
