package Ventana;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class canvas extends Canvas implements KeyListener, MouseMotionListener, MouseListener {

    int x = -1, y = -1, y1 = -1, x1 = -1;
    boolean nnw = false;

    public canvas() {
        Componentes();
        setBackground(Color.WHITE);
    }

    public void Componentes() {
        addKeyListener(this);
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2.3F));//el pincel
        g2.setColor(Color.black);

        if (x1 != -1 && -1 != x) {
            g2.drawLine(x, y, x1, y1);
        }

        if (nnw) {
            g2.setColor(Color.white);
            g2.fillRect(-10, -10, 800, 500);
            nnw = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_Z) {//cuando presiones ctrl + z
            nnw = true;
            paint(getGraphics());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        paint(this.getGraphics());
        x = x1;
        y = y1;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        paint(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = -1;
        x1 = -1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
