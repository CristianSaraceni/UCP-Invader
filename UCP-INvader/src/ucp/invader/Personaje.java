/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucp.invader;

/**
 *
 * @author sala23Pc02
 */
public class Personaje extends Artefacto{
    private int vida;
    
    public Personaje (int vida, int pVelocidad){
        super(pVelocidad);
        this.vida = vida;
    
    } 
        
    

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
