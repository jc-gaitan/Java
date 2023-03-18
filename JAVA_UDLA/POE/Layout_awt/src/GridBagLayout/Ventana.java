package GridBagLayout;

import java.awt.*;
import java.awt.event.*;

public class Ventana extends Frame {

    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;

    public Ventana() {
        setTitle("GRIDBAGLAYOUT");
        setSize(231,119);
        setLocationRelativeTo(null);
        boton1 = new Button("Button 1");
        boton2 = new Button("2");
        boton3 = new Button("Button 3");
        boton4 = new Button("Long-Named Button 4");
        boton5 = new Button("Button 5");
        setLayout(new GridBagLayout());
        Agregar();
        //pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void Agregar() {
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 2;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        add(boton1, c);

        c.gridx = 2;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        add(boton2, c);

        c.gridx = 3;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 2;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        add(boton3, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 2;
        c.gridwidth = 6;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        add(boton4, c);

        c.gridx = 2;
        c.gridy = 3;
        c.gridheight = 1;
        c.gridwidth = 4;
        c.weightx = 1;
        c.weighty = 1;
        c.insets=new Insets(10,0,0,0);
        c.fill = GridBagConstraints.BOTH;
        add(boton5, c);
    }
}
