
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HMovimiento extends Thread {

    //PanelCliente Pcliente;
    ImageIcon imagenes[][];
    int pos;
    JLabel animacion;
    HVenta Venta;
    HTemporizador tempo;
    

    public HMovimiento(ImageIcon imagenes[][], int pos, JLabel animacion, HVenta Venta, HTemporizador tempo) {
        //this.Pcliente = cliente;
        this.imagenes = imagenes;
        this.pos = pos;
        this.animacion = animacion;
        this.tempo = tempo;
        this.Venta = Venta;
    }

    public void run() {

        while (animacion.getBounds().getX() - 10 >= 0) {
            try {
                sleep(100);
                animacion.setIcon(new ImageIcon(imagenes[pos][0].getImage().getScaledInstance(192, 336, Image.SCALE_DEFAULT)));
                animacion.setBounds((int) animacion.getBounds().getX() - 10, 0, 192, 336);
                if (pos == imagenes.length - 1) {
                    pos = 0;
                } else {
                    pos++;
                }
            } catch (InterruptedException ex) {
            }
        }

        tempo.start();
        Venta.start();

    }

}
