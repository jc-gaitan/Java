
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCliente extends JPanel {

    JLabel Cliente;

    public PanelCliente() {
        Componentes();
        //setBackground(Color.BLUE);
        setLayout(new BorderLayout());
        add(Cliente, BorderLayout.EAST);
    }

    private void Componentes() {
        ImageIcon clien = new ImageIcon(getClass().getResource("/Otras/inicio.png"));
        clien = new ImageIcon(clien.getImage().getScaledInstance(192, 336, Image.SCALE_DEFAULT));
        Cliente = new JLabel(clien);
    }

}
