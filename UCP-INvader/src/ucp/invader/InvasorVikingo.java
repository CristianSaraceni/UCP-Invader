/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucp.invader;

/**
 *
 * @author Agustin
 */
public class InvasorVikingo extends Personaje{
    public InvasorVikingo(int pVida,int pVelocidad){
    
        super(pVida,pVelocidad);
        
        
    }
    public void destruitePorNave(Nave nave){
        int vida = this.getVida();
        int valor = (nave.getVelocidad()*10)/100;
        vida = vida - valor;
        this.setVida(vida);
    }
}
