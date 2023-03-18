
package saldo_hilos;


public class retiro {
    
    private int saldo=50;
    
    public retiro() {
        
    }
    
    public retiro(int saldo){
        this.saldo=saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    
    
    
    public void setsaldo(int saldo){
       this.saldo=saldo; 
    }
    public void retirobancario(double x){
        saldo -= x;
    }
    
}
