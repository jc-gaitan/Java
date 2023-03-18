
package Principal;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Emergente extends JDialog{
    
    JSpinner hora;
    JSpinner minuto;
    JSpinner segundo;
    
    JLabel lahora;
    JLabel laminuto;
    JLabel lasegundo;
    
    JLabel title;
    
    Font font;
    
    JButton hecho;
    
    JPanel time;
    
    public Emergente(JFrame padre, boolean modal){
        super(padre,modal);
        setTitle("      ");
        Componentes();
        
        setLayout(new GridBagLayout());
        Organizar();       
        
        setLocationRelativeTo(padre);
        pack();
        setResizable(false);
    }
    
    public void Componentes(){
        hecho = new JButton("Hecho");
        
        title = new JLabel(" Editar temporizador");
        //title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        title.setOpaque(true);//activa el setBackground
        Color col = new Color(0,128,255);
        title.setBackground(col);
        font = new Font("Times New Roman", Font.BOLD, 30);
        title.setFont(font);
        title.setForeground(Color.WHITE);//cambiar el color de la letra
        title.setAlignmentX(CENTER_ALIGNMENT);//centra el componente
        
        SpinnerNumberModel modeloMinuto = new SpinnerNumberModel();
        modeloMinuto.setMaximum(59);
        modeloMinuto.setMinimum(0);
        
        SpinnerNumberModel modeloSegundo = new SpinnerNumberModel();
        modeloSegundo.setMaximum(59);
        modeloSegundo.setMinimum(0);
        
        SpinnerNumberModel modeloHora = new SpinnerNumberModel();
        modeloHora.setMaximum(23);
        modeloHora.setMinimum(0);
        
        hora = new JSpinner(modeloHora);
        minuto = new JSpinner(modeloMinuto);
        segundo = new JSpinner(modeloSegundo);
        
        lahora = new JLabel("Hora");
        lahora.setForeground(Color.DARK_GRAY);
        lahora.setFont(new Font("Times New Roman", Font.BOLD, 16));
        laminuto = new JLabel("Minuto");
        laminuto.setForeground(Color.DARK_GRAY);
        laminuto.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lasegundo = new JLabel("Segundo");      
        lasegundo.setForeground(Color.DARK_GRAY);
        lasegundo.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        time = new JPanel();
        time.setLayout(new GridLayout(2,3,5,0));
        
        time.add(hora);
        time.add(minuto);
        time.add(segundo);
        time.add(lahora);
        time.add(laminuto);
        time.add(lasegundo);
    }
    
    public void Organizar(){
        //c.insets = new Insets(int arriba, int izquierda, int abajo, int derecha);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(title, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(10, 4, 4, 4);
        add(time, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 6;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(hecho, c);
    }
    
}
