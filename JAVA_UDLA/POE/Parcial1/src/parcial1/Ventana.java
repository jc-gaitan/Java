
package parcial1;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame implements MouseListener{
    
    BloqueNumero bloqueNum;
    BloqueColores bloquecol;
    BloqueLetras bloqueLe;
    
    public Ventana(){
        setTitle("Parcil 1");
        setBackground(Color.WHITE);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        
        componentes();
        add(bloqueNum);
        add(bloquecol);
        add(bloqueLe);
        
        
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void componentes(){
        bloqueNum =  new BloqueNumero();
        bloqueNum.addMouseListener(this);
        bloquecol = new BloqueColores();
        bloquecol.addMouseListener(this);
        bloqueLe = new BloqueLetras();
        bloqueLe.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == bloqueNum){
            bloqueNum.title.setTitle("Enable");
            bloqueNum.setEnabled(true);
        }else if(me.getSource() == bloquecol){
            bloquecol.title.setTitle("Enable");
            bloquecol.setEnabled(true);
        }else if(me.getSource() == bloqueLe){
            bloqueLe.title.setTitle("Enable");
            bloqueLe.setEnabled(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource() == bloqueNum){
            bloqueNum.title.setTitle("Bloque de Numeros. ");
            bloqueNum.setEnabled(false);
        }else if(me.getSource() == bloquecol){
            bloquecol.title.setTitle("Bloque de Colores. ");
            bloquecol.setEnabled(false);
        }else if(me.getSource() == bloqueLe){
            bloqueLe.title.setTitle("Bloque de Letras. ");
            bloqueLe.setEnabled(false);
        }
    }
}
