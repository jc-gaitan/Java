
package Principal;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame implements ActionListener{
    JPanel contenido;
    
    TitledBorder title;
    
    JPanel barra;
    JButton Datos;
    JButton Incentivos;
    JButton Estadistica;

    Incentivo in;
    Datos datos;
    
    public Ventana(){
        setTitle("Jovenes en Accion");
        //setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
        
        Container conten = getContentPane();        
        conten.setLayout(new BoxLayout(conten,BoxLayout.Y_AXIS));
        
        Componentes();
        paneles();

        conten.add(barra);
        conten.add(datos);   
        //conten.add(new Incentivo());
        
        
        setResizable(false); 
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paneles(){
        barra = new JPanel();
        title = BorderFactory.createTitledBorder("Opciones");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        barra.setBackground(Color.WHITE);
        barra.setBorder(title);
        barra.setLayout(new GridLayout());
        barra.add(Datos);
        barra.add(Incentivos);
        barra.add(Estadistica);
    }
    
    public void Componentes(){
        Datos = new JButton(" Datos ");
        Datos.addActionListener(this);
        Incentivos = new JButton(" Incentivos ");
        Incentivos.setEnabled(false);
        Incentivos.addActionListener(this);
        Estadistica = new JButton(" Estadistica ");
        Estadistica.setEnabled(false);
        Estadistica.addActionListener(this);
        
        in = new Incentivo();
        datos = new Datos(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Incentivos){
            VentanaIncentivo ven = new VentanaIncentivo(this,true,in);
            ven.setVisible(true);
        }else if(e.getSource() == Estadistica){
            Estadistica estadistica = new Estadistica(this,true);
            estadistica.setVisible(true);//para mostrar el dialog estadistica
        }
    }
    
    
}
