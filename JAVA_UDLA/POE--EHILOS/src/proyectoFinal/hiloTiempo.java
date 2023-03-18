/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Argenis Figueroa
 */
public class hiloTiempo extends Thread {

    private int segundos;
    JLabel a, b;
    hiloLetras l = null;
    ImageIcon imagenes[] = new ImageIcon[26];
    boolean x = true;
    int c;
    JTextArea historial, registro;
    ImageIcon vacio;
    ArrayList<Character> letras = new ArrayList<Character>();
    int max = 762;

    public hiloTiempo(int minutos, JLabel a, JLabel b, int c, JTextArea historial, JTextArea registro) {
        segundos = minutos * 60;
        this.a = a;
        this.b = b;
        this.c = c;
        this.historial = historial;
        this.registro = registro;
        LlenarArreglo();
        String location = "/Imagenes/vacio.PNG";
        vacio = new ImageIcon(getClass().getResource(location));
    }

    @Override
    public void run() {
        int minutos;
        for (int i = segundos; i >= 0; i--) {
            try {
                if (l == null || l != null) {
                    int aleatorio = (int) (Math.random() * 26);
                    if (x) {
                        b.setIcon(new ImageIcon(imagenes[aleatorio].getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                        int asd = aleatorio + 65;
                        Ordenar((char)asd);
                        l = new hiloLetras(b, c,max);
                        l.start();
                        x = false;
                    }
                    if (!l.isAlive()) {
                        b.setIcon(new ImageIcon(vacio.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                        x = true;
                        b.setBounds(5, 20, 100, 100);
                    }
                }

                if (i >= 0) {
                    minutos = i / 60;
                    a.setText(minutos + " Min : " + (i % 60) + " Seg");
                }
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Ha Ocurrido Un Error");
            }
        }
        l.stop();
    }

    public void LlenarArreglo() {

        String location = "";

        for (int i = 0; i < imagenes.length; i++) {

            location = "/Imagenes/" + (i + 1) + ".PNG";

            imagenes[i] = new ImageIcon(getClass().getResource(location));

        }

    }

    public void Ordenar(char pos) {
        if (!letras.contains(pos)) {//comprobar si existe la letra
            max = 762;
            letras.add(pos);
            Collections.sort(letras);
            //historial.append((char) (asd) + "\n");
            //historial.setText("");
            /*for (int i =0; i<letras.size();i++) {
                //System.out.println(letras.get(i));
                int w = letras.get(i);
                historial.append((char)w + "\n");
            }*/
            //System.out.println(letras.toString());
            historial.setText(letras.toString());
        }else{
            max = 381;
            registro.append((char)pos + "\n");
        }
    }
}
