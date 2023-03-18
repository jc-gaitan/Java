
import java.awt.Image;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class HMovimientoI extends Thread{

    ImageIcon imagenes[][];
    int pos;
    JLabel animacion;
    

    public HMovimientoI(ImageIcon imagenes[][], int pos, JLabel animacion) {
        this.imagenes = imagenes;
        this.pos = pos;
        this.animacion = animacion;
    }
    
    public void run() {

        while (animacion.getBounds().getX() + 10 <= 575) {
            try {
                sleep(100);
                animacion.setIcon(new ImageIcon(imagenes[pos][1].getImage().getScaledInstance(192, 336, Image.SCALE_DEFAULT)));
                animacion.setBounds((int) animacion.getBounds().getX() + 10, 0, 192, 336);
                if (pos == imagenes.length - 1) {
                    pos = 0;
                } else {
                    pos++;
                }
                System.out.println(animacion.getBounds().getX() + 10);
            } catch (InterruptedException ex) {
            }
        }
        
        ImageIcon clien = new ImageIcon(getClass().getResource("/Otras/inicio.png"));
        clien = new ImageIcon(clien.getImage().getScaledInstance(192, 336, Image.SCALE_DEFAULT));
        animacion.setIcon(clien);   
    }
    
}
