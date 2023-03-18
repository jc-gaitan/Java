
package Principal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado implements KeyListener{
    
    Ventana a;
    
    /*
    keyPressed(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla.
    keyReleased(KeyEvent e): Se ejecuta cuando el usuario libera una tecla
    keyTyped(KeyEvent e): Se ejecuta cuando el usuario presiona una 
    tecla, pero solo cuando la tecla corresponde a caractéres, teclas especiales como F1, F2 entre otras no son identificadas.
    */
    
    public EventoTeclado(Ventana a){
        this.a = a;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //a.t.setText(a.d.getText());
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_ENTER){
            a.z.setText(a.c.getText());
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        a.t.setText(a.d.getText());
        a.q1.setText(a.q.getText());
    }
    
}
