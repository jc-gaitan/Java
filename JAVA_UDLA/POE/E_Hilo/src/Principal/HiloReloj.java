
package Principal;

import javax.swing.JLabel;

public class HiloReloj extends Thread {
    
    JLabel Hora;

    public HiloReloj(JLabel Hora) {
        this.Hora = Hora;
    }

    public void run() {
        for(int i = 0; i < 23; i++) for(int j = 0; j < 60; j++) for(int w = 0; w < 60; w++){
            try {
                i = Integer.parseInt(Hora.getText().substring(0, 2));
                j = Integer.parseInt(Hora.getText().substring(3, 5));
                w = Integer.parseInt(Hora.getText().substring(6));
                
                Thread.sleep(1000);
                Hora.setText(((i<=9)?("0" + String.valueOf(i) + ":"):(String.valueOf(i) + ":"))+((j<=9)?("0" + String.valueOf(j) + ":"):(String.valueOf(j) + ":"))+((w<=9)?("0" + String.valueOf(w)):(String.valueOf(w))));
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
