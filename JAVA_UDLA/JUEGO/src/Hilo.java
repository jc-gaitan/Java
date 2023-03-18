
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Hilo extends Thread
{

    JLabel mensaje;
    int tiempo;
    LimiteTiempo limit;

    public Hilo(JLabel msg, int tiempo, LimiteTiempo limit)
    {
        mensaje = msg;
        this.tiempo = tiempo;
        this.limit = limit;
    }

    public void run()
    {
        int m, s;
        m = tiempo / 60;
        s = tiempo % 60;
        while (m > 0 || s > 0) {

            while (s > 0) {

                s--;
                try {

                    mensaje.setText("Tiempo " + ((m <= 9) ? ("0" + m + ":") : (s + ":")) + ((s <= 9) ? ("0" + s) : (s)));
                    //System.out.println("Tiempo " + ((m <= 9) ? ("0" + m + ":") : (s + ":")) + ((s <= 9) ? ("0" + s) : (s)));
                    sleep(1000);
                } catch (InterruptedException ex) {
//                System.out.println("hola jojo");
//            }
                }
               
            }
             if (m > 0) {
                    s = 60;
                    m--;
                }
//        for (int i = tiempo; i > 0; i--) {
//          
//                System.out.println("["+mensaje.getText()+"] --> "+i);
//                mensaje.setText("Tiempo: "+i+" segundos");
//                sleep(1000);
//            
        }
            System.out.println("Este proceso ha terminado:" + this.getName());
            mensaje.setText("Tiempo: 0 segundos");
            limit.setVisible(true);
        }

    
}
