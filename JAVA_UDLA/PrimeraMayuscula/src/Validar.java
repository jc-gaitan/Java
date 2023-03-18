
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

public class Validar implements KeyListener {

    JTextField campo;

    public Validar(JTextField campo) {
        this.campo = campo;
    }

    public void SoloLetras(KeyEvent e) {
        char caracter = e.getKeyChar();
        if (Character.isDigit(caracter)) {//si es numero
            e.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public void Mayuscula() {
        if (campo.getText().trim().length() == 1) {
            campo.setText(String.valueOf(campo.getText().charAt(0)).toUpperCase());
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        SoloLetras(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Mayuscula();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
