
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame implements ActionListener, MouseListener {

    PanelGranjero granjero;
    PanelCliente cliente;

    JPanel a;

    ImageIcon[][] ImagenesCliente1;
    ImageIcon[][] ImagenesCliente2;

    ImageIcon[] ImagenesManzanas;
    
    ImageIcon[] PGran;
    ImageIcon[] PClien;

    JLabel mensajeGran;
    JLabel mensajeCli;
    
    JLabel relleno;

    JButton iniciar;

    HMovimiento MCliente;
    HVenta Venta;
    HTemporizador tempo;

    JComboBox opcion;
    String[] opciones = {"Opciones", "1", "2", "4", "5", "10", "20"};
    
    Emergente emergente;

    public Ventana() {
        Componentes();

        setTitle("Carrera");

        setSize(1200, 700);
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(true);

        setLayout(new GridBagLayout());
        organizar();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes() {

        granjero = new PanelGranjero();
        cliente = new PanelCliente();

        iniciar = new JButton("Iniciar");
        iniciar.setEnabled(false);
        iniciar.addActionListener(this);
        opcion = new JComboBox(opciones);
        opcion.addActionListener(this);
        opcion.setBorder(new TitledBorder(BorderFactory.createEmptyBorder(), "TIEMPO MAXIMO DE ATENCION:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));

        ImagenesCliente1 = new ImageIcon[8][2];
        Cliente1();

        ImagenesCliente2 = new ImageIcon[5][2];
        Cliente2();

        ImagenesManzanas = new ImageIcon[11];
        LlenarManzanas();
        
        PGran = new ImageIcon[3];
        PGran[0] = new ImageIcon(getClass().getResource("/Otras/P0.png"));
        PGran[1] = new ImageIcon(getClass().getResource("/Otras/P1000.png"));
        PGran[2] = new ImageIcon(getClass().getResource("/Otras/P2000.png"));
        
        PClien = new ImageIcon[3];
        PClien[0] = new ImageIcon(getClass().getResource("/Otras/c1.png"));
        PClien[1] = new ImageIcon(getClass().getResource("/Otras/c2.png"));
        PClien[2] = new ImageIcon(getClass().getResource("/Otras/gracias.png"));

        ImageIcon Gran = new ImageIcon(getClass().getResource("/Otras/inicio.png"));
        Gran = new ImageIcon(Gran.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        mensajeGran = new JLabel(Gran);

        ImageIcon Clien = new ImageIcon(getClass().getResource("/Otras/inicio.png"));
        Clien = new ImageIcon(Clien.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        mensajeCli = new JLabel(Clien);

        relleno = new JLabel("                          ");

        emergente = new Emergente(this,true);
        emergente.x.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iniciar) {
            if (!MCliente.isAlive()) {
                MCliente.start();
            }
            iniciar.setEnabled(false);
            opcion.setEnabled(false);
        } else if (e.getSource() == opcion) {
            if (opcion.getSelectedIndex() != 0) {
                tempo = new HTemporizador(Integer.parseInt(opcion.getSelectedItem().toString()));
                Venta = new HVenta(Integer.parseInt(opcion.getSelectedItem().toString()), granjero.getManzanas(),ImagenesManzanas, emergente,tempo, mensajeGran, mensajeCli, PGran, PClien, ImagenesCliente1, ImagenesCliente2, cliente.Cliente);
                MCliente = new HMovimiento(ImagenesCliente1, 0, cliente.Cliente, Venta, tempo);
            }
            iniciar.setEnabled(true);
        }
        
    }

    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(mensajeGran, c);

        c.gridx = 5;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 4;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(mensajeCli, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(relleno, c);

        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 5;
        c.gridheight = 5;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(granjero, c);

        c.gridx = 6;
        c.gridy = 4;
        c.gridwidth = 10;
        c.gridheight = 5;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(cliente, c);

        c.gridx = 0;
        c.gridy = 14;
        c.gridwidth = 10;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 10, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(opcion, c);

        c.gridx = 11;
        c.gridy = 14;
        c.gridwidth = 20;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(16, 4, 4, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(iniciar, c);
    }

    public void Cliente1() {
        String location = "";
        String paquete = "/Cliente1Derecha/";

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < ImagenesCliente1.length; i++) {
                location = paquete + i + ".gif";
                ImagenesCliente1[i][j] = new ImageIcon(getClass().getResource(location));
            }
            paquete = "/Cliente1Izquierda/";
        }
    }

    public void Cliente2() {
        String location = "";
        String paquete = "/Cliente2Derecha/";

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < ImagenesCliente2.length; i++) {
                location = paquete + i + ".gif";
                ImagenesCliente2[i][j] = new ImageIcon(getClass().getResource(location));
            }
            paquete = "/Cliente2Izquierda/";
        }
    }

    private void LlenarManzanas() {
        String location;

        for (int i = 0; i < ImagenesManzanas.length; i++) {
            location = "/Manzanas/" + i + ".png";
            ImagenesManzanas[i] = new ImageIcon(getClass().getResource(location));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.exit(0);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
