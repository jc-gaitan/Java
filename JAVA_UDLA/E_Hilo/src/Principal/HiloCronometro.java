package Principal;

import javax.swing.JLabel;

public class HiloCronometro extends Thread {

    JLabel Hora;

    long velocidad;

    public HiloCronometro(String name, long velocidad,JLabel Hora) {
        super(name);
        this.Hora = Hora;
        this.velocidad = velocidad;
    }

    public void run() {
        
        for(int i = 0; i < 23; i++) for(int j = 0; j < 60; j++) for(int w = 0; w < 60; w++){
            try {
                Thread.sleep(velocidad);
                Hora.setText(((i<=9)?("0" + String.valueOf(i) + ":"):(String.valueOf(i) + ":"))+((j<=9)?("0" + String.valueOf(j) + ":"):(String.valueOf(j) + ":"))+((w<=9)?("0" + String.valueOf(w)):(String.valueOf(w))));
            } catch (InterruptedException ex) {
            }
            
        }
        
    }
}
