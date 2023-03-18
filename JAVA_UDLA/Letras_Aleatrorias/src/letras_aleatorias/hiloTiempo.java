package letras_aleatorias;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class hiloTiempo extends Thread {

    private int segundos;
    JLabel tiempo, letra[];
    HiloMovimiento l[];
    ImageIcon imagenes[] = new ImageIcon[26];
    int x = 0;
    int VelocidadLetra;
    JTextArea historial, registro, num, todas;
    ArrayList<String> letras = new ArrayList<String>();
    int max = 290;
    int acum = 0;
    int pos = 0;

    public hiloTiempo(int minutos, JLabel tiempo, JLabel letra[], int VelocidadLetra, JTextArea historial, JTextArea registro, JTextArea todas) {
        segundos = minutos * 60;
        this.tiempo = tiempo;
        this.letra = letra;
        this.VelocidadLetra = VelocidadLetra;
        this.historial = historial;
        this.registro = registro;
        this.todas = todas;
        l = new HiloMovimiento[letra.length];
    }

    @Override
    public void run() {
        int minutos;
        for (int i = segundos; i >= 0; i--) {
            try {
                for (int j = 0; j < l.length; j++) {
                    //if (l == null || l != null) {
                        int aleatorio = (int) (Math.random() * 25) + 65;
                        if (x<l.length) {
                            letra[j].setText(String.valueOf((char) aleatorio));
                            OrdenarLetras(letra[j].getText());
                            l[j] = new HiloMovimiento(letra[j], VelocidadLetra, max);
                            l[j].start();
                            x ++;
                        }
                        if (!l[j].isAlive()) {
                            letra[j].setText("");
                            x--;
                            letra[j].setBounds((int) (Math.random() * 731) + 100, 20, 200, 90);
                        }
                    //}
                }
//todas.setText(letras.toString());

                if (i >= 0) {
                    minutos = i / 60;
                    tiempo.setText(minutos + " Min : " + (i % 60) + " Seg");
                }
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Ha Ocurrido Un Error");
            }
        }
        for (int i = 0; i < l.length; i++) {
            l[i].stop();
        }
        registro.append("Total diferentes: " + acum);
        registro.setText("Total diferentes: " + letras.size() + "\nTotal repetidas: " + acum + "\nTotal: " + (acum + letras.size()));

    }

    public void OrdenarLetras(String pos) {
        if (!letras.contains(pos)) {
            max = 290;
            letras.add(pos);
            Collections.sort(letras);
            historial.setText(letras.toString());

        } else {
            max = 145;
            acum++;
        }
        todas.append(pos+", ");
    }
}
