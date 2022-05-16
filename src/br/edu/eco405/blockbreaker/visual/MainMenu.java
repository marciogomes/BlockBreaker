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
import javax.swing.ImageIcon;

/**
 *
 * @author Márcio
 */
public class MainMenu implements GameState {

    Graphics2D g2d;
    ImageObserver im;

    public MainMenu(Graphics2D g2d, ImageObserver im) {
        this.g2d = g2d;
        this.im = im;
    }

    @Override
    public void paint() {

        if (PanelJogo.D) {

            Rectangle playButton = new Rectangle(40, 440, 150, 30);
            Rectangle aboutButton = new Rectangle(240, 440, 150, 30);
            Rectangle exitButton = new Rectangle(440, 440, 150, 30);

            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("Arial", Font.PLAIN, 30));
            g2d.drawString("PAUSE", 265, 60);

            /* botões */
            g2d.setColor(Color.BLACK);
            g2d.fill(playButton);
            g2d.fill(aboutButton);
            g2d.fill(exitButton);

            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font("Arial", Font.PLAIN, 20));
            g2d.drawString("PLAY", 90, 460);
            g2d.drawString("ABOUT", 270, 460);
            g2d.drawString("QUIT", 490, 460);
        }

        if (PanelJogo.U) {

            Rectangle playButton = new Rectangle(200, 300, 250, 50);
            Rectangle aboutButton = new Rectangle(200, 375, 250, 50);
            Rectangle exitButton = new Rectangle(200, 450, 250, 50);

            /* logotipo */
            ImageIcon logo = new ImageIcon("res/logo.png");
            g2d.drawImage(logo.getImage(), 50, 50, im);

            /* botões */
            g2d.setColor(Color.RED);
            g2d.fill(playButton);
            g2d.fill(aboutButton);
            g2d.fill(exitButton);

            g2d.setColor(Color.YELLOW);
            g2d.setFont(new Font("Arial", Font.PLAIN, 32));
            g2d.drawString("PLAY", 285, 345);
            g2d.setFont(new Font("Arial", Font.PLAIN, 32));
            g2d.drawString("ABOUT", 285, 425);
            g2d.setFont(new Font("Arial", Font.PLAIN, 32));
            g2d.drawString("QUIT", 285, 500);
        }

    }

    @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
