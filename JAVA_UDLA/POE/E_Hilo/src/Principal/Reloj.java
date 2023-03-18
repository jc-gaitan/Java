
package Principal;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reloj extends JPanel{
    
    JLabel hora;
    JPanel num;
    JButton PausarHora, Actualizar;
    Font font;
    boolean x;

    int w = 0;
    
    public Reloj(){
        Componentes();
        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        organizar();
    }
    
    public void Componentes(){
        hora = new JLabel("00:00:00");
        
        HoraActual();
        
        PausarHora = new JButton("Pausar Hora");
        
        Actualizar = new JButton("Actualizar Hora");
        Actualizar.setEnabled(false);
        
        font = new Font("Times New Roman", Font.BOLD, 50);
        hora.setFont(font);
        hora.setForeground(Color.DARK_GRAY);//cambiar el color de la letra
        hora.setAlignmentX(CENTER_ALIGNMENT);//centra el componente
        
        num = new JPanel();
        num.setLayout(new FlowLayout());
        num.add(hora);  
    }
    
    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 7;
        c.gridheight = 5;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(4, 4, 4, 4);
        add(num, c);

        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(PausarHora, c);

        c.gridx = 1;
        c.gridy = 7;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(Actualizar, c);
    }
    
    public void HoraActual(){
        Date actual = new Date();

        if(actual.getHours()<= 9){
            hora.setText("0"+String.valueOf(actual.getHours())+":");
        }else{
            hora.setText(String.valueOf(actual.getHours())+":");
        }
        if(actual.getMinutes() <= 9){
            hora.setText(hora.getText()+"0"+String.valueOf(actual.getMinutes())+":");
        }else{
            hora.setText(hora.getText()+String.valueOf(actual.getMinutes())+":");
        }
        if(actual.getSeconds() <= 9){
            hora.setText(hora.getText()+"0"+String.valueOf(actual.getSeconds()));
        }else{
            hora.setText(hora.getText()+String.valueOf(actual.getSeconds()));     
        }
    }
}
