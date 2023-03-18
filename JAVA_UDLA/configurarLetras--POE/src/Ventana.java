
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Ventana extends JFrame implements ActionListener {

    JPanel opciones;

    JTextArea text;

    JComboBox color;
    JComboBox Tletra;

    JRadioButton negrita, cursiva;

    String[] optionC = {"Rojo", "Azul", "Verde"};
    String[] optionL = {"Dialog", "Arial", "Times New Roman"};

    public Ventana() {
        Componentes();

        setTitle("Proyecto");
        //setSize(600, 560);

        getContentPane().setBackground(Color.WHITE);
        setResizable(false);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(text);
        add(color);
        add(Tletra);
        add(negrita);
        add(cursiva);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public void Componentes() {
        text = new JTextArea();
        text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        text.setForeground(Color.RED);
        text.setFont(new Font("Dialog", Font.PLAIN, 30));
        //text.setContentType("text/html");

        color = new JComboBox(optionC);
        color.addActionListener(this);
        Tletra = new JComboBox(optionL);
        Tletra.addActionListener(this);

        negrita = new JRadioButton("Negrita");
        negrita.addActionListener(this);
        cursiva = new JRadioButton("cursiva");
        cursiva.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Tletra) {
            if (Tletra.getSelectedIndex() == 0) {
                text.setFont(new Font("Dialog", Font.PLAIN, 30));
            } else if (Tletra.getSelectedIndex() == 1) {
                text.setFont(new Font("Arial", Font.PLAIN, 30));
            } else if (Tletra.getSelectedIndex() == 2) {
                text.setFont(new Font("Times New Roman", Font.PLAIN, 30));
            }
            System.out.println(text.getFont());
        } else if (e.getSource() == color) {
            if (color.getSelectedIndex() == 0) {
                //text.setText("<font color=\"red\">mierda</font><br>");
                text.setForeground(Color.RED);
            } else if (color.getSelectedIndex() == 1) {
                text.setForeground(Color.BLUE);
            } else if (color.getSelectedIndex() == 2) {
                text.setForeground(Color.GREEN);
            }
        } else if (e.getSource() == cursiva) {
            VerificarSe();
        } else if (e.getSource() == negrita) {
            VerificarSe();
        }
    }

    public void VerificarSe(){
        if(cursiva.isSelected() && negrita.isSelected()){
            text.setFont(new Font(text.getFont().getFamily(), Font.BOLD|Font.ITALIC, text.getFont().getSize()));
        }else if (cursiva.isSelected() && !negrita.isSelected()) {
            text.setFont(new Font(text.getFont().getFamily(), Font.ITALIC, text.getFont().getSize()));
        }else if (negrita.isSelected() && !cursiva.isSelected()) {
            text.setFont(new Font(text.getFont().getFamily(), Font.BOLD, text.getFont().getSize()));
        }else{
            text.setFont(new Font(text.getFont().getFamily(), Font.PLAIN, text.getFont().getSize()));
        }
    }

}
