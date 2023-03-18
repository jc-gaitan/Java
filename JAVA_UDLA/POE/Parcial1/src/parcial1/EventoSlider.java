
package parcial1;


import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import javax.swing.JPanel;


public class EventoSlider implements ChangeListener{
    
    JPanel a;
    Color col;
    
    public EventoSlider(JPanel a){
        this.a = a;
    }

    @Override
    public void stateChanged(ChangeEvent e) { 
        
    }

    
}
