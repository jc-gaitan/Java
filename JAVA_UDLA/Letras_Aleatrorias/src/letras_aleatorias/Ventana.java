package letras_aleatorias;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame implements ActionListener, KeyListener, ChangeListener {

    validaciones v = new validaciones();

    JPanel superior, medio, dentro, pbotones, slider, abajo, abajodentro, peste, cen;
    JButton iniciar, suspender, reanudar, terminar;
    JTextField tiemp;

    JTextArea num, his, todas;
    JLabel conteo, aleatorio[], cantidad;
    JSlider tiempos;
    int velo = 50;
    boolean x = true;

    hiloTiempo t;

    public Ventana() {
        setTitle("ALEATORIO");
        Componentes();
        setSize(1000, 700);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void Componentes() {
        //panel superior
        superior = new JPanel();
        superior.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.RED), "BIENVENIDOS")));
        superior.setBackground(Color.MAGENTA);
        superior.setPreferredSize(new Dimension(100, 150));
        superior.setLayout(new BorderLayout());

        //PANEL MEDIO
        dentro = new JPanel(new GridLayout(2, 1));
        dentro.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "")));

        //TEXTO
        tiemp = new JTextField();
        tiemp.setPreferredSize(new Dimension(100, 35));
        tiemp.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.DARK_GRAY), "MINUTOS")));
        dentro.add(tiemp);
        //LABEL
        conteo = new JLabel("");
        conteo.setPreferredSize(new Dimension(100, 35));
        conteo.setFont(new Font("Arial", Font.BOLD, 10));
        conteo.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "CONTEO")));
        dentro.add(conteo);
        superior.add(dentro, BorderLayout.WEST);

        //BOTONES
        pbotones = new JPanel(new GridLayout(4, 1));
        pbotones.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "BOTONES")));
        superior.add(pbotones, BorderLayout.EAST);

        iniciar = new JButton("INICIAR");
        iniciar.setBackground(Color.green);
        iniciar.setPreferredSize(new Dimension(150, 35));
        iniciar.setEnabled(false);
        iniciar.addActionListener(this);

        suspender = new JButton("SUSPENDER");
        suspender.setBackground(Color.YELLOW);
        suspender.setPreferredSize(new Dimension(150, 35));
        suspender.addActionListener(this);

        reanudar = new JButton("REANUDAR");
        reanudar.setBackground(Color.ORANGE);
        reanudar.setPreferredSize(new Dimension(150, 35));
        reanudar.addActionListener(this);

        terminar = new JButton("TERMINAR");
        terminar.setBackground(Color.RED);
        terminar.setPreferredSize(new Dimension(150, 35));
        terminar.addActionListener(this);

        pbotones.add(iniciar);
        pbotones.add(suspender);
        pbotones.add(reanudar);
        pbotones.add(terminar);

        //SLIDER
        slider = new JPanel(new GridLayout(1, 1));
        slider.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "VELOCIDAD")));
        superior.add(slider, BorderLayout.CENTER);

        tiempos = new JSlider(JSlider.HORIZONTAL, 0, 4000, 0);
        tiempos.addChangeListener(this);
        tiempos.setBounds(25, 20, 150, 30);
        tiempos.setInverted(false);
        tiempos.setPaintTicks(true);
        tiempos.setMajorTickSpacing(100);
        tiempos.setMinorTickSpacing(4000);
        slider.add(tiempos);

        add(superior, BorderLayout.NORTH);
        //-------------------------------------------------------------------------------------------------------------  

        medio = new JPanel();
        medio.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "JUGUEMOS")));
        medio.setBackground(Color.WHITE);
        medio.setLayout(null);
        add(medio, BorderLayout.CENTER);

        aleatorio = new JLabel[(int) (Math.random() * 6) + 1];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = new JLabel("");//LETRA
            aleatorio[i].setBounds((int) (Math.random() * 731) + 100, 20, 200, 90);
            aleatorio[i].setFont(new Font("arial", Font.PLAIN, 50));
            medio.add(aleatorio[i]);
        }

        //------------------------------------------------------------------------------------------------------------------
        abajo = new JPanel();
        abajo.setBackground(Color.MAGENTA);
        abajo.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "FINAL")));
        abajo.setPreferredSize(new Dimension(100, 150));
        abajo.setLayout(new BorderLayout());
        add(abajo, BorderLayout.SOUTH);
        //
        abajodentro = new JPanel(new GridLayout(1, 2));
        abajodentro.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "")));
        abajo.add(abajodentro, BorderLayout.WEST);
        //
        cen = new JPanel(new GridLayout(1, 2));
        cen.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "")));
        abajo.add(cen, BorderLayout.CENTER);
        //
        peste = new JPanel(new GridLayout(1, 1));
        peste.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "")));
        abajo.add(peste, BorderLayout.EAST);

        //
        cantidad = new JLabel("CANTIDAD DE LETRAS: ");
        abajodentro.add(cantidad);
        num = new JTextArea();
        num.setBackground(Color.PINK);
        num.setPreferredSize(new Dimension(100, 35));
        num.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "TOTAL")));
        abajodentro.add(num);

        his = new JTextArea();
        his.setBackground(Color.PINK);
        his.setPreferredSize(new Dimension(400, 35));
        his.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "ORGANIZACION DE LOS LETRAS")));
        peste.add(his);

        todas = new JTextArea();
        todas.setBackground(Color.PINK);
        todas.setPreferredSize(new Dimension(400, 35));
        todas.setBorder((BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK,
                Color.BLACK), "TODAS LAS LETRAS")));
        cen.add(todas);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(iniciar)) {
            t = new hiloTiempo(Integer.parseInt(tiemp.getText()), conteo, aleatorio, velo, his, num, todas);
            t.start();
            iniciar.setEnabled(false);
            suspender.setEnabled(true);
            terminar.setEnabled(true);
            tiemp.setEnabled(false);
        } else if (e.getSource().equals(suspender)) {
            t.suspend();
            for (int i = 0; i < t.l.length; i++) {
                t.l[i].suspend();
            }
            suspender.setEnabled(false);
            reanudar.setEnabled(true);
            terminar.setEnabled(false);
            tiemp.setEnabled(false);
        } else if (e.getSource().equals(reanudar)) {
            t.resume();
            for (int i = 0; i < t.l.length; i++) {
                t.l[i].resume();
            }
            reanudar.setEnabled(false);
            suspender.setEnabled(true);
            terminar.setEnabled(true);
            tiemp.setEnabled(false);
        } else if (e.getSource().equals(terminar)) {
            t.stop();
            for (int i = 0; i < t.l.length; i++) {
                t.l[i].stop();
            }
            terminar.setEnabled(false);
            suspender.setEnabled(false);
            tiemp.setEnabled(true);
            conteo.setBounds(430, 20, 200, 90);
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        v.vNumero(e, tiemp);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        v.vVacio(tiemp, iniciar);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        velo = tiempos.getValue();
        //System.out.println(velo);
        if (velo > 0) {
            if (x) {
                iniciar.setEnabled(true);
                x = false;
            } else if (t != null) {
                for (int i = 0; i < t.l.length; i++) {
                    t.l[i].c = tiempos.getValue();
                }
            }
        } else {
            iniciar.setEnabled(false);
        }

    }
}
