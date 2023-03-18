
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;



public class Hilo extends Thread {

    JLabel mensaje;
    private int tiempo;
    LimiteTiempo limit;

    public Hilo(JLabel msg, int tiempo, LimiteTiempo limit) {
        mensaje = msg;
        this.tiempo = tiempo;
        this.limit = limit;
    }

    public void run() {
        for (int i = tiempo; i > 0; i--) {
            try {
                System.out.println("["+mensaje.getText()+"] --> "+i);
                mensaje.setText("Tiempo: "+i+" Seg");
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Puto Cangrejo");
            }
        }
        System.out.println("Este proceso ha terminado:" + this.getName());
        mensaje.setText("Tiempo: 0 Seg");
        limit.setVisible(true);
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}