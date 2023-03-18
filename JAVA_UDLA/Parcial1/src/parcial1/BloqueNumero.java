package parcial1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class BloqueNumero extends JPanel implements KeyListener {

    TitledBorder title;

    JTextField num;
    JTextArea campoPar;
    JTextArea campoMulti3;
    JTextArea campomulti5;

    JLabel par, mul3, mul5;

    public BloqueNumero() {
        Componentes();
        title = BorderFactory.createTitledBorder("Bloque de Numeros. ");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        setBorder(title);
        organizar();
    }

    public void Componentes() {
        num = new JTextField(10);
        num.addKeyListener(this);
        campoPar = new JTextArea(10, 5);
        campoPar.setEditable(false);
        campoMulti3 = new JTextArea(10, 5);
        campoMulti3.setEditable(false);
        campomulti5 = new JTextArea(10, 5);
        campomulti5.setEditable(false);
        par = new JLabel("Numero pares: ");
        mul3 = new JLabel("Numero multiplos de 3: ");
        mul5 = new JLabel("Numero multiplos de 5: ");
    }

    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 1;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 0.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 0.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.NONE;//aumenta la celda en la que se encuentra(filas o columnas)
        c.anchor = GridBagConstraints.WEST;//pone el componente a la izquierda
        c.insets = new Insets(4, 0, 0, 0);
        add(num, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(par, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(campoPar, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(mul3, c);

        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(campoMulti3, c);

        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(mul5, c);

        c.gridx = 2;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(campomulti5, c);
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        campoPar.setText("");
        campoMulti3.setText("");
        campomulti5.setText("");
        String a = num.getText();
        int w = Integer.parseInt(a);
        if (w % 2 == 0) {
            campoPar.setText(a);
        } 
        if (w % 3 == 0) {
            campoMulti3.setText(a);
        } 
        if(w % 5 == 0){
            campomulti5.setText(a);
        }
    }

}
