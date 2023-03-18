package prograf1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class graficos1 extends JFrame {

    public graficos1() {

        setLayout(null);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("PRIMER GRAFICO PINTADO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(400, 250, 50, 50);
        g.fillOval(300, 100, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(500, 100, 100, 100);
        g.setColor(Color.red);
        g.drawString("CARITA", 600, 350);
        g.drawLine(700, 400, 200, 350);
        g.drawOval(150, 50, 600, 600);
    }

}
