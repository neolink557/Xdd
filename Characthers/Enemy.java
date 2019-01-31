/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characthers;

import Powers.StevePower;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Braya
 */
public class Enemy extends Thread {

    int x, y, j;
    int anchoe;
    int altoe;
    Steve misteve;
    StevePower powa;
    JPanel miJP;
    Graphics g;
    String direct = "C:/Users/estudiantes/Downloads/proyecto-final-poo-master/proyecto-final-poo-master/Collision/src/resources/al otro lado v/d1.png";
    boolean col = true;

    public Enemy(JPanel miJ, int xi, int yi, Steve misteve) {
        super();
        this.g = miJ.getGraphics();
        this.x = xi;
        this.y = yi;
        this.misteve = misteve;
    }

    public boolean isCol() {
        return col;
    }

    public void setCol(boolean col) {
        this.col = col;
    }

    public void DrawEnemy(Graphics g, int xi, int yi) {

        this.x = xi;
        this.y = yi;
        ImageIcon MiImagen = new ImageIcon(direct);
        g.drawImage(MiImagen.getImage(), xi, yi, null);

    }

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

    public int getAnchoe() {
        return anchoe;
    }

    public void setAnchoe(int anchoe) {
        this.anchoe = anchoe;
    }

    public int getAltoe() {
        return altoe;
    }

    public void setAltoe(int altoe) {
        this.altoe = altoe;
    }

    public void run() {
        this.y = 150;
        j = 1;
        while (true) {
            while (j <= 1000) {

                try {
                    this.x = j;
                    System.out.println(j);
                    
                    ImageIcon miImagen = new ImageIcon(direct);
                    this.g.drawImage(miImagen.getImage(), this.x, this.y, null);
                    altoe = miImagen.getIconHeight() - 50;
                    anchoe = miImagen.getIconWidth() - 50;
                    if (colision(this.x, this.y, this.altoe, this.anchoe, misteve.CoordX(), misteve.CoordY(), misteve.altos, misteve.anchos)) {

                    } else {

                        j = j + 10;
                    }
                    Enemy.sleep(50);
                   
                } catch (InterruptedException ex) {
                    Logger.getLogger(StevePower.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            while (j > 0) {
                
                try {
                    this.x = j;
                    System.out.println(x);
              
                    ImageIcon miImagen = new ImageIcon(direct);
                    g.drawImage(miImagen.getImage(), x, y, null);
                    altoe = miImagen.getIconHeight() - 50;
                    anchoe = miImagen.getIconWidth() - 50;
                    if (colision(this.x, this.y, this.altoe, this.anchoe, misteve.CoordX(), misteve.CoordY(), misteve.altos, misteve.anchos)) {
                        

                    } else {
                        j -= 10;
                    }
                    Enemy.sleep(50);
         
                } catch (InterruptedException ex) {
                    Logger.getLogger(StevePower.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public boolean colision(int x1, int y1, int alto, int ancho, int x2, int y2, int alto2, int ancho2) {

        if ((x2 >= x1 && x2 <= (x1 + ancho)) && (y2 >= y1 && y2 <= (y1 + alto))) {
            return true;
        }
        if ((x2 + ancho >= x1 && x2 <= (x1 + ancho)) && (y2 + alto >= y1 && y2 <= (y1 + alto))) {
            return true;
        }
        if ((x2 >= x1 && x2 <= (x1 + ancho)) && (y2 + alto >= y1 && y2 <= (y1 + alto))) {
            return true;
        }
        if (((x2 + ancho2) >= x1 && (x2 + ancho2) <= x1 + ancho) && ((y2 + alto2) >= y1 && (y2 + alto2) < y1 + alto)) {
            return true;
        } else {
            return false;
        }

    }

}
