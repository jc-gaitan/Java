package Principal;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Ventana extends JFrame implements MouseListener, ActionListener{

    PanelJuego J1;
    PanelJuego J2;
    boolean x;

    Reglas reglas;
    
    public Ventana() {
        //setUndecorated(true);
        Componentes();
        
        setTitle("Proyecto");
        setSize(1110, 560);

        getContentPane().setBackground(Color.WHITE);
        setResizable(true);        
        
        setLayout(new GridBagLayout());
        Organizar();     
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        reglas.setVisible(true);
    }
    
    public void Componentes(){
        x = true;
        J1 = new PanelJuego();
        J2 = new PanelJuego();
        
        J1.roca.addMouseMotionListener(new Codigo(J1,J1.roca,J2,J1.hilo));
        J1.lagartija.addMouseMotionListener(new Codigo(J1,J1.lagartija,J2,J1.hilo));
        J1.papel.addMouseMotionListener(new Codigo(J1,J1.papel,J2,J1.hilo));
        J1.spock.addMouseMotionListener(new Codigo(J1,J1.spock,J2,J1.hilo));
        J1.tigeras.addMouseMotionListener(new Codigo(J1,J1.tigeras,J2,J1.hilo));
        
        J2.roca.addMouseMotionListener(new Codigo(J2,J2.roca,J1,J2.hilo));
        J2.lagartija.addMouseMotionListener(new Codigo(J2,J2.lagartija,J1,J2.hilo));
        J2.papel.addMouseMotionListener(new Codigo(J2,J2.papel,J1,J2.hilo));
        J2.spock.addMouseMotionListener(new Codigo(J2,J2.spock,J1,J2.hilo));
        J2.tigeras.addMouseMotionListener(new Codigo(J2,J2.tigeras,J1,J2.hilo));
        
        reglas = new Reglas(this,true);
        reglas.Link.addMouseListener(this);
        reglas.hecho.addActionListener(this);
    }

    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;
        c.gridheight = 8;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(4, 4, 4, 4);
        add(J1, c);
        
        c.gridx = 10;
        c.gridy = 0;
        c.gridwidth = 10;
        c.gridheight = 8;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(4, 4, 4, 4);
        add(J2, c);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == reglas.Link){
            reglas.abrirLink();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reglas.hecho){
            reglas.dispose();
        }
    }

}
