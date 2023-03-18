
package Pruebas;

import Principal.*;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Reglas extends JDialog{
    JLabel title;
    JLabel mensaje;
    
    Font font;
    
    JButton hecho;
    
    JLabel Link;
    
    public Reglas(JFrame padre, boolean modal){
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
        hecho = new JButton("Hecho");
        
        title = new JLabel("Reglas del Juego", SwingConstants.CENTER);//para que el texto salga en el centro del jlabel
        title.setOpaque(true);//activa el setBackground
        Color col = new Color(0,128,255);
        title.setBackground(col);
        font = new Font("Times New Roman", Font.BOLD, 30);
        title.setFont(font);
        title.setForeground(Color.WHITE);//cambiar el color de la letra
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/reglas.png"));
        mensaje = new JLabel(imagen);
        
        Link = new JLabel("Mira el Video para más información. ".toUpperCase(),SwingConstants.CENTER);
        font = new Font("Franklin Gothic Heavy", Font.BOLD, 18);
        Link.setFont(font);
        Link.setForeground(Color.BLACK);
    }
    
    public void abrirLink(){
        try{
            Desktop.getDesktop().browse(new URI("https://youtu.be/Y6GPW1vUaqU?t=29"));
        }catch(Exception e){
            
        }
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
        c.insets = new Insets(4, 4, 4, 4);
        add(mensaje, c);
        
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 10, 4, 4);
        add(Link, c);

        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(hecho, c);
    }
    
}
