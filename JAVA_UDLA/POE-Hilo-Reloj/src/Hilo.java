
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Hilo extends Thread{
    
    int hora, minutos, segundos;
    Calendar calendario;
    
    @Override
    public void run() {
        while (true) {
            calcula();
            System.out.println(hora + ":" + minutos + ":" + segundos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    public void calcula() {
        Calendar calendario = new GregorianCalendar();
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
    }
  }
    

