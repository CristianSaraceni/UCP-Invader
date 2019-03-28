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
public class Nave extends Artefacto{
    
    private int vida;
    private int velocidad;
    
    public Nave (int pVida, int pVelocidad){
        super(pVelocidad);
        this.setVida(pVida);
    }
    public void destruir(Invasor invasor){
        
        int vida = invasor.getVida();
        int valor = ((invasor.getVelocidad() * this.getVelocidad())/100);
        vida = vida - valor;
        
        invasor.setVida(vida);
        
        
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
}
