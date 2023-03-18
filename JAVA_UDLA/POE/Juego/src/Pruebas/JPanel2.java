
package Pruebas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JPanel2 extends JPanel{
    
    JLabel title;
    JLabel esperando;
    JLabel ud, op, vs;
    JLabel mensaje;
    JLabel relleno;
    
    
    public JPanel2(){
        setBorder(BorderFactory.createLineBorder(Color.WHITE));
        setSize(542,525);
        Componentes();
        setBackground(new Color(0, 175, 196));
        
        setLayout(new GridBagLayout());
        Organizar();
    }
    
    public void Componentes(){
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/Titulo2.png"));
        title = new JLabel(imagen);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/esperando.png"));
        esperando = new JLabel(imagen);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/spock.png"));
        ud = new JLabel(imagen);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/opcion.png"));
        op = new JLabel(imagen);
        op.setText("");
        op.setFont(new Font("Arial", Font.PLAIN,0));
        
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/VS.png"));
        vs = new JLabel(imagen);
        
        Font font = new Font("Helvetica", Font.BOLD, 12);
        mensaje = new JLabel("			   ",SwingConstants.CENTER);
        mensaje.setFont(font);
        
        relleno = new JLabel("                                  ");
    }
    
    public void Organizar(){
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 12;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(title, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 12;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(esperando, c);
        
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 2;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(relleno, c);
        
        c.gridx = 2;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(ud, c);
        
        c.gridx = 5;
        c.gridy = 6;
        c.gridwidth = 2;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(vs, c);
        
        c.gridx = 7;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(op, c); 
        
        c.gridx = 0;
        c.gridy = 9;
        c.gridwidth = 12;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 20, 4);
        add(mensaje, c); 
        
    }
    
}
