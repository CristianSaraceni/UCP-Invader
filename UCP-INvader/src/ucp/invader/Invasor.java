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
public class Invasor {
      
    private int vida;
    private int velocidad;
    
    public Invasor (int vida, int velocidad){
        this.setVelocidad(velocidad);
        this.setVida(vida);
    }

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
    
    public void chocarNave(Nave pNave){
        pNave.setVida(0);
    }
    
    public void destruirNave(Nave pNave){
        int vida = pNave.getVida();
        
        int valor = ((this.getVelocidad() * 20)/100);
        vida = vida - valor;
        pNave.setVida(vida);
    }
}

