package Usuario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class usuario extends JFrame implements ActionListener, FocusListener {

    JPanel panel;
    JTextField nombre, fruta, bebida, genero;
    JLabel nombre1, fruta1, bebida1, genero1;
    JTextArea area;
    JButton limpiar, boton;

    String kk, n, f, b, g;
    int x = 0;

    ArrayList<asd> cli = new ArrayList<>();

    int banano = 0, fresa = 0, mora = 0, melon = 0, pina = 0, sandia = 0;
    int jugo, vino, cafe, chocolate;
    int h = 0, mu = 0;

    usuario() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("FRUTAS");
        setLocationRelativeTo(null);
        componentes();
    }

    public void componentes() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.red);
        this.getContentPane().add(panel);

        nombre1 = new JLabel("NOMBRE");
        nombre1.setBounds(20, 30, 50, 30);
        panel.add(nombre1);
        nombre = new JTextField();
        nombre.setBounds(100, 30, 130, 30);
        nombre.addFocusListener(this);
        panel.add(nombre);

        bebida1 = new JLabel("BEBIDA");
        bebida1.setBounds(20, 100, 50, 30);
        panel.add(bebida1);
        bebida = new JTextField();
        bebida.setBounds(100, 100, 130, 30);
        bebida.addFocusListener(this);
        panel.add(bebida);

        fruta1 = new JLabel("FRUTA");
        fruta1.setBounds(250, 30, 50, 30);
        panel.add(fruta1);
        fruta = new JTextField();
        fruta.setBounds(300, 30, 130, 30);
        fruta.addFocusListener(this);
        panel.add(fruta);

        genero1 = new JLabel("GENERO (F/M)");
        genero1.setBounds(250, 100, 50, 30);
        panel.add(genero1);
        genero = new JTextField();
        genero.setBounds(300, 100, 130, 30);
        genero.addFocusListener(this);
        panel.add(genero);

        area = new JTextArea();
        area.setBounds(20, 250, 450, 200);
        area.setEditable(false);
        panel.add(area);

        limpiar = new JButton("LIMPIAR");
        limpiar.setBounds(20, 200, 100, 20);
        limpiar.addActionListener(this);
        panel.add(limpiar);

        boton = new JButton("resultados");
        boton.setBounds(150, 200, 100, 20);
        boton.addActionListener(this);
        panel.add(boton);

    }

    public void lim() {
        nombre.setText("");
        fruta.setText("");
        bebida.setText("");
        genero.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(limpiar)) {
            lim();
        } else if (e.getSource().equals(boton)) {
            if (cli.size() > 0) {
                String text
                        = "Frutas: "
                        + "\nBanano: " + banano
                        + "\nFresa: " + fresa
                        + "\nMora: " + mora
                        + "\nMelon: " + melon
                        + "\nSandia: " + sandia
                        + "\nPiña: " + pina
                        + "\nBebida: "
                        + "\nJugo: " + jugo
                        + "\nCafe: " + cafe
                        + "\nVino: " + vino
                        + "\nChocolate: " + chocolate
                        + "\nGenero: "
                        + "\nMujeres: " + mu
                        + "\nHombres: " + h;
                JOptionPane.showMessageDialog(null, text);
            }

        }
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource().equals(nombre)) {
            if (nombre.getText().trim().length() > 0) {
                x++;
                n = nombre.getText();
            } else {
                System.out.println("vacio");
                x--;
            }
        } else if (e.getSource().equals(fruta)) {
            if (fruta.getText().trim().length() > 0) {
                x++;
                f = fruta.getText();
                if (f.equals("banano")) {
                    banano++;
                } else if (f.equals("fresa")) {
                    fresa++;
                } else if (f.equals("mora")) {
                    mora++;
                } else if (f.equals("melon")) {
                    melon++;
                } else if (f.equals("sandia")) {
                    sandia++;
                } else if (f.equals("piña")) {
                    pina++;
                }
            } else {
                System.out.println("vacio");
                x--;
            }
        } else if (e.getSource().equals(bebida)) {
            if (bebida.getText().trim().length() > 0) {
                x++;
                b = bebida.getText();
                //jugo, vino, cafe, chocolate
                if (b.equals("jugo")) {
                    jugo++;
                } else if (b.equals("vino")) {
                    vino++;
                } else if (b.equals("cafe")) {
                    cafe++;
                } else if (b.equals("chocolate")) {
                    chocolate++;
                }
            } else {
                System.out.println("vacio");
                x--;
            }
        } else if (e.getSource().equals(genero)) {
            if (genero.getText().trim().length() > 0) {
                x++;
                g = genero.getText();
                if (g.toLowerCase().equals("f")) {
                    mu++;
                } else if (g.toLowerCase().equals("m")) {
                    h++;
                }
            } else {
                System.out.println("vacio");
                x--;
            }
        }
        if (x == 4) {
            cli.add(new asd(n, f, b, g.charAt(0)));
            //System.out.println(cli.get(cli.size()-1));
            area.setText(area.getText() + cli.get(cli.size() - 1) + "\n");
            x = 0;
            lim();
        } else if (x < 0) {
            x = 0;
        }
    }

}
