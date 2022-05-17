/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.eco405.blockbreaker.visual;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Márcio
 */
public class JanelaJogo {

    private static final String FRAME_TITLE = "Block Breaker";
    private static final int FRAME_WIDTH = 650;
    private static final int FRAME_HEIGHT = 600;

    public static void main(String[] args) throws IOException {
        new Runnable() {

            @Override
            public void run() {
                try {
                    JFrame janela = new JFrame(FRAME_TITLE);
                    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    janela.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                    janela.setLocationRelativeTo(null);
                    janela.setResizable(false);
                    janela.add(new PanelJogo());
                    janela.setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.run();
    }
}
