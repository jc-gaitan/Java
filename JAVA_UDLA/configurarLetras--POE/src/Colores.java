
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Colores extends JDialog implements ChangeListener {

    static final int FPS_MIN = 0;
    static final int FPS_MAX = 250;
    static final int FPS_INIT = 0;

    JLabel r1, g1, b1;
    JSlider r, g, b;
    
    Color rgb;
    
    public Colores(JFrame padre, boolean modal){
        super(padre,modal);
        setTitle("      ");

        Componentes();
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(new GridBagLayout());
        Organizar();
        
        pack();
        setResizable(false);
        setLocationRelativeTo(padre);
    }

    public void Componentes() {
        r1 = new JLabel("R (0)  ");
        g1 = new JLabel("G (0)  ");
        b1 = new JLabel("B (0)  ");

        r = new JSlider(FPS_MIN, FPS_MAX, FPS_INIT);
        r.addChangeListener(this);
        g = new JSlider(FPS_MIN, FPS_MAX, FPS_INIT);
        g.addChangeListener(this);
        b = new JSlider(FPS_MIN, FPS_MAX, FPS_INIT);
        b.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == r) {
            r1.setText("R (" + String.valueOf(r.getValue()) + ")");
        } else if (e.getSource() == b) {
            b1.setText("B (" + String.valueOf(b.getValue()) + ")");
        } else if (e.getSource() == g) {
            g1.setText("G (" + String.valueOf(g.getValue()) + ")");
        }
        rgb = new Color(r.getValue(), b.getValue(), g.getValue());
    }

    private void Organizar() {
        //c.insets = new Insets(int arriba, int izquierda, int abajo, int derecha);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 8;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 4, 0, 0);
        add(r1, c);
        
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 6;
        c.gridheight = 8;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 6, 0, 4);
        add(r, c);
        
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 2;
        c.gridheight = 8;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 4, 0, 0);
        add(g1, c);
        
        c.gridx = 2;
        c.gridy = 8;
        c.gridwidth = 6;
        c.gridheight = 8;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 6, 0, 4);
        add(g, c);
    }

}
