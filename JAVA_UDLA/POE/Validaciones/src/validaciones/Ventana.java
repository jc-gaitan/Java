package validaciones;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    JLabel nombre;
    JLabel apellido;
    JLabel nombre2;
    JLabel apellido2;
    JLabel novedad;

    JTextField camName1, camName2;
    JTextField camApe1, camApe2;

    JButton validar;

    JPanel datos;
    
    String opciones[]={"Opciones","Ingenieria de sistemas","Quimica","Derecho","Biologia","Agrocologia"};
    JComboBox lista;
    
    JRadioButton ti,cc;
    JTextField numdoc;
    ButtonGroup group;
    
    JTextArea novedades;
    
    public Ventana() {
        setTitle("Ventana");

        Container conten = getContentPane();

        componentes();
        organizar();

        conten.add(datos);

        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void componentes() {
        datos = new JPanel();
        datos.setLayout(new GridBagLayout());

        nombre = new JLabel("Primer Nombre (*): ");
        nombre2 = new JLabel("Segundo Nombre: ");
        apellido = new JLabel("Primer Apellido (*): ");
        apellido2 = new JLabel("Segundo Apellido: ");
        novedad = new JLabel("Novedades: ");

        validar = new JButton("Validar");
        validar.addActionListener(this);

        camName1 = new JTextField(8);
        camName1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        camName1.addKeyListener(new EventoTeclado(this));
        camApe1 = new JTextField(8);
        camApe1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        camApe1.addKeyListener(new EventoTeclado(this));

        camName2 = new JTextField(8);
        camName2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        camName2.addKeyListener(new EventoTeclado(this));
        camApe2 = new JTextField(8);
        camApe2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        camApe2.addKeyListener(new EventoTeclado(this));
        
        lista = new JComboBox(opciones);
        
        ti = new JRadioButton("TI");
        cc = new JRadioButton("CC");
        group = new ButtonGroup();
        group.add(ti);
        group.add(cc);
        
        numdoc = new JTextField(6);
        numdoc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        numdoc.addKeyListener(new EventoTeclado(this));
        
        novedades = new JTextArea(5,5);
        novedades.setEditable(false);
        novedades.setBackground(null);
    }

    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 3;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 0.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 0.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.NONE;//aumenta la celda en la que se encuentra(filas o columnas)
        c.anchor = GridBagConstraints.WEST;//pone el componente a la izquierda
        c.insets = new Insets(4, 4, 0, 0);
        datos.add(nombre, c);

        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(camName1, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(nombre2, c);

        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(camName2, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(4, 4, 0, 0);
        datos.add(apellido, c);

        c.gridx = 3;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(camApe1, c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(4, 4, 0, 0);
        datos.add(apellido2, c);

        c.gridx = 3;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(camApe2, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(ti, c);
        
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(cc, c);
        
        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 3);
        c.fill = GridBagConstraints.BOTH;
        datos.add(numdoc, c);
        
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(lista, c);

        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(validar, c);

        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(novedad, c);
        
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 6;
        c.gridheight = 5;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(novedades, c);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(validar)){
            if(VALIDAR()){
                //lista.setSelectedIndex(0);//envia a el combo a las opciones
                //group.clearSelection();//desmarcar los radio button seleccionados
                novedades.setText("LLENO EL FORMULARIO CORRECTAMENTE.");
                repaint();
                pack();
            }
        }
    }

    public boolean VALIDAR() {
        boolean x = true;
        novedades.setText("");
        if (camName1.getText().trim().isEmpty()) {
            camName1.setBorder(BorderFactory.createLineBorder(Color.RED));
            novedades.setText("EL CAMPO DEL PRIMER NOMBRE"+'\n'+"ESTA VACIO. "+'\n'+novedades.getText());
            x = false;
        }else{
            camName1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
        
        if(camApe1.getText().trim().isEmpty()) {
            camApe1.setBorder(BorderFactory.createLineBorder(Color.RED));
            novedades.setText("EL CAMPO DEL PRIMER APELLIDO"+'\n'+"ESTA VACIO."+'\n'+novedades.getText()); 
            x = false;
        }else{
            camApe1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
        
        if(numdoc.getText().trim().isEmpty()) {
            numdoc.setBorder(BorderFactory.createLineBorder(Color.RED));
            novedades.setText("EL CAMPO DEL NUMERO DE"+'\n'+"DOCUMENTO ESTA VACIO."+'\n'+novedades.getText());
            x = false;
        }else{
            numdoc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
        
        if(lista.getSelectedIndex()==0){
            lista.setBorder(BorderFactory.createLineBorder(Color.RED));
            novedades.setText("NO SELECCIONO SU PROGRAMA."+'\n'+novedades.getText());  
            x = false;
        }else{
            lista.setBorder(null);
        }
        
        if(group.getSelection()==null){
            ti.setBorderPainted(true);//pinta el borde
            ti.setBorder(BorderFactory.createLineBorder(Color.RED));
            cc.setBorderPainted(true);
            cc.setBorder(BorderFactory.createLineBorder(Color.RED));
            novedades.setText("NO SELECCIONO SU TIPO"+'\n'+"DE DOCUMENTO."+'\n'+novedades.getText());
            x = false;
        }else{
            ti.setBorderPainted(false);
            cc.setBorderPainted(false);
        }
        
        repaint();
        pack(); 
        
        return x;
    }

}
