/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NOGUERA
 */
public class HiloMapa1 extends Thread {

    Ventana Ventana;

    public HiloMapa1(Ventana Ventana) {
        this.Ventana = Ventana;
    }

    @Override
    public void run() {
        int x = Ventana.mapa1.getLocation().x;
        int y = Ventana.mapa1.getLocation().y;
        boolean estado = false;
        boolean aux = true;

        while (true) {
            try {
                if (aux) {
                    sleep(70);
                    y += 10;
                    Ventana.mapa1.setLocation(x, y);
                    System.out.println("X" + Ventana.mapa1.getLocation().x);
                    System.out.println("y" + Ventana.mapa1.getLocation().y);
                } else {
                    sleep(70);
                    y -= 10;
                    Ventana.mapa1.setLocation(x, y);
                    System.out.println("X" + Ventana.mapa1.getLocation().x);
                    System.out.println("y" + Ventana.mapa1.getLocation().y);
                }
                if (y == 550) {
                    aux = false;
                } else if (y == 0) {
                    aux = true;
                }

            } catch (InterruptedException ex) {
               
            }
        }

    
    }

}
