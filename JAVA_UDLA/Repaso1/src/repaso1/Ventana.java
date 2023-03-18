package repaso1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class Ventana extends JFrame implements ActionListener, KeyListener {

    Validar validar;
    Suscripcion suscri = new Suscripcion();
    JTextArea Novedades;
    Novedad novedad;
    //Campo donde se digita la informacion
    private JTextField nombre;
    private JTextField apellido;
    private JTextField codigo;

    //Con el que se le da el nombre al campo
    private TitledBorder titleName;
    private TitledBorder titleApe;
    private TitledBorder titleCode;

    private JLabel genero;
    //Ubicacion donde se va a mostrar
    private GridBagConstraints c;

    private JButton suscrip;
    private JButton verificar;

    private JCheckBox drama, terror, accion, romantico, infantil;
//    JPanel CheckBox;

//    //Para poder darle ubicacion al titulo
    private Border borde;

    public Ventana() {
        setTitle("Tv Cable");

        this.getContentPane().setBackground(Color.WHITE);//cambiar el color de la ventana

        Componentes();
        setLayout(new GridBagLayout());
        Organizar();

        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes() {

        borde = BorderFactory.createLineBorder(Color.BLACK);
        c = new GridBagConstraints();
        //Se crean los componentes
//        nombre = new JTextField(8);
//        titleName = new TitledBorder("Nombre:");
//        nombre.setBorder(titleName);
//
//        apellido = new JTextField(8);
//        titleApe = new TitledBorder("Apellido:");
//        apellido.setBorder(titleApe);

        Novedades = new JTextArea(12, 22);
        Novedades.setEditable(false);
        validar = new Validar(Novedades);
        novedad = new Novedad(this, true, Novedades);

        nombre = new JTextField(8);
        nombre.addKeyListener(this);
        titleName = new TitledBorder(borde, "Nombre:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        nombre.setBorder(titleName);

        apellido = new JTextField(8);
        apellido.addKeyListener(this);
        titleApe = new TitledBorder(borde, "Apellido:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        apellido.setBorder(titleApe);

        codigo = new JFormattedTextField(mascara());
        titleCode = new TitledBorder("Codigo de seguridad:");
        codigo.setBorder(titleCode);

        genero = new JLabel("Generos");

        drama = new JCheckBox("Drama");
        drama.setBackground(Color.WHITE);
        terror = new JCheckBox("Terror");
        terror.setBackground(Color.WHITE);
        accion = new JCheckBox("Accion");
        accion.setBackground(Color.WHITE);
        romantico = new JCheckBox("Romantico");
        romantico.setBackground(Color.WHITE);
        infantil = new JCheckBox("Infantil");
        infantil.setBackground(Color.WHITE);

        suscrip = new JButton("SUSCRIPCION");
        suscrip.addActionListener(this);
        suscrip.setEnabled(false);
        verificar = new JButton("Validar");
        verificar.addActionListener(this);

    }

    // Creamos el formato de nuestra contraseña
    // # -> un número 
    // U -> letra mayúscula 
    // L -> letra minúscula
    // * -> cualquier caracter 
    // ' -> caracteres de escape
    // A -> cualquier letra o número 
    // ? -> cualquier caracter
    // H -> cualquier caracter hexagonal (0-9, a-f or A-F).
    private MaskFormatter mascara() {
        MaskFormatter mascara = new MaskFormatter();
        try {

            mascara = new MaskFormatter("UUUULL-##-LL");

        } catch (ParseException e) {
            // Algún error que pueda ocurrir
            e.printStackTrace();
        }
        return mascara;
    }

    public void Organizar() {

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(nombre, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(apellido, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(codigo, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(genero, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 4, 2);
        add(drama, c);

        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 0);
        add(terror, c);

        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 0);
        add(accion, c);

        c.gridx = 3;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 0);
        add(romantico, c);

        c.gridx = 4;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 4);
        add(infantil, c);

        c.gridx = 4;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 4, 2);
        add(verificar, c);

        c.gridx = 5;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 4, 2);
        add(suscrip, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == verificar) {
            Novedades.setText("");

            int x = 0;

            x = validar.VacioJTextField(apellido, titleApe);
            x += validar.VacioJTextField(nombre, titleName);
            x += validar.VacioJFormattedTextField(codigo, titleCode);

            x += validar.ValidarCheckBox(drama);
            x += validar.ValidarCheckBox(terror);
            x += validar.ValidarCheckBox(accion);
            x += validar.ValidarCheckBox(romantico);
            x += validar.ValidarCheckBox(infantil);

            if (x == 0) {
                suscrip.setEnabled(true);
                this.repaint();
                x = 0;
            } else {
                suscrip.setEnabled(false);
            }

            if (!Novedades.getText().equals("")) {
                novedad.setVisible(true);
            } /*else {
             nombre.setText("");
             apellido.setText("");
             codigo.setText("");
             drama.setSelected(false);
             terror.setSelected(false);
             accion.setSelected(false);
             romantico.setSelected(false);
             infantil.setSelected(false);

             }*/

            repaint();
        }

        if (e.getSource() == suscrip) {
            suscri.setVisible(true);
        }
    }
    //valide los campos obligatorios
//            if
//            suscripcion;

    @Override
    public void keyTyped(KeyEvent ke) {
        if (ke.getSource() == nombre || ke.getSource() == apellido) {
            validar.soloLetras(ke, nombre);
            validar.soloLetras(ke, apellido);
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getSource() == apellido) {
            validar.PrimerMayuscula(ke, apellido);
        }
    }

}
