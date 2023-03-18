package BoxLayout;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Ventana extends JFrame {
    
    //JPanel a;
    
    public Ventana (){        
       setTitle("BoxLayout");
       setSize(220,170);
       setBackground(Color.white);
       setLocationRelativeTo(null);
       //a=new JPanel();
       //setContentPane(a);//para aÃ±adir el panel a la ventana
       //a.setLayout(new BoxLayout(a,BoxLayout.Y_AXIS));
       setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
       JButton button1=new JButton("Button 1");
       JButton button2=new JButton("2");
       JButton button3=new JButton("Button 3");
       JButton button4=new JButton("Long-Named Button 4");
       JButton button5=new JButton("Button 5");
       
       
       button1.setAlignmentX(CENTER_ALIGNMENT);
       button2.setAlignmentX(CENTER_ALIGNMENT);
       button3.setAlignmentX(CENTER_ALIGNMENT);
       button4.setAlignmentX(CENTER_ALIGNMENT);
       button5.setAlignmentX(CENTER_ALIGNMENT);
       
       add(button1);
       add(button2);
       add(button3);
       add(button4);
       add(button5);

        setDefaultCloseOperation(EXIT_ON_CLOSE);//para cerrar la ventana con la X
        this.setVisible(true);
    }
    
}
