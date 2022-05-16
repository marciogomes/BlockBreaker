/*
 * Trabalho de ECO005 - Java
 * Jogo Block Breaker
 * Márcio Gomes - 25038
 */
package br.edu.eco405.blockbreaker.modelo;

/*
 * Essa classe define objetos comandados pelo jogador
 */
public class PlayerObject extends GameObject {
    
    private double direcaoX;
    private double direcaoY;
    private double velocidade;
    
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getDirecaoX() {
        return direcaoX;
    }

    public void setDirecaoX(double direcaoX) {
        this.direcaoX = direcaoX;
    }

    public double getDirecaoY() {
        return direcaoY;
    }

    public void setDirecaoY(double direcaoY) {
        this.direcaoY = direcaoY;
    }
    
    

}
