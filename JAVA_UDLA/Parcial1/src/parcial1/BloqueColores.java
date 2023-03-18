
package parcial1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BloqueColores extends JPanel implements ActionListener,ChangeListener{
    
    JRadioButton R;
    JRadioButton G;
    JRadioButton B;
    ButtonGroup group;
    
    boolean r,g,b;
    
    JSlider color;
    
    Label colo;
    Label numero;
    
    Color col;
    
    TitledBorder title;
    
    int r1,g1,b1;
    
    public BloqueColores(){
        Componentes();
        title = BorderFactory.createTitledBorder("Bloque de Colores. ");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        setBorder(title);
        organizar();
    }
    
    public void Componentes(){
        R = new JRadioButton("R ("+"0)");
        R.addActionListener(this);
        R.setBackground(Color.WHITE);
        G = new JRadioButton("G ("+"0)");
        G.addActionListener(this);
        G.setBackground(Color.WHITE);
        B = new JRadioButton("B ("+"0)");
        B.addActionListener(this);
        B.setBackground(Color.WHITE);
        group = new ButtonGroup();
        group.add(R);
        group.add(G);
        group.add(B);
        
        color = new JSlider(JSlider.HORIZONTAL,0,250,0);
        color.setBackground(Color.white);
        color.addChangeListener(this);
        
        colo = new Label("");
        numero = new Label("");
        
        r1=g1=b1=0;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == R){
            r = true;
            g = false;
            b = false;
        }else if(ae.getSource() == B){
            b = true;
            g = false;
            r = false;
        }else if(ae.getSource() == G){
            g = true;
            b = false;
            r = false;
        }
    }   

    @Override
    public void stateChanged(ChangeEvent ce) {
        
        numero.setText(String.valueOf(color.getValue()));
        if(r){
            R.setText("R ("+color.getValue()+")");
            r1 = color.getValue();
            col = new Color(r1,g1,b1);
            colo.setBackground(col);
        }else if(g){
            G.setText("G ("+color.getValue()+")");
            g1 = color.getValue();
            col = new Color(r1,g1,b1);
            colo.setBackground(col);
        }else if(b){
            B.setText("B ("+color.getValue()+")");
            b1 = color.getValue();
            System.out.println(b1);
            col = new Color(r1,g1,b1);
            colo.setBackground(col);
        }
    }
    
    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 1;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 0.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 0.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.NONE;//aumenta la celda en la que se encuentra(filas o columnas)
        c.anchor = GridBagConstraints.WEST;//pone el componente a la izquierda
        c.insets = new Insets(4, 0, 0, 0);
        add(R, c);

        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(G, c);
        
        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(B, c); 
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 4;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0,0);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(color, c); 
        
        c.gridx = 4;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(numero, c); 
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(colo, c); 
    }
    
}
