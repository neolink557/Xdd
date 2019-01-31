/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characthers;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.w3c.dom.css.Rect;

/**
 *
 * @author Braya
 */
public class Steve {

    int x, y;
    int change;
    int lastkey;
    int anchos;
    int altos;

    public int getLastkey() {
        return lastkey;
    }

    public void setLastkey(int lastkey) {
        this.lastkey = lastkey;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    String dir;

    public void setChange(int change) {
        this.change = change;
    }

    public int getChange() {
        return change;
    }
    JPanel MiJP;

    public Steve(JPanel miJ) {
        this.x = 500;
        this.y = 500;
        this.MiJP = miJ;
    }

    public void DrawChar(Graphics g, int xi, int yi, String Direccion) {

        this.x = xi;
        this.y = yi;
        this.dir = Direccion;
        ImageIcon MiImagen = new ImageIcon(Direccion);
        g.drawImage(MiImagen.getImage(), xi, yi,null);
        altos = MiImagen.getIconHeight();
        anchos = MiImagen.getIconWidth();
    }

    public int getAnchos() {
        return anchos;
    }

    public void setAnchos(int anchos) {
        this.anchos = anchos;
    }

    public int getAltos() {
        return altos;
    }

    public void setAltos(int altos) {
        this.altos = altos;
    }

    public int CoordX() {
        return this.x;
    }

    public int CoordY() {
        return this.y;
    }

    public String direccion() {
        return this.dir;

    }

}
