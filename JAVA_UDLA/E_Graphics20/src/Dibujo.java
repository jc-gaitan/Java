
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Dibujo extends Canvas {

    boolean x;

    public Dibujo() {
        this.setSize(400, 350);
        x = false;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (x) {
            g.drawRect(200, 125, 25, 25);
            g.fillOval(150, 50, 25, 25);
            g.setColor(Color.yellow);
            g.fillOval(250, 50, 50, 50);
            g.setColor(Color.red);
            g.drawString("CARITA", 300, 175);
            g.drawLine(350, 200, 100, 175);
            g.drawOval(75, 25, 300, 300);
        }
        
    }

}
