
package repaso1;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Validar {
    
    JTextArea novedades;
    int i;

    Border error;
    Border bien;

    public Validar(JTextArea novedades) {
        this.novedades = novedades;

        error = BorderFactory.createLineBorder(Color.RED);
        bien = BorderFactory.createLineBorder(Color.BLACK);
        i = 0;
    }

    public int VacioJTextField(JTextField campo, TitledBorder borde) {
        if (campo.getText().trim().isEmpty()) {
            novedades.setText("El CAMPO DEL " + borde.getTitle().substring(0, borde.getTitle().length() - 1).toUpperCase() + '\n' + "ESTA VACIO. " + '\n' + novedades.getText());
            borde.setBorder(error);
            return 1;
        } else {
            borde.setBorder(bien);
            return 0;
        }
        //return borde;
    }
    
    public int VacioJFormattedTextField(JTextField campo, TitledBorder borde) {
        if (campo.getText().trim().equals("-  -")) {
            novedades.setText("El CAMPO DEL " + borde.getTitle().substring(0, borde.getTitle().length() - 1).toUpperCase() + '\n' + "ESTA VACIO. " + '\n' + novedades.getText());
            borde.setBorder(error);
            return 1;
        } else {
            borde.setBorder(bien);
            return 0;
        }
        //return borde;
    }
    
    public boolean ValidarJComboBox(JComboBox list, TitledBorder borde) {
        if (list.getSelectedIndex() == 0) {
            novedades.setText("NO SELECCIONO " + borde.getTitle().substring(0, borde.getTitle().length() - 1).toUpperCase() + '\n' + novedades.getText());
            borde.setBorder(error);
            return false;
        } else {
            borde.setBorder(bien);
            return true;
        }
        //return borde;
    }

    public int ValidarCheckBox(JCheckBox button) {
        if (!button.isSelected()) {
            i++;
            if (i == 6) {
                i = 0;
                button.setBorder(error);
                novedades.setText("NO SELECCIONO EL GENERO" + '\n' + novedades.getText());
            }
            return 1;
        } else {
            i = 0;
            button.setBorder(null);
            return 0;
        }
    }
    public void soloLetras(KeyEvent ke, JTextField campo){
        char t = ke.getKeyChar();
        if (t>47 && t<58){
            ke.consume();
        }
    }
    
    public void PrimerMayuscula(KeyEvent ke, JTextField campo) {
        String texto = campo.getText();
        if (texto.length()>0){
            char letra = texto.charAt(0);
            texto = Character.toUpperCase(letra)+texto.substring(1, texto.length());
            campo.setText(texto);
        }
    }
   
    
}
