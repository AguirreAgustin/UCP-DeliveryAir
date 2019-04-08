/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import deliveryGps.Drone;
import deliveryGps.Gps;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Juan Carlos
 */
public class TestGPS {
    
    public TestGPS() {
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
    public void crearGps(){
    
        Gps gps1 = new Gps("");
        
        assertNotNull(gps1);      
             
    }
    
    @Test
    public void crearGpsConPath(){
    
        Gps gpsConPathl = new Gps("$GPRMC,231220.479,V,3354.928,N,08002.498,W,40.6,2.37,060419,,E*4A");
        assertEquals(gpsConPathl.getPath(), "$GPRMC,231220.479,V,3354.928,N,08002.498,W,40.6,2.37,060419,,E*4A");

       
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
      
        
         assertEquals(drone.getGps().size(), 1);
   
    }
    
    
    
     @Test
    public void obtenerListadoPath(){
        
        Gps gps = new Gps("uno");
        //Gps gps1 = new Gps("uno");
      
        
        Drone drone = new Drone(gps);
        //drone.agregarGPS(gps1);
       
        
        
        //assertEquals(drone.obtenerListadoPath().size(), null);
         assertEquals(drone.obtenerListadoPath().size(), null);
   
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}


}
