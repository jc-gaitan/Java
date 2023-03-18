
package e3;


import java.awt.*;
import java.util.*;
import java.awt.event.*;

class Ventana extends Frame{
    
    public Ventana() {
        setTitle("Ventana");//titulo de la ventana
        setSize(500,500);//tamaño de la ventana
        setBackground(Color.red);//color de la ventana
        setLocationRelativeTo(null);//posicion de la ventana
        Label a=new Label("Hola");//crear texto
        add(a);//para agregar el texto
        setResizable(false); //(false)para no poder modificar el tamaño de la ventana
        //pack();//poner el tamaño adecuado de la ventana, de lo que tiene po dentro
        
        setVisible(true);//visibilidad de la ventana----siempre poner al final del contructor
        
        }
    }
