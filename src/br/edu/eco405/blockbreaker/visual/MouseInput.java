/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.eco405.blockbreaker.visual;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Márcio
 */
public class MouseInput implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent me) {
        // code
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if (PanelJogo.D) {
            switch (PanelJogo.state) {
                case MENU:
                    // inicia o jogo
                    if (x >= 40 && x <= 190 && y >= 440 && y <= 470) {
                        if (PanelJogo.U) {
                            SoundEffects.MENU_CLICK.play();
                        }

                        PanelJogo.state = PanelJogo.STATE.GAME;
                    }

                    /* implementar o about */
                    // sai do jogo
                    if (x >= 440 && x <= 590 && y >= 440 && y <= 470) {
                        PanelJogo.state = PanelJogo.STATE.GAME_OVER;
                        System.exit(0);
                    }
                    break;

                case PAUSE:
                    // inicia o jogo
                    if (x >= 40 && x <= 190 && y >= 440 && y <= 470) {

                        PanelJogo.state = PanelJogo.STATE.GAME;
                        PanelJogo.t.restart();
                    }

                    // sai do jogo
                    if (x >= 440 && x <= 590 && y >= 440 && y <= 470) {
                        PanelJogo.state = PanelJogo.STATE.GAME_OVER;
                        System.exit(0);
                    }
                    break;

                case GAME_OVER:
                    // implementar depois
                    break;
            }
        }

        if (PanelJogo.U) {
            switch (PanelJogo.state) {
                case MENU:
                    // inicia o jogo
                    if (x >= 200 && x <= 450 && y >= 300 && y <= 358) {
                        SoundEffects.MENU_CLICK.play();

                        PanelJogo.state = PanelJogo.STATE.GAME;
                    }

                    if (x >= 200 && x <= 450 && y >= 375 && y <= 433) {
                        SoundEffects.MENU_CLICK.play();

                        JOptionPane.showMessageDialog(null, "Marcio Gomes "
                                + "25038", "About", 1);
                    }

                    // sai do jogo
                    if (x >= 200 && x <= 450 && y >= 450 && y <= 508) {
                        PanelJogo.state = PanelJogo.STATE.GAME_OVER;
                        System.exit(0);
                    }
                    break;

                case PAUSE:
                    // inicia o jogo
                    if (x >= 200 && x <= 450 && y >= 300 && y <= 350) {
                        SoundEffects.MENU_CLICK.play();

                        PanelJogo.state = PanelJogo.STATE.GAME;
                        PanelJogo.t.restart();
                    }

                    if (x >= 200 && x <= 450 && y >= 375 && y <= 425) {
                        SoundEffects.MENU_CLICK.play();

                        //PanelJogo.state = PanelJogo.STATE.REINICIO;
                    }
                    
                    // sai do jogo
                    if (x >= 200 && x <= 450 && y >= 450 && y <= 500) {
                        PanelJogo.state = PanelJogo.STATE.GAME_OVER;
                        System.exit(0);
                    }
                    break;

                case GAME_OVER:
                    // implementar depois
                    break;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        // code
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // code
    }

    @Override
    public void mouseExited(MouseEvent me) {
        // code
    }

}
