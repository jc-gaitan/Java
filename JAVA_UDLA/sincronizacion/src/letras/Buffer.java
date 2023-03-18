/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

/**
 *
 * @author Argenis Figueroa
 */
public class Buffer {

    private char contenido;
    private boolean disponible = false;

    public void Buffer() {
    }

//    public void poner(char c){
//        contenido = c;
//        disponible = true;                
//    }
    public synchronized void poner(char c) {

        while (disponible) {
            try {
                wait();
            } catch (InterruptedException ex) {

            }
        }
        contenido = c;
        disponible = true;
        notify();
    }

    public synchronized char recoger() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException ex) {

            }
        }
        disponible = false;
        notify();
        return contenido;
    }

//    public char recoger() {
//        if (disponible) {
//            disponible = false;
//            return contenido;
//        }
//        return '*';
//    }
}
