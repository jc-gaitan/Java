package cronometro;

import javax.swing.JLabel;

public class Proceso extends Thread {

    JLabel a;
    long velocidad;

    public Proceso(long velocidad, JLabel a) {
        this.a = a;
        this.velocidad = velocidad;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(velocidad);
                a.setText(String.valueOf(i));
            } catch (InterruptedException e) {
            }

        }
    }
}
