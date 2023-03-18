/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Argenis Figueroa
 */
public class validar {
    
    public void validarNumero(KeyEvent e, JTextField campo) {
        char c = e.getKeyChar();
        if (e.getSource().equals(campo)) {
            if (!Character.isDigit(c)) {//solo numeros
                e.consume();
                Toolkit.getDefaultToolkit().beep();//hace sonar el sonido de error
            }
        }
    }
    
    public void validarVacio(JTextField campo, JButton b) {
        if (campo.getText().trim().isEmpty()) {
            b.setEnabled(false);
        } else {
            b.setEnabled(true);
        }
        
    }
    
}
