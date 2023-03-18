
package PvE;

import Pruebas.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel1 extends JPanel{
    
    JLabel title;
    JLabel mensaje;
    JLabel roca, papel, tigeras, lagartija, spock;
    JLabel elige;
    
    public JPanel1(){
        setBorder(BorderFactory.createLineBorder(Color.WHITE));
        setSize(542,525);
        Componentes();
        setBackground(new Color(0, 175, 196));
        
        setLayout(new GridBagLayout());
        Organizar();
    }
    
    public void Componentes(){
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/Titulo.png"));
        title = new JLabel(imagen);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/empiece.png"));
        mensaje = new JLabel(imagen);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/diamante.png"));
        roca = new JLabel(imagen);
        roca.setText("roca");
        roca.setFont(new Font("Arial", Font.PLAIN,0));
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/avion.png"));
        papel = new JLabel(imagen);
        papel.setText("papel");
        papel.setFont(new Font("Arial", Font.PLAIN,0));
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/tigeras.png"));
        tigeras = new JLabel(imagen);
        tigeras.setText("tigeras");
        tigeras.setFont(new Font("Arial", Font.PLAIN,0));
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/lagartija.png"));
        lagartija = new JLabel(imagen);
        lagartija.setText("lagartija");
        lagartija.setFont(new Font("Arial", Font.PLAIN,0));
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/spock.png"));
        spock = new JLabel(imagen);
        spock.setText("spock");
        spock.setFont(new Font("Arial", Font.PLAIN,0));
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/EligeOpcion.png"));
        elige = new JLabel(imagen);        
    }

    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();
        
        //Insets (int superior, int izquierda, int abajo, int derecha)
        
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(roca, c);
        
        c.gridx = 3;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(papel, c);
        
        c.gridx = 6;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(tigeras, c);
        
        c.gridx = 9;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(lagartija, c);
        
        c.gridx = 12;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(spock, c);
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(40, 4, 4, 4);
        add(title, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 15;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(mensaje, c);
        
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 15;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 10, 4);
        add(elige, c);
        
    }
    
}
