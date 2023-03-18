package e_validaciones;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Ventana extends JFrame implements ActionListener, KeyListener {

    JTabbedPane principal;
    Border borde;

    Panel_datos datos;
    Panel_Precio precio;

    Validar validar;

    JTextArea novedades;
    
    Foco foco;

    public Ventana() {
        setTitle("Ventana");

        Componentes();
        add(principal);

        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes() {
        datos = new Panel_datos();
        precio = new Panel_Precio();
        
        novedades = new JTextArea(5, 5);
        novedades.setBorder(datos.borde);
        novedades.setEditable(false);
        novedades.setBackground(null);

        principal = new JTabbedPane();
        principal.setBackground(null);
        principal.add("Datos", datos);
        principal.add("Precio", precio);
        principal.setEnabledAt(1, true);//para activar o desactivar pestañas

        validar = new Validar(this);
        datos.nombrePro.addKeyListener(this);
        datos.seleccionar.addActionListener(this);
        datos.calcularFecha.addActionListener(this);

        foco = new Foco(this);
        
        precio.Guardar.addActionListener(this);
        precio.esta1.addKeyListener(this);
        precio.esta1.addFocusListener(foco);
        precio.esta2.addKeyListener(this);
        precio.esta2.addFocusListener(foco);
        precio.esta3.addKeyListener(this);
        precio.esta3.addFocusListener(foco);
        precio.gananciae1.addKeyListener(this);
        precio.gananciae1.addFocusListener(foco);
        precio.gananciae2.addKeyListener(this);
        precio.gananciae2.addFocusListener(foco);
        precio.gananciae3.addKeyListener(this);
        precio.gananciae3.addFocusListener(foco);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        validar.ValidarTipo(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == datos.nombrePro) {
            validar.PrimerMayuscula(datos.nombrePro, e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == datos.seleccionar) {
            int returnVal = datos.file.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File archivo = datos.file.getSelectedFile();
                datos.rutaFoto.setText(String.valueOf(archivo));
                Image foto = getToolkit().getImage(datos.rutaFoto.getText());
                foto = foto.getScaledInstance(117, 110, Image.SCALE_DEFAULT);
                datos.imagen.setIcon(new ImageIcon(foto));
            }
            datos.imagen.setBorder(validar.ValidarSeleccionImagen(returnVal));
        } else if (e.getSource() == datos.calcularFecha) {
            try {
                String text = datos.sdf.format(datos.FechaHoy);
                Date fechaInicial = datos.sdf.parse(text);
                Date fechaFinal = datos.Calendario.getDate();

                int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);// un dia tiene 86400000 milisegundos
                datos.diaVenci.setText("Faltan " + dias + " dias para que el producto se venza. ");
            } catch (Exception ex) {
            }
        } else if (e.getSource() == precio.Guardar) {
            novedades.setText("");
            datos.nombrePro.setBorder(validar.VacioJTextField(datos.nombrePro, datos.titleName));
            validar.ValidarButtonGroup(datos.group);
            precio.esta1.setBorder(validar.VacioJTextField(precio.esta1, precio.esta10));
            precio.esta2.setBorder(validar.VacioJTextField(precio.esta2, precio.esta20));
            precio.esta3.setBorder(validar.VacioJTextField(precio.esta3, precio.esta30));
            precio.gananciae1.setBorder(validar.VacioJTextField(precio.gananciae1, precio.gananciae10));
            precio.gananciae2.setBorder(validar.VacioJTextField(precio.gananciae2, precio.gananciae20));
            precio.gananciae3.setBorder(validar.VacioJTextField(precio.gananciae3, precio.gananciae30));
            repaint();

            if (novedades.getText().equals("") && datos.imagen.getBorder()==null) {
                JOptionPane.showMessageDialog(this, "HA LLENADO CORRECTAMENTE EL FORMULARIO. ");

            } else {
                datos.imagen.setBorder(validar.ValidarSeleccionImagen(1));
                VentanaNovedades ven = new VentanaNovedades(this, true, novedades);
                ven.setVisible(true);
            }
        }

    }

}
