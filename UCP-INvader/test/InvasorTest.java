/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ucp.invader.InvasorGhost;
import ucp.invader.Invasor;
import ucp.invader.Nave;
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
public class InvasorTest {
    
    public InvasorTest() {
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
    public void chocarNave(){
        
        Nave n = new Nave (100, 100);
        Invasor i = new Invasor (100, 100);
        
        i.chocar(n);
        
        assertEquals(n.getVida(), 0);
    }
    
    @Test
    public void destruirNave(){
        Nave n = new Nave (100, 100);
        Invasor i = new Invasor (100, 50);
        
        int vida = n.getVida();
        
        i.destruirNave(n);
        
        int valor = ((i.getVelocidad() * 20)/100);
        vida = vida - valor;
        
        assertEquals(n.getVida(), vida);
    }
    
    @Test
    public void chocarGhostNave(){
        
        Nave n = new Nave (100, 100);
        InvasorGhost ig = new InvasorGhost (100, 100);
        int vida = n.getVida();
        ig.chocar(n);
        
        assertEquals(n.getVida(), vida);
    }
    
    @Test
    public void destruirGhostNave(){
        Nave n = new Nave (100, 100);
        InvasorGhost ig = new InvasorGhost (100, 50);
        
        int vida = n.getVida();
        
        ig.destruirNave(n);
        
        int valor = ((ig.getVelocidad() * 20)/100);
        vida = vida - valor;
    
        assertEquals(n.getVida(), vida);
    }
    
    @Test
    public void chocarGhostNave2(){

        Nave n = new Nave(55,100);
        InvasorGhost iG =  new InvasorGhost (100, 100);
        int vida = n.getVida();
        iG.chocar(n);
        
        assertEquals(n.getVida(),vida);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
