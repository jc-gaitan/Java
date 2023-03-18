
package BorderLayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        setTitle("BorderLayout");
        setSize(255,116);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        
        JButton button1=new JButton("Button 1");
        add(button1,BorderLayout.NORTH);
        JButton button2=new JButton("2");
        add(button2,BorderLayout.CENTER);
        JButton button3=new JButton("Button 3");
        add(button3,BorderLayout.WEST);
        JButton button4=new JButton("Long-Named Button 4");
        add(button4,BorderLayout.SOUTH);
        JButton button5=new JButton("Button 5");
        add(button5,BorderLayout.EAST);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para cerrar la ventana con la X
        setVisible(true);
    }
}
