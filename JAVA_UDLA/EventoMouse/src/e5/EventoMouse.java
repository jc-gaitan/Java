
package e5;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventoMouse implements MouseListener{
    
    Ventana a;
    
    public EventoMouse(Ventana a){
        this.a = a;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        //Se llama cuando se oprime y se suelta un botón en el mouse.
        //a.b2.setText("mouseClicked");
        /*
        Es la combinacion de mousePressed y mouseReleased
        */
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //es llamado cuando se oprime un botón en el Mouse.
        a.b2.setText("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Ocurre cuando se suelta un botón en el Mouse.
        a.b2.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Ocurre cuando el cursor entra dentro de los límites del componente.
        a.b2.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Ocurre cuando el cursor sale dentro de los límites del componente.
        a.b2.setText("mouseExited");   
    }
    
}
