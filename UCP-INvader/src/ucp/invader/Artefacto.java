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
public class Artefacto implements IChocable{
    private int velocidad;
    
    public Artefacto (int pVelocidad){
        this.setVelocidad(pVelocidad);
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

    @Override
    public void chocar(IChocable victima) {
       throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void chocate(int velocidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

 
}


