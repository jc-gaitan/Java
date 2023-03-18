/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import static proyecto.VentanaInicio.ht;

/**
 *
 * @author NOGUERA
 */
public class Ventana extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    VentanaInicio VentanaInicio;
    static HiloMapa1 hm1;
    static HiloMapa2 hm2;
    static HiloMapa3 hm3;
    static HiloMapa4 hm4;
    static HiloMapa5 hm5;
    static HiloMapa6 hm6;

    JPanel panelPrincipal = new JPanel();
    JPanel panelMapa = new JPanel();
    JPanel PanelInferior = new JPanel();

    JLabel fondo = new JLabel();
    JLabel mapa1, mapa2, mapa3, mapa4, mapa5, mapa6 = new JLabel();

    static JLabel Tiempo = new JLabel("      Tiempo:      ");
    JButton Salir, pausar, reanudar, regresar;

    boolean aux1;

    Ventana() {

        setTitle("Juego mapa de BOLIVIA");

        PanelCentral();
        PanelInferior();

        Organizar();

        setResizable(true);
        pack();
        try {
            Image img = ImageIO.read(new File("Icono.png"));
            this.setIconImage(img);
        } catch (Exception e) {
        }

        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        hm1 = new HiloMapa1(this);
        hm1.start();
        hm2 = new HiloMapa2(this);
        hm2.start();
        hm3 = new HiloMapa3(this);
        hm3.start();
        hm4 = new HiloMapa4(this);
        hm4.start();
        hm5 = new HiloMapa5(this);
        hm5.start();
        hm6 = new HiloMapa6(this);
        hm6.start();

    }

    private void PanelCentral() {

        ImageIcon font = new ImageIcon(this.getClass().getResource("/Imagenes/Bolivia2.png"));

        // fondo.setLocation(10, 10);
        fondo.setIcon(font);
        fondo.setBounds(200, 100, 453, 500);

        mapa1 = new JLabel(new ImageIcon("Mapa1.png"));
        mapa1.setBounds(1150, 0, 170, 150);
        mapa1.addMouseMotionListener(this);
        mapa1.addMouseListener(this);
        aux1 = true;

        mapa2 = new JLabel(new ImageIcon("Mapa2.png"));
        mapa2.setBounds(1150, 180, 120, 120);

        mapa3 = new JLabel(new ImageIcon("Mapa3.png"));
        mapa3.setBounds(1150, 350, 130, 240);

        mapa4 = new JLabel(new ImageIcon("Mapa4.png"));
        mapa4.setBounds(950, 0, 146, 189);

        mapa5 = new JLabel(new ImageIcon("Mapa5.png"));
        mapa5.setBounds(950, 210, 210, 230);

        mapa6 = new JLabel(new ImageIcon("Mapa6.png"));
        mapa6.setBounds(950, 450, 105, 120);

        add(mapa1);
        add(mapa2);
        add(mapa3);
        add(mapa4);
        add(mapa5);
        add(mapa6);
        add(fondo);

    }

    private void PanelInferior() {

        JLabel Puntaje = new JLabel("   Puntaje:   ");
        Puntaje.setFont(new Font("Arial", Font.BOLD, 20));
        Tiempo.setFont(new Font("Arial", Font.BOLD, 20));

        regresar = new JButton();
        ImageIcon regre = new ImageIcon("regresar.png");
        regresar.setIcon(new ImageIcon(regre.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
        regresar.addActionListener(this);

        pausar = new JButton();
        ImageIcon pau = new ImageIcon("Pausar.png");
        pausar.setIcon(new ImageIcon(pau.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
        pausar.addActionListener(this);

        reanudar = new JButton();
        ImageIcon conti = new ImageIcon("Continuar.png");
        reanudar.setIcon(new ImageIcon(conti.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
        reanudar.addActionListener(this);

        Salir = new JButton();
        ImageIcon cerra = new ImageIcon("Cerrar.png");
        Salir.setIcon(new ImageIcon(cerra.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
        Salir.addActionListener(this);

        JPanel paneldatos = new JPanel(new FlowLayout(FlowLayout.CENTER));
        paneldatos.setBackground(Color.WHITE);

        PanelInferior.add(regresar);
        PanelInferior.add(pausar);
        PanelInferior.add(reanudar);
        PanelInferior.add(Salir);

        paneldatos.add(Tiempo);
        paneldatos.add(Puntaje);
        PanelInferior.add(paneldatos, BorderLayout.CENTER);
        PanelInferior.setBackground(Color.WHITE);

    }

    private void Organizar() {

        setLayout(new BorderLayout());

        add(panelPrincipal, BorderLayout.CENTER);
        panelPrincipal.setBackground(Color.WHITE);
        add(PanelInferior, BorderLayout.SOUTH);

    }

    private void IniciarHilos() {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == regresar) {
            VentanaInicio VentanaInicio = new VentanaInicio();
            setVisible(false);
            ht.stop();
            // dispose();

        }

        if (ae.getSource() == pausar) {
            ht.suspend();
            hm1.suspend();
            hm2.suspend();
            hm3.suspend();
            hm4.suspend();
            hm5.suspend();
            hm6.suspend();

        }

        if (ae.getSource() == reanudar) {
            ht.resume();
            hm1.resume();
            hm2.resume();
            hm3.resume();
            hm4.resume();
            hm5.resume();
            hm6.resume();

        }

        if (ae.getSource() == Salir) {
            System.exit(0);
        }

    }

    public void VerificarPos(int x, int y) {
        if (y >= 94 && y <= 102 && x >= 193 && x <= 208) {
            mapa1.setLocation(200, 100);
            aux1 = false;
        } else {
            mapa1.setLocation(1150, 0);
            hm1 = new HiloMapa1(this);
            hm1.start();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == mapa1 && aux1) {
            mapa1.setLocation(mapa1.getX() + e.getX() - mapa1.getWidth() / 2, mapa1.getY() + e.getY() - mapa1.getHeight() / 2);
            //posicion(letro.getX(), letro.getY(), letro);
            hm1.stop();
            System.out.println(mapa1.getLocation());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        VerificarPos(mapa1.getX(), mapa1.getY());
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

}
