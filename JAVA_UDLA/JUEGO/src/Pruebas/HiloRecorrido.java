
package Pruebas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HiloRecorrido extends Thread{
    
    JLabel a;
    ImageIcon imagenes[];
    
    public HiloRecorrido(JLabel a, ImageIcon imagenes[]){
        this.a = a;
        this.imagenes = imagenes;
    }
    
    
    public void run() {
        for (int i = 0; i < imagenes.length; i++) {
            try {
                sleep(500);
                a.setIcon(imagenes[i]);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    
}
