
public class sincronizacion {

    private int caPuestos = 5;
    private boolean disponible = false;

    public sincronizacion() {
    }

    public synchronized void Desocupar() {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        caPuestos++;
        disponible = true;
        notify(); // informa sobre la situacion
    }
    
    synchronized int Montar(){
      while(!disponible){
           try{
               wait();
            }catch(InterruptedException e){ 
                
            }
        }
       disponible=false;
       notify();
       caPuestos--;
       return caPuestos;
    }
    
}
