
package Principal;

import java.awt.BorderLayout;
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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame{
    
    JPanel flow;
    JPanel border;
    JPanel box;
    JPanel grib;
    JPanel free;
    
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    
    JButton boton6;
    JButton boton7;
    JButton boton8;
    JButton boton9;
    
    JButton boton10;
    JButton boton11;
    JButton boton12;
    
    JButton boton13;
    JButton boton14;
    JButton boton15;
    JButton boton16;
    
    JButton boton17;
    JButton boton18;
    JButton boton19;
    JButton boton20;
    
    TitledBorder title;
    
    public Ventana(){
        setTitle("Ventana");
        setLocationRelativeTo(null);
        //setSize(500,500);
        setResizable(false);//para que no se pueda modificar el tamaño de la ventana
        
        botones();
        
        
        Container conten = this.getContentPane();
        conten.setLayout(new BorderLayout());
        
        paneles();

        conten.add(flow,BorderLayout.NORTH);
        conten.add(border,BorderLayout.CENTER);        
        conten.add(grib,BorderLayout.SOUTH);
        conten.add(box,BorderLayout.EAST);
        conten.add(free,BorderLayout.WEST);
        
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void botones(){
        boton1 = new JButton("JButton 1");
        boton2 = new JButton("JButton 2");
        boton3 = new JButton("JButton 3");
        boton4 = new JButton("JButton 4");
        boton5 = new JButton("JButton 5");
        
        boton6 = new JButton();
        boton7 = new JButton();
        boton8 = new JButton();
        boton9 = new JButton();
        
        boton10 = new JButton();
        boton11 = new JButton();
        boton12 = new JButton();
        
        boton13 = new JButton();
        boton14 = new JButton();
        boton15 = new JButton();
        boton16 = new JButton();
        
        boton17 = new JButton();
        boton18 = new JButton();
        boton19 = new JButton();
        boton20 = new JButton();
        
    }
    
    public void paneles(){
        title = BorderFactory.createTitledBorder("Flow Layout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        flow = new JPanel();
        flow.setBackground(Color.WHITE);
        flow.setLayout(new FlowLayout());
        flow.add(boton1);
        flow.add(boton2);
        flow.add(boton3);
        flow.add(boton4);
        flow.add(boton5);
        //flow.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        flow.setBorder(title);
        
        title = BorderFactory.createTitledBorder("Border Layout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        border = new JPanel();
        border.setBackground(Color.WHITE);
        border.setLayout(new BorderLayout());
        boton6.setText("JButton 6");
        border.add(boton6,BorderLayout.NORTH);
        boton7.setText("JButton 7");
        border.add(boton7,BorderLayout.WEST);
        boton8.setText("JButton 8");
        border.add(boton8,BorderLayout.EAST);
        boton5.setText("JButton 5");
        border.add(boton5,BorderLayout.CENTER);
        boton9.setText("JButton 9");
        border.add(boton9,BorderLayout.SOUTH);
        border.setBorder(title);
        
        title = BorderFactory.createTitledBorder("Grid Layout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        grib = new JPanel();
        grib.setBackground(Color.WHITE);
        grib.setLayout(new GridLayout(1,4));
        boton13.setText("Button 13");
        grib.add(boton13);
        boton14.setText("Button 14");
        grib.add(boton14);
        boton15.setText("Button 15");
        grib.add(boton15);
        boton16.setText("Button 16");
        grib.add(boton16);
        grib.setBorder(title);
        
        title = BorderFactory.createTitledBorder("Box Layout");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        box = new JPanel();
        box.setBackground(Color.WHITE);
        box.setLayout(new BoxLayout(box,BoxLayout.Y_AXIS));
        boton17.setText("Button 17");
        box.add(boton17);
        boton18.setText("Button 18");
        box.add(boton18);
        boton19.setText("Button 19");
        box.add(boton19);
        boton20.setText("Button 20");
        box.add(boton20);
        box.setBorder(title);
        
        title = BorderFactory.createTitledBorder("Free Layout");//FALTA PONER EL LAYOUT
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        free = new JPanel();
        free.setBackground(Color.WHITE);
        free.setLayout(new BoxLayout(free,BoxLayout.Y_AXIS));
        boton10.setText("...");
        free.add(boton10);
        boton11.setText("...");
        free.add(boton11);
        boton12.setText("...");
        free.add(boton12);
        free.setBorder(title);
    }

    
}
