package Principal;

import javax.swing.JLabel;

public class HiloTemporizador extends Thread {

    Ventana a;
    JLabel Hora;
    long velocidad;

    public HiloTemporizador(long velocidad, Ventana a) {
        this.a = a;
        this.Hora = a.temporizador.hora;
        this.velocidad = velocidad;
    }

    public void run() {

        int segundo = Integer.parseInt(Hora.getText().substring(6));
        int minuto = Integer.parseInt(Hora.getText().substring(3, 5));
        int hora = Integer.parseInt(Hora.getText().substring(0, 2));

        while (hora > 0 || minuto > 0 || segundo > 0) {

            while (minuto > 0 || segundo > 0) {

                while (segundo > 0) {
                    try {
                        segundo--;
                        Thread.sleep(velocidad);
                        Hora.setText(((hora <= 9) ? ("0" + String.valueOf(hora) + ":") : (String.valueOf(hora) + ":")) + ((minuto <= 9) ? ("0" + String.valueOf(minuto) + ":") : (String.valueOf(minuto) + ":")) + ((segundo <= 9) ? ("0" + String.valueOf(segundo)) : (String.valueOf(segundo))));
                    } catch (InterruptedException ex) {
                    }
                }
                
                if (minuto > 0) {
                    segundo = 60;
                    minuto--;
                }
            }

            if (hora > 0) {
                minuto = 60;
                hora--;
            }
        }
        
        a.reiniciaR();       
        
    }

}
