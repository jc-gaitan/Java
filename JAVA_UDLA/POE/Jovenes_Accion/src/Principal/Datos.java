package Principal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Datos extends JPanel implements ActionListener {
    
    //List <Estudiante> lista;
    Ventana a;

    TitledBorder title;

    JLabel nombre;
    JLabel apellido;
    JLabel fecha_na;
    JLabel celular;
    JLabel correo;
    JLabel Num_documento;

    JRadioButton cc, ti;
    ButtonGroup group;
    JButton generarNota;

    JTextField Nombre;
    JTextField Apellido;
    JTextField Fecha_na;
    JTextField Celular;
    JTextField Correo;
    JTextField num_documento;
    JTextField genNota;

    String[] programas = {"Programas", "Ingenieria Sistemas", "Medicina Veterinaria", "Derecho", "Quimica", "Contaduria Publica"};
    JComboBox programa;

    JButton registrar, Cancelar;

    String k;

    boolean bocc, boti, pro = false;

    public Datos(Ventana a) {
        this.a = a;
        componentes();
        title = BorderFactory.createTitledBorder("Registro");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        setBorder(title);
        organizar();
    }

    public void componentes() {
        nombre = new JLabel("Nombre: ");
        apellido = new JLabel("Apellido: ");
        fecha_na = new JLabel("Fecha de Nacimiento (D/M/A): ");
        celular = new JLabel("Celular: ");
        correo = new JLabel("Correo: ");
        Num_documento = new JLabel("Numero de Documento: ");
        group = new ButtonGroup();
        cc = new JRadioButton("CC");
        cc.setBackground(Color.white);
        ti = new JRadioButton("TI");
        ti.setBackground(Color.WHITE);
        cc.addActionListener(this);
        ti.addActionListener(this);
        group.add(cc);
        group.add(ti);
        generarNota = new JButton("Generar Nota: ");
        generarNota.addActionListener(this);

        Nombre = new JTextField("", 8);
        Apellido = new JTextField("", 8);
        Fecha_na = new JTextField("", 7);
        Celular = new JTextField("");
        num_documento = new JTextField("", 7);
        Correo = new JTextField("");
        genNota = new JTextField("");
        genNota.setEditable(false);

        programa = new JComboBox(programas);
        programa.addActionListener(this);

        registrar = new JButton("Registrar Estudiante");
        registrar.addActionListener(this);
        Cancelar = new JButton("Cancelar");
        Cancelar.addActionListener(this);
    }

    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 1;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 0.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 0.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.NONE;//aumenta la celda en la que se encuentra(filas o columnas)
        c.anchor = GridBagConstraints.WEST;//pone el componente a la izquierda
        c.insets = new Insets(4, 4, 0, 0);
        add(nombre, c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, -10, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(Nombre, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 0);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        add(apellido, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, -10, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(Apellido, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.NONE;
        add(fecha_na, c);

        c.gridx = 3;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 4;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 0, 0, 4);
        c.fill = GridBagConstraints.BOTH;
        add(Fecha_na, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.NONE;
        add(Num_documento, c);

        c.gridx = 3;
        c.gridy = 3;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, -30, 0, 4);
        c.fill = GridBagConstraints.BOTH;
        add(num_documento, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(2, 4, 0, 0);
        c.fill = GridBagConstraints.NONE;
        add(ti, c);

        c.gridx = 1;
        c.gridy = 4;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(2, 4, 0, 0);
        c.fill = GridBagConstraints.NONE;
        add(cc, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 0);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        add(celular, c);

        c.gridx = 1;
        c.gridy = 5;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, -15, 0, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(Celular, c);

        c.gridx = 0;
        c.gridy = 6;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 0);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        add(correo, c);

        c.gridx = 1;
        c.gridy = 6;
        c.gridheight = 1;
        c.gridwidth = 5;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, -15, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(Correo, c);

        c.gridx = 0;
        c.gridy = 8;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(generarNota, c);

        c.gridx = 1;
        c.gridy = 8;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(genNota, c);

        c.gridx = 0;
        c.gridy = 9;
        c.gridheight = 1;
        c.gridwidth = 5;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(programa, c);

        c.gridx = 0;
        c.gridy = 10;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(registrar, c);

        c.gridx = 3;
        c.gridy = 10;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(Cancelar, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generarNota) {
            genNota.setText(String.valueOf((int) (Math.random() * 40) + 10));
            generarNota.setEnabled(false);
        } else if (e.getSource() == cc) {
            bocc = true;
            boti = false;
        } else if (e.getSource() == ti) {
            bocc = false;
            boti = true;
        } else if (e.getSource() == registrar && (bocc || boti) && !Correo.getText().equals("")
                && !genNota.getText().equals("") && !Celular.getText().equals("")
                && !Nombre.getText().equals("") && !Apellido.getText().equals("")
                && !Fecha_na.getText().equals("") && !num_documento.getText().equals("") && pro) {

            a.Incentivos.setEnabled(true);
            a.Estadistica.setEnabled(true);
            
            if (Integer.parseInt(genNota.getText()) >= 30) {
                if(Integer.parseInt(genNota.getText()) >= 43){
                    JOptionPane.showMessageDialog(a, "El joven va a recivir el incentivo de EXCELENCIA. ");
                    a.in.listaEx.add(new Estudiante(Nombre.getText(),Apellido.getText(),Fecha_na.getText(), 
                            num_documento.getText(),bocc,Celular.getText(),Correo.getText(),genNota.getText(),k));
                }else{
                    JOptionPane.showMessageDialog(a, "El joven va a recivir el incentivo de PERMANENCIA. ");
                    a.in.listaPer.add(new Estudiante(Nombre.getText(),Apellido.getText(),Fecha_na.getText(), 
                            num_documento.getText(),bocc,Celular.getText(),Correo.getText(),genNota.getText(),k));
                }
                Correo.setText("");
                genNota.setText("");
                Celular.setText("");
                Nombre.setText("");
                Apellido.setText("");
                Fecha_na.setText("");
                num_documento.setText("");
                generarNota.setEnabled(true);
                programa.setSelectedItem("Programas");

            } else {
                JOptionPane.showMessageDialog(a, "El joven NO RECIVIRA INCENTIVO");
                a.in.listaNoRe.add(new Estudiante(Nombre.getText(),Apellido.getText(),Fecha_na.getText(), 
                            num_documento.getText(),bocc,Celular.getText(),Correo.getText(),genNota.getText(),k));
                Correo.setText("");
                genNota.setText("");
                Celular.setText("");
                Nombre.setText("");
                Apellido.setText("");
                Fecha_na.setText("");
                num_documento.setText("");
                generarNota.setEnabled(true);
                programa.setSelectedItem("Programas");//Establece el elemento seleccionado en el área de visualización del cuadro combinado al objeto en el argumento.
            }

        } else if (e.getSource() == programa) {
            if (programa.getSelectedIndex() == 1) {
                k = "Ingenieria de Sistemas";
            } else if (programa.getSelectedIndex() == 2) {
                k = "Medicina Veterinaria";
            } else if (programa.getSelectedIndex() == 3) {
                k = "Derecho";
            } else if (programa.getSelectedIndex() == 4) {
                k = "Quimica";
            } else if (programa.getSelectedIndex() == 5) {
                k = "Contaduria Publica";
            }

            if (programa.getSelectedIndex() != 0) {
                pro = true;
            } else {
                pro = false;
            }
        } else if (e.getSource() == Cancelar) {
            Correo.setText("");
            genNota.setText("");
            Celular.setText("");
            Nombre.setText("");
            Apellido.setText("");
            Fecha_na.setText("");
            num_documento.setText("");
            generarNota.setEnabled(true);
            programa.setSelectedItem("Programas");
        }

    }
}
