package e_validaciones;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Validar {

    Ventana a;

    Border error = BorderFactory.createLineBorder(Color.RED);
    Border bien = BorderFactory.createLineBorder(Color.BLACK);

    public Validar(Ventana a) {
        this.a = a;
    }

    public void ValidarTipo(KeyEvent ke) {
        char c = ke.getKeyChar();
        if (ke.getSource().equals(a.datos.nombrePro)) {
            if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {//solo letras
                ke.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (!Character.isDigit(c)) {//solo numeros
                ke.consume();
                Toolkit.getDefaultToolkit().beep();//hace sonar el sonido de error
            }
        }
        /*
            Character.isAlphabetic(c);//devuelve true si el char pertenese al alfabeto
            Character.isLetter(c)//true si el char es una letra
            Character.isDigit(c)//true si el char es un dígito
            ke.consume();//no deja ingresar la letra
            KeyEvent.VK_SPACE //si oprime espacio
            KeyEvent.VK_BACK_SPACE // si oprime la tecla de eliminar (back space)
            !Character.isDigit(c) && c != KeyEvent.VK_PERIOD//permite numeros y punto
         */
    }

    public void PrimerMayuscula(JTextField campo, KeyEvent ke) {
        campo.setText(campo.getText().substring(0, 1).toUpperCase()+campo.getText().substring(1));
    }

    public TitledBorder VacioJTextField(JTextField campo, TitledBorder borde) {
        if (campo.getText().trim().isEmpty()) {
            a.novedades.setText("El CAMPO DEL " + borde.getTitle().substring(0, borde.getTitle().length() - 1).toUpperCase() + '\n' + "ESTA VACIO. " + '\n' + a.novedades.getText());
            borde.setBorder(error);
        } else {
            borde.setBorder(bien);
        }
        return borde;
    }

    public void ValidarButtonGroup(ButtonGroup group) {
        if (group.getSelection() == null) {
            a.datos.litro.setBorderPainted(true);//pinta el borde
            a.datos.gramo.setBorderPainted(true);
            a.datos.unidad.setBorderPainted(true);
            a.novedades.setText("NO SELECCIONO LA FORMA" + '\n' + "DE PRESENTACION." + '\n' + a.novedades.getText());
        } else {
            a.datos.litro.setBorderPainted(false);
            a.datos.gramo.setBorderPainted(false);
            a.datos.unidad.setBorderPainted(false);
        }
    }
    
    public Border ValidarSeleccionImagen(int returnVal){
        if (returnVal == JFileChooser.APPROVE_OPTION) {
                a.novedades.setText("NO SELECCIONO LA IMAGEN"+'\n'+"DEL PRODUCTO"+ '\n' + a.novedades.getText());
                return null;
            } else {
                a.datos.imagen.setIcon(a.datos.ima);
                a.datos.rutaFoto.setText("");
                return error;
            }
    }

}
