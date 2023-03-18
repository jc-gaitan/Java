
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame implements ActionListener{
    
    JLabel ImagFondo, ImagRueda, ImagDueño, usuario, msj1, msj2, TDurac,TDurac1,TDurac2, TDurac3,TDurac4,disponible  ;
    ImageIcon[] usuarios;
    JComboBox TRueda, TPersonas;
    JPanel TDuracion;
    JButton iniciar;
    DuracionRueda dr;
    sincronizacion a;
    TiemLlegada tl;
    
    public Ventana(){
        setTitle("Rueda de la fortuna");
        
        setSize(900, 500);
        setResizable(true);

        
        
        Componentes();
        
        setLayout(new GridBagLayout());
        
        organizar();
              
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
    
    public void Componentes(){
        
        a = new sincronizacion();
        
        iniciar = new JButton("Iniciar");
        iniciar.addActionListener(this);
        iniciar.setEnabled(false);
        
        String [] op ={"Duración", "30 Seg", "45 Seg", "1 Min", "2 Min"};
        TRueda = new JComboBox(op);
        TRueda.addActionListener(this);
        
        String [] opP ={"TiempoP", "0.5 Seg", "1 Seg", "2 Seg", "3 Seg"};
        TPersonas = new JComboBox(opP);
        TPersonas.addActionListener(this);
         
        
        ImageIcon fondo = new ImageIcon(getClass().getResource("/Imagenes/imagenFondo.jpg"));
        fondo = new ImageIcon(fondo.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        ImagFondo = new JLabel(fondo);
        
        ImageIcon rueda = new ImageIcon(getClass().getResource("/Imagenes/Rueda.png"));
        rueda = new ImageIcon(rueda.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
        ImagRueda = new JLabel(rueda);
        
        ImageIcon dueño = new ImageIcon(getClass().getResource("/Imagenes/Dueño.png"));
        dueño = new ImageIcon(dueño.getImage().getScaledInstance(80, 200, Image.SCALE_DEFAULT));
        ImagDueño = new JLabel(dueño);
        
        usuarios  = new ImageIcon[5];
               
        for (int i = 0; i < 5; i++) {
            String ruta = "/usuarios/usuario"+(i)+".png";
            usuarios[i] = new ImageIcon(getClass().getResource(ruta));
            usuarios[i] = new ImageIcon(usuarios[i].getImage().getScaledInstance(80, 200, Image.SCALE_DEFAULT));
        }
        
        usuario = new JLabel(usuarios[3]);  
        
        ImageIcon m1 = new ImageIcon(getClass().getResource("/Imagenes/mensaje.png"));
        m1 = new ImageIcon(m1.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
        msj1 = new JLabel(m1);
        
        ImageIcon m2 = new ImageIcon(getClass().getResource("/Imagenes/mensaje 2.png"));
        m2 = new ImageIcon(m2.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
        msj2 = new JLabel(m2);
        
        TDurac = new JLabel("1)           0 Seg       ");
        TDurac1 = new JLabel("2)           0 Seg       ");
        TDurac2 = new JLabel("3)           0 Seg       ");
        TDurac3 = new JLabel("4)           0 Seg       ");
        TDurac4 = new JLabel("5)           0 Seg       ");
        JLabel a = new JLabel("                                                   ");
        
        TDuracion = new JPanel();
        TDuracion.setBorder(BorderFactory.createTitledBorder("Duracion Personas "));
        TDuracion.setLayout(new BoxLayout(TDuracion,BoxLayout.Y_AXIS));
        TDuracion.add(a);
        TDuracion.add(TDurac);
        TDuracion.add(TDurac1);
        TDuracion.add(TDurac2);
        TDuracion.add(TDurac3);
        TDuracion.add(TDurac4);
        
        disponible = new JLabel("Puestos disponible:        ");
        
    }
    
    public void organizar(){
        GridBagConstraints c = new GridBagConstraints();
         
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;//cuantas columnas va a ocupar
        c.gridheight = 20;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 0, 0);
        add(ImagRueda, c);
        
        c.gridx = 10;
        c.gridy = 0;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 5;//cuantas filas va a ocupar
        add(msj2, c);
        
        c.gridx = 10;
        c.gridy = 5;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 0, 0);
        add(ImagDueño, c);
        
        c.gridx = 15;
        c.gridy = 0;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 4, 0);
        add(msj1, c);
        
        c.gridx = 15;
        c.gridy = 5;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 4, 0);
        add(usuario, c);
        
        c.gridx = 0;
        c.gridy = 20;
        c.gridwidth = 2 ;//cuantas columnas va a ocupar
        c.gridheight = 2;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 10, 0);
        add(TRueda, c);
        
        c.gridx = 2;
        c.gridy = 20;
        c.gridwidth = 5 ;//cuantas columnas va a ocupar
        c.gridheight = 2;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 10, 0);
        add(TPersonas, c);
        
        c.gridx = 7;
        c.gridy = 20;
        c.gridwidth = 5 ;//cuantas columnas va a ocupar
        c.gridheight = 2;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 10, 0);
        add(disponible, c);
        
        c.gridx = 12;
        c.gridy = 20;
        c.gridwidth = 3;//cuantas columnas va a ocupar
        c.gridheight = 2;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 10, 0);
        add(iniciar, c);
        
        
        c.gridx = 0;
        c.gridy = 25;
        c.gridwidth = 5 ;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 10, 0);
        add(TDuracion, c);
        
        //Insets (int superior, int izquierda, int abajo, int derecha) 
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == iniciar){
            dr.start();
        }else if(e.getSource() == TRueda){
            if (TRueda.getSelectedIndex() == 0) {
                iniciar.setEnabled(false);
            }else if (TRueda.getSelectedIndex() == 1) {
                dr = new DuracionRueda(30);
                iniciar.setEnabled(true);
            }else if (TRueda.getSelectedIndex() == 2) {
                dr = new DuracionRueda(45);
                iniciar.setEnabled(true);
            }else if (TRueda.getSelectedIndex() == 3) {
                dr = new DuracionRueda(60);
                iniciar.setEnabled(true);
            }else if (TRueda.getSelectedIndex() == 4) {
                dr = new DuracionRueda(120);
                iniciar.setEnabled(true);
            }
        }else if(e.getSource() == TPersonas){
            if(TPersonas.getSelectedIndex() == 0){

            }else if(TPersonas.getSelectedIndex() == 1){
                tl = new TiemLlegada(500,a);
            }else if(TPersonas.getSelectedIndex() == 2){
                tl = new TiemLlegada(1000,a);
            }else if(TPersonas.getSelectedIndex() == 3){
                tl = new TiemLlegada(2000,a);
            }if(TPersonas.getSelectedIndex() == 4){
                tl = new TiemLlegada(3000,a);
            }
        
        }
    }
}
