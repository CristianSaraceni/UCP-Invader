/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ucp.invader.Nave;
import ucp.invader.Invasor;
import ucp.invader.InvasorVikingo;
import ucp.invader.Asteroide;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ucp.invader.InvasorGhost;

/**
 *
 * @author sala23Pc02
 */
public class NaveTest {
   
    @Test
    public void destruir85(){
        Nave n = new Nave (100, 50);
        Invasor i = new Invasor (100, 25);
        
        int vida;
        vida = i.getVida();
        n.destruir(i);
        System.out.println(vida);
        int valor;
        
        valor = ((n.getVelocidad() * i.getVelocidad())/100);
        System.out.println(valor);
        vida = vida - valor;
        System.out.println(vida);
        
        
        assertEquals(i.getVida(), vida);
    }
    
    @Test
    public void destruir100(){
        
        Nave n = new Nave (100, 0);
        Invasor i = new Invasor (100, 0);
        
        n.destruir(i);
        
        assertEquals(i.getVida(), 100);  
        
        
    }
    
    @Test
    public void destruir0(){
        
        Nave n = new Nave (100, 100);
        Invasor i = new Invasor (100, 100);
        
        n.destruir(i);
        
        assertEquals(i.getVida(), 0);
    }
    @Test
    public void destruirGhost(){
        
        Nave n = new Nave (100, 100);
        InvasorGhost ig = new InvasorGhost (100, 100);
        int vida = ig.getVida();
        n.destruirGhost(ig);
        
        assertEquals(ig.getVida(), vida);
    }
    @Test
    public void destruirPersonajeInvasor(){
        Nave n = new Nave (100, 100);
        Invasor i = new Invasor (100, 100);
        
        n.destruir(i);
        
        assertEquals(i.getVida(), 0);
    }
    @Test
    public void destruirPersonajeGhost(){
         
        Nave n = new Nave (100, 100);
        InvasorGhost ig = new InvasorGhost (100, 100);
        int vida = ig.getVida();
        n.destruir(ig);
        
        assertEquals(ig.getVida(), vida);
    }
    
    @Test
    public void destruirPersonajeGhost2(){
        
        InvasorGhost iG = new InvasorGhost(50,25);
        Nave n = new Nave(50,50);
        int vida = iG.getVida();
        n.destruir(iG);
        
        assertEquals(iG.getVida(), vida);
    }
    
     @Test
    public void destruirVikingo1(){
        Nave nave = new Nave(100,50);
        InvasorVikingo vikingo = new InvasorVikingo(100,100);
        nave.destruir(vikingo);
        assertEquals(vikingo.getVida(), 95);
    }
    
    @Test
    public void destruirVikingo2(){
        Nave nave = new Nave(100,100);
        InvasorVikingo vikingo = new InvasorVikingo(100,100);
        nave.destruir(vikingo);
        assertEquals(vikingo.getVida(), 90);
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
