
import javax.swing.JLabel;

public class HMovimiento extends Thread {

    JLabel campo;
    boolean conti;

    public HMovimiento(JLabel campo, boolean x) {
        this.campo = campo;
        this.conti = x;
    }

    @Override
    public void run() {
        int x = campo.getLocation().x;
        int y = campo.getLocation().y;
        boolean estado = false;
        boolean aux = true;

        while (conti) {
            try {
                if (aux) {
                    sleep(80);
                    y += 10;
                    campo.setLocation(x, y);
                    //System.out.println("X" + campo.getLocation().x);
                    //System.out.println("y" + campo.getLocation().y);
                } else {
                    sleep(80);
                    y -= 10;
                    campo.setLocation(x, y);
                    //System.out.println("X" + campo.getLocation().x);
                    //System.out.println("y" + campo.getLocation().y);
                }
                if (y >= 243) {
                    aux = false;
                } else if (y <= 71) {
                    aux = true;
                }

            } catch (InterruptedException ex) {

            }
        }

    }

}
