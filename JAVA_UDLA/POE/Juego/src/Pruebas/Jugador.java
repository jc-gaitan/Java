
package Pruebas;

import java.awt.CardLayout;
import javax.swing.JPanel;


public class Jugador extends JPanel{
    
    CardLayout cardLayout;
    
    JPanel1 panel1;
    JPanel2 panel2;
    
    public Jugador(){        
        panel1 = new JPanel1();
        panel2 = new JPanel2();
        
        cardLayout = new CardLayout();
        setSize(542, 525);
        setLayout(cardLayout);
        add(panel1, "panel1");
        add(panel2, "panel2");
    }
    
}
