/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Argenis Figueroa
 */
public class hiloLetras extends Thread{
    
    JLabel a;
    int c;
    int max;//762

    public hiloLetras( JLabel a, int c, int max) {
        this.a = a;
        this.c = c;
        this.max = max;
    }
    
    @Override
    public void run() {
            while (a.getLocation().x < max) {
                a.setLocation(a.getLocation().x + 10, a.getLocation().y);
                try {                    
                    sleep(c);
                } catch (InterruptedException ex) {
                }
            }
        
    }
    
    
}
