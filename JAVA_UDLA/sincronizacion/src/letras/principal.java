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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buffer b = new Buffer();
        productor p = new productor(b);
        consumidor c = new consumidor(b);
        p.start();
        c.start();
    }

}
