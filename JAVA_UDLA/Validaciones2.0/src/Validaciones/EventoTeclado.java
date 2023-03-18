package Validaciones;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class EventoTeclado implements KeyListener {

    Ventana a;

    /*
    keyPressed(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla.
    keyReleased(KeyEvent e): Se ejecuta cuando el usuario libera una tecla
    keyTyped(KeyEvent e): Se ejecuta cuando el usuario presiona una 
    tecla, pero solo cuando la tecla corresponde a caractéres, teclas especiales como F1, F2 entre otras no son identificadas.
    */
    
    public EventoTeclado(Ventana a) {
        this.a = a;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        char c = ke.getKeyChar();
        if (ke.getSource().equals(a.numdoc)) {
            if (a.numdoc.getText().length() >= 12) {
                JOptionPane.showMessageDialog(a, "SU NUMERO DE DOCUMENTO NO PUEDE EXCEDER LOS 12 NUMEROS. ");
            }
            if (Character.isLetter(c)) {//solo numeros
                ke.consume();
            }
        } else {
            if (Character.isDigit(c)) {//solo letras
                ke.consume();
            }
        }
        /*
            Character.isAlphabetic(c);//devuelve true si el char pertenese al alfabeto
            Character.isLetter(c)//true si el char es una letra
            Character.isDigit(c)//true si el char es un dígito
            ke.consume();//no deja ingresar la letra
         */
    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getSource() == a.camName1) {
            a.camName1.setText(a.camName1.getText().toUpperCase());
        } else if (ke.getSource() == a.camName2) {
            a.camName2.setText(a.camName2.getText().toUpperCase());
        } else if (ke.getSource() == a.camApe1) {
            a.camApe1.setText(a.camApe1.getText().toUpperCase());
        } else if (ke.getSource() == a.camApe2) {
            a.camApe2.setText(a.camApe2.getText().toUpperCase());
        }
    }

}
