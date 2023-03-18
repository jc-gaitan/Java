/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

/**
 *
 * @author Argenis Figueroa
 */
public class Sincronizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       verificarCuenta v = new verificarCuenta();
       
       Thread erika = new Thread(v, "Erika cliente ");
       Thread duber = new Thread(v, "Duber cliente ");
       
       erika.start();
       duber.start();
    }
    
}
