
package Principal;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {
    
    JLabel b;
    JLabel x;
    JLabel x1;
    JLabel z;
    JTextField a;
    JPanel w;
    JTextField c;
    JTextField d;
    JLabel t;
    JButton mostrar;
    JTextField q;
    JLabel q1;
    
    public Ventana (){
        setTitle("asd");
        /*
        GridLayout(int rows, int cols, int hgap, int vgap)
        Creates a grid layout with the specified number of rows and columns.
        */
        
        Container conten = this.getContentPane();
        w = new JPanel();
        w.setLayout(new GridLayout(5,2,2,2));
        
        a = new JTextField();
        c = new JTextField();
        c.addKeyListener(new EventoTeclado(this));//para saber cual tecla se preciona
        b = new JLabel();
        x = new JLabel();
        x1 = new JLabel();
        z = new JLabel();
        t = new JLabel();
        d = new JTextField();
        d.addKeyListener(new EventoTeclado(this));
        d.addFocusListener(new Foco(this));
        q = new JTextField();
        q.addKeyListener(new EventoTeclado(this));
        q.addFocusListener(new Foco(this));
        q1 = new JLabel();
        
        mostrar = new JButton("Mostrar");
        mostrar.addActionListener(this);
        
        w.add(a);
        w.add(b);
        w.add(mostrar);
        w.add(x);
        w.add(c);
        w.add(z);
        w.add(d);
        w.add(t);
        w.add(q);
        w.add(q1);
        
        
        
        conten.add(w);
        
        setResizable(false); 
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == mostrar){
           b.setText(a.getText());
        }
    }
}
