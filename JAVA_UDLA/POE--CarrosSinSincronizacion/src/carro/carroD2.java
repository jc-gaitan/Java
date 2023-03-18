package carro;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class carroD2 extends Thread {

    JLabel label;
    carroI h1;
    boolean x = true;
    int tiempo;

    public carroD2(JLabel label, carroI h1, int tiempo) {
        this.label = label;
        this.h1 = h1;
        this.tiempo = tiempo;
    }

    @Override
    public void run() {

        while (x) {
            if (!h1.isAlive()) {
                //System.out.println("murio");
                while (label.getLocation().x > 5) {
                    label.setLocation(label.getLocation().x - 10, label.getLocation().y);
                    try {
                        sleep((int) (Math.random()*tiempo + 1));
                    } catch (InterruptedException ex) {
                        Logger.getLogger(carro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                x = false;
            } else {
                //System.out.println("vive");
            }
        }

    }

}
