/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author NOGUERA
 */
public class HiloTiempo extends Thread {

    int Tiempo;
    Ventana Ventana;

    public HiloTiempo(int tiempo) {
        Tiempo = tiempo * 60;
    }

    @Override
    public void run() {
        for (int i = 1; i <= Tiempo; i++) {
            if (i >= 60) {

                Ventana.Tiempo.setText(" Tiempo:  " + (i / 60) + ":" + (i % 60));
            } else {
                Ventana.Tiempo.setText(" Tiempo:  " + i);
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        Ventana.hm1.stop();
        Ventana.hm2.stop();
        Ventana.hm3.stop();
        Ventana.hm4.stop();
        Ventana.hm5.stop();
        Ventana.hm6.stop();

    }

}
