package parcial1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class BloqueLetras extends JPanel implements ActionListener {

    TitledBorder title;

    String[] opciones = {"Arial", "Calibri"};

    JComboBox combo;

    JRadioButton negrita;

    JRadioButton min;
    JRadioButton may;
    ButtonGroup group;

    JLabel text;

    Font font;
    int i = 0;
    boolean x = true;

    public BloqueLetras() {
        componentes();
        title = BorderFactory.createTitledBorder("Bloque de Letras. ");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        setLayout(new FlowLayout());
        setBorder(title);

        add(text);
        add(combo);
        add(negrita);
        add(min);
        add(may);
    }

    public void componentes() {
        font = new Font("Arial", Font.PLAIN, 16);
        text = new JLabel("hola que tal     ");
        text.setFont(font);
        combo = new JComboBox(opciones);
        combo.addActionListener(this);
        negrita = new JRadioButton("Negrita");
        negrita.setBackground(Color.WHITE);
        negrita.addActionListener(this);
        min = new JRadioButton("Min");
        min.setBackground(Color.WHITE);
        min.addActionListener(this);
        may = new JRadioButton("May");
        may.setBackground(Color.WHITE);
        may.addActionListener(this);
        group = new ButtonGroup();
        group.add(min);
        group.add(may);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == negrita && i == 0) {
            if (x) {
                font = new Font("Arial", Font.BOLD, 16);
                text.setFont(font);
                i++;
            } else {
                font = new Font("Calibri", Font.BOLD, 16);
                text.setFont(font);
                i++;
            }
        } else if (ae.getSource() == negrita && i == 1) {
            if (x) {
                font = new Font("Arial", Font.PLAIN, 16);
                text.setFont(font);
                i--;
            } else {
                font = new Font("Calibri", Font.PLAIN, 16);
                text.setFont(font);
                i--;
            }
        } else if (ae.getSource() == min) {
            String texto = text.getText();
            texto = texto.toLowerCase();
            text.setText(texto);
        }else if(ae.getSource() == may){
            String texto = text.getText();
            texto = texto.toUpperCase();
            text.setText(texto);
        }

        if (ae.getSource() == combo) {
            if (combo.getSelectedIndex() == 0) {
                font = new Font("Arial", Font.PLAIN, 16);
                text.setFont(font);
                x = true;
            } else if (combo.getSelectedIndex() == 1) {
                font = new Font("Calibri", Font.PLAIN, 16);
                text.setFont(font);
                x = false;
            }
        }

    }

}
