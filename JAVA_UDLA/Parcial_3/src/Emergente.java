
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Emergente extends JDialog{
    
    JLabel title;
    JLabel x;
    Font font;
    JLabel DineroReco;
    JLabel CanVendida;
    
    public Emergente(JFrame padre, boolean modal){
        super(padre,modal);

        //setUndecorated(true);//quitar la decoracion
        
        Componentes();
        
        setLayout(new GridBagLayout());
        Organizar();       
        
        setLocationRelativeTo(padre);
        pack();
        setResizable(false);
    }

    private void Componentes() {
        title = new JLabel(" Informe Final                      ");
        title.setOpaque(true);//activa el setBackground
        Color col = new Color(0,128,255);
        title.setBackground(col);
        font = new Font("Times New Roman", Font.BOLD, 30);
        title.setFont(font);
        title.setForeground(Color.WHITE);//cambiar el color de la letra
        title.setAlignmentX(CENTER_ALIGNMENT);//centra el componente
        
        x = new JLabel("    X ");
        x.setOpaque(true);
        x.setBackground(col);
        x.setFont(font);
        x.setForeground(Color.WHITE);
        x.setAlignmentX(CENTER_ALIGNMENT);

        CanVendida = new JLabel("La cantidad vendida es:    ");  
        CanVendida.setFont(font);
        CanVendida.setForeground(Color.BLACK);
        DineroReco = new JLabel("El dinero recolectado:     ");
        DineroReco.setFont(font);
        DineroReco.setForeground(Color.BLACK);
    }

    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(title, c);

        c.gridx = 6;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(x, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(CanVendida, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(DineroReco, c);
        
    }
    
}
