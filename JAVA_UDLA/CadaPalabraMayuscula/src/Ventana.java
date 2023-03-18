
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;


public class Ventana extends JFrame{
    JTextField nombre, apellido;
    
    public Ventana(){
        Componentes();

        setTitle("Validar");
        
        setLayout(new GridBagLayout());
        Organizar();

        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }
    
    public void Componentes(){
        nombre = new JTextField(8);
        nombre.addKeyListener(new Validar(nombre));
        apellido = new JTextField(8);
        apellido.addKeyListener(new Validar(apellido));
    }
    
    public void Organizar(){
        GridBagConstraints c = new GridBagConstraints();
        
        //Insets (int superior, int izquierda, int abajo, int derecha)
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 8;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8, 2, 0, 2);
        add(nombre, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 8;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(2, 2, 8, 2);
        add(apellido, c);
    }
    
}
