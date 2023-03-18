
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame implements KeyListener, ActionListener {

    JTextField nombre1, nombre2;
    JTextField apellido1, apellido2;

    JRadioButton ti, cc;
    ButtonGroup group;
    JTextField campo;

    String opciones[] = {"Opcion", "Hombre", "Mujer"};
    JComboBox list;

    JButton validar, borrar;

    JTextArea novedades;

    TitledBorder titleName;
    TitledBorder titleApe;
    TitledBorder titleApe2;
    TitledBorder titleDocumento;
    TitledBorder titleList;
    Border borde, bordeRo;

    public Ventana() {
        Componentes();

        setTitle("Validar");

        this.getContentPane().setBackground(Color.WHITE);

        setLayout(new GridBagLayout());
        Organizar();

        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    public void Componentes() {
        bordeRo = BorderFactory.createLineBorder(Color.RED);
        
        borde = BorderFactory.createLineBorder(Color.BLACK);
        nombre1 = new JTextField(16);
        titleName = new TitledBorder(borde, "Primer Nombre:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        nombre1.setBorder(titleName);
        nombre1.addKeyListener(this);

        nombre2 = new JTextField(16);
        nombre2.setBorder(new TitledBorder(borde, "Segundo Nombre: ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));
        nombre2.addKeyListener(this);

        apellido1 = new JTextField(16);
        titleApe = new TitledBorder(borde, "Primer Apellido:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        apellido1.setBorder(titleApe);
        apellido1.addKeyListener(this);

        apellido2 = new JTextField(14);
        titleApe2 = new TitledBorder(borde, "Segundo Apellido:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        apellido2.setBorder(titleApe2);
        apellido2.addKeyListener(this);

        list = new JComboBox(opciones);

        ti = new JRadioButton("TI");
        ti.setBackground(Color.WHITE);
        cc = new JRadioButton("CC");
        cc.setBackground(Color.WHITE);
        group = new ButtonGroup();
        group.add(ti);
        group.add(cc);

        campo = new JTextField(14);
        titleDocumento = new TitledBorder(borde, "Numero Documento: ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        campo.setBorder(titleDocumento);
        campo.addKeyListener(this);

        validar = new JButton("Validar");
        validar.addActionListener(this);
        borrar = new JButton("Borrar");
        borrar.addActionListener(this);

        novedades = new JTextArea(16, 18);
    }

    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 16;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 0, 4);
        add(nombre1, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 16;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(nombre2, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 16;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(apellido1, c);

        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 16;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(apellido2, c);

        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 16;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(list, c);

        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(ti, c);

        c.gridx = 1;
        c.gridy = 10;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(cc, c);

        c.gridx = 2;
        c.gridy = 10;
        c.gridwidth = 14;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(campo, c);

        c.gridx = 0;
        c.gridy = 12;
        c.gridwidth = 16;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(validar, c);

        c.gridx = 0;
        c.gridy = 14;
        c.gridwidth = 16;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(borrar, c);

        c.gridx = 0;
        c.gridy = 16;
        c.gridwidth = 16;
        c.gridheight = 18;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(novedades, c);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (e.getSource() == campo) {
            if (Character.isLetter(c)) {//solo numeros
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (Character.isDigit(c)) {//solo letras
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == validar) {
            novedades.setText("");
            
            list.setBorder(ValidarJComboBox(list));
            nombre1.setBorder(ValidarTextField(nombre1));
            apellido1.setBorder(ValidarTextField(apellido1));
            apellido2.setBorder(ValidarTextField(apellido2));
            campo.setBorder(ValidarTextField(campo));
            
            
            JRadioButton(group);
            
            this.repaint();
            
            if(novedades.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
            }
            
        } else if (e.getSource() == borrar) {
            Borrar();
        }
    }
    
    public void JRadioButton(ButtonGroup group){
        if(group.getSelection() == null){
            novedades.setText("No selecciono el tipo de documento.\n" +novedades.getText() );
            //System.out.println("null");
        }else{
            //System.out.println("select");
        }
    }

    public Border ValidarJComboBox(JComboBox list){
        if(list.getSelectedIndex() == 0){
            novedades.setText("El campo del GENERO esta vacio.\n" +novedades.getText());
            return bordeRo;
        }else{
            return null;
        }
    }
    
    public TitledBorder ValidarTextField(JTextField campo) {
        TitledBorder a = (TitledBorder) campo.getBorder();
        if(campo.getText().trim().isEmpty()){
            a.setTitleColor(Color.RED);
            a.setBorder(bordeRo);
            
            novedades.setText("El campo del " + a.getTitle() +" esta vacio.\n" +novedades.getText() );
            return a;
        }else{
            a.setTitleColor(Color.BLACK);
            a.setBorder(borde);
            return a;
        }
    }
    
    public void Borrar() {
        nombre1.setText("");
        nombre2.setText("");
        apellido1.setText("");
        apellido2.setText("");
        campo.setText("");
        group.clearSelection();
        list.setSelectedIndex(0);
        novedades.setText("");
    }

}
