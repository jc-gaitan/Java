/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import static java.lang.Thread.sleep;

/**
 *
 * @author NOGUERA
 */
public class HiloMapa5 extends Thread {

    Ventana Ventana;

    public HiloMapa5(Ventana Ventana) {
        this.Ventana = Ventana;
    }

    @Override
    public void run() {
        int x = Ventana.mapa5.getLocation().x;
        int y = Ventana.mapa5.getLocation().y;
        boolean estado = false;
        boolean aux = true;

        while (true) {
            try {
                if (aux) {
                    sleep(70);
                    y += 10;
                    Ventana.mapa5.setLocation(x, y);
                    //System.out.println("X" + Ventana.mapa5.getLocation().x);
                    //System.out.println("y" + Ventana.mapa5.getLocation().y);
                } else {
                    sleep(70);
                    y -= 10;
                    Ventana.mapa5.setLocation(x, y);
                    //System.out.println("X" + Ventana.mapa5.getLocation().x);
                    //System.out.println("y" + Ventana.mapa5.getLocation().y);
                }
                if (y == 450) {
                    aux = false;
                } else if (y == 0) {
                    aux = true;
                }

            } catch (InterruptedException ex) {
               
            }
        }

    
    }

}
