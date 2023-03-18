
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame implements ActionListener{
    
    Hilo Htiempo;
    LimiteTiempo limit;
    
    JComboBox OTiempo;
    String op[] = {"Opciones", "1 minutos", "2 minutos", "3 minutos"};
    
    JButton iniciar;
    JButton Cerrar;
    
    JLabel tiempo;
    JLabel errores;
    JButton pista;
    JLabel imagen;
    
    JPanel letras;
    JPanel botones;
    JPanel PBotones;
    JPanel solucion;
    
    JLabel letra[];
    
    public Ventana(){
        Componentes();
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(new GridBagLayout());
        Organizar();
        
        setSize(388, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setResizable(true);
        //pack();
        setLocationRelativeTo(null);
        //limit.setVisible(true);//Muestra la ventana
    }
    
    public void Organizar(){
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(10, 20, 0, 0);
        add(imagen, c);
        
        c.gridx = 10;
        c.gridy = 0;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(8, 20, 0, 4);
        add(PBotones, c);
        
        c.gridx = 0;
        c.gridy = 40;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 3;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        c.fill = GridBagConstraints.NONE;
        add(botones, c);
        
        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 3;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        c.fill = GridBagConstraints.NONE;
        add(solucion, c);
        
        c.gridx = 0;
        c.gridy = 25;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 15;//cuantas filas va a ocupar
        c.weightx = 1.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 1.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(4, 4, 0, 4);
        add(letras, c);

    }
    
    public void OrganizarBoto(){
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
        PBotones.add(OTiempo, c);
    }
    
    public void Componentes(){
        iniciar = new JButton("Iniciar");
        Cerrar = new JButton("Cerrar");
        
        tiempo = new JLabel("Tiempo:                ");
        errores = new JLabel("errores:      ");    
        pista = new JButton("Pista");
        
        botones = new JPanel();
//        botones.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        botones.setBackground(Color.WHITE);
        botones.add(iniciar);
        botones.add(Cerrar);
        
        PBotones = new JPanel();
        //PBotones.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        PBotones.setBackground(Color.WHITE);
        PBotones.setLayout(new GridBagLayout());
              
        letras = new JPanel();
        letras.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        letras.setBackground(Color.WHITE);
        letras.setSize(200, 200);
        
        ImageIcon Imag = new ImageIcon(getClass().getResource("/Imagenes/goku.jpg"));
        Imag = new ImageIcon(Imag.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        imagen = new JLabel(Imag);
        
        letra = new JLabel[6];
        
        Imag = new ImageIcon(getClass().getResource("/Imagenes/raya.png"));
        Imag = new ImageIcon(Imag.getImage().getScaledInstance(40, 60, Image.SCALE_DEFAULT));

        solucion = new JPanel();
        solucion.setBackground(Color.WHITE);

        for (int i = 0; i < letra.length; i++) {
            letra[i] = new JLabel(Imag);
            solucion.add(letra[i]);
        }
        
        limit = new LimiteTiempo(this, true);
        limit.hecho.addActionListener(this);
        
        OTiempo = new JComboBox(op);
        OTiempo.addActionListener(this);
        
        Htiempo = new Hilo(tiempo, 30, limit);

        OrganizarBoto(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == limit.hecho){
            limit.dispose();
        }else if(e.getSource() == OTiempo){
            if(OTiempo.getSelectedIndex() == 0){
                System.out.println("pto");
            }else if(OTiempo.getSelectedIndex() == 1){
                Htiempo.setTiempo(60);
                Htiempo.start();
                OTiempo.setEnabled(false);
            }else if(OTiempo.getSelectedIndex() == 2){
                Htiempo.setTiempo(120);
                Htiempo.start();
                OTiempo.setEnabled(false);
            }else if(OTiempo.getSelectedIndex() == 3){
                Htiempo.setTiempo(180);
                Htiempo.start();
                OTiempo.setEnabled(false);
            }
        }
    }
    
    
    
}
