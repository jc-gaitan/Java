
import javax.swing.JLabel;

public class TiemLlegada extends Thread {

    sincronizacion asd;
    int tiem;

    public TiemLlegada(int tiem, sincronizacion f) {
        this.tiem = tiem;
        asd = f;
    }

    public void run() {
        try {
            Thread.sleep(tiem);
        } catch (InterruptedException ex) {
        }
        asd.Montar();
    }

}
