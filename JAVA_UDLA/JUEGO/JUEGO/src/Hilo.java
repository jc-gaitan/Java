import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Hilo extends Thread {

    HMovimiento1 a, b;
    long tiempoi;
    long tiempof;

    long ta, tb;

    public Hilo(HMovimiento1 a, HMovimiento1 b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        tiempoi = System.currentTimeMillis();
        boolean x = true;
        int asd = 0;
        ta = tb = 0;
        while (a.isAlive() || b.isAlive()) {
            if (!a.isAlive() && x) {
                tiempof = System.currentTimeMillis();
                ta = tiempof - tiempoi;
                System.out.println("ta" + ta);
                x = false;
                asd = 1;
            } else if (!b.isAlive() && x) {
                tiempof = System.currentTimeMillis();
                tb = tiempof - tiempoi;
                System.out.println("tb " + tb);
                x = false;
                asd = 2;
            }
        }
        
        if(ta == 0){
            System.out.println("ganador tb");
            JOptionPane.showMessageDialog(null, "ganador rojo");
        }else{
            System.out.println("ganador ta");
            JOptionPane.showMessageDialog(null, "ganador azul");
        }

    }

}
