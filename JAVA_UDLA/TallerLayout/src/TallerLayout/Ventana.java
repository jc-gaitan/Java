package TallerLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame implements ChangeListener {

    JPanel p1, p2, p3;
    JSlider v, h;
    JButton b1, b2, b3, b4, b5;
    JLabel l1, l2;
    BorderLayout b;

    Ventana() {
        setTitle("Taller");
        Componentes();
        setSize(385, 441);
        getContentPane().setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setResizable(false);
        setVisible(true);
    }

    public void Componentes() {
        b = new BorderLayout(0,0);

        l1 = new JLabel("   VGAP");

        v = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        v.setInverted(false);
        v.setPaintTicks(true);
        v.setMajorTickSpacing(10);
        v.setPaintLabels(true);
        v.addChangeListener(this);

        p1 = new JPanel(new BorderLayout());

        p1.add(l1, BorderLayout.NORTH);
        p1.add(v, BorderLayout.CENTER);
        add(p1, BorderLayout.NORTH);

        p2 = new JPanel(new BorderLayout());

        l2 = new JLabel("   HGAP");

        h = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        v.setInverted(false);
        h.setPaintTicks(true);
        h.setMajorTickSpacing(10);
        h.setPaintLabels(true);
        h.addChangeListener(this);

        p2.add(l2, BorderLayout.NORTH);
        p2.add(h, BorderLayout.CENTER);
        add(p2, BorderLayout.CENTER);

        b1 = new JButton("Uno");
        b2 = new JButton("Dos");
        b3 = new JButton("Tres");
        b4 = new JButton("Cuatro");
        b5 = new JButton("Cinco");

        p3 = new JPanel(b);

        p3.add(b1, BorderLayout.NORTH);
        p3.add(b2, BorderLayout.WEST);
        p3.add(b3, BorderLayout.CENTER);
        p3.add(b4, BorderLayout.EAST);
        p3.add(b5, BorderLayout.SOUTH);
        add(p3, BorderLayout.SOUTH);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()== h){
            l2.setText("   HGAP ("+h.getValue()+")");
            int hgp = h.getValue();
            b.setHgap(hgp);
        }else{
            l1.setText("   VGAP ("+v.getValue()+")");
            int vgp = v.getValue();
            b.setVgap(vgp);
        }
        p3.setVisible(false);
        p3.validate();
        p3.repaint();
        p3.setVisible(true);
    }
}
