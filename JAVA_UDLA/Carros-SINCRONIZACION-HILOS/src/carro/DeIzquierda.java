package carro;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class DeIzquierda extends Thread {

    JLabel label;
    int tiempo;
    IzDerecha h1;
    boolean x = true;

    public DeIzquierda(JLabel label, int tiempo, IzDerecha h1) {
        this.label = label;
        this.tiempo = tiempo;
        this.h1 = h1;
    }

    private synchronized void VerficarSiVive() throws InterruptedException {
        if (!h1.isAlive()) {
            while (label.getLocation().x < 765) {
                label.setLocation(label.getLocation().x + 10, label.getLocation().y);
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

        if (h1!=null) {
            while (x) {
                try {
                    this.VerficarSiVive();
                } catch (InterruptedException ex) {
                    Logger.getLogger(DeIzquierda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            while (label.getLocation().x < 765) {
                //System.out.println(label.getLocation().x);
                label.setLocation(label.getLocation().x + 10, label.getLocation().y);
                try {
                    sleep((int) (Math.random() * tiempo + 1));
                } catch (InterruptedException ex) {
                    Logger.getLogger(DeIzquierda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

}
