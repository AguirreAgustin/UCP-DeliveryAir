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
        Drone drone = new Drone();
        
        drone.generarEntrega("id ", "lat", "long");
        assertNotNull(drone.getId());
        assertNotNull(drone.getLatitud());
        assertNotNull(drone.getLongitud());
    }
    
    @Test
    public void crearDrone(){
         Drone drone = new Drone();
        
        assertNotNull(drone);
   
    }
    
    @Test
    public void agregarGPS(){
        
        Gps gps = new Gps("");
        Drone drone = new Drone();
        
        drone.agregarGPS(gps);
        
        assertEquals(drone.getGps().size(), 1);
   
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
