package ejercicio;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame implements ActionListener {

    JRadioButton r, v, a;
    JLabel rl, vl, al;
    int r1,v1,a1;

    public Ventana() {
        Componentes();

        setTitle("Calculadora");
        setSize(254, 228);

        setLayout(new GridBagLayout());
        Organizar();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }

    private void Componentes() {
        r = new JRadioButton("Rojo");
        r.addActionListener(this);
        v = new JRadioButton("Verde");
        v.addActionListener(this);
        a = new JRadioButton("Azul");
        a.addActionListener(this);

        rl = new JLabel("   ");
        vl = new JLabel("   ");
        al = new JLabel("   ");
        
        r1 = v1 = a1 = 0;
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
        c.insets = new Insets(4, 4, 0, 0);
        add(r, c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(v, c);

        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(a, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(rl, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(vl, c);

        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(al, c);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r && r1 == 0) {
            rl.setOpaque(true);//para que muestre el color de fondo del JLabel
            rl.setBackground(Color.RED);
            r1++;
        }else if(e.getSource() == r && r1 == 1){
            rl.setOpaque(false);
            r1--;
        }
        else if(e.getSource() == v && v1 == 0){
            vl.setOpaque(true);
            vl.setBackground(Color.GREEN);
            v1++;
        }else if(e.getSource() == v && v1 == 1){
            vl.setOpaque(false);
            v1--;
        }
        else if(e.getSource() == a && a1 == 0){
            al.setOpaque(true);
            al.setBackground(Color.BLUE);
            a1++;
        }else if(e.getSource() == a && a1 == 1){
            al.setOpaque(false);
            a1--;
        }
        repaint();
    }

}
