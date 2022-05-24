/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.eco405.blockbreaker.visual;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

/**
 *
 * @author Márcio
 */
public class PauseMenu implements GameHandling {

    Graphics2D g2d;
    ImageObserver im;

    public PauseMenu(Graphics2D g2d, ImageObserver im) {
        this.g2d = g2d;
        this.im = im;
    }

    @Override
    public void paint() {

        if (PanelJogo.DEBUG_MODE) {

            Rectangle resumeButton = new Rectangle(40, 440, 150, 30);
            Rectangle restartButton = new Rectangle(240, 440, 150, 30);
            Rectangle exitButton = new Rectangle(440, 440, 150, 30);
            
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("Arial", Font.PLAIN, 30));
            g2d.drawString("PAUSE", 265, 60);

            /* botões */
            g2d.setColor(Color.BLACK);
            g2d.fill(resumeButton);
            g2d.fill(restartButton);
            g2d.fill(exitButton);

            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font("Arial", Font.PLAIN, 20));
            g2d.drawString("PLAY", 90, 460);
            g2d.drawString("RESTART", 270, 460);
            g2d.drawString("QUIT", 490, 460);
        }

        if (PanelJogo.USER_MODE) {

            Rectangle playButton = new Rectangle(200, 300, 250, 50);
            Rectangle restartButton = new Rectangle(200, 375, 250, 50);
            Rectangle exitButton = new Rectangle(200, 450, 250, 50);

            g2d.setColor(Color.BLUE);
            g2d.setFont(new Font("Arial", Font.PLAIN, 70));
            g2d.drawString("PAUSE", 200, 100);

            /* botões */
            g2d.setColor(Color.RED);
            g2d.fill(playButton);
            g2d.fill(restartButton);
            g2d.fill(exitButton);

            g2d.setColor(Color.YELLOW);
            g2d.setFont(new Font("Arial", Font.PLAIN, 32));
            g2d.drawString("RESUME", 255, 345);
            g2d.drawString("RESTART", 250, 420);
            g2d.drawString("QUIT", 285, 500);
        }
    }

    @Override
    public void dispose() {
        g2d.dispose();
    }

}
