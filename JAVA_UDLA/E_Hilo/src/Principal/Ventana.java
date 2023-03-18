package Principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTabbedPane;

public class Ventana extends JFrame implements ActionListener, MouseListener {

    Cronometro cronometro;
    Reloj reloj;
    Temporizador temporizador;
    JTabbedPane principal;
    Emergente emergente;

    boolean x;
    boolean y;
    boolean o;

    int w;
    int z;
    int p;

    HiloCronometro Hcronometro;
    HiloReloj Hreloj;
    HiloTemporizador Htemporizador;

    public Ventana() {
        setTitle("Cronometro");
        Componentes();
        add(principal);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes() {
        cronometro = new Cronometro();
        reloj = new Reloj();
        temporizador = new Temporizador();

        cronometro.play.addActionListener(this);
        cronometro.reiniciar.addActionListener(this);
        cronometro.segundos.addActionListener(this);

        reloj.PausarHora.addActionListener(this);
        reloj.Actualizar.addActionListener(this);

        temporizador.Iniciar.addActionListener(this);
        temporizador.Reiniciar.addActionListener(this);
        temporizador.num.addMouseListener(this);
        emergente = new Emergente(this, true);
        emergente.hecho.addActionListener(this);

        principal = new JTabbedPane();
        principal.setBackground(null);
        principal.add("Reloj", reloj);
        principal.add("Cronometro", cronometro);
        principal.add("Temporizador", temporizador);
        //principal.add("Precio", precio);
        //principal.setEnabledAt(1, true);//para activar o desactivar pestañas

        x = true;
        y = true;
        o = true;
        w = 0;
        z = 0;
        p = 0;
        
        Hreloj = new HiloReloj(reloj.hora);
        Hreloj.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cronometro.play && x) {
            if (w == 0) {
                Hcronometro.start();
                w++;
            } else {
                Hcronometro.resume();
            }

            cronometro.reiniciar.setEnabled(true);
            cronometro.play.setText("PAUSE");
            x = false;

        } else if (e.getSource() == cronometro.play) {
            Hcronometro.suspend();

            cronometro.reiniciar.setEnabled(true);
            cronometro.play.setText("PLAY");
            x = true;

        } else if (e.getSource() == cronometro.reiniciar) {
            Hcronometro.stop();

            cronometro.Hora.setText("00:00:00");
            cronometro.play.setText("PLAY");
            cronometro.reiniciar.setEnabled(false);
            cronometro.segundos.setEnabled(true);
            cronometro.play.setEnabled(false);
            cronometro.segundos.setSelectedIndex(0);
            w = 0;
            x = true;

        } else if (e.getSource() == cronometro.segundos) {
            long velocidad = 0;
            switch (cronometro.segundos.getSelectedIndex()) {
                case 1:
                    velocidad = 500;
                    break;
                case 2:
                    velocidad = 1000;
                    break;
                case 3:
                    velocidad = 2000;
                    break;
                case 4:
                    velocidad = 4000;
                    break;
                case 5:
                    velocidad = 10000;
                    break;
                default:
                    break;
            }
            if (cronometro.segundos.getSelectedIndex() != 0) {
                cronometro.play.setEnabled(true);
                cronometro.segundos.setEnabled(false);
            }

            Hcronometro = new HiloCronometro("cronometro", velocidad, cronometro.Hora);

        } else if (e.getSource() == emergente.hecho) {
            if ((int) emergente.hora.getValue() <= 9) {
                temporizador.hora.setText("0" + String.valueOf(emergente.hora.getValue()) + ":");
            } else {
                temporizador.hora.setText(String.valueOf(emergente.hora.getValue()) + ":");
            }

            if ((int) emergente.minuto.getValue() <= 9) {
                temporizador.hora.setText(temporizador.hora.getText() + "0" + String.valueOf(emergente.minuto.getValue()) + ":");
            } else {
                temporizador.hora.setText(temporizador.hora.getText() + String.valueOf(emergente.minuto.getValue()) + ":");
            }

            if ((int) emergente.segundo.getValue() <= 9) {
                temporizador.hora.setText(temporizador.hora.getText() + "0" + String.valueOf(emergente.segundo.getValue()));
            } else {
                temporizador.hora.setText(temporizador.hora.getText() + String.valueOf(emergente.segundo.getValue()));
            }

            if ((int) emergente.hora.getValue() > 0 || (int) emergente.minuto.getValue() > 0 || (int) emergente.segundo.getValue() > 0) {
                temporizador.Iniciar.setEnabled(true);
                Htemporizador = new HiloTemporizador(500, this);
            }
            emergente.dispose();

        } else if (e.getSource() == temporizador.Iniciar && o) {
            if (p == 0) {
                Htemporizador.start();
                p++;
            } else {
                Htemporizador.resume();
            }
            temporizador.Iniciar.setText("Pausar");
            temporizador.Reiniciar.setEnabled(true);
            o = false;
        } else if (e.getSource() == temporizador.Iniciar) {
            Htemporizador.suspend();
            temporizador.Iniciar.setText("Reanudar");
            temporizador.Reiniciar.setEnabled(true);
            o = true;

        } else if (e.getSource() == temporizador.Reiniciar) {
            Htemporizador.stop();
            reiniciaR();
        } else if (e.getSource() == reloj.PausarHora && y) {
            Hreloj.resume();
            reloj.PausarHora.setText("Reanudar");
            reloj.Actualizar.setEnabled(true);
            y = false;
            //hilo = new Proceso(1000, numeros);

        } else if (e.getSource() == reloj.PausarHora) {
            //Hreloj.suspend();
            reloj.PausarHora.setText("Pausar Hora");
            y = true;

        } else if (e.getSource() == reloj.Actualizar) {
            reloj.HoraActual();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        emergente.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        temporizador.hora.setForeground(Color.CYAN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        temporizador.hora.setForeground(Color.DARK_GRAY);
    }

    public void reiniciaR() {
        o = true;
        temporizador.Iniciar.setText("Iniciar");
        temporizador.Iniciar.setEnabled(false);
        temporizador.Reiniciar.setEnabled(false);
        temporizador.hora.setText("00:00:00");
        p = 0;
    }

}
