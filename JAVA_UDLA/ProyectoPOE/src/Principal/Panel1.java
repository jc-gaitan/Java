package Principal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel1 extends JPanel implements MouseMotionListener {

    JPanel preguntas;

    JLabel op1;
    JLabel op2;
    JLabel op3;
    JLabel op4;
    JLabel op5;

    JLabel cuadrado, triangulo, circulo, rombo, estrella;
    JLabel res1, res2, res3, res4, res5, res6, res7, res8;

    JLabel pregun[];
    
    int xcua, ycua, xtri, ytri, xrom, yrom, xcir, ycir, xest, yest;

    boolean x;

    public Panel1() {
        setBackground(Color.WHITE);
        Componentes();
        setSize(500, 500);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setLayout(new GridBagLayout());
        Organizar();

    }

    public void Componentes() {
        pregun = new JLabel[8];
        Preguntas();

        Respuestas();
        preguntas = new JPanel();
        preguntas.setBackground(Color.WHITE);
        preguntas.setLayout(new GridBagLayout());
        OrganizarPre();
        x = true;
    }

    public boolean Icon(int x, int y, int p) {
        boolean m = true;
        ImageIcon imagen = null;
        
        switch(p){
            case 1:
                imagen = new ImageIcon(getClass().getResource("cuadrado.png"));
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(44, 45, Image.SCALE_DEFAULT));
                break;
            case 2:
                imagen = new ImageIcon(getClass().getResource("triangulo.png"));
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(50, 43, Image.SCALE_DEFAULT));
                break;
            case 3:
                imagen = new ImageIcon(getClass().getResource("cuadrado.png"));
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(44, 45, Image.SCALE_DEFAULT));
                break;
            case 4:
                imagen = new ImageIcon(getClass().getResource("cuadrado.png"));
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(44, 45, Image.SCALE_DEFAULT));
                break;
            case 5:
                imagen = new ImageIcon(getClass().getResource("cuadrado.png"));
                imagen = new ImageIcon(imagen.getImage().getScaledInstance(44, 45, Image.SCALE_DEFAULT));
                break;
        }
        
        if (x >= 113 && x <= 153 && y <= 108 && y >= 68) {
            res1.setIcon(imagen);
        }else if(x >= 113 && x <= 153 && y <= 187 && y >= 107){
            res2.setIcon(imagen);
        }else if(x >= 156 && x <= 226 && y <= 221 && y >= 164){
            res3.setIcon(imagen);
        }else if(x >= 156 && x <= 226 && y <= 270 && y >= 249){
            res4.setIcon(imagen);
        }else if(x >= 203 && x <= 243 && y <= 324 && y >= 284){
            res5.setIcon(imagen);
        }else if(x >= 271 && x <= 311 && y <= 374 && y >= 334){
            res6.setIcon(imagen);
        }else if(x >= 266 && x <= 306 && y <= 429 && y >= 389){
            res7.setIcon(imagen);
        }else if(x >= 312 && x <= 352 && y <= 483 && y >= 467){
            res8.setIcon(imagen);
        }
        else{
            m = false;
        }
        
        return m;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xcua = cuadrado.getX();
        ycua = cuadrado.getY();
        xtri = triangulo.getX();
        ytri = triangulo.getY();
        xrom = rombo.getX();
        yrom = rombo.getY();
        xcir = circulo.getX(); 
        ycir = circulo.getY();
        xest = estrella.getX();
        yest = estrella.getY();
        
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK && e.getSource() == cuadrado) {
            cuadrado.setLocation(cuadrado.getX() + e.getX() - cuadrado.getWidth() / 2, cuadrado.getY() + e.getY() - cuadrado.getHeight() / 2);
            //System.out.println(cuadrado.getLocation());
            if(Icon(cuadrado.getX(), cuadrado.getY(),1)){
                cuadrado.setLocation(xcua, ycua);
                x = false;
            } 
        } else if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK && e.getSource() == triangulo) {
            triangulo.setLocation(triangulo.getX() + e.getX() - triangulo.getWidth() / 2, triangulo.getY() + e.getY() - triangulo.getHeight() / 2);
            //System.out.println(triangulo.getLocation());
            if(Icon(triangulo.getX(), triangulo.getY(),2)){
                triangulo.setLocation(xtri, ytri);
                x = false;
            } 
        } else if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK && e.getSource() == circulo && (circulo.getX() != 139 || circulo.getY() != 95)) {//deja de moverse cuando el componente llega a esas coordenadas
            circulo.setLocation(circulo.getX() + e.getX() - circulo.getWidth() / 2, circulo.getY() + e.getY() - circulo.getHeight() / 2);
        } else if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK && e.getSource() == estrella && (estrella.getX() != 139 || estrella.getY() != 95)) {//deja de moverse cuando el componente llega a esas coordenadas
            estrella.setLocation(estrella.getX() + e.getX() - estrella.getWidth() / 2, estrella.getY() + e.getY() - estrella.getHeight() / 2);
        } else if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK && e.getSource() == rombo && (rombo.getX() != 139 || rombo.getY() != 95)) {//deja de moverse cuando el componente llega a esas coordenadas
            rombo.setLocation(rombo.getX() + e.getX() - rombo.getWidth() / 2, rombo.getY() + e.getY() - rombo.getHeight() / 2);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    private void OrganizarPre() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;//cuantas columnas va a ocupar
        c.gridheight = 3;//cuantas filas va a ocupar
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(pregun[0], c);

        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(res1, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(pregun[1], c);

        c.gridx = 3;
        c.gridy = 3;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(res2, c);

        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 5;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(pregun[2], c);

        c.gridx = 5;
        c.gridy = 6;
        c.gridwidth = 5;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(res3, c);

        c.gridx = 0;
        c.gridy = 9;
        c.gridwidth = 5;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(pregun[3], c);

        c.gridx = 5;
        c.gridy = 9;
        c.gridwidth = 5;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(res4, c);

        c.gridx = 0;
        c.gridy = 12;
        c.gridwidth = 7;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(pregun[4], c);

        c.gridx = 6;
        c.gridy = 12;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(res5, c);

        c.gridx = 0;
        c.gridy = 15;
        c.gridwidth = 9;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(pregun[5], c);

        c.gridx = 9;
        c.gridy = 15;
        c.gridwidth = 9;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(res6, c);

        c.gridx = 0;
        c.gridy = 18;
        c.gridwidth = 9;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(pregun[6], c);

        c.gridx = 9;
        c.gridy = 18;
        c.gridwidth = 9;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(res7, c);

        c.gridx = 0;
        c.gridy = 21;
        c.gridwidth = 11;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(pregun[7], c);

        c.gridx = 11;
        c.gridy = 21;
        c.gridwidth = 11;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 8, 4, 0);
        c.anchor = GridBagConstraints.WEST;
        preguntas.add(res8, c);
    }

    public void Organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;//cuantas columnas va a ocupar
        c.gridheight = 3;//cuantas filas va a ocupar
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 8, 4, 0);
        add(op1, c);

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 8, 4, 0);
        add(cuadrado, c);

        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 0);
        add(op3, c);

        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 0);
        add(triangulo, c);

        c.gridx = 6;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 0);
        add(op2, c);

        c.gridx = 6;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 0);
        add(circulo, c);

        c.gridx = 9;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 0);
        add(op4, c);

        c.gridx = 9;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 0);
        add(rombo, c);

        c.gridx = 12;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 8);
        add(op5, c);

        c.gridx = 12;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 4, 4, 8);
        add(estrella, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 12;
        c.gridheight = 10;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 8, 0);
        add(preguntas, c);

    }

    public void Preguntas() {
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/P1.png"));
        pregun[0] = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(127, 40, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/P2.png"));
        pregun[1] = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(123, 39, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/P3.png"));
        pregun[2] = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(171, 39, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/P4.png"));
        pregun[3] = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(170, 43, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/P5.png"));
        pregun[4] = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(216, 39, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/P6.png"));
        pregun[5] = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(262, 42, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/P7.png"));
        pregun[6] = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(273, 41, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/P8.png"));
        pregun[7] = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(329, 44, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/espacio.png"));
        res1 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(51, 44, Image.SCALE_DEFAULT)));
        res2 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(51, 44, Image.SCALE_DEFAULT)));
        res3 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(51, 44, Image.SCALE_DEFAULT)));
        res4 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(51, 44, Image.SCALE_DEFAULT)));
        res5 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(51, 44, Image.SCALE_DEFAULT)));
        res6 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(51, 44, Image.SCALE_DEFAULT)));
        res7 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(51, 44, Image.SCALE_DEFAULT)));
        res8 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(51, 44, Image.SCALE_DEFAULT)));
    }

    public void Respuestas() {
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
        op1 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
        op3 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
        op2 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
        op4 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/5.png"));
        op5 = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));

        imagen = new ImageIcon(getClass().getResource("/Imagenes/cuadrado.png"));
        cuadrado = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));
        cuadrado.addMouseMotionListener(this);

        imagen = new ImageIcon(getClass().getResource("/Imagenes/triangulo.png"));
        triangulo = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));
        triangulo.addMouseMotionListener(this);

        imagen = new ImageIcon(getClass().getResource("/Imagenes/circulo.png"));
        circulo = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));
        circulo.addMouseMotionListener(this);

        imagen = new ImageIcon(getClass().getResource("/Imagenes/estrella.png"));
        estrella = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));
        estrella.addMouseMotionListener(this);

        imagen = new ImageIcon(getClass().getResource("/Imagenes/rombo.png"));
        rombo = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(91, 95, Image.SCALE_DEFAULT)));
        rombo.addMouseMotionListener(this);
    }

}
