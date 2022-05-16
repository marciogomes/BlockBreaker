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

    public static void main(String[] args) throws IOException {
        new Runnable() {

            @Override
            public void run() {
                try {
                    JFrame janela = new JFrame("Block Breaker");
                    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    janela.setSize(650, 600);
                    janela.setLocationRelativeTo(null);
                    janela.setResizable(false);
                    janela.add(new PanelJogo());
                    janela.setVisible(true);
                } catch (IOException e) {
                    //Logger.getLogger(JanelaJogo.class.getName()).log(Level.SEVERE, null, ex);
                    e.printStackTrace();
                }
            }
        }.run();
    }
}
