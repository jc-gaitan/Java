package Pruebas;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Codigo implements MouseMotionListener {

    Jugador jugador1;
    Jugador jugador2;
    JLabel a;

    public Codigo(Jugador jugador1, Jugador jugador2, JLabel a) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.a = a;
    }

    public JLabel asd(JLabel a, int x, int y) {
        a.setLocation(a.getX() + x - a.getWidth() / 2, a.getY() + y - a.getHeight() / 2);
        return a;
    }

    public void posicion(int x, int y, JLabel a) {
        if (x >= 305 && x <= 340 && y >= 393 && y <= 414) {
            a.setLocation(318, 402);

            jugador1.cardLayout.show(jugador1, "panel2");

            jugador1.panel2.ud.setIcon(a.getIcon());
            jugador1.panel2.ud.setText(a.getText());
            jugador1.panel2.ud.setFont(a.getFont());

            jugador2.panel2.op.setIcon(a.getIcon());
            jugador2.panel2.op.setText(a.getText());
            jugador2.panel2.op.setFont(a.getFont());

            if (!jugador1.panel2.op.getText().equals("")) {
                DefinirGanador();
            }
        }
    }
    
    public void DefinirGanador() {
        ImageIcon empate = new ImageIcon(getClass().getResource("/Imagenes/empate.png"));
        ImageIcon ganador = new ImageIcon(getClass().getResource("/Imagenes/ganador.png"));
        ImageIcon perdedor = new ImageIcon(getClass().getResource("/Imagenes/perdedor.png"));

        if (jugador1.panel2.ud.getText().equals(jugador1.panel2.op.getText())) {

            jugador1.panel2.esperando.setIcon(empate);
            jugador1.panel2.mensaje.setText("EMPATE");
            jugador2.panel2.esperando.setIcon(empate);
            jugador2.panel2.mensaje.setText("EMPATE");

        } else if (jugador1.panel2.ud.getText().equals("tigeras") && jugador1.panel2.op.getText().equals("papel")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("Tigeras corta Papel");
            jugador2.panel2.mensaje.setText("Tigeras corta Papel");

        } else if (jugador1.panel2.op.getText().equals("tigeras") && jugador1.panel2.ud.getText().equals("papel")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("Tigeras corta Papel");
            jugador2.panel2.mensaje.setText("Tigeras corta Papel");

        } else if (jugador1.panel2.ud.getText().equals("papel") && jugador1.panel2.op.getText().equals("roca")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("El papel cubre la roca");
            jugador2.panel2.mensaje.setText("El papel cubre la roca");

        } else if (jugador1.panel2.op.getText().equals("papel") && jugador1.panel2.ud.getText().equals("roca")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("El papel cubre la roca");
            jugador2.panel2.mensaje.setText("El papel cubre la roca");

        } else if (jugador1.panel2.ud.getText().equals("roca") && jugador1.panel2.op.getText().equals("lagartija")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("La roca aplasta a la lagartija");
            jugador2.panel2.mensaje.setText("La roca aplasta a la lagartija");

        } else if (jugador1.panel2.op.getText().equals("roca") && jugador1.panel2.ud.getText().equals("lagartija")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("La roca aplasta a la lagartija");
            jugador2.panel2.mensaje.setText("La roca aplasta a la lagartija");

        } else if (jugador1.panel2.ud.getText().equals("lagartija") && jugador1.panel2.op.getText().equals("spock")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("La lagartija envenena a Spock");
            jugador2.panel2.mensaje.setText("La lagartija envenena a Spock");

        } else if (jugador1.panel2.op.getText().equals("lagartija") && jugador1.panel2.ud.getText().equals("spock")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("La lagartija envenena a Spock");
            jugador2.panel2.mensaje.setText("La lagartija envenena a Spock");

        } else if (jugador1.panel2.ud.getText().equals("spock") && jugador1.panel2.op.getText().equals("tigeras")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("Spock rompe las tigeras");
            jugador2.panel2.mensaje.setText("Spock rompe las tigeras");

        } else if (jugador1.panel2.op.getText().equals("spock") && jugador1.panel2.ud.getText().equals("tigeras")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("Spock rompe las tigeras");
            jugador2.panel2.mensaje.setText("Spock rompe las tigeras");

        } else if (jugador1.panel2.ud.getText().equals("tigeras") && jugador1.panel2.op.getText().equals("lagartija")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("Las tigeras decapitan a la lagartija");
            jugador2.panel2.mensaje.setText("Las tigeras decapitan a la lagartija");

        } else if (jugador1.panel2.op.getText().equals("tigeras") && jugador1.panel2.ud.getText().equals("lagartija")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("Las tigeras decapitan a la lagartija");
            jugador2.panel2.mensaje.setText("Las tigeras decapitan a la lagartija");

        } else if (jugador1.panel2.ud.getText().equals("lagartija") && jugador1.panel2.op.getText().equals("papel")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("La lagartija se come a el papel");
            jugador2.panel2.mensaje.setText("La lagartija se come a el papel");

        } else if (jugador1.panel2.op.getText().equals("lagartija") && jugador1.panel2.ud.getText().equals("papel")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("La lagartija se come a el papel");
            jugador2.panel2.mensaje.setText("La lagartija se come a el papel");

        } else if (jugador1.panel2.ud.getText().equals("papel") && jugador1.panel2.op.getText().equals("spock")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("El papel rechaza a Spock");
            jugador2.panel2.mensaje.setText("El papel rechaza a Spock");

        } else if (jugador1.panel2.op.getText().equals("papel") && jugador1.panel2.ud.getText().equals("spock")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("El papel rechaza a Spock");
            jugador2.panel2.mensaje.setText("El papel rechaza a Spock");

        } else if (jugador1.panel2.ud.getText().equals("spock") && jugador1.panel2.op.getText().equals("roca")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("Spock vaporiza la roca");
            jugador2.panel2.mensaje.setText("Spock vaporiza la roca");

        } else if (jugador1.panel2.op.getText().equals("spock") && jugador1.panel2.ud.getText().equals("roca")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("Spock vaporiza la roca");
            jugador2.panel2.mensaje.setText("Spock vaporiza la roca");

        } else if (jugador1.panel2.ud.getText().equals("roca") && jugador1.panel2.op.getText().equals("tigeras")) {

            jugador1.panel2.esperando.setIcon(ganador);
            jugador2.panel2.esperando.setIcon(perdedor);
            jugador1.panel2.mensaje.setText("La roca aplasta a las tigeras");
            jugador2.panel2.mensaje.setText("La roca aplasta a las tigeras");

        } else if (jugador1.panel2.op.getText().equals("roca") && jugador1.panel2.ud.getText().equals("tigeras")) {

            jugador1.panel2.esperando.setIcon(perdedor);
            jugador2.panel2.esperando.setIcon(ganador);
            jugador1.panel2.mensaje.setText("La roca aplasta a las tigeras");
            jugador2.panel2.mensaje.setText("La roca aplasta a las tigeras");

        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        a.setLocation(a.getX() + e.getX() - a.getWidth() / 2, a.getY() + e.getY() - a.getHeight() / 2);
        posicion(a.getX(), a.getY(), a);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
