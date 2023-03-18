package botoncrearboton;

//@author Jc16
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener {

    JPanel botones;
    JButton boton;
    JButton buttons[];
    int con;
    Color color;

    public Ventana() {
        Componentes();

        setTitle("Crear Botones");
        setSize(682, 440);

        /*setLayout(new GridBagLayout());
        Organizar();*/
        setLayout(null);
        boton.setBounds(241, 10, 200, 40);
        botones.setBounds(30, 60, 607, 306);
        add(boton);
        add(botones);

        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //pack();
    }

    public void Componentes() {
        con = 0;
        boton = new JButton("Crear Boton");
        boton.addActionListener(this);

        buttons = new JButton[100];

        botones = new JPanel();
        botones.setSize(557, 268);
        botones.setLayout(new GridLayout(10, 10));
        botones.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (con < buttons.length) {
            color = new Color((int)Math.floor(Math.random()*(0-250)+250),(int)Math.floor(Math.random()*(0-250)+250),(int)Math.floor(Math.random()*(0-250)+250));
            buttons[con] = new JButton(String.valueOf(con + 1));
            buttons[con].setBackground(color);
            botones.add(buttons[con]);
            botones.repaint();
            repaint();
            revalidate();
            con++;
        }else{
            boton.setEnabled(false);
        }

    }

    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(boton, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 10;
        c.gridheight = 10;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(botones, c);
    }

}
