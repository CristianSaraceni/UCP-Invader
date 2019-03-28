package ucp.invader;


import ucp.invader.Invasor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sala23Pc02
 */
public class Nave extends Personaje{
    
    
    
    public Nave ( int pVelocidad, int pVida){
        super(pVelocidad, pVida);
        
    }
    public void destruir(Invasor invasor){
        
        int vida = invasor.getVida();
        int valor = ((invasor.getVelocidad() * this.getVelocidad())/100);
        vida = vida - valor;
        
        invasor.setVida(vida);
        
        
    }
    public void destruirGhost(InvasorGhost invasor){
       
        
        
    }

   
    
}
