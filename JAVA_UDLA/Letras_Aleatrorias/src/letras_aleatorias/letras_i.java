
package letras_aleatorias;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;


public class letras_i extends Thread {
    
    
    JLabel tx;
    int c;
    int mayor;

    public letras_i( JLabel tx, int c, int mayor) {
        this.tx = tx;
        this.c = c;
        this.mayor = mayor;
    }
    
    @Override
    public void run() {
            while (tx.getLocation().x < mayor) {
                tx.setLocation(tx.getLocation().x + 10, tx.getLocation().y);
                try {                    
                    sleep(c);
                } catch (InterruptedException f) {
                }
            }
        
    
    
    
}
}
