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
public class cuentaBancaria {
    private int saldo = 50;

    public cuentaBancaria() {
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void retiro(int retiro){
        saldo = saldo - retiro;
    }
}
