/*
 * Trabalho de ECO005 - Java
 * Jogo Block Breaker
 * Márcio Gomes - 25038
 */
package br.edu.eco405.blockbreaker.modelo;

import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * Essa classe define um objeto geral do game
 */
public class GameObject {

    private int x;
    private int y;
    private Rectangle mask;
    private ArrayList<ImageIcon> render;    

    public GameObject() {
        this.render = new ArrayList<>();
    }
    
    /* Getters e setters */
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Rectangle getMask() {
        return mask;
    }

    public void setMask(Rectangle mask) {
        this.mask = mask;
    }
    
    public void setMaskX(int x) {
        this.mask.x = x;
    }
    
    public void setMaskY(int y) {
        this.mask.y = y;
    }
    
    public int getMaskX() {
        return mask.x;
    }
    
    public int getMaskY() {
        return mask.y;
    }
    
    public void setMaskWidth(int width) {
        this.mask.width = width;
    }
    
    public void setMaskHeight(int height) {
        this.mask.height = height;
    }
    
    public int getMaskWidth() {
        return mask.width;
    }
    
    public int getMaskHeight() {
        return mask.height;
    }

    public ArrayList<ImageIcon> getRender() {
        return render;
    }

    public void setRender(ArrayList<ImageIcon> render) {
        this.render = render;
    }

}
