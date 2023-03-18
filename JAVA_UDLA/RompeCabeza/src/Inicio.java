
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Inicio extends JDialog{
    Ventana ven;
        
    JButton b1,b2;
    
    Font font;
    
    JLabel L1, title;
        
    public Inicio(JFrame padre, boolean modal){
        super(padre,modal);
        setTitle("      ");
        Componentes();
        
        getContentPane().setBackground(Color.PINK);
        
        setLayout(new GridBagLayout());
        Organizar();
                
        setResizable(true);
        pack(); 
        setLocationRelativeTo(padre);
    }
    
    public void Componentes(){       
        /*title = new JLabel("Inicio", SwingConstants.CENTER);//para que el texto salga en el centro del jlabel
        title.setOpaque(true);//activa el setBackground
        Color col = new Color(0,128,255);
        title.setBackground(col);
        font = new Font("Times New Roman", Font.BOLD, 30);
        title.setFont(font);
        title.setForeground(Color.WHITE);//cambiar el color de la letra*/
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.jpg")).getImage());
       
        
        ImageIcon fondo = new ImageIcon(getClass().getResource("/Imagenes/images.jpg"));
        fondo = new ImageIcon(fondo.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT));
        L1 = new JLabel(fondo);
        
        b1 = new JButton();
        //b1.addActionListener(this);
        ImageIcon bo1 = new ImageIcon(getClass().getResource("/Imagenes/play.jpg"));
        bo1 = new ImageIcon(bo1.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT));
        b1.setIcon(bo1);
        
        
        b2 = new JButton();
        //b2.addActionListener(this);
        ImageIcon bo2 = new ImageIcon(getClass().getResource("/Imagenes/descarga.png"));
        bo2 = new ImageIcon(bo2.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT));
        b2.setIcon(bo2);
        
    }
    
    public void Organizar(){
        //c.insets = new Insets(int arriba, int izquierda, int abajo, int derecha);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
//        c.insets = new Insets(0, 4, 0, 4);
        add(L1, c);
        
        c.gridx = 1;
        c.gridy = 17;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 5;//cuantas filas va a ocupar
//        c.insets = new Insets(0, 4, 0, 0);
        add(b1, c);
        
        c.gridx = 7;
        c.gridy = 17;
        c.gridwidth = 7;//cuantas columnas va a ocupar
        c.gridheight = 5;//cuantas filas va a ocupar
//        c.insets = new Insets(0, 0, 0, 0);
        add(b2, c);
        
        /*c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(title, c);*/

    }  

}
