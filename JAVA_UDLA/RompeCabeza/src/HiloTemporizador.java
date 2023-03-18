

public class HiloTemporizador extends Thread{
    int tiem;
    
    
    public HiloTemporizador(int tiem){
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