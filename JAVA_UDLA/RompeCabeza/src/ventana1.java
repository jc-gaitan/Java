
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ventana1 extends JFrame implements ActionListener{
    
    Ventana ven;
        
    JButton b1,b2;
    
    JLabel L1;
    
  public ventana1(){
      
        Componentes();
        
        getContentPane().setBackground(Color.PINK);
        
        setLayout(new GridBagLayout());
        Organizar();
        
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }  

    private void Componentes() {
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.jpg")).getImage());
       
        
        ImageIcon fondo = new ImageIcon(getClass().getResource("/Imagenes/images.jpg"));
        fondo = new ImageIcon(fondo.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT));
        L1 = new JLabel(fondo);
        
        b1 = new JButton();
        b1.addActionListener(this);
        ImageIcon bo1 = new ImageIcon(getClass().getResource("/Imagenes/play.jpg"));
        bo1 = new ImageIcon(bo1.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT));
        b1.setIcon(bo1);
        
        
        b2 = new JButton();
        b2.addActionListener(this);
        ImageIcon bo2 = new ImageIcon(getClass().getResource("/Imagenes/descarga.png"));
        bo2 = new ImageIcon(bo2.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT));
        b2.setIcon(bo2);
       
        
    }

    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 15;//cuantas columnas va a ocupar
        c.gridheight = 10;//cuantas filas va a ocupar
//        c.insets = new Insets(0, 4, 0, 4);
        add(L1, c);
        
        c.gridx = 1;
        c.gridy = 11;
        c.gridwidth = 5;//cuantas columnas va a ocupar
        c.gridheight = 5;//cuantas filas va a ocupar
//        c.insets = new Insets(0, 4, 0, 0);
        add(b1, c);
        
        c.gridx = 7;
        c.gridy = 11;
        c.gridwidth = 7;//cuantas columnas va a ocupar
        c.gridheight = 5;//cuantas filas va a ocupar
//        c.insets = new Insets(0, 0, 0, 0);
        add(b2, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource() == b2){
            System.exit(0);
        }
        
        if(e.getSource() == b1){
            ven = new Ventana();
//            ven.dispose();
//            ven.setVisible(true); 
        }
    }

   

    
}
