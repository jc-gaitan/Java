package Validaciones;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame implements ActionListener, KeyListener {
    JDateChooser Calendario;
    JTextField camName1, camName2;
    JTextField camApe1, camApe2;
    JTextField FechaNa;

    JButton Botonvalidar;

    JPanel datos;
    
    String opciones[]={"Opciones","Ingenieria de sistemas","Quimica","Derecho","Biologia","Agrocologia"};
    JComboBox lista;
    
    JRadioButton ti,cc;
    JTextField numdoc;
    ButtonGroup group;
    
    JTextArea novedades;
    
    Validar validar;
    
    TitledBorder titleName;
    TitledBorder titleApe;
    TitledBorder titleDoc;
    TitledBorder titleList;
    TitledBorder titleFecha;
    Border borde;
    
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
        borde = BorderFactory.createLineBorder(Color.BLACK);
                
        datos = new JPanel();
        datos.setLayout(new GridBagLayout());

        camName1 = new JTextField(8);
        camName1.setBackground(null);
        titleName = new TitledBorder(borde,"Primer Nombre:",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        camName1.setBorder(titleName);
        camName1.addKeyListener(this);
        
        titleApe = new TitledBorder(borde,"Primer Apellido:",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        camApe1 = new JTextField(8);
        camApe1.setBackground(null);
        camApe1.setBorder(titleApe);
        camApe1.addKeyListener(this);

        camName2 = new JTextField(8);
        camName2.setBackground(null);
        camName2.setBorder(new TitledBorder(borde,"Segundo Nombre: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP));
        camName2.addKeyListener(this);
        
        camApe2 = new JTextField(8);
        camApe2.setBackground(null);
        camApe2.setBorder(new TitledBorder(borde,"Segundo Apellido: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP));
        camApe2.addKeyListener(this);
        
        titleDoc = new TitledBorder(borde,"Numero de Documento:",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        numdoc = new JTextField(6);
        numdoc.setBorder(titleDoc);
        numdoc.setBackground(null);
        numdoc.addKeyListener(this);
        
        titleList = new TitledBorder(borde,"Facultad:",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        lista = new JComboBox(opciones);
        lista.setBorder(titleList);
        
        ti = new JRadioButton("TI");
        ti.setBorder(BorderFactory.createLineBorder(Color.RED));
        cc = new JRadioButton("CC");
        cc.setBorder(BorderFactory.createLineBorder(Color.RED));
        group = new ButtonGroup();
        group.add(ti);
        group.add(cc);

        novedades = new JTextArea(5,5);
        novedades.setBorder(new TitledBorder(BorderFactory.createEmptyBorder(),"Novedades: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP));
        novedades.setEditable(false);
        novedades.setBackground(null);
        
        Botonvalidar = new JButton("Validar");
        Botonvalidar.addActionListener(this);
        
        FechaNa = new JTextField(8);
        FechaNa.setEditable(false);
        titleFecha = new TitledBorder(borde,"Fecha de nacimiento: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        FechaNa.setBorder(titleFecha);
        
        Calendario = new com.toedter.calendar.JDateChooser();
        //Calendario.setFont(new java.awt.Font("Arial", Font.BOLD, 16));//cambiar el tipo y tamaño de letra
        Calendario.setForeground(Color.BLACK);//cambiar el color de la letra.
        Calendario.getDateEditor().setEnabled(false);//habilitar la edicion del jtextfield de la fecha
        Date FechaIngreso = new Date();//obtiene la fecha actual
        
        /*
        //Para poner que la fecha maxima sea solo para mayores de edad
        Calendar FechaMayorEdad = Calendar.getInstance ();
        FechaMayorEdad.set (Calendar.YEAR, FechaIngreso.getYear()+1890);  
        FechaMayorEdad.set (Calendar.MONTH, FechaIngreso.getMonth());  
        FechaMayorEdad.set (Calendar.DATE, FechaIngreso.getDay()+15);        
        Calendario.setDate(FechaMayorEdad.getTime());
        Calendario.setMaxSelectableDate(FechaMayorEdad.getTime());*/
        
        Calendario.setDate(FechaIngreso);
        Calendario.setMaxSelectableDate(FechaIngreso);//poner hasta que fecha llega el calendario
        Calendar min = Calendar.getInstance ();//crear un fecha
        min.set (Calendar.YEAR, 1918 );  
        min.set (Calendar.MONTH, 1 );  
        min.set (Calendar.DATE, 1 );    
        Calendario.setMinSelectableDate(min.getTime());//poner la fecha desde donde empieza el calendario
        Calendario.setBorder(titleFecha);
        
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String Fecha = sdf.format(Calendario.getDate());*/
        
        validar = new Validar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(Botonvalidar)){
            novedades.setText("");
            camName1.setBorder(validar.VacioJTextField(camName1, titleName));
            camApe1.setBorder(validar.VacioJTextField(camApe1, titleApe));
            numdoc.setBorder(validar.VacioJTextField(numdoc, titleDoc));
            lista.setBorder(validar.ValidarJComboBox(lista, titleList));
            validar.ValidarButtonGroup(group);
            if(novedades.getText().equals("")){
                JOptionPane.showMessageDialog(this, "HA LLENADO CORRECTAMENTE EL FORMULARIO. ");
                camName1.setText("");
                camApe1.setText("");
                camName2.setText("");
                camApe2.setText("");
                numdoc.setText("");
                group.clearSelection();//desmarcar los radio button seleccionados
                lista.setSelectedIndex(0);//envia a el combo a las opciones
            }
//            repaint();
            pack();
        }
    }

    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(camName1, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(camName2, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(camApe1, c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        datos.add(camApe2, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.NONE;
        datos.add(ti, c);
        
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.NONE;
        datos.add(cc, c);
        
        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 3);
        c.fill = GridBagConstraints.HORIZONTAL;
        datos.add(numdoc, c);
        
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        datos.add(lista, c);

        /*c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(FechaNa, c);*/
        
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(Calendario, c);
        
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        datos.add(Botonvalidar, c);
        
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 8;
        c.gridheight = 8;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.insets = new Insets(4, 4, 4, 4);
        c.fill = GridBagConstraints.BOTH;
        datos.add(novedades, c);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        validar.ValidarTipo(ke);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        validar.Mayuscula(camName1,ke);
        validar.Mayuscula(camName2,ke);
        validar.Mayuscula(camApe1,ke);
        validar.Mayuscula(camApe2,ke);
    }

    /*
    keyPressed(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla.
    keyReleased(KeyEvent e): Se ejecuta cuando el usuario libera una tecla
    keyTyped(KeyEvent e): Se ejecuta cuando el usuario presiona una 
    tecla, pero solo cuando la tecla corresponde a caractéres, teclas especiales como F1, F2 entre otras no son identificadas.
    */

}
