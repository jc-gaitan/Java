
package e_validaciones;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Panel_Precio extends JPanel{
    JPanel establecimiento1,establecimiento2,establecimiento3;
    JPanel organizar;
    Border borde;
    
    JTextField esta1,esta2,esta3;//campos para los precios de los establecimientos}
    JTextField gananciae1, gananciae2, gananciae3;
    
    JLabel precioVentae1, precioVentae2, precioVentae3;
    
    JButton Guardar;
    
    TitledBorder esta10,esta20,esta30;
    TitledBorder gananciae10,gananciae20,gananciae30;
    
    
    public Panel_Precio(){
        Componentes();
        setBackground(null);
        setLayout(new GridBagLayout());
        organizar();
    }
    
    public void Componentes(){
        borde = BorderFactory.createLineBorder(Color.BLACK);

        esta1 = new JTextField(8);
        esta1.setBackground(null);
        esta10 = new TitledBorder(borde,"Precio Producto: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        esta1.setBorder(esta10);

        gananciae10 = new TitledBorder(borde,"% de ganancia: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        gananciae1 = new JTextField(8);
        gananciae1.setBackground(null);
        gananciae1.setBorder(gananciae10);

        precioVentae1 = new JLabel("El precio: ");
        
        establecimiento1 = new JPanel();
        establecimiento1.setBorder(new TitledBorder(borde, "Establecimiento 1", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));
        establecimiento1.setBackground(null);
        establecimiento1.setLayout(new BoxLayout(establecimiento1,BoxLayout.Y_AXIS));
        establecimiento1.add(esta1);
        establecimiento1.add(gananciae1);
        establecimiento1.add(precioVentae1);    
        

        esta20 = new TitledBorder(borde,"Precio Producto: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        esta2 = new JTextField(8);
        esta2.setBackground(null);
        esta2.setBorder(esta20);

        gananciae20 = new TitledBorder(borde,"% de ganancia: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        gananciae2 = new JTextField(8);
        gananciae2.setBackground(null);
        gananciae2.setBorder(gananciae20);
      
        precioVentae2 = new JLabel("El precio: ");
        
        establecimiento2 = new JPanel();
        establecimiento2.setBorder(new TitledBorder(borde, "Establecimiento 2", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));
        establecimiento2.setBackground(null);
        establecimiento2.setLayout(new BoxLayout(establecimiento2,BoxLayout.Y_AXIS));
        establecimiento2.add(esta2);
        establecimiento2.add(gananciae2);
        establecimiento2.add(precioVentae2); 

        esta30 = new TitledBorder(borde,"Precio Producto: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        esta3 = new JTextField(8);
        esta3.setBackground(null);
        esta3.setBorder(esta30);

        gananciae30 = new TitledBorder(borde,"% de ganancia: ",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        gananciae3 = new JTextField(8);
        gananciae3.setBackground(null);
        gananciae3.setBorder(gananciae30);
        precioVentae3 = new JLabel("El precio: ");
        
        establecimiento3 = new JPanel();
        establecimiento3.setBorder(new TitledBorder(borde, "Establecimiento 3", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));
        establecimiento3.setBackground(null);
        establecimiento3.setLayout(new BoxLayout(establecimiento3,BoxLayout.Y_AXIS));
        establecimiento3.add(esta3);
        establecimiento3.add(gananciae3);
        establecimiento3.add(precioVentae3); 
        
        Guardar = new JButton("Guardar Informacion");
        
        organizar = new JPanel();
        organizar.setLayout(new GridLayout(1,3));
        organizar.add(establecimiento1);
        organizar.add(establecimiento2);
        organizar.add(establecimiento3);
        
    }
    
     public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;
        c.gridheight = 6;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(organizar, c);
        
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 10;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(4, 4, 0, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(Guardar, c);

        //c.insets = new Insets(int arriba, int izquierda, int abajo, int derecha);

    }

}
