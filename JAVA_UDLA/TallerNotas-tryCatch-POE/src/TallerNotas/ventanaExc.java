package TallerNotas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class ventanaExc extends JFrame implements ActionListener, KeyListener {

    JPanel datos, botones, bloques;
    JButton buscar, reiniciar, calcular;
    JTextArea aprobados, reprobados;
    JTextField identificacion, nombre, apellido, nota1, nota2, nota3;
    JComboBox tipo;
    JScrollPane scroll;
//    TitledBorder iden, nom, apelli, n1, n2, n3;

    Border error = BorderFactory.createLineBorder(Color.RED);
    Border bien = BorderFactory.createLineBorder(Color.BLACK);
    int x = 0;
    String text;

    ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

    ventanaExc() {
        setTitle("Excepciones");
        Componentes();
        setSize(500, 450);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setResizable(false);
        setVisible(true);
        ComponentesAc(false);
    }

    public void Componentes() {

        datos = new JPanel(new GridLayout(7, 1));

        String[] opc = {"Tipo de documento", "CC", "TI"};
        tipo = new JComboBox(opc);
        tipo.addActionListener(this);

//        iden = BorderFactory.createTitledBorder("No. de identificación");
        identificacion = new JTextField();
        identificacion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "No. de identificación"));

//        nom = BorderFactory.createTitledBorder("Nombre");
        nombre = new JTextField();
        nombre.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Nombre"));

//        apelli = BorderFactory.createTitledBorder("Apellido");
        apellido = new JTextField();
        apellido.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Apellido"));

//        n1 = BorderFactory.createTitledBorder("Primera nota");
        nota1 = new JTextField();
        nota1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Primera nota"));

//        n2 = BorderFactory.createTitledBorder("Segunda nota");
        nota2 = new JTextField();
        nota2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Segunda nota"));

//        n3 = BorderFactory.createTitledBorder("Tercera nota");
        nota3 = new JTextField();
        nota3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Tercera nota"));

        datos.add(tipo);
        datos.add(identificacion);
        datos.add(nombre);
        datos.add(apellido);
        datos.add(nota1);
        datos.add(nota2);
        datos.add(nota3);

        add(datos, BorderLayout.NORTH);

        bloques = new JPanel(new GridLayout(1, 3));

        aprobados = new JTextArea(2, 1);
        aprobados.setEditable(false);
        aprobados.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Aprobados"));
        scroll = new JScrollPane(aprobados);
        scroll.setBounds(20, 20, 150, 260);
        //frutas.setLineWrap(true);
        bloques.add(scroll);

        reprobados = new JTextArea(2, 1);
        reprobados.setEditable(false);
        reprobados.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Reprobados"));
        scroll = new JScrollPane(reprobados);
        scroll.setBounds(20, 20, 150, 260);
        //frutas.setLineWrap(true);
        bloques.add(scroll);

        add(bloques, BorderLayout.CENTER);

        botones = new JPanel(new GridLayout(1, 3));

        buscar = new JButton("Buscar");

        reiniciar = new JButton("Reiniciar");
        calcular = new JButton("CALCULAR");
        botones.add(buscar);
        botones.add(reiniciar);
        botones.add(calcular);
        calcular.addActionListener(this);
        reiniciar.addActionListener(this);
        buscar.addActionListener(this);
        add(botones, BorderLayout.SOUTH);
//        pack();

        //identificacion.addKeyListener(this);
        nombre.addKeyListener(this);
        apellido.addKeyListener(this);
        /*nota1.addKeyListener(this);
        nota2.addKeyListener(this);
        nota3.addKeyListener(this);*/
    }

    public void ComponentesAc(boolean x) {
        identificacion.setEnabled(x);
        nombre.setEnabled(x);
        apellido.setEnabled(x);
        nota1.setEnabled(x);
        nota2.setEnabled(x);
        nota3.setEnabled(x);
        buscar.setEnabled(x);
        reiniciar.setEnabled(x);
        calcular.setEnabled(x);
    }

    public void vaciar() {
        tipo.setSelectedIndex(0);
        identificacion.setText("");
        nombre.setText("");
        apellido.setText("");
        nota1.setText("");
        nota2.setText("");
        nota3.setText("");
    }

    
    public void validarTipo(KeyEvent ke) {
        char c = ke.getKeyChar();
        if (ke.getSource().equals(identificacion)) {
            if (identificacion.getText().length() >= 12 && c != KeyEvent.VK_BACK_SPACE) {
                JOptionPane.showMessageDialog(this, "SU NUMERO DE DOCUMENTO NO PUEDE EXCEDER LOS 12 NUMEROS. ");
            }
            if (!Character.isDigit(c)) {//solo numeros
                ke.consume();
                Toolkit.getDefaultToolkit().beep();//hace sonar el sonido de error
            }
        } else if (ke.getSource().equals(nota1) || ke.getSource().equals(nota2) || ke.getSource().equals(nota3)) {
            if (!Character.isDigit(c) && c != '.') {//solo numeros
                ke.consume();
                Toolkit.getDefaultToolkit().beep();//hace sonar el sonido de error
            }

            System.out.println(x);
        } else {
            if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {//solo letras
                ke.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    public void Mayuscula(JTextField campo, KeyEvent ke) {
        if (ke.getSource() == campo) {
            campo.setText(campo.getText().toUpperCase());
        }
    }
    public TitledBorder validarVacio(JTextField campo) {
        TitledBorder titledBorder = (TitledBorder) campo.getBorder();
        if (campo.getText().trim().isEmpty()) {
            titledBorder.setBorder(error);
            if (x < 0) {
                x = 0;
            } else {
                x--;
            }
        } else {
            titledBorder.setBorder(bien);
            x++;
        }
        return titledBorder;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tipo) {
            if (tipo.getSelectedIndex() == 0) {
                vaciar();
                ComponentesAc(false);
            } else {
                ComponentesAc(true);
            }
        } else if (e.getSource() == calcular) {
            identificacion.setBorder(validarVacio(identificacion));
            nombre.setBorder(validarVacio(nombre));
            apellido.setBorder(validarVacio(apellido));
            nota1.setBorder(validarVacio(nota1));
            nota2.setBorder(validarVacio(nota2));
            nota3.setBorder(validarVacio(nota3));

            System.out.println(x);
            if (x == 6) {
                try {
                    long id = Long.parseLong(identificacion.getText());
                    
                    double n1 = Double.parseDouble(nota1.getText());
                    double n2 = Double.parseDouble(nota2.getText());
                    double n3 = Double.parseDouble(nota3.getText());
                    double promedio = (n1 + n2 + n3) / 3;
                    System.out.println(promedio);
                    if (promedio >= 0 && promedio < 2.95) {
                        reprobados.setText(reprobados.getText() + String.valueOf("REPROBADO") + '\n');
                    } else if (promedio >= 2.95 && promedio <= 5.0) {
                        aprobados.setText(aprobados.getText() + String.valueOf("APROBO") + '\n');
                    }
                    estudiantes.add(new Estudiante(id, nombre.getText(), apellido.getText(), promedio));
                    vaciar();
                } catch (NumberFormatException err) {
                    text = "Los campo Nota e identificacion, no puede llevar letras ni simbolos";
                    JOptionPane.showMessageDialog(this, text);
                }
            } else {
                text = "Los campos no pueden estar vacios";
                JOptionPane.showMessageDialog(this, text);
            }
            
            x = 0;
            repaint();
        } else if (e.getSource() == buscar) {
            identificacion.setBorder(validarVacio(identificacion));
            if (estudiantes.size() > 0) {
                JOptionPane.showMessageDialog(this, estudiantes.get(0));
            } else {
                JOptionPane.showMessageDialog(this, "No hay estudiantes registrados");
            }
            repaint();
        } else if (e.getSource() == reiniciar) {
            vaciar();
            reprobados.setText("");
            aprobados.setText("");
            estudiantes.clear();
        }
    }

    
    @Override
    public void keyTyped(KeyEvent e) {
        validarTipo(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Mayuscula(nombre, e);
        Mayuscula(apellido, e);
    }

 /*
    keyPressed(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla.
    keyReleased(KeyEvent e): Se ejecuta cuando el usuario libera una tecla
    keyTyped(KeyEvent e): Se ejecuta cuando el usuario presiona una 
    tecla, pero solo cuando la tecla corresponde a caractéres, teclas especiales como F1, F2 entre otras no son identificadas.
     */
}
