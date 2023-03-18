
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ProcesoAnimacion extends Thread {
    
    ImageIcon imagenes[];
    int pos;
    JLabel animacion;
    
    public ProcesoAnimacion(ImageIcon imagenes[], int pos, JLabel animacion) {
        this.imagenes = imagenes;
        this.pos = pos;
        this.animacion = animacion;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(50);
                animacion.setIcon(new ImageIcon(imagenes[pos].getImage().getScaledInstance(240, 200, Image.SCALE_DEFAULT)));
                if (pos == imagenes.length-1) {
                    pos = 0;
                } else {
                    pos++;
                }

            } catch (InterruptedException ex) {
            }
        }
    }

}
