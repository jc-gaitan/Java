/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowcardlayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCardLayout implements ActionListener {

    WindowCardLayout1 ventana;

    public ControlCardLayout(WindowCardLayout1 frame) {
        ventana = frame;
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == ventana.combo) {
            if (ventana.combo.getSelectedIndex() == 0) {
                ventana.cardLayout.show(ventana.panelInferior, "panel1");
            }
            if (ventana.combo.getSelectedIndex() == 1) {
                ventana.cardLayout.show(ventana.panelInferior, "panel2");
            }
            if (ventana.combo.getSelectedIndex() == 2) {
                ventana.cardLayout.show(ventana.panelInferior, "panel3");
            }
        }
    }
}
