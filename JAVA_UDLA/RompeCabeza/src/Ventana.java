
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame implements ActionListener{
    
    //HiloTemporizador htiempo;
    Hilo htiempo;
    Inicio inicio;
    LimiteTiempo limit;
    
    JPanel partes;
    JPanel botones;
    
    JComboBox optiempo;
    
    JLabel guia;
    JLabel parte[];
    
    JButton iniciar;
    JButton cerrar;
    
    JLabel puntaje, tiempo;
    
    public Ventana(){
        Componentes();
        
        getContentPane().setBackground(Color.PINK);
        
        setLayout(new GridBagLayout());
        Organizar();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        pack();
        setLocationRelativeTo(null);

        inicio.setVisible(true);
    }
    
    public void Componentes(){
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.jpg")).getImage());
        
        puntaje = new JLabel("Puntaje:      ");
        tiempo = new JLabel("Tiempo:      ");
        
        String [] op ={"Duración", "30 Seg", "45 Seg", "1 Min", "2 Min"};
        optiempo = new JComboBox(op);
        optiempo.addActionListener(this);
        
        iniciar = new JButton();
        iniciar.addActionListener(this);
        ImageIcon bo1 = new ImageIcon(getClass().getResource("/Imagenes/play1.png"));
        bo1 = new ImageIcon(bo1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        iniciar.setIcon(bo1);
        iniciar.setEnabled(false);
        
        cerrar = new JButton();
        cerrar.addActionListener(this);
        ImageIcon bo2 = new ImageIcon(getClass().getResource("/Imagenes/cerrar.jpg"));
        bo2 = new ImageIcon(bo2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        cerrar.setIcon(bo2);
        
        ImageIcon Imag = new ImageIcon(getClass().getResource("/Imagenes/mapa.png"));
        Imag = new ImageIcon(Imag.getImage().getScaledInstance(341, 361, Image.SCALE_DEFAULT));
        
        guia = new JLabel(Imag);
        guia.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        botones = new JPanel();
        botones.setBackground(Color.WHITE);
        botones.setLayout(new GridBagLayout());
        OrganizarBoto();  
        
        parte = new JLabel[27];
        
        partes = new JPanel();
        partes.setBackground(Color.WHITE);
        partes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        partes.setLayout(new GridLayout(3,5,2,2));
 
        for (int i = 0; i < parte.length; i++) {
            Imag = new ImageIcon(getClass().getResource("/Partes/"+i+".png"));
            Imag = new ImageIcon(Imag.getImage().getScaledInstance(101, 92, Image.SCALE_DEFAULT));
            parte[i] = new JLabel(Imag);
            partes.add(parte[i]);
        }
        
        inicio = new Inicio(this, true);
        inicio.b1.addActionListener(this);
        inicio.b2.addActionListener(this);
        
        limit = new LimiteTiempo(this,true);
        limit.hecho.addActionListener(this);
        
        htiempo = new Hilo(tiempo, 0, limit);
        
    }
    
    public void Organizar(){
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 18;//cuantas filas va a ocupar
        c.insets = new Insets(8, 8, 0, 8);
        add(guia, c);
              
        c.gridx = 0;
        c.gridy = 18;
        c.gridwidth = 20;//cuantas columnas va a ocupar
        c.gridheight = 20;//cuantas filas va a ocupar
        c.insets = new Insets(4, 8, 8, 8);
        add(partes, c);
        
        c.gridx = 15;
        c.gridy = 0;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 5;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 0, 4);
        add(botones, c);
        
    }
    
    public void OrganizarBoto(){
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 0, 4);
        botones.add(iniciar, c);
        
        c.gridx = 4;
        c.gridy = 0;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 0, 4);
        botones.add(cerrar, c);
        
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 2;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 0, 4);
        botones.add(puntaje, c);
        
        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 4;//cuantas columnas va a ocupar
        c.gridheight = 2;//cuantas filas va a ocupar
        c.insets = new Insets(8, 4, 8, 4);
        botones.add(tiempo, c);
        
        c.gridx = 4;
        c.gridy = 9;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 5;//cuantas filas va a ocupar
        c.insets = new Insets(4, 4, 4, 4);
        botones.add(optiempo, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == iniciar){
            htiempo.start();
        }else if(e.getSource() == optiempo){
            if (optiempo.getSelectedIndex() == 0) {
                iniciar.setEnabled(false);
            }else if (optiempo.getSelectedIndex() == 1) {
                htiempo.setTiempo(30);
                iniciar.setEnabled(true);
            }else if (optiempo.getSelectedIndex() == 2) {
                htiempo.setTiempo(45);
                iniciar.setEnabled(true);
            }else if (optiempo.getSelectedIndex() == 3) {
                htiempo.setTiempo(60);
                iniciar.setEnabled(true);
            }else if (optiempo.getSelectedIndex() == 4) {
                htiempo.setTiempo(120);
                iniciar.setEnabled(true);
            }
        }else if(e.getSource() == inicio.b1){
            inicio.dispose();
            setVisible(true);
        }else if(e.getSource() == inicio.b2){
            System.exit(0);
        }else if(e.getSource() == cerrar){
            System.exit(0);
        }else if(e.getSource() == limit.hecho){
            System.exit(0);
        }
    }
    
}
