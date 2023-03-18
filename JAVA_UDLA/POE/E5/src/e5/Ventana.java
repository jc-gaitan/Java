
package e5;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Ventana extends JFrame implements ActionListener{
    
    static final int FPS_MIN = 0;
    static final int FPS_MAX = 250;
    static final int FPS_INIT = 0; 
    
    JPanel principal;
    JPanel vacio;
    JPanel botones;
    JPanel dias_semana;
    JPanel color;
    JPanel contenido;
    
    JButton habi,deshabi,aplicar;
    JButton aplicar1;
    JButton salir;
    
    JComboBox prin;
    JComboBox comsema;
    
    Label mensaje;
    Label dia;
    Label r1,g1,b1,colorla,num,num2,num3;
    
    
    JSlider r,g,b;   
    
    String[] opciones = {"Opciones","Botones","Dias Semana","Colores"};
    String[] opciones1 = {"Opciones","1","2","3","4","5","6","7"};
    
    CardLayout cardLayout;
    
    public Ventana (){
        setTitle("Ventana");
        setLocationRelativeTo(null);
        
        Container conten = this.getContentPane();
        conten.setLayout(new BoxLayout(conten,BoxLayout.Y_AXIS));
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        
        componentes();
        paneles();        
        

        //conten.add(botones);
        //conten.add(dias_semana);
        //conten.add(color);
        conten.add(principal);
        conten.add(contenido);
        
        
        
        
        
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paneles(){
        principal = new JPanel();
        principal.setBackground(Color.WHITE);
        principal.setLayout(new FlowLayout());
        principal.add(prin);
        principal.add(salir);


        vacio = new JPanel();
        vacio.setBackground(Color.white);
        
        botones = new JPanel();
        botones.setBackground(Color.WHITE);
        botones.setLayout(new GridBagLayout());
        organizar();
        
        dias_semana = new JPanel();
        dias_semana.setBackground(Color.WHITE);
        dias_semana.setLayout(new BoxLayout(dias_semana,BoxLayout.Y_AXIS));
        dias_semana.add(comsema);
        dias_semana.add(dia);
        
        color = new JPanel();
        color.setBackground(Color.WHITE);
        color.setLayout(new GridBagLayout());
        organizar1();
        
        cardLayout = new CardLayout();
        contenido = new JPanel();
        contenido.setBackground(Color.WHITE);
        contenido.setLayout(cardLayout);
        contenido.add(vacio,"Opciones");
        contenido.add(botones,"Botones");
        contenido.add(dias_semana,"Dias Semana");
        contenido.add(color,"Colores");
    }
    
    public void componentes(){
        prin = new JComboBox(opciones);
        prin.addActionListener(this);
        
        salir = new JButton("Salir");
        salir.setToolTipText("Este boton cierra la aplicacion");
        salir.addActionListener(this);
        
        habi = new JButton("Habilitar");
        habi.setEnabled(false);//false para deshabilitar el boton, true para habilitarlo
        habi.setToolTipText("Este boton habilita el boton de Mostrar Texto.");
        habi.addActionListener(this);
        deshabi = new JButton("Deshabilitar");
        deshabi.setToolTipText("Este boton deshabilita el boton de Mostrar Texto. ");
        deshabi.addActionListener(this);
        aplicar = new JButton("Mostrar Texto");
        aplicar.setToolTipText("Este boton muestra en pantalla el texto Hola.");
        aplicar.addActionListener(this);
        mensaje = new Label();
        
        comsema = new JComboBox(opciones1);
        comsema.addActionListener(this);
        dia = new Label();//FALTA Centrar el label
        
        r1 = new Label("R (0)  ");
        g1 = new Label("G (0)  ");
        b1 = new Label("B (0)  ");
        
        r = new JSlider(FPS_MIN,FPS_MAX,FPS_INIT);
        r.addChangeListener(new EventoSlider(this));
        g = new JSlider(FPS_MIN,FPS_MAX,FPS_INIT);
        g.addChangeListener(new EventoSlider(this));
        b = new JSlider(FPS_MIN,FPS_MAX,FPS_INIT);
        b.addChangeListener(new EventoSlider(this));
        colorla = new Label();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == salir){
            System.exit(0);
        }if(ae.getSource() == aplicar){
            mensaje.setText("Hola");
        }else if(ae.getSource() == deshabi){
            aplicar.setEnabled(false);
            habi.setEnabled(true);
            deshabi.setEnabled(false);
        }else if(ae.getSource() == habi){
            aplicar.setEnabled(true);
            deshabi.setEnabled(true);
            habi.setEnabled(false);
        }else if(ae.getSource() == comsema){
            if(comsema.getSelectedIndex() == 0){
                dia.setText(" ");
            }else if(comsema.getSelectedIndex() == 1){
                dia.setText("Lunes");
            }else if(comsema.getSelectedIndex() == 2){
                dia.setText("Martes");
            }else if(comsema.getSelectedIndex() == 3){
                dia.setText("Miercoles");
            }else if(comsema.getSelectedIndex() == 4){
                dia.setText("Jueves");
            }else if(comsema.getSelectedIndex() == 5){
                dia.setText("Viernes");
            }else if(comsema.getSelectedIndex() == 6){
                dia.setText("Sabado");
            }else if(comsema.getSelectedIndex() == 7){
                dia.setText("Domingo");
            }
        }else if (ae.getSource() == prin) {
            if (prin.getSelectedIndex() == 0) {
                cardLayout.show(contenido,"Opciones");
            }else if (prin.getSelectedIndex()  == 1) {
                cardLayout.show(contenido,"Botones");
            }else if (prin.getSelectedIndex()  == 2) {
                cardLayout.show(contenido,"Dias Semana");
            }else if (prin.getSelectedIndex()  == 3) {
                cardLayout.show(contenido,"Colores");
            }
        }
    }
    
    public void organizar(){//MODIFICAR
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 1;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 1.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 1.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.insets=new Insets(4,4,0,0);
        botones.add(habi,c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        botones.add(aplicar,c);
        
        c.gridx = 2;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,4);
        botones.add(deshabi,c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 3;
        c.gridwidth = 3;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,4);
        botones.add(mensaje,c);

        /*
        LABEL: 
        MODIFICAR TAMAÑO LETRA, COLOR Y TIPO
        */
    }
    
    public void organizar1(){//MODIFICAR
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 1;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 1.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 1.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.insets=new Insets(4,4,0,0);
        color.add(r1,c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        color.add(b1,c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        color.add(g1,c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        color.add(r,c);
        
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        color.add(b,c);
        
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        color.add(g,c);
        
        c.insets=new Insets(4,4,4,4);
        c.gridx = 0;
        c.gridy = 4;
        c.gridheight = 2;
        c.gridwidth = 3;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        color.add(colorla,c);

    }
    
}
