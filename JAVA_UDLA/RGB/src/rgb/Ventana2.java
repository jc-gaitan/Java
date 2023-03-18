package rgb;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana2 extends JFrame implements ChangeListener, ActionListener {

    JSlider r, g, b;
    JRadioButton rr, rg, rb;
    ButtonGroup grupo;
    JPanel pr, pg, pb, pslider, pradio;
    JButton limpiar;

    Ventana2() {
        setTitle("RGB- SLider");
        Componentes();
        setLayout(null);
        setSize(500, 420);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void Componentes() {
        pslider = new JPanel();
        pslider.setBounds(50, 30, 300, 150);
        //pslider.setBackground(Color.red);

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

        pr = new JPanel();//Panel 1
        pr.setBounds(50, 200, 100, 50);
        //pr.setBackground(Color.white);

        pg = new JPanel();//Panel 2
        pg.setBounds(170, 200, 100, 50);
        //pg.setBackground(Color.white);

        pb = new JPanel();//Panel 3
        pb.setBounds(290, 200, 100, 50);
        //pb.setBackground(Color.white);

        pradio = new JPanel();
        pradio.setBounds(380, 30, 100, 100);
        //pradio.setBackground(Color.BLACK);

        grupo = new ButtonGroup();

        rr = new JRadioButton("P1");
        rr.setBounds(10, 20, 50, 30);
        rr.addChangeListener(this);

        rg = new JRadioButton("P2");
        rg.setBounds(10, 50, 50, 30);
        rg.addChangeListener(this);

        rb = new JRadioButton("P3");
        rb.setBounds(10, 90, 50, 30);
        rb.addChangeListener(this);

        grupo.add(rr);
        grupo.add(rg);
        grupo.add(rb);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(200, 300, 100, 30);
        limpiar.addActionListener(this);

        add(pslider);
        pslider.add(r);
        pslider.add(g);
        pslider.add(b);

        add(pr);
        add(pg);
        add(pb);

        add(pradio);
        pradio.add(rr);
        pradio.add(rg);
        pradio.add(rb);

        add(limpiar);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (rr.isSelected()) {
            int red = r.getValue();
            System.out.println("Red: " + red);
            int green = g.getValue();
            System.out.println("green: " + green);
            int blue = b.getValue();
            System.out.println("blue: " + blue);
            pr.setBackground(new Color(red, green, blue));
        }else if(rg.isSelected()){
            int red = r.getValue();
            System.out.println("Red: " + red);
            int green = g.getValue();
            System.out.println("green: " + green);
            int blue = b.getValue();
            System.out.println("blue: " + blue);
            pg.setBackground(new Color(red, green, blue));
        }else if(rb.isSelected()){
            int red = r.getValue();
            System.out.println("Red: " + red);
            int green = g.getValue();
            System.out.println("green: " + green);
            int blue = b.getValue();
            System.out.println("blue: " + blue);
            pb.setBackground(new Color(red, green, blue));
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(limpiar)){
            r.setValue(0);
            g.setValue(0);
            b.setValue(0);
            grupo.clearSelection();
            pb.setBackground(new Color(238,238,238));
            pg.setBackground(new Color(238,238,238));
            pr.setBackground(new Color(238,238,238));
            System.out.println("Limpiar");
        }
    }

}
