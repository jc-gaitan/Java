
package FlowLayout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        setTitle("FlowLayout");
        setSize(500,75);
        setLocationRelativeTo(null);
        
        JButton button1=new JButton("Button 1");
        JButton button2=new JButton("2");
        JButton button3=new JButton("Button 3");
        JButton button4=new JButton("Long-Named Button 4");
        JButton button5=new JButton("Button 5");

        setLayout(new FlowLayout());
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para cerrar la ventana con la X
        setVisible(true);
    }
}
