
package e5;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;

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
    JPanel mouse;
    
    JButton habi,deshabi,aplicar;
    JButton aplicar1;
    JButton salir;
    
    JComboBox prin;
    JComboBox comsema;
    
    Label mensaje;
    Label dia;
    Label r1,g1,b1,colorla,num,num2,num3;
    
    
    JSlider r,g,b;   
    
    String[] opciones = {"Opciones","Botones","Dias Semana","Colores","Mouse"};
    String[] opciones1 = {"Opciones","1","2","3","4","5","6","7"};
    
    CardLayout cardLayout;
    
    TitledBorder title;
    
    Label w,s;
    
    JButton b2,b3,b4;
    
    Label x,y;
    Point location = MouseInfo.getPointerInfo().getLocation();
    
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
        //conten.add(mouse);
        conten.add(contenido); 
        conten.add(principal);    
        
            
        
        
        setResizable(false); //(false)para no poder modificar el tamaño de la ventana
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paneles(){
        principal = new JPanel();
        principal.setBackground(Color.WHITE);
        principal.setLayout(new FlowLayout());
        title = BorderFactory.createTitledBorder("Principal");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        principal.setBorder(title);
        principal.add(prin);
        principal.add(s);
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
        dias_semana.add(w);
        
        color = new JPanel();
        color.setBackground(Color.WHITE);
        color.setLayout(new GridBagLayout());
        organizar1();
        
        mouse = new JPanel();
        mouse.setBackground(Color.white);
        mouse.setLayout(new BorderLayout());
        mouse.add(x,BorderLayout.SOUTH);
        mouse.add(b2,BorderLayout.NORTH);
        
        title = BorderFactory.createTitledBorder("Contenido");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cardLayout = new CardLayout();
        contenido = new JPanel();
        contenido.setBackground(Color.WHITE);        
        contenido.setBorder(title);
        contenido.setLayout(cardLayout);
        contenido.add(vacio,"Opciones");
        contenido.add(botones,"Botones");
        contenido.add(dias_semana,"Dias Semana");
        contenido.add(color,"Colores");
        contenido.add(mouse,"Mouse");
        
    }
    
    public void componentes(){
        prin = new JComboBox(opciones);
        s = new Label("                                         ");
        prin.addActionListener(this);
        
        salir = new JButton("   Salir   ");
        salir.setToolTipText("Este boton cierra la aplicacion");
        salir.addActionListener(this);
        /*//para poner una imagen a un boton
        ImageIcon h = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        salir.setIcon(h);*/
        
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
        mensaje.setAlignment(Label.CENTER);//para centrar el texto
        mensaje.setFont(new Font(mensaje.getText(),Font.BOLD,16));
        
        comsema = new JComboBox(opciones1);
        comsema.addActionListener(this);
        dia = new Label();
        dia.setAlignment(Label.CENTER);
        dia.setFont(new Font(dia.getText(),Font.BOLD,16));//cambiar el tipo de letra, estilo y tamaño
                                           //letra negrita
        w=new Label();
        
        r1 = new Label("R (0)  ");
        g1 = new Label("G (0)  ");
        b1 = new Label("B (0)  ");
        
        r = new JSlider(JSlider.HORIZONTAL,0,250,0);
        r.setBackground(Color.white);
        r.addChangeListener(new EventoSlider(this));
        g = new JSlider(FPS_MIN,FPS_MAX,FPS_INIT);
        g.setBackground(Color.white);
        g.addChangeListener(new EventoSlider(this));
        b = new JSlider(FPS_MIN,FPS_MAX,FPS_INIT);
        b.setBackground(Color.white);
        b.addChangeListener(new EventoSlider(this));
        colorla = new Label();
        
        //ImageIcon h = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton2.png")).getImage());
        b2 = new JButton("Button 1");
        //b2.setIcon(h);
        //b2.setBorder(null);
        //b2.setBorderPainted(false);
        //b2.setContentAreaFilled(false);
        b2.addMouseListener(new EventoMouse(this));
        /*b3 = new JButton("Button 2");
        b4 = new JButton("Button 3");*/
        x = new Label("Coordenadas del raton");
        x.setFont(new Font(x.getText(),Font.BOLD,12));
        addEventos();//para mostrar la pocision en X del mouse
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == salir){
            System.exit(0);
        }if(ae.getSource() == aplicar){
            mensaje.setText("Hola");
        }else if(ae.getSource() == deshabi){
            aplicar.setEnabled(false);//deshabilitar el boton
            habi.setEnabled(true);//habilitar el boton
            deshabi.setEnabled(false);
            mensaje.setText(" ");
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
            }else if(prin.getSelectedIndex()  == 4){
                cardLayout.show(contenido,"Mouse");
            }
        }
    }
    
    public void organizar(){
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
    }
    
    public void organizar1(){
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
        
    public void addEventos() {
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evento) {
                x.setText(String.format("Sus coordenadas son [%d, %d]",evento.getX(), evento.getY()));
                //getX y getY devuelve valores de las coordenadas del puntero.
                x.setFont(new Font(x.getText(),Font.BOLD,12));
            }
        });
    }
}
