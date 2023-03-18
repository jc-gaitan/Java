package principal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame implements ChangeListener {

    JSlider R, G, B;
    int r, g, b;
    JLabel Lcolor;
    JLabel rl, gl, bl;
    Color color;

    public Ventana() {
        Componentes();

        setTitle("RGB");
        setLayout(new GridBagLayout());
        Organizar();

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void Componentes() {
        R = new JSlider(JSlider.HORIZONTAL, 0, 250, 0);
        R.addChangeListener(this);

        G = new JSlider(JSlider.HORIZONTAL, 0, 250, 0);
        G.addChangeListener(this);

        B = new JSlider(JSlider.HORIZONTAL, 0, 250, 0);
        B.addChangeListener(this);

        Lcolor = new JLabel("       ");
        Lcolor.setOpaque(true);

        rl = new JLabel("R");
        gl = new JLabel("G");
        bl = new JLabel("B");
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
        add(rl, c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(R, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(gl, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 4;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(G, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(bl, c);

        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 4;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(B, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 5;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(Lcolor, c);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == R) {
            r = R.getValue();
        } else if (e.getSource() == G) {
            g = G.getValue();
        } else if (e.getSource() == B) {
            b = B.getValue();
        }

        color = new Color(r, g, b);
        Lcolor.setBackground(color);
        //System.out.println(r+" "+g+" "+b);
    }

}
