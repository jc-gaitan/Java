
public class DuracionRueda extends Thread{
    int tiem;
    
    public DuracionRueda(int tiem){
        this.tiem = tiem;
    }

    public void run() {
        for (int i = tiem; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
