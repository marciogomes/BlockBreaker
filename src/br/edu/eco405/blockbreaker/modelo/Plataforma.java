/*
 * Trabalho de ECO005 - Java
 * Jogo Block Breaker
 * Márcio Gomes - 25038
 */
package br.edu.eco405.blockbreaker.modelo;

public class Plataforma extends PlayerObject {

    public enum STATE {

        NORMAL,
        GRANDE,
        MUITO_GRANDE
    }

    private STATE state = STATE.NORMAL;

    private int life;

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

}
