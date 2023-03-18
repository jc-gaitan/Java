
package Principal;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Foco implements FocusListener{
    
    Ventana a;
    
    public Foco(Ventana a){
        this.a = a;
    }

    @Override
    public void focusGained(FocusEvent fe) {
        if(fe.getSource() == a.d){
            System.out.println("D Tiene el Foco");
        }else if(fe.getSource() == a.q){
            System.out.println("Q Tiene el Foco");
        }
    }

    @Override
    public void focusLost(FocusEvent fe) {
        if(fe.getSource() == a.d){
            System.out.println("D no Tiene el Foco");
        }else if(fe.getSource() == a.q){
            System.out.println("Q no Tiene el Foco");
        }
        
    }
    
}
