package Principal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Codigo implements MouseMotionListener {

    PanelJuego panel;
    PanelJuego panelOp;
    JLabel opcion;
    boolean x;

    int oriX;
    int oriY;

    HiloIcono hilo;

    public Codigo(PanelJuego panel, JLabel opcion, PanelJuego panelOp, HiloIcono hilo) {
        this.panel = panel;
        this.opcion = opcion;
        this.panelOp = panelOp;
        this.hilo = hilo;
        x = true;
    }

    public void Res() {
        //empate
        /*ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/empate.png"));
        panel.esperar.setIcon(imagen);
        panelOp.esperar.setIcon(imagen);*/

        //uno ha ganado y el otro perdido
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/ganador.png"));
        panel.esperar.setIcon(imagen);
        imagen = new ImageIcon(getClass().getResource("/Imagenes/perdedor.png"));
        panelOp.esperar.setIcon(imagen);
        panel.mensaje.setText("Las tigeras corta papel");
        panelOp.mensaje.setText("Las tigeras corta papel");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        oriX = opcion.getX();
        oriY = opcion.getY();
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK && x) {
            opcion.setLocation(opcion.getX() + e.getX() - opcion.getWidth() / 2, opcion.getY() + e.getY() - opcion.getHeight() / 2);
            //System.out.println(opcion.getLocation());
            if (opcion.getX() >= 269 && opcion.getX() <= 310 && opcion.getY() >= 170 && opcion.getY() <= 194) {
                x = false;
                opcion.setLocation(286, 181);
                panel.ud.setIcon(opcion.getIcon());
                if (panel.op.getIcon() == null) {
                    panel.cardLayout.show(panel.contenido, "buscar");
                    hilo.start();
                } else {
                    panel.cardLayout.show(panel.contenido, "buscar");
                    //panelOp.hilo.x=false;
                    panelOp.hilo.stop();
                    // Res();
                }
                panelOp.op.setIcon(opcion.getIcon());
                panel.repaint();
                panelOp.repaint();
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
