
package letras_aleatorias;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JTextField;


public class validaciones {
     public void vNumero(KeyEvent e, JTextField campo) {
        char c = e.getKeyChar();
        if (e.getSource().equals(campo)) {
            if (!Character.isDigit(c)) {
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    
    public void vVacio(JTextField campo, JButton b) {
        if (campo.getText().trim().isEmpty()) {
            b.setEnabled(false);
        } else {
            b.setEnabled(true);
        }
        
    }

   
}
