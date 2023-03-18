package Principal;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    JButton salir;
    JButton aplicar;
    JButton generar;
    JButton generarTa;
    Label generado;
    Label fondo;
    Label tabla;
    JRadioButton amarillo;
    JRadioButton gris;
    JRadioButton rosado;
    ButtonGroup group;//para que los botones de radio solo se pueda seleccionar uno a la vez
    Font font;
    JTextField campotext;
    TextArea tablas;
    
    boolean amari,gri,rosa;

    public Ventana() {
        setTitle("Ventana");
        //setLocationRelativeTo(null);

        generar = new JButton("Generar");
        generar.addActionListener(this);
        salir = new JButton("Salir");
        salir.addActionListener(this);
        aplicar = new JButton("Aplicar");
        aplicar.addActionListener(this);
        generarTa = new JButton("Generar");
        generarTa.addActionListener(this);
        
        generado = new Label();
        font = new Font("Arial", Font.BOLD, 12);//cambiarle el estilo de letra y tamaño
        fondo = new Label("Fondo");
        fondo.setFont(font);
        tabla = new Label("Tabla");
        tabla.setFont(font);
        
        group = new ButtonGroup();
        amarillo = new JRadioButton("Amarillo");
        gris = new JRadioButton("Gris");
        rosado = new JRadioButton("Rosado");
        group.add(amarillo);
        group.add(gris);
        group.add(rosado);
        amarillo.addActionListener(this);
        gris.addActionListener(this);
        rosado.addActionListener(this);
        
        campotext = new JTextField();
        
        tablas = new TextArea(10,5);
        tablas.setEditable(false);//para que no lo puedadn editar
        
        setLayout(new GridBagLayout());
        organizar();
        

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para cerrar la ventana con la X
        setVisible(true);
    }

    public void organizar() {//MODIFICAR
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 1;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 1.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 1.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.insets=new Insets(4,4,0,0);
        add(generado, c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        add(generar, c);
        
        c.insets=new Insets(10,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(0,4,0,0);
        add(fondo, c);
        
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        add(amarillo, c);
        
        c.insets=new Insets(-5,4,0,0);
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        add(gris, c);
        
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        add(rosado, c);

        c.gridx = 2;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        add(aplicar, c);
        
        c.insets=new Insets(10,0,0,0);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(0,4,0,0);
        add(tabla, c);
        
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        add(campotext, c);

        c.gridx = 3;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,0,0,3);
        add(generarTa, c);
        
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 3;
        c.gridheight = 10;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets=new Insets(4,4,0,0);
        c.fill = GridBagConstraints.BOTH;
        add(tablas, c);
        
        
        c.gridx = 0;
        c.gridy = 15;
        c.gridwidth = 4;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(10,10,10,10);
        add(salir, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generar) {
            int al = (int) (Math.random() * 20);
            String text = String.valueOf(al);
            generado.setText(text);
        }
        else if(e.getSource() == salir){
            System.exit(0);
        }
        else if(e.getSource() == amarillo){
            amari = true;
            gri = false;
            rosa = false;
        }else if(e.getSource() == gris){
            amari = false;
            gri = true;
            rosa = false;
        }else if(e.getSource() == rosado){
            amari = false;
            gri = false;
            rosa = true;
        }      
        
        else if(e.getSource() == aplicar && amari){
            Container con=this.getContentPane();
            con.setBackground(Color.YELLOW);
            generar.setBackground(Color.YELLOW);
            generado.setBackground(Color.YELLOW);
            fondo.setBackground(Color.YELLOW);
            amarillo.setBackground(Color.YELLOW);
            gris.setBackground(Color.YELLOW);
            rosado.setBackground(Color.YELLOW);
            aplicar.setBackground(Color.YELLOW);
            
            generarTa.setBackground(Color.YELLOW);
            tabla.setBackground(Color.YELLOW);
            campotext.setBackground(Color.YELLOW);
            tablas.setBackground(Color.YELLOW);  
            salir.setBackground(Color.YELLOW);  
        }else if(e.getSource() == aplicar && gri){
            Container con=this.getContentPane();
            con.setBackground(Color.GRAY);
            generar.setBackground(Color.GRAY);
            generado.setBackground(Color.GRAY);
            fondo.setBackground(Color.GRAY);
            amarillo.setBackground(Color.GRAY);
            gris.setBackground(Color.GRAY);
            rosado.setBackground(Color.GRAY);
            aplicar.setBackground(Color.GRAY);
            
            generarTa.setBackground(Color.GRAY);
            tabla.setBackground(Color.GRAY);
            campotext.setBackground(Color.GRAY);
            tablas.setBackground(Color.GRAY); 
            salir.setBackground(Color.GRAY);
        }else if(e.getSource() == aplicar && rosa){
            Container con=this.getContentPane();
            con.setBackground(Color.PINK);
            generar.setBackground(Color.PINK);
            generado.setBackground(Color.PINK);
            fondo.setBackground(Color.PINK);
            amarillo.setBackground(Color.PINK);
            gris.setBackground(Color.PINK);
            rosado.setBackground(Color.PINK);
            aplicar.setBackground(Color.PINK);
            
            generarTa.setBackground(Color.PINK);
            tabla.setBackground(Color.PINK);
            campotext.setBackground(Color.PINK);
            tablas.setBackground(Color.PINK); 
            salir.setBackground(Color.PINK);
        }
        else if(e.getSource() == generarTa){
            tablas.setText(tabla(Integer.parseInt(campotext.getText())));
        }

    }
    
    public String tabla(int num){
        String text = " ";
        for(int i=0;i<31;i++){
            text+=i+" X "+num+" = "+num*i+"\n";
        }
        return text;
    }
}
