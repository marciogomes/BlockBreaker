/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.eco405.blockbreaker.modelo;

import br.edu.eco405.blockbreaker.visual.PanelJogo;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Márcio
 */
public class PoderBola implements Poderes {

    public static final String ACELERA = "acelera";
    public static final String AUMENTA_DANO = "aumenta_dano";
    public static final String AUMENTA_QUANT = "aumenta_quant";
    public static final String AUMENTA_TAMANHO = "aumenta_tamanho";

    public static final int FATOR_VELOC = 2;
    public static final int FATOR_DANO = 2;
    public static final int FATOR_TAM = 40;
    
    Random gerador = new Random();

    @Override
    public void poder(PlayerObject playerObject, String op) {
        if (playerObject instanceof Bola) {
            Bola bola = (Bola) playerObject;
            switch (op) {
                case ACELERA:
                    bola.setVelocidade(bola.getVelocidade() + FATOR_VELOC);
                    break;

                case AUMENTA_DANO:
                    bola.setDano(bola.getDano() + FATOR_DANO);
                    break;

                case AUMENTA_QUANT: {
                    Bola b;
                    b = new Bola();
                    b.setX(gerador.nextInt(500));
                    b.setY(gerador.nextInt(300));
                    b.setMask(new Rectangle(b.getX(), b.getY(), PanelJogo.BOLA_MASK_WIDTH, PanelJogo.BOLA_MASK_HEIGHT));
                    b.setVelocidade(gerador.nextInt(5));
                    b.setDirecaoX(1);
                    b.setDirecaoY(-1);
                    b.setDano(1);
                    b.setState(Bola.STATE.NORMAL);
                    b.getRender().add(new ImageIcon("res/bolas/bolaA.png"));
                    b.getRender().add(new ImageIcon("res/bolas/bolaB.png"));
                    b.getRender().add(new ImageIcon("res/bolas/bolaC.png"));
                    PanelJogo.bolas.add(b);
                    break;
                }
                case AUMENTA_TAMANHO:
                    // so pega o comprimento porque o mask é quadrado
                    switch (bola.getMaskWidth()) {
                        case 20:
                            bola.setMaskWidth(bola.getMaskWidth() + FATOR_TAM);
                            bola.setMaskHeight(bola.getMaskHeight() + FATOR_TAM);
                            bola.setState(Bola.STATE.GRANDE);
                            break;
                        case 60:
                            bola.setMaskWidth(bola.getMaskWidth() + FATOR_TAM);
                            bola.setMaskHeight(bola.getMaskHeight() + FATOR_TAM);
                            bola.setState(Bola.STATE.MUITO_GRANDE);
                            break;
                    }
                    break;

            }
        } else {
            // 
        }

    }

}
