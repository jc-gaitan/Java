package Pruebas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener, MouseListener{

    Reglas reglas;

    Jugador jugador1;
    Jugador jugador2;

    JPanel principal;
    CardLayout cardLayout;
    
    //
    Pseudocodigo pseudocodigo;
    //
    
    public Ventana() {
        Componentes();

        setTitle("Proyecto");
        setSize(1200, 560);

        getContentPane().setBackground(Color.WHITE);
        setResizable(true);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        add(jugador1);
        add(jugador2);
        
        //
        //pseudocodigo.setVisible(true);
        //
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        reglas.setVisible(true);
    }

    public void Componentes() {
        
        /*
        pseudocodigo = new Pseudocodigo(this,true,"roca", "lagartija");
        pseudocodigo.pausar.addActionListener(this);
        pseudocodigo.terminar.addActionListener(this);
        //*/
        
        reglas = new Reglas(this,true);
        reglas.hecho.addActionListener(this);
        reglas.Link.addMouseListener(this);
        
        jugador1 = new Jugador();
        jugador2 = new Jugador();

        jugador1.panel1.lagartija.addMouseMotionListener(new Codigo(jugador1, jugador2, jugador1.panel1.lagartija));
        jugador1.panel1.roca.addMouseMotionListener(new Codigo(jugador1, jugador2, jugador1.panel1.roca));
        jugador1.panel1.papel.addMouseMotionListener(new Codigo(jugador1, jugador2, jugador1.panel1.papel));
        jugador1.panel1.tigeras.addMouseMotionListener(new Codigo(jugador1, jugador2, jugador1.panel1.tigeras));
        jugador1.panel1.spock.addMouseMotionListener(new Codigo(jugador1, jugador2, jugador1.panel1.spock));

        jugador2.panel1.lagartija.addMouseMotionListener(new Codigo(jugador2, jugador1, jugador2.panel1.lagartija));
        jugador2.panel1.roca.addMouseMotionListener(new Codigo(jugador2, jugador1, jugador2.panel1.roca));
        jugador2.panel1.papel.addMouseMotionListener(new Codigo(jugador2, jugador1, jugador2.panel1.papel));
        jugador2.panel1.tigeras.addMouseMotionListener(new Codigo(jugador2, jugador1, jugador2.panel1.tigeras));
        jugador2.panel1.spock.addMouseMotionListener(new Codigo(jugador2, jugador1, jugador2.panel1.spock));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reglas.hecho){
            reglas.dispose();
        }
        //
        else if(e.getSource() == pseudocodigo.terminar){
            pseudocodigo.dispose();
        }else if(e.getSource() == pseudocodigo.pausar && pseudocodigo.reco.isAlive()){
            pseudocodigo.pausar.setText("Reanudar");
            pseudocodigo.reco.suspend();
        }else if(e.getSource() == pseudocodigo.pausar){
            pseudocodigo.pausar.setText(" Pausar ");
            pseudocodigo.reco.resume();
        }
        //
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

}
