
public class HTemporizador extends Thread{
    
    int minuto;
    
    public HTemporizador(int minuto){
        this.minuto = minuto;
    }
    public void run() {
        minuto *= 60;
        for (int i = minuto; i > 0; i--) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
