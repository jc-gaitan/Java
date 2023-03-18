
package saldo_hilos;


public class Saldo_hilos {

    
    public static void main(String[] args) {
        cuenta c = new cuenta();
        
        
        Thread diana = new Thread(c, "diana");
        Thread juan = new Thread(c,"juan");
        
        diana.start();
        juan.start();
    }
    
}
