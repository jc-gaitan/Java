package e5;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame implements ActionListener, ChangeListener {

    static final int FPS_MIN = 0;
    static final int FPS_MAX = 20;
    static final int FPS_INIT = 0;

    JPanel principal;
    JPanel contenido;

    JButton salir;

    JComboBox prin;

    Label numeros, numeros2;

    JSlider numero, numero2;

    String[] opciones = {"Area", "Perimetro"};

    JRadioButton rectangulo, cuadrado;

    ButtonGroup group;

    JTextArea ope;
    JScrollPane scroll;

    public Ventana() {
        setTitle("Ventana");
        setLocationRelativeTo(null);

        Container conten = this.getContentPane();
        conten.setLayout(new BoxLayout(conten, BoxLayout.Y_AXIS));

        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());

        componentes();
        paneles();

        conten.add(principal);
        conten.add(contenido);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paneles() {
        principal = new JPanel();//s
        //principal.setBackground(Color.red);
        principal.setLayout(new FlowLayout());
        principal.add(prin);
        principal.add(rectangulo);
        principal.add(cuadrado);
        principal.add(salir);

        contenido = new JPanel();
        contenido.setBackground(Color.WHITE);
        contenido.setLayout(new GridBagLayout());
        organizar();
    }

    public void componentes() {
        prin = new JComboBox(opciones);
        prin.addActionListener(this);

        rectangulo = new JRadioButton("Rectangulo");
        rectangulo.addActionListener(this);
        cuadrado = new JRadioButton("Cuadrado");
        cuadrado.addActionListener(this);

        group = new ButtonGroup();
        group.add(rectangulo);
        group.add(cuadrado);

        salir = new JButton("Salir");
        salir.setToolTipText("Este boton cierra la aplicacion");
        salir.addActionListener(this);

        numeros = new Label(" (0)  ");
        numeros2 = new Label(" (0)  ");

        numero = new JSlider(FPS_MIN, FPS_MAX, FPS_INIT);//
        numero.addChangeListener(this);
        numero.setEnabled(false);
        numero2 = new JSlider(FPS_MIN, FPS_MAX, FPS_INIT);//
        numero2.addChangeListener(this);
        numero2.setEnabled(false);

        ope = new JTextArea(10, 10);
        ope.setEditable(false);
        scroll = new JScrollPane(ope);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == salir) {
            System.exit(0);
        } else if (ae.getSource() == prin) {//
            if (prin.getSelectedIndex() == 0) {

            } else if (prin.getSelectedIndex() == 1) {

            }
        } else if (ae.getSource() == cuadrado) {
            numero.setEnabled(true);
            numero2.setEnabled(false);
        } else if (ae.getSource() == rectangulo) {
            numero.setEnabled(true);
            numero2.setEnabled(true);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == numero) {
            numeros.setText("(" + String.valueOf(numero.getValue()) + ")");
            if (prin.getSelectedIndex() == 0 && cuadrado.isSelected()) {
                ope.setText(ope.getText() + "\nArea: " + (numero.getValue() * numero.getValue()));
            } else if (prin.getSelectedIndex() == 1 && cuadrado.isSelected()) {
                ope.setText(ope.getText() + "\nPerimetro: " + (numero.getValue() + numero.getValue() + numero.getValue() + numero.getValue()));
            }
        } else if (e.getSource() == numero2) {
            numeros2.setText("(" + String.valueOf(numero2.getValue()) + ")");
        }
        if (prin.getSelectedIndex() == 0 && rectangulo.isSelected()) {
            ope.setText(ope.getText() + "\nArea: " + (numero.getValue() * numero2.getValue()));
        } else if (prin.getSelectedIndex() == 1 && rectangulo.isSelected()) {
            ope.setText(ope.getText() + "\nPerimetro: " + (numero.getValue() + numero.getValue() + numero2.getValue() + numero2.getValue()));
        }
    }
    
    
    public void organizar(){//MODIFICAR
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 2;//cuantas columnas va a ocupar
        c.gridheight = 2;//cuantas filas va a ocupar
        c.weightx = 1.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 1.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.insets=new Insets(4,4,4,4);
        contenido.add(numeros,c);
        
        c.gridx = 2;
        c.gridy = 0;
        c.gridheight = 2;
        c.gridwidth = 5;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        contenido.add(numero,c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridheight = 2;
        c.gridwidth = 2;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,4);
        contenido.add(numeros2,c);
        
        c.gridx = 2;
        c.gridy = 3;
        c.gridheight = 2;
        c.gridwidth = 5;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,4);
        contenido.add(numero2,c);
        
        c.gridx = 0;
        c.gridy = 6;
        c.gridheight = 7;
        c.gridwidth = 7;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,4);
        contenido.add(scroll,c);
    }
    

}
