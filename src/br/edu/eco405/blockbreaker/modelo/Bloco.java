/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.eco405.blockbreaker.modelo;

/**
 *
 * @author Márcio
 */
public class Bloco extends GameObject {
    public static enum STATE {
        NORMAL,
        DANIFICADO,
        MUITO_DANIFICADO,
        DESTRUIDO;
    }
    
    private int vida;
    private Poderes poder;
    private boolean destrutivel;
    private boolean powerfull;
    private STATE state;
    
    private String messagePoder;
    
    public int getVida() {
        return vida;
    }

    public Poderes getPoder() {
        return poder;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPoder(Poderes poder) {
        this.poder = poder;
    }

    public boolean isDestrutivel() {
        return destrutivel;
    }

    public void setDestrutivel(boolean destrutivel) {
        this.destrutivel = destrutivel;
    }
    
    public boolean temPoder() {
        return poder != null;
    }  

    public String getMessagePoder() {
        return messagePoder;
    }

    public void setMessagePoder(String messagePoder) {
        this.messagePoder = messagePoder;
    }

    public boolean isPowerfull() {
        return powerfull;
    }

    public void setPowerfull(boolean powerfull) {
        this.powerfull = powerfull;
    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }
    
}
