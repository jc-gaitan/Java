package Principal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cronometro extends JPanel {

    JPanel num;
    JLabel Hora;
    JComboBox segundos;
    String opciones[] = {"SEGUNDOS", "0.5", "1", "2", "4", "10"};
    JButton play, reiniciar;
    Font font;

    public Cronometro() {
        Componentes();
        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        organizar();
    }

    public void Componentes() {
        Hora = new JLabel("00:00:00");
        
        segundos = new JComboBox(opciones);
        
        play = new JButton("PLAY   ");
        play.setEnabled(false);
        
        reiniciar = new JButton("REINICIAR");
        reiniciar.setEnabled(false);
        font = new Font("Times New Roman", Font.BOLD, 50);
        Hora.setFont(font);
        Hora.setForeground(Color.DARK_GRAY);
        Hora.setAlignmentX(CENTER_ALIGNMENT);
        
        num = new JPanel();
        num.setLayout(new FlowLayout());
        num.add(Hora);          
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
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(segundos, c);

        c.gridx = 2;
        c.gridy = 7;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(play, c);

        c.gridx = 3;
        c.gridy = 7;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(reiniciar, c);
    }

}
