/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.eco405.blockbreaker.visual;

import br.edu.eco405.blockbreaker.modelo.GameState;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Márcio
 */
public class MouseMotion implements MouseMotionListener {

    private boolean flag = true; // evita que o som toque muito rápido

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if (PanelJogo.DEBUG_MODE) {
            switch (PanelJogo.state) {
                case MENU:
                    // inicia o jogo
                    if (x >= 40 && x <= 190 && y >= 440 && y <= 470) {
                        // fazer algo
                    }

                    /* implementar o about */
                    // sai do jogo
                    if (x >= 440 && x <= 590 && y >= 440 && y <= 470) {
                        // fazer algo
                    }
                    break;

                case PAUSE:
                    // inicia o jogo
                    if (x >= 40 && x <= 190 && y >= 440 && y <= 470) {
                        //fazer açgp
                    }

                    /* implementar o restart */
                    // sai do jogo
                    if (x >= 440 && x <= 590 && y >= 440 && y <= 470) {
                        // fazer algo
                    }
                    break;

                case GAME_OVER:
                    // implementar depois
                    break;
            }
        }

        if (PanelJogo.USER_MODE) {

            if (PanelJogo.state != GameState.GAME && PanelJogo.state != GameState.GAME_OVER) {

                if ((x >= 200 && x <= 450 && y >= 300 && y <= 350)
                        || (x >= 200 && x <= 450 && y >= 375 && y <= 425)
                        || (x >= 200 && x <= 450 && y >= 450 && y <= 500)) {
                    if (flag) {
                        SoundEffects.MENU_ENTER.play();
                        flag = false;
                    }
                } else {
                    flag = true;
                }
            }

            /* implementar o about */
        }
    }

}
