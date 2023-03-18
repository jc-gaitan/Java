package e_validaciones;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Panel_datos extends JPanel {

    JTextField nombrePro;
    JTextField rutaFoto;

    JButton seleccionar;
    JLabel diaVenci;
    JLabel formaPresen;

    JRadioButton litro, gramo, unidad;
    ButtonGroup group;

    Border borde;

    JFileChooser file;

    JLabel imagen;

    ImageIcon photo;
    ImageIcon ima;

    FileNameExtensionFilter filtro;

    JDateChooser Calendario;
    JLabel fech;

    JButton calcularFecha;

    Date FechaHoy;
    JLabel mostrarFechaHoy;
    SimpleDateFormat sdf;
    
    TitledBorder titleName;

    public Panel_datos() {
        Componentes();
        setBackground(null);
        setLayout(new GridBagLayout());
        organizar();
    }

    public void Componentes() {
        borde = BorderFactory.createLineBorder(Color.BLACK);

        nombrePro = new JTextField(8);
        nombrePro.setBackground(null);
        titleName = new TitledBorder(borde, "Nombre del producto: ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        nombrePro.setBorder(titleName);

        rutaFoto = new JTextField(8);
        rutaFoto.setBackground(null);
        rutaFoto.setBorder(new TitledBorder(borde, "Imagen: ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));
        rutaFoto.setEditable(false);
        seleccionar = new JButton("Seleccionar");
        
        diaVenci = new JLabel("Faltan 0 dias para que el producto se venza. ");

        formaPresen = new JLabel("Forma de presentacion: ");
        litro = new JRadioButton("Litro");
        litro.setBorder(BorderFactory.createLineBorder(Color.RED));
        gramo = new JRadioButton("Gramo");
        gramo.setBorder(BorderFactory.createLineBorder(Color.RED));
        unidad = new JRadioButton("Unidad");
        unidad.setBorder(BorderFactory.createLineBorder(Color.RED));
        group = new ButtonGroup();
        group.add(litro);
        group.add(gramo);
        group.add(unidad);

        imagen = new JLabel();
        photo = new ImageIcon(getClass().getResource("/Imagen/Imagen.png"));
        ima = new ImageIcon(photo.getImage().getScaledInstance(117, 110, Image.SCALE_DEFAULT));
        imagen.setIcon(ima);

        file = new JFileChooser();
        filtro = new FileNameExtensionFilter(
                "Imágenes JPG, PNG Y GIF", "jpg", "gif", "png");
        file.setFileFilter(filtro);

        fech = new JLabel("Seleccione la fecha de vencimiento: ");
        Calendario = new com.toedter.calendar.JDateChooser();
        Calendario.setForeground(Color.BLACK);//cambiar el color de la letra.
        Calendario.getDateEditor().setEnabled(false);//habilitar la edicion del jtextfield de la fecha 
        Date Fecha = new Date();
        Calendario.setDate(Fecha);
        Calendario.setMinSelectableDate(Fecha);//poner la fecha desde donde empieza el calendario
        FechaHoy = Calendario.getDate();//Fecha actual

        calcularFecha = new JButton("Fecha de vencimiento");
        
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        mostrarFechaHoy = new JLabel("                   "+sdf.format(FechaHoy));
    }

    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 1;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 8;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 0.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 0.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.anchor = GridBagConstraints.WEST;//pone el componente a la izquierda
        c.insets = new Insets(4, 4, 4, 4);
        add(nombrePro, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(rutaFoto, c);

        c.gridx = 7;
        c.gridy = 2;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(10, 0, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(seleccionar, c);
        //c.insets = new Insets(int arriba, int izquierda, int abajo, int derecha);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(fech, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 10;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(Calendario, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 10;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(calcularFecha, c);

        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(diaVenci, c);

        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(formaPresen, c);

        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(litro, c);

        c.gridx = 3;
        c.gridy = 8;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(gramo, c);

        c.gridx = 5;
        c.gridy = 8;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.anchor = GridBagConstraints.EAST;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(unidad, c);

        c.gridx = 9;
        c.gridy = 8;
        c.gridwidth = 4;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(mostrarFechaHoy, c);
        
        c.gridx = 9;
        c.gridy = 0;
        c.gridwidth = 6;
        c.gridheight = 5;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(imagen, c);

    }

}
