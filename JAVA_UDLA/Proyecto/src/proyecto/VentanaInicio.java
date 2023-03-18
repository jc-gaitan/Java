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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author NOGUERA
 */
public class VentanaInicio extends JFrame implements ActionListener {

    Ventana Ventana;

    JButton StarInicio, salir;
    JComboBox TiempoFuncion;
    static HiloTiempo ht;
    
    JPanel Paneltiempo = new JPanel();
    JPanel P2 = new JPanel();
    JPanel panelSuperior = new JPanel();
    JPanel PanelInferior = new JPanel();
    JPanel panelPrincipal = new JPanel();
    JLabel fondo = new JLabel();

    public VentanaInicio() {

        setTitle("Juego mapa de BOLIVIA");

        PanelSuperior();
        PanelCentral();
        PanelInferior();
        Organizar();

        setResizable(false);
        pack();
        try {
            Image img = ImageIO.read(new File("Icono.png"));
            this.setIconImage(img);
        } catch (Exception e) {
        }
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.WHITE);

    }

    private void PanelSuperior() {

        JLabel Nombre = new JLabel(" BIEVENIDO");
        Nombre.setFont(new Font("Arial", Font.BOLD, 50));
        panelSuperior.add(Nombre);

    }

    private void PanelCentral() {

        JLabel Descripcion = new JLabel(" El juego consiste en que se "
                + "debe armar el mapa del pais de bolivia con sus departamentos,"
                + " se debe ir arrastrando los departamentos y colocarlos en la silueta correspondiente."
                + "");
        Descripcion.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel Descripcion2 = new JLabel(" NOTA:  PARA INICIAR EL JUEGO DEBE SELECCION EL TIEMPO QUE TENDRA PARA COMPLETAR EL MAPA"
                + " Y DARLE CLICK AL BOTON 'START' ");
        Descripcion2.setFont(new Font("Arial", Font.BOLD, 15));

        P2.setLayout(new FlowLayout(FlowLayout.LEADING));
        P2.setBackground(Color.WHITE);

        panelPrincipal.setBackground(Color.WHITE);
        panelPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        ImageIcon font = new ImageIcon(this.getClass().getResource("/Imagenes/bolivia.jpg"));

        fondo.setLocation(10, 10);
        fondo.setIcon(font);

        P2.add(fondo);

        panelPrincipal.add(P2);
        panelPrincipal.add(Descripcion);
        panelPrincipal.add(Descripcion2);

    }

    private void PanelInferior() {
        String[] datos = {"Seleccionar    ", "1 minuto", "2 minutos", "3 minutos", "4 minutos", "5 minutos", "6 minutos"};

        Paneltiempo.setBorder(BorderFactory.createTitledBorder("Tiempo Del Juego"));

        Paneltiempo.setLayout(new FlowLayout(FlowLayout.CENTER));
        Paneltiempo.setBackground(Color.WHITE);
        TiempoFuncion = new JComboBox(datos);
        TiempoFuncion.addActionListener(this);

        StarInicio = new JButton();
        //  StarInicio.setBackground(Color.yellow);//// color de fondo del boton
        ImageIcon star = new ImageIcon("star.png");
        StarInicio.setIcon(new ImageIcon(star.getImage().getScaledInstance(70, 40, Image.SCALE_SMOOTH)));
        StarInicio.addActionListener(this);

        salir = new JButton();
        ImageIcon sali = new ImageIcon("Cerrar.png");
        salir.setIcon(new ImageIcon(sali.getImage().getScaledInstance(70, 40, Image.SCALE_AREA_AVERAGING)));

        salir.addActionListener(this);

        PanelInferior.add(Paneltiempo, BorderLayout.CENTER);
        PanelInferior.add(StarInicio);
        PanelInferior.add(salir);
        Paneltiempo.add(TiempoFuncion);

        PanelInferior.setBackground(Color.WHITE);

    }

    private void Organizar() {
        setLayout(new BorderLayout());
//        setLayout(new GridBagLayout());
//        GridBagConstraints c = new GridBagConstraints();
//        c.gridx = 0;
//        c.gridy = 0;
//        c.gridwidth = 3;
//        c.gridheight = 3;
//        c.weightx = 3.0; //se estira a lo horizontal
//        c.weighty = 3.0; //se estira a lo vertical
//        c.fill = 1;
//        c.ipadx = 100;
//        add(fondo, c);
        add(panelSuperior, BorderLayout.NORTH);

        add(panelPrincipal, BorderLayout.CENTER);

        add(PanelInferior, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == StarInicio && TiempoFuncion.getSelectedIndex() >= 1) {
            Ventana ventana = new Ventana();

            setVisible(false);
            //   dispose();

       

        }

        if (ae.getSource() == salir) {
            System.exit(0);
        }

        if (ae.getSource() == TiempoFuncion) {
            if (TiempoFuncion.getSelectedIndex() >= 1) {
                ht = new HiloTiempo(TiempoFuncion.getSelectedIndex());

                ht.start();

//                hr.start();
//                hp.start();
//                switch (velocidadPersonas.getSelectedIndex()) {
//                    case 1:
//                        hlc = new HiloLLegadaCliente(8);
//                        break;
//                    case 2:
//                        hlc = new HiloLLegadaCliente(4);
//                        break;
//                    case 3:
//                        hlc = new HiloLLegadaCliente(1);
//                        break;
//
//                }
//                hlc.start();
            }

        }
    }

}
