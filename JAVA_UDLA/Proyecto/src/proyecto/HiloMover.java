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
public class HiloMover extends Thread {

    Ventana Ventana;

    public HiloMover(Ventana Ventana) {
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
                    sleep(250);
                    y += 10;
                    Ventana.mapa1.setLocation(x, y);
                    System.out.println("X" + Ventana.mapa1.getLocation().x);
                    System.out.println("y" + Ventana.mapa1.getLocation().y);
                } else {
                    sleep(250);
                    y -= 10;
                    Ventana.mapa1.setLocation(x, y);
                    System.out.println("X" + Ventana.mapa1.getLocation().x);
                    System.out.println("y" + Ventana.mapa1.getLocation().y);
                }
                if (y == 630) {
                    aux = false;
                } else if (y == 0) {
                    aux = true;
                }

            } catch (InterruptedException ex) {
                System.out.println("PUTA");
            }
        }

        /*while (true) {
         if (estado = false) {
         y--;
         if (y < 1) {
         estado = true;
         y++;
         }
         }
         if (estado == true) {
         y++;
         if (y > 450) {
         y = 450;
         estado = false;
         }
         }

         Ventana.mapa1.setLocation(x, y);

         try {
         Thread.sleep(8);
         } catch (Exception e) {
         }

         }*/
    }

}
