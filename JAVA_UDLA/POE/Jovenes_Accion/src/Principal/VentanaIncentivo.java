
package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class VentanaIncentivo extends JDialog implements ActionListener{
    Incentivo incen;

    public VentanaIncentivo(JFrame padre, boolean modal,Incentivo incen){
        super(padre,modal);
        this.incen = incen;
        setTitle("Incetivos");
        //setLocationRelativeTo(null);
        //setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        incen.salir.addActionListener(this);
        add(incen);

        pack();
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

}
