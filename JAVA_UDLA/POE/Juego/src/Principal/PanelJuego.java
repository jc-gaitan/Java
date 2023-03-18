package Principal;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelJuego extends JPanel{

    Font font;
    JLabel Title;
    JLabel a;
    ImageIcon ImagenTitle, ImagenA;
    
    JLabel roca, papel, tigeras, lagartija, spock;
    JLabel elige;
    JLabel opcion;
    
    JLabel ud, op, vs;
    JLabel esperar, mensaje;
    
    Color rgb;

    JPanel contenido,inicio,buscar;
    CardLayout cardLayout;
    
    HiloIcono hilo;
    
    public PanelJuego() {
        Componentes();
        rgb = new Color(0, 175, 196);
        setBackground(rgb);
        
        setLayout(new GridBagLayout());
        Organizar();
        //add(titulo);
    }
    
    public void Componentes(){
        ImagenTitle = new ImageIcon(getClass().getResource("/Imagenes/Titulo.png"));
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/empiece.png"));

        Title = new JLabel(ImagenTitle);
        a = new JLabel(ImagenA);
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/diamante.png")); 
        roca = new JLabel(ImagenA);
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/avion.png")); 
        papel = new JLabel(ImagenA);
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/tigeras.png")); 
        tigeras = new JLabel(ImagenA);
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/lagartija.png")); 
        lagartija = new JLabel(ImagenA);
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/spock.png")); 
        spock = new JLabel(ImagenA);
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/EligeOpcion.png")); 
        elige = new JLabel(ImagenA);
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/opcion.png")); 
        opcion = new JLabel(ImagenA);
        
        ud = new JLabel();
        op = new JLabel();
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/VS.png")); 
        vs = new JLabel(ImagenA);
        
        ImagenA = new ImageIcon(getClass().getResource("/Imagenes/esperando.png"));
        esperar = new JLabel(ImagenA);
        mensaje = new JLabel("",SwingConstants.CENTER);
        
        buscar = new JPanel();
        buscar.setLayout(new GridBagLayout());
        buscar.setBackground(rgb);
        OrganizarBuscar();
        
        inicio = new JPanel();
        inicio.setLayout(new GridBagLayout());
        inicio.setBackground(rgb);
        OrganizarInicio();

        cardLayout = new CardLayout();
        contenido = new JPanel();
        contenido.setBackground(rgb);
        contenido.setLayout(cardLayout);
        contenido.add(inicio,"inicio");
        contenido.add(buscar,"buscar");
        
        hilo = new HiloIcono(op);
    }
    
    public void OrganizarBuscar(){
        GridBagConstraints c = new GridBagConstraints(); 
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 7;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 4, 4, 4);
        buscar.add(esperar, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 10, 4, 4);
        buscar.add(ud,c);
        
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        buscar.add(vs, c);
        
        c.gridx = 4;
        c.gridy = 1;
        c.gridwidth = 3;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        buscar.add(op, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 7;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        buscar.add(mensaje, c);
    }
    
    public void OrganizarInicio(){
        GridBagConstraints c = new GridBagConstraints(); 
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 10, 4, 4);
        inicio.add(roca, c);
        
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        inicio.add(papel, c);
        
        c.gridx = 2;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        inicio.add(tigeras, c);
        
        c.gridx = 3;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        inicio.add(lagartija, c); 
        
        c.gridx = 4;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        inicio.add(spock, c);  
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(20, 4, 20, 4);
        inicio.add(a, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 10;
        c.gridheight = 4;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        inicio.add(elige, c);
    }
    
    public void Organizar(){
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 10;
        c.gridheight = 4;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(20, 4, 4, 4);
        add(contenido, c);
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;//cuantas columnas va a ocupar
        c.gridheight = 4;//cuantas filas va a ocupar
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(20, 4, 4, 4);
        add(Title, c);
        
        /*c.gridx = 3;
        c.gridy = 8;
        c.gridwidth = 5;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(opcion, c);*/
    }

}
