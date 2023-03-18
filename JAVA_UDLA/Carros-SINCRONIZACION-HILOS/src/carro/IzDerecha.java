/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Argenis Figueroa
 */
public class IzDerecha extends Thread {

    JLabel label;
    int tiempo;
    DeIzquierda h1;
    boolean x = true;

    public IzDerecha(JLabel label, int tiempo, DeIzquierda h1) {
        this.label = label;
        this.tiempo = tiempo;
        this.h1 = h1;
    }

    private synchronized void VerficarSiVive() throws InterruptedException {
        if (!h1.isAlive()) {
            while (label.getLocation().x > 5) {
                label.setLocation(label.getLocation().x - 10, label.getLocation().y);
                try {
                    sleep((int) (Math.random() * tiempo + 1));
                } catch (InterruptedException ex) {
                    Logger.getLogger(DeIzquierda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            x = false;
        }
    }

    @Override
    public void run() {

        while (x) {
            try {
                this.VerficarSiVive();
            } catch (InterruptedException ex) {
                Logger.getLogger(DeIzquierda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
