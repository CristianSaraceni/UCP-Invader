/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sala23Pc02
 */
public class Nave {
    
    int vida;
    int velocidad;
    
    public Nave (int vida, int velocidad){
        this.vida = vida;
        this.velocidad = velocidad;
    }
    public int destruir (Invasor invasor){
        invasor.vida -= (this.velocidad * invasor.velocidad)/100;
        return invasor.vida;
        
    }
}
