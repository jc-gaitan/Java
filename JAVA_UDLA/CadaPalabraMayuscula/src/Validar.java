
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

public class Validar implements KeyListener {

    JTextField campo;
    int x = 0;

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

    public void Mayuscula(KeyEvent e) {
        //campo.getText().trim().length() == 1
        if (x == 0) {
            //campo.setText(String.valueOf(campo.getText().charAt(0)).toUpperCase());
            String letra = String.valueOf(e.getKeyChar());
            letra = letra.toUpperCase();
            e.setKeyChar(letra.charAt(0));
            String a = campo.getText();
            //System.out.println(letra.substring(letra.length(), letra.length()-1));
            //System.out.println(letra.length());
            //System.out.println(e.getKeyChar());
            //campo.setText(a+a.substring(a.length()-1,a.length()));
            //System.out.println(a.substring(a.length()-1,a.length()));
            a = a.substring(0, a.length()-1) + letra;
            campo.setText(a);
            x = 1;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        SoloLetras(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Mayuscula(e);
        //System.out.println(e.getKeyChar());
                
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            x = 0;
        }
    }

}
