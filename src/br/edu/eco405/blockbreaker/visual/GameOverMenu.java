/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.eco405.blockbreaker.visual;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

/**
 *
 * @author Márcio
 */
public class GameOverMenu implements GameHandling {
    
    Graphics2D g2d;
    ImageObserver im;

    public GameOverMenu(Graphics2D g2d, ImageObserver im) {
        this.g2d = g2d;
        this.im = im;
    }
    
    @Override
    public void paint() {
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(150, 235, 320, 70);
        g2d.setColor(Color.RED);
        g2d.setFont(new Font("Arial", Font.PLAIN, 36));
        g2d.drawString("GAME OVER :(", 180, 280);
    }

    @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
