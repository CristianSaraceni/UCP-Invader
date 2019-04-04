package ucp.invader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sala23Pc02
 */
public class Invasor extends Personaje{
      
    
    
    public Invasor (int pVelocidad, int vida){
        super(pVelocidad, vida);
        
    }


    @Override
    public void chocar(IChocable victima){
        victima.chocate(0);
    }
    
    public void destruirNave(Nave pNave){
        int vida = pNave.getVida();
        
        int valor = ((this.getVelocidad() * 20)/100);
        vida = vida - valor;
        pNave.setVida(vida);
    }
    
    public void destruitePorNave(Nave nave){
        int vida = this.getVida();
        int valor = (this.getVelocidad()* nave.getVelocidad())/100;
        vida = vida - valor;
        this.setVida(vida);
    }
}
