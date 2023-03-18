
package rgb;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame implements ChangeListener{
    JSlider r, g, b;
    JLabel lr, lg, lb;
    JPanel pcolor, pslider, pvalor;
    
    Ventana(){
        setTitle("RGB- SLider");
        Componentes();
        setLayout(null);
        setSize(400, 420);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
    
    public void Componentes(){
        pslider = new JPanel();
        pslider.setBounds(50, 30, 300, 150);
        
        r = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        r.setBounds(25, 20, 150, 30);
        r.setInverted(false);
        r.setPaintTicks(true);
        r.setMajorTickSpacing(50);
        r.setMinorTickSpacing(10);
        r.setPaintLabels(true);
        r.addChangeListener(this);
        
        g = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        g.setBounds(25, 70, 150, 30);
        g.setInverted(false);
        g.setPaintTicks(true);
        g.setMajorTickSpacing(50);
        g.setMinorTickSpacing(10);
        g.setPaintLabels(true);
        g.addChangeListener(this);
        
        b = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        b.setBounds(25, 110, 150, 30);
        b.setInverted(false);
        b.setPaintTicks(true);
        b.setMajorTickSpacing(50);
        b.setMinorTickSpacing(10);
        b.setPaintLabels(true);
        b.addChangeListener(this);
        
        pcolor = new JPanel();
        pcolor.setBounds(50, 200, 300, 100);
        
       // pvalor = new JPanel();
        //pvalor.setBounds(50, 310, 300, 60);
        
        lr = new JLabel("R: 0       ");
        lr.setBounds(50, 320, 50, 30);
        
        lg = new JLabel("G: 0       ");
        lg.setBounds(120, 320, 50, 30);
        
        lb = new JLabel("B: 0       ");
        lb.setBounds(190, 320, 50, 30);
        
        add(pslider);
        pslider.add(r);
        pslider.add(g);
        pslider.add(b);
        
        add(pcolor);
        
        //add(pvalor);
        //pvalor.add(lr);
        //pvalor.add(lg);
        //pvalor.add(lb);
        add(lr);
        add(lg);
        add(lb);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int red = r.getValue();
        int green = g.getValue();
        int blue = b.getValue();
        
        lr.setText("R: "+red);
        lg.setText("G: "+green);
        lb.setText("B: "+blue);
        
        pcolor.setBackground(new Color(red,green,blue));
    }
}
