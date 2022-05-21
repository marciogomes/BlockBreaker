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
public class PoderManagerPlataforma implements PoderManager {

    public static final String ACELERA = "acelera";
    public static final String AUMENTA_TAMANHO = "aumenta_tamanho";
    public static final String AUMENTA_VIDA = "aumenta_vida";

    public static final int FATOR_VELOC = 5;
    public static final int FATOR_TAMANHO = 40;

    @Override
    public void aplicaPoder(PlayerObject alvo, String operacaoPoder) {
        if (alvo instanceof Plataforma) {
            Plataforma plataforma = (Plataforma) alvo;
            switch (operacaoPoder) {
                case ACELERA:
                    plataforma.setVelocidade(plataforma.getVelocidade() + FATOR_VELOC);
                    break;

                case AUMENTA_TAMANHO:
                    //plataforma.setTamanho(plataforma.getTamanho() + FATOR_TAMANHO);
                    switch (plataforma.getMaskWidth()) {

                        case 100: {
                            plataforma.setMaskWidth(plataforma.getMaskWidth() + FATOR_TAMANHO);
                            plataforma.setState(Plataforma.STATE.GRANDE);
                            break;
                        }
                        case 140: {
                            plataforma.setMaskWidth(plataforma.getMaskWidth() + FATOR_TAMANHO);
                            plataforma.setState(Plataforma.STATE.MUITO_GRANDE);
                            break;
                        }
                    }
                    break;
                    
                case AUMENTA_VIDA:
                    plataforma.setLife(plataforma.getLife()+1);
                    break;
            }
        }
    }
}
