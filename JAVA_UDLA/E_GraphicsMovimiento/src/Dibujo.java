
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public class Dibujo extends Canvas {

    Rectangle2D limites;
    double x = 0;
    double y = 0;
    double dy = 1;
    double dx = 1;

    public Dibujo() {
        setSize(600, 350);
        setBackground(Color.cyan);
        limites = this.getBounds();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        //g.drawString("CARITA", 300, 175);
        g.fillOval(Movimiento_x(), Movimiento_y(), 25, 25);
    }

    public int Movimiento_x() {

        int TAMX = 25;

        x += dx;

        if (x < limites.getMinX()) {
            x = limites.getMinX();
            dx = -dx;
        }

        if (x + TAMX >= limites.getMaxX()) {
            x = limites.getMaxX() - TAMX;
            dx = -dx;
        }
        
        return (int) x;

    }

    public int Movimiento_y() {
        
        int TAMY = 25;
        y += dy;

        if (y < limites.getMinY()) {
            y = limites.getMinY();
            dy = -dy;
        }

        if (y + TAMY >= limites.getMaxY()) {
            y = limites.getMaxY() - TAMY;
            dy = -dy;
        }
        
        return (int) y;
    }

}
