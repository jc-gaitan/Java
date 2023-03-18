import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Ventana extends JFrame implements ActionListener {

    Hilo tiempo;
    JPanel Pletras;
    JPanel PBotones;
    JPanel Praya;
    relas reglas;
    JLabel[] letras;
    JTable ganadores;
    long var[];
    JButton reiniciar;

    HMovimiento movimientos[];
    JButton play;
    boolean x = true;
    int w = 0;

    HMovimiento1 a;
    HMovimiento1 b;

    public Ventana() {
        Componentes();
        setTitle("Carrera ");
        setIconImage(new ImageIcon(getClass().getResource("/icon/pause.png")).getImage());
        getContentPane().setBackground(Color.cyan);
        setLayout(new GridBagLayout());
        Organizar();
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    public void Organizar() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 10;
        c.gridy = 0;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(4, 20, 0, 4);
        add(PBotones, c);

        c.gridx = 0;
        c.gridy = 25;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 15;//cuantas filas va a ocupar
        c.weightx = 1.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 1.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.anchor = GridBagConstraints.CENTER;//pone el componente a la izquierda
        c.insets = new Insets(4, 4, 0, 4);
        add(Pletras, c);

    }

    public void OrganizarBoto() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 12;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        PBotones.add(play, c);
        c.gridx = 8;
        c.gridy = 12;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        PBotones.add(reiniciar, c);
    }

    public void Organisarimagenes() {
        Pletras = new JPanel();
        Pletras.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Pletras.setOpaque(false);
        Pletras.setLayout(null);
        Pletras.setSize(300, 500);

        ImageIcon Imag;

        letras = new JLabel[8];
        movimientos = new HMovimiento[4];
        var = new long[4];
        ImageIcon IconLetra;

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/1.png"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT));
        letras[0] = new JLabel(IconLetra);
        letras[0].setBounds(10, 66, 100, 60);

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/2.png"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT));
        letras[1] = new JLabel(IconLetra);
        letras[1].setBounds(10, 166, 100, 60);

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/3.png"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT));
        letras[2] = new JLabel(IconLetra);
        letras[2].setBounds(10, 266, 100, 60);

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/4.png"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT));
        letras[3] = new JLabel(IconLetra);
        letras[3].setBounds(10, 366, 100, 60);

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/linea.png"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(60, 400, Image.SCALE_DEFAULT));
        letras[4] = new JLabel(IconLetra);
        letras[4].setBounds(85, 50, 60, 400);

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/la.jpg"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(800, 40, Image.SCALE_DEFAULT));
        letras[5] = new JLabel(IconLetra);
        letras[5].setBounds(8, 10, 800, 40);

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/lb.jpg"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(800, 40, Image.SCALE_DEFAULT));
        letras[6] = new JLabel(IconLetra);
        letras[6].setBounds(8, 450, 800, 40);

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/fn.png"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(100, 400, Image.SCALE_DEFAULT));
        letras[7] = new JLabel(IconLetra);
        letras[7].setBounds(750, 50, 100, 400);

        Pletras.add(letras[0]);
        for (int i = 0; i < letras.length; i++) {
            Pletras.add(letras[i]);
        }

    }

    public void Componentes() {

        play = new JButton("PLAY   ");
//        play.setEnabled(false);
        play.addActionListener(this);

        ImageIcon photoplay = new ImageIcon(getClass().getResource("/icon/play.png"));
        ImageIcon ima1 = new ImageIcon(photoplay.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
        play.setIcon(ima1);
        reiniciar = new JButton("REINICIAR");
        reiniciar.setEnabled(false);
        reiniciar.addActionListener(this);
        ImageIcon photorein = new ImageIcon(getClass().getResource("/icon/reiniciar.png"));
        ImageIcon ima2 = new ImageIcon(photorein.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
        reiniciar.setIcon(ima2);
        PBotones = new JPanel();

        PBotones.setOpaque(false);
        PBotones.setLayout(new GridBagLayout());
        OrganizarBoto();

        ganadores = new JTable();

        Organisarimagenes();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == play && x) {

            if (w == 0) {
                movimientos[0] = new HMovimiento(letras[0], true, "Amarillo");
                //movimientos[1] = new HMovimiento(letras[1], true, "azul");
                movimientos[2] = new HMovimiento(letras[2], true, "cian");
                //movimientos[3] = new HMovimiento(letras[3], true, "rojo");

                a = new HMovimiento1(letras[1], true, "azul", movimientos[0]);
                b = new HMovimiento1(letras[3], true, "rojo", movimientos[2]);
                
                tiempo = new Hilo(a,b);
                
                movimientos[0].start();
                var[0] = movimientos[0].tiempo;
                a.start();
                //      System.out.println("sdsd"+var);
//  movimientos[1].start();
//  var [1]= movimientos[1].tiempo; 
                // System.out.println("sdsd"+var);

                movimientos[2].start();
                var[2] = movimientos[2].tiempo;
                b.start();                //  System.out.println("sdsd"+var);
                tiempo.start();
//      movimientos[3].start();
//      var[3] = movimientos[3].tiempo; 
                //  System.out.println("sdsd"+var);
                Arrays.sort(var);
                w++;
            } else {
                movimientos[0].resume();
                movimientos[1].resume();
                movimientos[2].resume();
                movimientos[3].resume();

            }

            reiniciar.setEnabled(true);
            ImageIcon photopause = new ImageIcon(getClass().getResource("/icon/pause.png"));
            ImageIcon ima = new ImageIcon(photopause.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
            play.setIcon(ima);
            play.setText("PAUSE");
            x = false;
        } else if (ae.getSource() == play) {

            movimientos[0].suspend();
            movimientos[1].suspend();
            movimientos[2].suspend();
            movimientos[3].suspend();

            ImageIcon photoplay = new ImageIcon(getClass().getResource("/icon/play.png"));
            ImageIcon ima1 = new ImageIcon(photoplay.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
            play.setIcon(ima1);
            play.setText("PLAY   ");
            reiniciar.setEnabled(true);
            x = true;
        } else if (ae.getSource() == reiniciar) {

            movimientos[0].stop();
            movimientos[1].stop();
            movimientos[2].stop();
            movimientos[3].stop();
            letras[0].setBounds(10, 66, 100, 60);
            letras[1].setBounds(10, 166, 100, 60);
            letras[2].setBounds(10, 266, 100, 60);
            letras[3].setBounds(10, 366, 100, 60);
            ImageIcon photoplay = new ImageIcon(getClass().getResource("/icon/play.png"));
            ImageIcon ima1 = new ImageIcon(photoplay.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
            play.setIcon(ima1);
            play.setText("PLAY   ");
            reiniciar.setEnabled(false);

            w = 0;
            x = true;
        }

    }
}
