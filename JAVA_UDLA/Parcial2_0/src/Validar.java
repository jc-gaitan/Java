
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

    public void VacioJTextField(JTextField campo, TitledBorder borde) {
        if (campo.getText().trim().isEmpty()) {
            novedades.setText("El CAMPO DEL " + borde.getTitle().substring(0, borde.getTitle().length() - 1).toUpperCase() + '\n' + "ESTA VACIO. " + '\n' + novedades.getText());
            borde.setBorder(error);
        } else {
            borde.setBorder(bien);
        }
        //return borde;
    }
    
    public void VacioJFormattedTextField(JTextField campo, TitledBorder borde) {
        if (campo.getText().trim().equals("-  -")) {
            novedades.setText("El CAMPO DEL " + borde.getTitle().substring(0, borde.getTitle().length() - 1).toUpperCase() + '\n' + "ESTA VACIO. " + '\n' + novedades.getText());
            borde.setBorder(error);
        } else {
            borde.setBorder(bien);
        }
        //return borde;
    }

    public void ValidarJComboBox(JComboBox list, TitledBorder borde) {
        if (list.getSelectedIndex() == 0) {
            novedades.setText("NO SELECCIONO " + borde.getTitle().substring(0, borde.getTitle().length() - 1).toUpperCase() + '\n' + novedades.getText());
            borde.setBorder(error);
        } else {
            borde.setBorder(bien);
        }
        //return borde;
    }

    public void ValidarCheckBox(JCheckBox button, JPanel CheckBox) {
        if (!button.isSelected()) {
            i++;
            if (i == 5) {
                i = 0;
                CheckBox.setBorder(error);
                novedades.setText("NO SELECCIONO EL GENERO" + '\n' + novedades.getText());
            }
        } else {
            i = 0;
            CheckBox.setBorder(null);
        }
    }
    
    public void ValidarFecha(String fecha){
        if(!(Integer.parseInt(fecha) == 1)){
            novedades.setText("LA FECHA SOLO PUEDE SER EL" + '\n' + "PRIMER DIA DE CADA MES." + '\n' + novedades.getText());
        }
    }
    
    
    public void PrimerMayuscula(JTextField campo) {
        campo.setText(campo.getText().substring(0, 1).toUpperCase()+campo.getText().substring(1));
    }
    
    public void ValidarTipo(KeyEvent ke, Datos datos) {//VER SI SE PUEDE OPTIMIZAR
        char c = ke.getKeyChar();
        if (ke.getSource().equals(datos.getNombre()) || ke.getSource().equals(datos.getApellido())) {
            if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
                ke.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else if(ke.getSource().equals(datos.getCodigo()) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE){
            if(!Character.isLetter(c) && !Character.isDigit(c)){
                ke.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }else {
            if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
                ke.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

}
