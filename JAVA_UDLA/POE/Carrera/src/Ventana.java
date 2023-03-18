
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener {

    JLabel grifo;
    JLabel anciano;
    JLabel sonic;

    ImageIcon[] imagenesGrifo;
    ImageIcon[] imagenesAnciano;
    ImageIcon[] imagenesSonic;

    JPanel panel;

    JButton empezar;

    ProcesoAnimacion movimiento1, movimiento2, movimientoSonic;

    public Ventana() {
        setTitle("Carrera");
        Componentes();

        add(panel);

        //pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);//para poner la aplicacion a pantalla completa
        //setResizable(false);
    }

    public void Componentes() {
        imagenesGrifo = new ImageIcon[8];
        LlenarArregloGrifo();

        imagenesAnciano = new ImageIcon[30];
        LlenarArregloAnciano();

        imagenesSonic = new ImageIcon[9];
        LlenarArregloSonic();

        ImageIcon inicio = new ImageIcon(getClass().getResource("inicio.jpg"));

        grifo = new JLabel(new ImageIcon(inicio.getImage().getScaledInstance(240, 200, Image.SCALE_DEFAULT)));
        anciano = new JLabel(new ImageIcon(inicio.getImage().getScaledInstance(240, 200, Image.SCALE_DEFAULT)));
        sonic = new JLabel(new ImageIcon(inicio.getImage().getScaledInstance(240, 200, Image.SCALE_DEFAULT)));

        /*grifo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        anciano.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sonic.setBorder(BorderFactory.createLineBorder(Color.BLACK));*/

        empezar = new JButton("Empezar");
        empezar.addActionListener(this);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new GridBagLayout());
        Organizar();

        movimiento1 = new ProcesoAnimacion(imagenesGrifo, 0, grifo);
        movimiento2 = new ProcesoAnimacion(imagenesAnciano, 0, anciano);
        movimientoSonic = new ProcesoAnimacion(imagenesSonic, 0, sonic);

    }

    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 7;
        c.gridheight = 7;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        panel.add(grifo, c);

        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 7;
        c.gridheight = 7;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        panel.add(anciano, c);

        c.gridx = 0;
        c.gridy = 14;
        c.gridwidth = 7;
        c.gridheight = 7;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        panel.add(sonic, c);

        c.gridx = 0;
        c.gridy = 21;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(empezar, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        movimiento1.start();
        movimiento2.start();
        movimientoSonic.start();
    }

    public void LlenarArregloGrifo() {
        String location = "";
        for (int i = 0; i < imagenesGrifo.length; i++) {
            location = "/ImagenesGrifo/" + i + ".gif";
            imagenesGrifo[i] = new ImageIcon(getClass().getResource(location));
        }
    }

    public void LlenarArregloAnciano() {
        String location = "";
        for (int i = 0; i < imagenesAnciano.length; i++) {
            location = "/ImagenesAnciano/" + i + ".gif";
            imagenesAnciano[i] = new ImageIcon(getClass().getResource(location));
        }
    }

    public void LlenarArregloSonic() {
        String location = "";
        for (int i = 0; i < imagenesSonic.length; i++) {
            location = "/ImagenesSonic/" + i + ".gif";
            imagenesSonic[i] = new ImageIcon(getClass().getResource(location));
        }
    }

}
