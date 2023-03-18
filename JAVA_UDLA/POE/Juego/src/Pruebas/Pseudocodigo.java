
package Pruebas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pseudocodigo extends JDialog{
    
    JLabel jugador1, jugador2;
    JLabel rejugador1,rejugador2;
    String Sjugador1, Sjugador2;
    
    ImageIcon imagen;
    
    JLabel recorrido;
    
    JButton pausar;
    JButton terminar;
    
    HiloRecorrido reco;
    
    public Pseudocodigo(JFrame padre, boolean modal, String Sjugador1, String Sjugador2){
        super(padre,modal);

        this.Sjugador1 = Sjugador1;
        this.Sjugador2 = Sjugador2;
        
        setTitle("Pseudocodigo");
        
        Componentes();
        
        setLayout(new GridBagLayout());
        Organizar();
        
        getContentPane().setBackground(Color.WHITE);
        pack();
        setResizable(false);
        setLocationRelativeTo(padre);
    }
    
    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();
        
        //Insets (int superior, int izquierda, int abajo, int derecha)
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 0);
        add(jugador1, c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(rejugador1, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 0);
        add(jugador2, c);
        
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(rejugador2, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 6;
        c.gridheight = 5;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 4);
        add(recorrido, c);
        
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 4);
        add(pausar, c);
        
        c.gridx = 3;
        c.gridy = 7;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 4);
        add(terminar, c);
    }
    
    public void Componentes(){
        
        imagen = new ImageIcon(getClass().getResource("/Ipseudocodigo/inicio.png"));
        recorrido = new JLabel(imagen);

        pausar = new JButton(" Pausar ");
        terminar = new JButton("Terminar");
        
        imagen = new ImageIcon(getClass().getResource("/Ipseudocodigo/jugador1.png"));
        jugador1 = new JLabel(imagen);
        
        imagen = new ImageIcon(getClass().getResource("/Ipseudocodigo/jugador2.png"));
        jugador2 = new JLabel(imagen);
        
        String location = "/Ipseudocodigo/"+Sjugador1+".png";
        imagen = new ImageIcon(getClass().getResource(location));
        rejugador1 = new JLabel(imagen);
        
        location = "/Ipseudocodigo/"+Sjugador2+".png";
        imagen = new ImageIcon(getClass().getResource(location));
        rejugador2 = new JLabel(imagen);
        
    }
    
}
