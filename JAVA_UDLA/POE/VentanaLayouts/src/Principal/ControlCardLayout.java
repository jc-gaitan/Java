
package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCardLayout implements ActionListener{
    Ventana ventana;
    
    public ControlCardLayout(Ventana jframe){
        ventana = jframe;
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == ventana.list) {
            if (ventana.list.getSelectedIndex() == 0) {
                ventana.cardLayout.show(ventana.layouts,"Opciones");
            }else
            if (ventana.list.getSelectedIndex() == 1) {
                ventana.cardLayout.show(ventana.layouts,"FlowLayout");
            }else
            if (ventana.list.getSelectedIndex() == 2) {
                ventana.cardLayout.show(ventana.layouts,"BorderLayout");
            }else
            if (ventana.list.getSelectedIndex() == 3) {
                ventana.cardLayout.show(ventana.layouts,"GridLayout");
            }else
            if (ventana.list.getSelectedIndex() == 4) {
                ventana.cardLayout.show(ventana.layouts, "BoxLayout");
            }else if (ventana.list.getSelectedIndex() == 5) {
                ventana.cardLayout.show(ventana.layouts, "GridBagLayout");
            }
        }
    }
}
