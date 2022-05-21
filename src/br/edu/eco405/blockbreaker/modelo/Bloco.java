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
    public enum STATE {
        NORMAL,
        DANIFICADO,
        MUITO_DANIFICADO,
        DESTRUIDO
    }
    
    private int vida;
    private PoderManager poderManager;
    private boolean destrutivel;
    private boolean powerfull;
    private STATE state;
    
    private String operacaoPoder;
    
    public int getVida() {
        return vida;
    }

    public PoderManager getPoderManager() {
        return poderManager;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPoderManager(PoderManager poderManager) {
        this.poderManager = poderManager;
    }

    public boolean isDestrutivel() {
        return destrutivel;
    }

    public void setDestrutivel(boolean destrutivel) {
        this.destrutivel = destrutivel;
    }
    
    public boolean temPoder() {
        return poderManager != null;
    }  

    public String getOperacaoPoder() {
        return operacaoPoder;
    }

    public void setOperacaoPoder(String operacaoPoder) {
        this.operacaoPoder = operacaoPoder;
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
