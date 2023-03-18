package Principal;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

    JPanel principal;
    
    ImageIcon[] ImagenesTemp;
    JLabel temp;
    HiloTemporizador Htemp;
    
    Panel1 lienzo;

    public Ventana() {
        Componentes();

        setTitle("Proyecto");

        setSize(1002, 613);
        //setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);//para cambiarle el color a el jframe

        setLayout(new GridBagLayout());
        organizar();
        //add(lienzo);
        //add(grafico);
        
        //pack();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void Componentes() {
        ImagenesTemp = new ImageIcon[147];
        ImaTemporizador();
        
        lienzo = new Panel1();
        
        temp = new JLabel(new ImageIcon(ImagenesTemp[146].getImage().getScaledInstance(687, 42, Image.SCALE_DEFAULT)));
        
        Htemp = new HiloTemporizador(temp, ImagenesTemp);
        Htemp.start();       
        

        principal = new JPanel();
        principal.setLayout(new GridLayout(1,2));
        principal.add(lienzo);
        principal.add(new Pseudocodigo());
    }

    private void organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;//cuantas columnas va a ocupar
        c.gridheight = 3;//cuantas filas va a ocupar
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(principal, c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 10;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 8, 4);
        add(temp, c);
        
    }

    public void ImaTemporizador() {
        String location = "";
        for (int i = 0; i < 147; i++) {
            location = "/ImagenesTemp/" + i + ".gif";
            ImagenesTemp[i] = new ImageIcon(getClass().getResource(location));
        }
    }

}
