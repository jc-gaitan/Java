
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener {

    JPanel botones;
    Dibujo dibujo;
    JButton Iniciar;
    JButton Detener;

    public Ventana() {
        Componentes();

        setLayout(new GridBagLayout());
        Organizar();

        pack();
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void Componentes() {
        Iniciar = new JButton("Iniciar");
        Iniciar.addActionListener(this);
        Detener = new JButton("Detener");
        Detener.addActionListener(this);

        botones = new JPanel();
        botones.setBackground(Color.red);
        botones.add(Iniciar);
        botones.add(Detener);

        dibujo = new Dibujo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Iniciar) {
            dibujo.repaint();
        } else if (e.getSource() == Detener) {

        }
    }

    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(dibujo, c);

        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 10;
        c.gridheight = 4;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(botones, c);

    }

}
