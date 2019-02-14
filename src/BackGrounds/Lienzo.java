/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackGrounds;

import Characthers.Enemy;
import Characthers.Steve;
import Powers.StevePower;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/**
 *
 * @author estudiantes
 */
public class Lienzo extends Canvas implements KeyListener{
    Steve steve;
    StevePower sp;
    Enemy enemy;
    Graphics miG;
    Image imgBuffer;
    BackGrounds bg;
    Timer timer;
    
    
    public Lienzo(Steve steve,Enemy enemy){
        bg = new BackGrounds();
        this.steve = steve;
        this.sp=sp;
        //this.enemy=enemy;
        timer = new Timer();
        timer.schedule(new Actualizador(),0,100);
        imgBuffer = new BufferedImage(1920, 1080, BufferedImage.OPAQUE);
    }
    
    
    public void paint(Graphics g){
        miG  = imgBuffer.getGraphics();
        miG.clearRect(0, 0, 1920, 1080);
        bg.DrawBack(miG);
        steve.DrawChar(steve.CoordX(), steve.CoordY(), steve.getActual(),miG);
        //enemy.DrawEnemy(miG, enemy.getX(), enemy.getY());
        g.drawImage(imgBuffer, 0, 0, null);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        steve.setX(steve.CoordX()+5);
        System.out.println("actualizo");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    private class Actualizador extends TimerTask {

        @Override
        public void run() {
            repaint();
            
        }
        
    }
}
