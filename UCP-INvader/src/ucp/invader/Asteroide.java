/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucp.invader;

/**
 *
 * @author VersaSH
 */
public class Asteroide extends Artefacto {
    
    private int velocidad;
    
    public Asteroide (int pVelocidad){
        super(pVelocidad);
    }
    

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void chocar(Nave pNave){
        int vida = pNave.getVida();
        int valor = ((pNave.getVelocidad() * this.getVelocidad())/200);
        
        vida = vida - valor;
        
        pNave.setVida(vida);
    
    }
    
}