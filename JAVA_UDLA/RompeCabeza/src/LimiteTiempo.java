
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class LimiteTiempo extends JDialog {
   JLabel title;
    JLabel mensaje;
    
    Font font;
    
    JButton hecho;
    
    JLabel Link;
    
    public LimiteTiempo(JFrame padre, boolean modal){
        super(padre,modal);
        setTitle("      ");
        Componentes();
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(new GridBagLayout());
        Organizar();       
        
        pack();
        setResizable(false);
        setLocationRelativeTo(padre);
    }
    
    public void Componentes(){
        hecho = new JButton("Salir");
        
        title = new JLabel("Perdiste", SwingConstants.CENTER);//para que el texto salga en el centro del jlabel
        title.setOpaque(true);//activa el setBackground
        Color col = new Color(0,128,255);
        title.setBackground(col);
        font = new Font("Times New Roman", Font.BOLD, 30);
        title.setFont(font);
        title.setForeground(Color.WHITE);//cambiar el color de la letra
        
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
        c.gridy = 6;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(hecho, c);
    }  
}
