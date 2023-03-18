
package e_validaciones;

import static java.awt.Component.RIGHT_ALIGNMENT;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class VentanaNovedades extends JDialog implements ActionListener{
    
    JTextArea novedades;
    JButton salir;

    public VentanaNovedades(JFrame padre, boolean modal,JTextArea novedades){
        super(padre,modal);
        this.novedades = novedades;
        setTitle("Novedades");
        add(novedades);

        setLocationRelativeTo(null);
        pack();
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

}
