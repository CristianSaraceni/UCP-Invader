/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import invaders.Invaders;
import invaders.Nave;
import invaders.Invasor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sala23Pc02
 */

public class NaveTest {
   
    @Test
    public void destruir100(){
        Nave n = new Nave(100,0);
        Invasor i = new Invasor(100, 0);
        int vida;
        
        n.destruir(i);
        assertEquals(i.getVida(), 100);
    }
    
    public NaveTest() {
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
