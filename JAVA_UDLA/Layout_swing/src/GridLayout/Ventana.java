
package GridLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        setTitle("GridLayout");
        setSize(330, 140);
        setLocationRelativeTo(null);
        
        GridLayout grid = new GridLayout(3,2);
        
        setLayout(grid);//filas,columnas
        //grid.setHgap(5);//espacio horizontal
        //grid.setVgap(5);//espacio vertical
        
        JButton button1=new JButton("Button 1");
        add(button1);
        JButton button2=new JButton("2");
        add(button2);
        JButton button3=new JButton("Button 3");
        add(button3);
        JButton button4=new JButton("Long-Named Button 4");
        add(button4);
        JButton button5=new JButton("Button 5");
        add(button5);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para cerrar la ventana con la X
        setVisible(true);
    }
}
