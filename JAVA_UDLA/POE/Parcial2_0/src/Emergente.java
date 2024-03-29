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
import javax.swing.JTextArea;

public class Emergente extends JDialog{
    
    JLabel title;
    
    Font font;
    
    JButton hecho;
    
    JTextArea Novedades;
    
    public Emergente(JFrame padre, boolean modal, JTextArea Novedades){
        super(padre,modal);
    
	setUndecorated(true);//para quitar la x de cerrar
        
	this.Novedades = Novedades;        
        Componentes();
        
        setLayout(new GridBagLayout());
        Organizar();       
        
        setLocationRelativeTo(padre);
        pack();
        //setResizable(false);
    }
    
    public void Componentes(){
        //hecho = new JButton("Cerrar");
        
        title = new JLabel(" NOVEDADES");
        //title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        title.setOpaque(true);//activa el setBackground
        Color col = new Color(0,128,255);
        title.setBackground(col);
        font = new Font("Times New Roman", Font.BOLD, 30);
        title.setFont(font);
        title.setForeground(Color.WHITE);//cambiar el color de la letra
        title.setAlignmentX(CENTER_ALIGNMENT);//centra el componente
    }
    
    public void Organizar(){
        //c.insets = new Insets(int arriba, int izquierda, int abajo, int derecha);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(title, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 6;
        c.gridheight = 6;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(10, 4, 4, 4);
        add(Novedades, c);
    }
    
}
