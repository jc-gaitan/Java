
package Principal;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame{
    
    JPanel principal;
    JPanel layouts;
    JLabel text;
    JComboBox list;
 
    CardLayout cardLayout;
    
    TitledBorder title;
    
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
            button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,
            button21,button22,button23,button24,button25;
    
    JPanel flow,grid,border,box,gridbag,vacio;
        
    String [] opciones = {"Opciones","FlowLayout","BorderLayout","GridLayout","BoxLayout","GridBagLayout"};

    public Ventana(){
        setTitle("Ventana");
        setLocationRelativeTo(null);
        
        //setLayout(new GridLayout(2,1));
        
        Container conten = this.getContentPane();
        conten.setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        
        text = new JLabel("Escoja un Layout:    ");
        
        list = new JComboBox(opciones);
        panelesLayout();
        paneles();
        
        conten.add(principal);
        conten.add(layouts);
        
        ControlCardLayout control= new ControlCardLayout(this);
        list.addActionListener(control);
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paneles(){
        title = BorderFactory.createTitledBorder("Seleccion");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        principal = new JPanel();
        principal.setBackground(Color.WHITE);
        principal.setLayout(new FlowLayout());
        principal.add(text);
        principal.add(list);
        principal.setBorder(title);
        
        vacio = new JPanel();
        vacio.setBackground(Color.WHITE);
        
        cardLayout = new CardLayout();
        layouts = new JPanel();
        layouts.setBackground(Color.WHITE);
        layouts.setLayout(cardLayout);
        layouts.add(vacio,"Opciones");
        layouts.add(flow,"FlowLayout");
        layouts.add(grid,"GridLayout");
        layouts.add(border,"BorderLayout");
        layouts.add(box,"BoxLayout");
        layouts.add(gridbag,"GridBagLayout");
        
    }
    
    public void panelesLayout(){
        button1=new JButton("Button 1");
        button2=new JButton("2");
        button3=new JButton("Button 3");
        button4=new JButton("Long-Named Button 4");
        button5=new JButton("Button 5");
        
        title = BorderFactory.createTitledBorder("FlowLayout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        flow = new JPanel();
        flow.setBackground(Color.WHITE);
        flow.setLayout(new FlowLayout());
        flow.add(button1);
        flow.add(button2);
        flow.add(button3);
        flow.add(button4);
        flow.add(button5);
        flow.setBorder(title);
        
        button6=new JButton("Button 1");
        button7=new JButton("2");
        button8=new JButton("Button 3");
        button9=new JButton("Long-Named Button 4");
        button10=new JButton("Button 5");
        
        title = BorderFactory.createTitledBorder("GridLayout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        grid = new JPanel();
        grid.setBackground(Color.WHITE);
        grid.setLayout(new GridLayout(3,3));
        grid.add(button6);
        grid.add(button7);
        grid.add(button8);
        grid.add(button9);
        grid.add(button10);
        grid.setBorder(title);
        
        button11=new JButton("Button 1");
        button12=new JButton("2");
        button13=new JButton("Button 3");
        button14=new JButton("Long-Named Button 4");
        button15=new JButton("Button 5");
        
        title = BorderFactory.createTitledBorder("BorderLayout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        border = new JPanel();
        border.setBackground(Color.WHITE);
        border.setLayout(new BorderLayout());
        border.add(button11,BorderLayout.NORTH);
        border.add(button12,BorderLayout.CENTER);
        border.add(button13,BorderLayout.WEST);
        border.add(button14,BorderLayout.SOUTH);
        border.add(button15,BorderLayout.EAST);
        border.setBorder(title);
        
        button16=new JButton("Button 1");
        button17=new JButton("2");
        button18=new JButton("Button 3");
        button19=new JButton("Long-Named Button 4");
        button20=new JButton("Button 5");
        
        title = BorderFactory.createTitledBorder("BoxLayout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        box = new JPanel();
        box.setBackground(Color.WHITE);
        box.setLayout(new BoxLayout(box,BoxLayout.Y_AXIS));
        button16.setAlignmentX(CENTER_ALIGNMENT);
        button17.setAlignmentX(CENTER_ALIGNMENT);
        button18.setAlignmentX(CENTER_ALIGNMENT);
        button19.setAlignmentX(CENTER_ALIGNMENT);
        button20.setAlignmentX(CENTER_ALIGNMENT);
        box.add(button16);
        box.add(button17);
        box.add(button18);
        box.add(button19);
        box.add(button20);
        box.setBorder(title);
        
        button21=new JButton("Button 1");
        button22=new JButton("2");
        button23=new JButton("Button 3");
        button24=new JButton("Long-Named Button 4");
        button25=new JButton("Button 5");
        
        title = BorderFactory.createTitledBorder("GridBagLayout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gridbag = new JPanel();
        gridbag.setBackground(Color.WHITE);
        gridbag.setLayout(new GridBagLayout());
        organizar();
        gridbag.setBorder(title);
    }
    
    public void organizar(){//MODIFICAR
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 2;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        gridbag.add(button21, c);
        
        c.gridx = 2;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        gridbag.add(button22, c);
        
        c.gridx = 3;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 2;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        gridbag.add(button23, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 5;
        c.gridwidth = 6;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        gridbag.add(button24, c);
        
        c.gridx = 2;
        c.gridy = 6;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.weightx = 1;
        c.weighty = 1;
        c.insets=new Insets(10,0,0,0);
        c.fill = GridBagConstraints.BOTH;
        gridbag.add(button25, c);
        
    }


    
}
