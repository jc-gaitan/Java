package PvE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class Ventana extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    Reglas reglas;
    Jugador jugador1;

    boolean x = true;
    
    Pseudocodigo pseudocodigo;

    public Ventana() {
        Componentes();

        setTitle("Proyecto");
        setSize(600, 560);

        getContentPane().setBackground(Color.WHITE);
        setResizable(true);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        add(jugador1);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        reglas.setVisible(true);
    }

    public void Componentes() {
        reglas = new Reglas(this, true);
        reglas.hecho.addActionListener(this);
        reglas.Link.addMouseListener(this);

        jugador1 = new Jugador();
        jugador1.panel1.lagartija.addMouseMotionListener(this);
        jugador1.panel1.papel.addMouseMotionListener(this);
        jugador1.panel1.roca.addMouseMotionListener(this);
        jugador1.panel1.spock.addMouseMotionListener(this);
        jugador1.panel1.tigeras.addMouseMotionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reglas.hecho) {
            reglas.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == reglas.Link) {
            reglas.abrirLink();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == jugador1.panel1.papel) {
            jugador1.panel1.papel.setLocation(jugador1.panel1.papel.getX() + e.getX() - jugador1.panel1.papel.getWidth() / 2, jugador1.panel1.papel.getY() + e.getY() - jugador1.panel1.papel.getHeight() / 2);
            posicion(jugador1.panel1.papel.getX(), jugador1.panel1.papel.getY(), jugador1.panel1.papel);
        } else if (e.getSource() == jugador1.panel1.lagartija) {
            jugador1.panel1.lagartija.setLocation(jugador1.panel1.lagartija.getX() + e.getX() - jugador1.panel1.lagartija.getWidth() / 2, jugador1.panel1.lagartija.getY() + e.getY() - jugador1.panel1.lagartija.getHeight() / 2);
            posicion(jugador1.panel1.lagartija.getX(), jugador1.panel1.lagartija.getY(), jugador1.panel1.lagartija);
        } else if (e.getSource() == jugador1.panel1.roca) {
            jugador1.panel1.roca.setLocation(jugador1.panel1.roca.getX() + e.getX() - jugador1.panel1.roca.getWidth() / 2, jugador1.panel1.roca.getY() + e.getY() - jugador1.panel1.roca.getHeight() / 2);
            posicion(jugador1.panel1.roca.getX(), jugador1.panel1.roca.getY(), jugador1.panel1.roca);
        } else if (e.getSource() == jugador1.panel1.spock) {
            jugador1.panel1.spock.setLocation(jugador1.panel1.spock.getX() + e.getX() - jugador1.panel1.spock.getWidth() / 2, jugador1.panel1.spock.getY() + e.getY() - jugador1.panel1.spock.getHeight() / 2);
            posicion(jugador1.panel1.spock.getX(), jugador1.panel1.spock.getY(), jugador1.panel1.spock);
        } else if (e.getSource() == jugador1.panel1.tigeras) {
            jugador1.panel1.tigeras.setLocation(jugador1.panel1.tigeras.getX() + e.getX() - jugador1.panel1.tigeras.getWidth() / 2, jugador1.panel1.tigeras.getY() + e.getY() - jugador1.panel1.tigeras.getHeight() / 2);
            posicion(jugador1.panel1.tigeras.getX(), jugador1.panel1.tigeras.getY(), jugador1.panel1.tigeras);
        }
    }

    public void posicion(int x, int y, JLabel a) {
        if (x >= 305 && x <= 340 && y >= 393 && y <= 414) {
            a.setLocation(318, 402);

            jugador1.cardLayout.show(jugador1, "panel2");

            jugador1.panel2.ud.setIcon(a.getIcon());
            jugador1.panel2.ud.setText(a.getText());
            jugador1.panel2.ud.setFont(a.getFont());

            if (this.x) {
                Aleatorio();
                /*pseudocodigo = new Pseudocodigo(this,true, jugador1.panel2.ud.getText(), jugador1.panel2.op.getText());
                pseudocodigo.setVisible(true);*/
                DefinirGanador();
                this.x=false;
            }
        }
    }

    public void Aleatorio() {
        ImageIcon imagen;

        int ramdon = (int) (Math.random() * 5) + 1;
        System.out.println(ramdon);
        switch (ramdon) {
            case 1:
                imagen = new ImageIcon(getClass().getResource("/Imagenes/diamante.png"));
                jugador1.panel2.op.setIcon(imagen);
                jugador1.panel2.op.setText("roca");
                jugador1.panel2.op.setFont(new Font("Arial", Font.PLAIN, 0));
                break;
            case 2:
                imagen = new ImageIcon(getClass().getResource("/Imagenes/avion.png"));
                jugador1.panel2.op.setIcon(imagen);
                jugador1.panel2.op.setText("papel");
                jugador1.panel2.op.setFont(new Font("Arial", Font.PLAIN, 0));
                break;
            case 3:
                imagen = new ImageIcon(getClass().getResource("/Imagenes/tigeras.png"));
                jugador1.panel2.op.setIcon(imagen);
                jugador1.panel2.op.setText("tigeras");
                jugador1.panel2.op.setFont(new Font("Arial", Font.PLAIN, 0));
                break;
            case 4:
                imagen = new ImageIcon(getClass().getResource("/Imagenes/lagartija.png"));
                jugador1.panel2.op.setIcon(imagen);
                jugador1.panel2.op.setText("lagartija");
                jugador1.panel2.op.setFont(new Font("Arial", Font.PLAIN, 0));
                break;
            case 5:
                imagen = new ImageIcon(getClass().getResource("/Imagenes/spock.png"));
                jugador1.panel2.op.setIcon(imagen);
                jugador1.panel2.op.setText("spock");
                jugador1.panel2.op.setFont(new Font("Arial", Font.PLAIN, 0));
                break;
        }
    }

    public void DefinirGanador() {
        ImageIcon empate = new ImageIcon(getClass().getResource("/Imagenes/empate.png"));
        ImageIcon ganador = new ImageIcon(getClass().getResource("/Imagenes/ganador.png"));
        ImageIcon perdedor = new ImageIcon(getClass().getResource("/Imagenes/perdedor.png"));

        if (jugador1.panel2.ud.getText().equals(jugador1.panel2.op.getText())) {

            jugador1.panel2.esperando.setIcon(empate);
            jugador1.panel2.mensaje.setText("EMPATE");

        } else if (jugador1.panel2.ud.getText().equals("tigeras") && jugador1.panel2.op.getText().equals("papel")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("Tigeras corta Papel");

        } else if (jugador1.panel2.op.getText().equals("tigeras") && jugador1.panel2.ud.getText().equals("papel")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("Tigeras corta Papel");

        } else if (jugador1.panel2.ud.getText().equals("papel") && jugador1.panel2.op.getText().equals("roca")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("El papel cubre la roca");

        } else if (jugador1.panel2.op.getText().equals("papel") && jugador1.panel2.ud.getText().equals("roca")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("El papel cubre la roca");

        } else if (jugador1.panel2.ud.getText().equals("roca") && jugador1.panel2.op.getText().equals("lagartija")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("La roca aplasta a la lagartija");

        } else if (jugador1.panel2.op.getText().equals("roca") && jugador1.panel2.ud.getText().equals("lagartija")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("La roca aplasta a la lagartija");

        } else if (jugador1.panel2.ud.getText().equals("lagartija") && jugador1.panel2.op.getText().equals("spock")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("La lagartija envenena a Spock");

        } else if (jugador1.panel2.op.getText().equals("lagartija") && jugador1.panel2.ud.getText().equals("spock")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("La lagartija envenena a Spock");

        } else if (jugador1.panel2.ud.getText().equals("spock") && jugador1.panel2.op.getText().equals("tigeras")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("Spock rompe las tigeras");

        } else if (jugador1.panel2.op.getText().equals("spock") && jugador1.panel2.ud.getText().equals("tigeras")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("Spock rompe las tigeras");

        } else if (jugador1.panel2.ud.getText().equals("tigeras") && jugador1.panel2.op.getText().equals("lagartija")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("Las tigeras decapitan a la lagartija");

        } else if (jugador1.panel2.op.getText().equals("tigeras") && jugador1.panel2.ud.getText().equals("lagartija")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("Las tigeras decapitan a la lagartija");

        } else if (jugador1.panel2.ud.getText().equals("lagartija") && jugador1.panel2.op.getText().equals("papel")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("La lagartija se come a el papel");

        } else if (jugador1.panel2.op.getText().equals("lagartija") && jugador1.panel2.ud.getText().equals("papel")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("La lagartija se come a el papel");

        } else if (jugador1.panel2.ud.getText().equals("papel") && jugador1.panel2.op.getText().equals("spock")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("El papel rechaza a Spock");

        } else if (jugador1.panel2.op.getText().equals("papel") && jugador1.panel2.ud.getText().equals("spock")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("El papel rechaza a Spock");

        } else if (jugador1.panel2.ud.getText().equals("spock") && jugador1.panel2.op.getText().equals("roca")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("Spock vaporiza la roca");

        } else if (jugador1.panel2.op.getText().equals("spock") && jugador1.panel2.ud.getText().equals("roca")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("Spock vaporiza la roca");

        } else if (jugador1.panel2.ud.getText().equals("roca") && jugador1.panel2.op.getText().equals("tigeras")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("La roca aplasta a las tigeras");

        } else if (jugador1.panel2.op.getText().equals("roca") && jugador1.panel2.ud.getText().equals("tigeras")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("La roca aplasta a las tigeras");

        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
