package letras_aleatorias;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;


public class HiloMovimiento extends Thread{
    
    JLabel a;
    int c;
    int max;//762

    public HiloMovimiento( JLabel a, int c, int max) {
        this.a = a;
        this.c = c;
        this.max = max;
    }
    
    @Override
    public void run() {
            while (a.getLocation().y < max) {
                a.setLocation(a.getLocation().x, a.getLocation().y + 10);
                try {                    
                    sleep(c);
                } catch (InterruptedException ex) {
                }
            }
        
    }
    
    
}
