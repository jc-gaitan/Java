
package Validaciones;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Validar {
    Ventana a;
    
    Border error = BorderFactory.createLineBorder(Color.RED);
    Border bien = BorderFactory.createLineBorder(Color.BLACK);
    
    public Validar(Ventana a){
        this.a = a;
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
            a.ti.setBorder(BorderFactory.createLineBorder(Color.RED));
            a.cc.setBorderPainted(true);
            a.cc.setBorder(BorderFactory.createLineBorder(Color.RED));
            a.novedades.setText("NO SELECCIONO SU TIPO"+'\n'+"DE DOCUMENTO."+'\n'+a.novedades.getText());  
        }else{
            a.ti.setBorderPainted(false);
            a.cc.setBorderPainted(false);
        }
    }


}
