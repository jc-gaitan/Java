
package e5;


import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;


public class EventoSlider implements ChangeListener{
    
    Ventana a;
    Color rgb;
    
    public EventoSlider(Ventana a){
        this.a = a;
    }

    @Override
    public void stateChanged(ChangeEvent e) { 
        if(e.getSource() == a.r){
            a.r1.setText("R ("+String.valueOf(a.r.getValue())+")");
        }else if(e.getSource() == a.b){
            a.b1.setText("B ("+String.valueOf(a.b.getValue())+")");
        }else if(e.getSource() == a.g){
            a.g1.setText("G ("+String.valueOf(a.g.getValue())+")");
        }
        rgb=new Color(a.r.getValue(),a.b.getValue(),a.g.getValue());
        a.colorla.setBackground(rgb);
    }

    
}
