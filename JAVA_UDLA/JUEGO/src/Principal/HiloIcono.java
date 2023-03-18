package Principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HiloIcono extends Thread {

    JLabel opo;
    ImageIcon imagenes[];
    boolean x;

    public HiloIcono(JLabel opo) {
        this.opo = opo;
        x = true;

        imagenes = new ImageIcon[5];
        
        imagenes[0] = new ImageIcon(getClass().getResource("/Imagenes/diamante.png"));
        imagenes[1] = new ImageIcon(getClass().getResource("/Imagenes/avion.png"));
        imagenes[2] = new ImageIcon(getClass().getResource("/Imagenes/tigeras.png"));
        imagenes[3] = new ImageIcon(getClass().getResource("/Imagenes/lagartija.png"));
        imagenes[4] = new ImageIcon(getClass().getResource("/Imagenes/spock.png"));
        
    }

    public void run() {
        int pos = 0;
        while (x) {
            try {
                Thread.sleep(150);
                opo.setIcon(imagenes[pos]);
                pos++;
                if (pos == imagenes.length) {
                    pos = 0;
                }
            } catch (InterruptedException ex) {
            }
        }
    }
}
