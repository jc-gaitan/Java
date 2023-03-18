
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    JLabel letro;
    Hilo Htiempo;
    LimiteTiempo limit;
    JButton iniciar;
    JButton Cerrar;
    JPanel num;
    JLabel tiempo;
    JLabel errores;
    JButton pista;
    JLabel imagen;
    Font font;
    JPanel Pletras;
    JPanel botones;
    JPanel PBotones;
    JPanel Praya;
    relas reglas;
    JLabel[] raya;
    JLabel[] letras;
    HMovimiento movimientos[];

    boolean aux;
    int pos;
    int x, y;

    JButton sigui;
    int ima = 0;

    public Ventana() {
        Componentes();
        setTitle("juego de animales");

        setIconImage(new ImageIcon(getClass().getResource("/icon/pause.png")).getImage());

        getContentPane().setBackground(Color.cyan);

        setLayout(new GridBagLayout());
        Organizar();

        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setResizable(false);
        //pack();
        setLocationRelativeTo(null);
        reglas.setVisible(true);
    }

    public void Organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(4, 20, 0, 0);
        add(imagen, c);

        c.gridx = 10;
        c.gridy = 0;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(4, 20, 0, 4);
        add(PBotones, c);

        c.gridx = 0;
        c.gridy = 40;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 3;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        c.fill = GridBagConstraints.NONE;
        add(botones, c);

        c.gridx = 0;
        c.gridy = 25;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 15;//cuantas filas va a ocupar
        c.weightx = 1.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 1.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.anchor = GridBagConstraints.CENTER;//pone el componente a la izquierda
        c.insets = new Insets(4, 4, 0, 4);
        add(Pletras, c);

    }

    public void OrganizarBoto() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 0, 4);
        PBotones.add(tiempo, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        PBotones.add(errores, c);

        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        PBotones.add(pista, c);

        c.gridx = 0;
        c.gridy = 12;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        PBotones.add(sigui, c);
    }

    public void Componentes() {
        sigui = new JButton("Siguiente");
        sigui.addActionListener(this);

        iniciar = new JButton("Pausar  ");
        ImageIcon photopause = new ImageIcon(getClass().getResource("/icon/pause.png"));
        ImageIcon ima = new ImageIcon(photopause.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
        iniciar.setIcon(ima);
        Cerrar = new JButton("Cerrar  ");
        ImageIcon hotopause = new ImageIcon(getClass().getResource("/icon/cerrar.jpg"));
        ImageIcon ma = new ImageIcon(hotopause.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
        Cerrar.setIcon(ma);
        tiempo = new JLabel("Tiempo:  ");

        errores = new JLabel("errores:      ");
        pista = new JButton("Pista");

        botones = new JPanel();
//        botones.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        botones.setBackground(Color.cyan);
        botones.add(iniciar);
        botones.add(Cerrar);

        PBotones = new JPanel();
        //PBotones.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        PBotones.setOpaque(false);
        PBotones.setLayout(new GridBagLayout());
        OrganizarBoto();
//        PBotones.add(tiempo);
//        PBotones.add(errores);
//        PBotones.add(pista);

        Pletras = new JPanel();
        Pletras.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Pletras.setOpaque(false);
        Pletras.setLayout(null);
        Pletras.setSize(200, 300);

        /*l = new letras();
         l.solucion[1].addMouseListener(this);
         l.solucion[1].setBounds(0, 0, 40, 60);
         letras.add(l.solucion[1]);*/
        //imagen = new JLabel[5];
        ImageIcon Imag;
        /*for (int i = 0; i < imagen.length; i++) {
         //System.out.println("/Imagenes/"+ i +".jpg");
         Imag = new ImageIcon(getClass().getResource("/Imagenes/" + i + ".jpg"));
         Imag = new ImageIcon(Imag.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT));
         imagen[i] = new JLabel(Imag);
         }*/

        Imag = new ImageIcon(getClass().getResource("/Imagenes/0.jpg"));
        Imag = new ImageIcon(Imag.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT));
        imagen = new JLabel(Imag);

        raya = new JLabel[8];

        Imag = new ImageIcon(getClass().getResource("/Imagenes/reyaaa.png"));
        Imag = new ImageIcon(Imag.getImage().getScaledInstance(40, 60, Image.SCALE_DEFAULT));

        Praya = new JPanel();
        Praya.setOpaque(false);

        for (int i = 0; i < raya.length; i++) {
            raya[i] = new JLabel(Imag);
            Praya.add(raya[i]);
        }

        reglas = new relas(this, true);
        //reglas.Link.addMouseListener(this);
        reglas.hecho.addActionListener(this);

        limit = new LimiteTiempo(this, true);
        limit.hecho.addActionListener(this);

        Htiempo = new Hilo(tiempo, 140, limit);

        letras = new JLabel[27];
        movimientos = new HMovimiento[27];

        ImageIcon IconLetra;

        IconLetra = new ImageIcon(getClass().getResource("/abecedario/a.png"));
        IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(40, 60, Image.SCALE_DEFAULT));
        letro = new JLabel(IconLetra);
        letro.addMouseMotionListener(this);
        letro.setBounds(0, 0, 40, 60);

        //Pletras.add(letro);
        char ascii = 97;
        int x = 10;
        int y = 66;

        for (int i = 0; i < letras.length - 1; i++) {
            IconLetra = new ImageIcon(getClass().getResource("/abecedario/" + String.valueOf(ascii) + ".png"));
            IconLetra = new ImageIcon(IconLetra.getImage().getScaledInstance(40, 60, Image.SCALE_DEFAULT));
            //System.out.println("/abecedario/" + String.valueOf(ascii) +".png");
            letras[i] = new JLabel(IconLetra);
            letras[i].addMouseMotionListener(this);
            letras[i].addMouseListener(this);
            letras[i].setBounds(x, y, 40, 60);
            movimientos[i] = new HMovimiento(letras[i], true);

            if (x <= 606) {
                x += 46;
            } else {
                x = 10;
                y += 106;
            }

            ascii++;
            Pletras.add(letras[i]);
        }

        Praya.setBounds(150, 15, 360, 40);
        //Pletras.add(Praya);

        aux = true;
        
        reglas.list.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//       if(e.getSource() == reglas.hecho){
//            reglas.dispose();
//        }
        if (e.getSource() == reglas.hecho) {
            reglas.dispose();
            Htiempo.start();
            movimientos[0].start();
            movimientos[14].start();
        }else if(e.getSource() == reglas.list){
            if(reglas.list.getSelectedIndex() == 0){
                Htiempo.tiempo = 360;
                reglas.hecho.setEnabled(true);
            }else if(reglas.list.getSelectedIndex() == 1){
                Htiempo.tiempo = 180;
                reglas.hecho.setEnabled(true);                
            }else if(reglas.list.getSelectedIndex() == 2){
                Htiempo.tiempo = 90;
                reglas.hecho.setEnabled(true);
            }
            
        } else if (e.getSource() == sigui) {
            ima++;
            if (ima == 5) {
                ima = 0;
            }
            ImageIcon Imag = new ImageIcon(getClass().getResource("/Imagenes/" + ima + ".jpg"));
            Imag = new ImageIcon(Imag.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT));
            imagen.setIcon(Imag);
            this.repaint();
        }

        if (e.getSource() == limit.hecho) {
            limit.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        verificarPos(pos, x, y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void verificarPos(int i, int x, int y) {
        if (x >= 1 && x <= 10 && y >= 0 && y <= 6) {//rango donde va a estar ubicado
            aux = false;//para que no se puede arrastrar
            letras[i].setLocation(5, 2);//lo envia a la posicion exacta donde va a estar ubicado
        } else {
            letras[i].setLocation(100, 100);//posicion Inicial
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        for (int i = 0; i < letras.length; i++) {
            /*xini = letras[i].getX();
             yini = letras[i].getY();*/
            if (e.getSource() == letras[i] && aux) {
                letras[i].setLocation(letras[i].getX() + e.getX() - letras[i].getWidth() / 2, letras[i].getY() + e.getY() - letras[i].getHeight() / 2);
                System.out.println(letras[i].getLocation());
                pos = i;
                movimientos[i].conti = false;//detiene el hilo
                x = letras[i].getX();
                y = letras[i].getY();
            }
        }
        if (e.getSource() == letro) {
            letro.setLocation(letro.getX() + e.getX() - letro.getWidth() / 2, letro.getY() + e.getY() - letro.getHeight() / 2);
            //posicion(letro.getX(), letro.getY(), letro);
            System.out.println(letro.getLocation());
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
