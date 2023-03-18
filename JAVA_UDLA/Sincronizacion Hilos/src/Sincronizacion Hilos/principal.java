
package hilos2;

public class principal {

    public static void main(String[] args) {
        Buffer b = new Buffer();
        Productor p = new Productor(b);
        Consumidor c = new Consumidor(b);
        
        p.start();
        c.start();
    }
    
}
