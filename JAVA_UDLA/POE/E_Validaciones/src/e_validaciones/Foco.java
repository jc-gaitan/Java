
package e_validaciones;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Foco implements FocusListener{
    
    Ventana a;
    
    public Foco(Ventana a){
        this.a = a;
    }

    @Override
    public void focusGained(FocusEvent fe) {//tiene el foco
        
    }

    @Override
    public void focusLost(FocusEvent fe) {//no tiene foco
        
    }
    
}
