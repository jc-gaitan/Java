package carro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author yubet
 */
public class Carros extends JFrame implements ActionListener, KeyListener{

    JPanel panel, panel1, panel2, panel4;
    JButton iniciar;
    JLabel c1, c2, c3, c4, c5, c6, c7, c8, col, col1;
    JTextArea resultado;
    JScrollPane scroll;
    JTextField tiempo;
    int tiem;

    public Carros() {
        setTitle("PARCIAL 3");
        Componentes();
        setSize(1000, 700);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public void Componentes() {

        //panel1
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.GRAY);
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.CYAN), "CARRERA", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
        panel.add(panel2);

        ImageIcon azul = new ImageIcon(getClass().getResource("/imagenes/f1.png"));
        c1 = new JLabel(new ImageIcon(azul.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        c1.setBounds(5, 10, 100, 100);
        panel2.add(c1);
        ImageIcon a1 = new ImageIcon(getClass().getResource("/imagenes/f1.png"));
        c2 = new JLabel(new ImageIcon(a1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        c2.setBounds(5, 100, 100, 100);
        panel2.add(c2);

        ImageIcon rojo = new ImageIcon(getClass().getResource("/imagenes/f2.png"));
        c3 = new JLabel(new ImageIcon(rojo.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        c3.setBounds(5, 200, 100, 100);
        panel2.add(c3);
        ImageIcon r1 = new ImageIcon(getClass().getResource("/imagenes/f2.png"));
        c4 = new JLabel(new ImageIcon(r1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        c4.setBounds(5, 290, 100, 100);

        panel2.add(c4);

        col = new JLabel();
        col.setBounds(800, 10, 10, 460);
        col.setOpaque(true);
        col.setBackground(Color.red);
        panel2.add(col);

        // col1 = new JLabel();
        // col1.setBounds(100, 10, 10, 460);
        //col1.setOpaque(true);
        //col1.setBackground(Color.red);
        //panel2.add(col1);
        ImageIcon a2 = new ImageIcon(getClass().getResource("/imagenes/a2.png"));
        c5 = new JLabel(new ImageIcon(a2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        c5.setBounds(800, 10, 100, 100);
        panel2.add(c5);
        ImageIcon a3 = new ImageIcon(getClass().getResource("/imagenes/a2.png"));
        c6 = new JLabel(new ImageIcon(a3.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        c6.setBounds(800, 100, 100, 100);
        panel2.add(c6);
        ImageIcon r2 = new ImageIcon(getClass().getResource("/imagenes/a1.png"));
        c7 = new JLabel(new ImageIcon(r2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        c7.setBounds(800, 200, 100, 100);
        panel2.add(c7);
        ImageIcon r3 = new ImageIcon(getClass().getResource("/imagenes/a1.png"));
        c8 = new JLabel(new ImageIcon(r3.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        c8.setBounds(800, 290, 100, 100);

        panel2.add(c8);

        add(panel, BorderLayout.CENTER);

        //JLABEL---PANEL 1
        //panel2
        panel1 = new JPanel(new GridLayout(1, 1));

        tiempo = new JTextField("");
        tiempo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "HORA EN MINUTOS "));
        panel1.add(tiempo);
        tiempo.addKeyListener(this);
        add(panel1, BorderLayout.NORTH);

        //panel4
        panel4 = new JPanel(new GridLayout(1, 2));
        iniciar = new JButton("INICIAR");
        iniciar.setEnabled(false);
        panel4.add(iniciar);
        iniciar.addActionListener(this);
        resultado = new JTextArea(8, 1);
        resultado.setEditable(false);
        resultado.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "RESULTADOS"));
        scroll = new JScrollPane(resultado);
        scroll.setBounds(10, 10, 10, 10);
        //frutas.setLineWrap(true);
        panel4.add(scroll);
        add(panel4, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tiem = Integer.parseInt(tiempo.getText());
        tiem = tiem*60;
        tiem = (int)tiem/4;
        //System.out.println(tiempo.getText());
        carro hilo = new carro(c1, tiem);
        carro hilo2 = new carro(c3, tiem);
        hilo.start();
        hilo2.start();

        carroD h1 = new carroD(c5, hilo, tiem);
        h1.start();
        carroD h2 = new carroD(c7, hilo2, tiem);
        h2.start();
        
        carroI h3 = new carroI(c2, h1, tiem);
        h3.start();
        carroI h4 = new carroI(c4, h2, tiem);
        h4.start();
        
        carroD2 h5 = new carroD2(c6, h3, tiem);
        h5.start();
        carroD2 h6 = new carroD2(c8, h4, tiem);
        h6.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(!tiempo.getText().isEmpty()){
            iniciar.setEnabled(true);
        }else{
            iniciar.setEnabled(false);
        }
    }

}
