
package Validaciones;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Validar{
    Ventana a;

    Border error = BorderFactory.createLineBorder(Color.RED);
    Border bien = BorderFactory.createLineBorder(Color.BLACK);
    
    public Validar(Ventana a){
        this.a = a;
    }
       
    public void ValidarTipo(KeyEvent ke){
        char c = ke.getKeyChar();
        if (ke.getSource().equals(a.numdoc)) {
            if (a.numdoc.getText().length() >= 12 && c != KeyEvent.VK_BACK_SPACE) {
                JOptionPane.showMessageDialog(a, "SU NUMERO DE DOCUMENTO NO PUEDE EXCEDER LOS 12 NUMEROS. ");
            }
            if (!Character.isDigit(c)) {//solo numeros
                ke.consume();
                Toolkit.getDefaultToolkit().beep();//hace sonar el sonido de error
            }
        } else {
            if (!Character.isLetter(c) && c!=KeyEvent.VK_SPACE) {//solo letras
                ke.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
        /*
            Character.isAlphabetic(c);//devuelve true si el char pertenese al alfabeto
            Character.isLetter(c)//true si el char es una letra
            Character.isDigit(c)//true si el char es un dígito
            ke.consume();//no deja ingresar la letra
            KeyEvent.VK_SPACE //si oprime espacio
            KeyEvent.VK_BACK_SPACE // si oprime la tecla de eliminar (back space)
         */
    }
    
    public void Mayuscula(JTextField campo, KeyEvent ke) {
        if(ke.getSource() == campo){
            campo.setText(campo.getText().toUpperCase());
        }

    }

    public TitledBorder VacioJTextField(JTextField campo, TitledBorder borde){
        if (campo.getText().trim().isEmpty()) {
            a.novedades.setText("El CAMPO DEL "+borde.getTitle().substring(0, borde.getTitle().length()-1).toUpperCase()+'\n'+"ESTA VACIO. "+'\n'+a.novedades.getText());
            borde.setBorder(error);
        }else{
            borde.setBorder(bien);
        }
        return borde;
    }
    
    public TitledBorder ValidarJComboBox(JComboBox list, TitledBorder borde ){
        if(list.getSelectedIndex()==0){
            a.novedades.setText("NO SELECCIONO SU "+borde.getTitle().substring(0, borde.getTitle().length()-1).toUpperCase()+'\n'+a.novedades.getText());  
            borde.setBorder(error);
        }else{
            borde.setBorder(bien);
        }
        return borde;
    }
    
    public void ValidarButtonGroup(ButtonGroup group){
        if(group.getSelection()==null){
            a.ti.setBorderPainted(true);//pinta el borde
            a.cc.setBorderPainted(true);
            a.novedades.setText("NO SELECCIONO SU TIPO"+'\n'+"DE DOCUMENTO."+'\n'+a.novedades.getText());  
        }else{
            a.ti.setBorderPainted(false);
            a.cc.setBorderPainted(false);
        }
    }

    /*public void ValidarFecha(String fecha){
        String FechaIn[] = fecha.split("/");
        
        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String FechaHoy = sdf.format(Fecha);
        String Fechahoy[] = FechaHoy.split("/");
        
        //System.out.println("Fecha hoy: "+FechaHoy);
        //System.out.println("Fecha ingresada: "+fecha);
        
    }*/
    
}
