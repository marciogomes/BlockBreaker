/*
 * Trabalho de ECO005 - Java
 * Jogo Block Breaker
 * Márcio Gomes - 25038
 */
package br.edu.eco405.blockbreaker.modelo;

public class Bola extends PlayerObject {

    public enum STATE {

        NORMAL,
        GRANDE,
        MUITO_GRANDE
    }

    private STATE state;
    private int dano;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }

}
