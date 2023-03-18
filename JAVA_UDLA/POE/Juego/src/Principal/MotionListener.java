
package Principal;

import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class MotionListener implements MouseMotionListener{
    
    JPanel2 a;
    JPanel2 b;
    
    JLabel opcion;
    
    int oriX;
    int oriY;
    
    HiloIcono hilo;
    
    public MotionListener(JPanel2 a, JPanel2 b, JLabel opcion){
        this.a = a;
        this.b = b;
        this.opcion = opcion;
        
        hilo = new HiloIcono(a.op);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        oriX = opcion.getX();
        oriY = opcion.getY();
        if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
            hilo.start();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
}
