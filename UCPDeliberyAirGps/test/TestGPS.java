/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import deliveryGps.Gps;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
