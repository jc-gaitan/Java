package BorderLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame {

    public Ventana() {
        setTitle("BorderLayout");
        setSize(255, 116);
        setLocationRelativeTo(null);
        setBackground(Color.white);

        setLayout(new BorderLayout());
        Button button1=new Button("Button 1");
        add(button1,BorderLayout.NORTH);
        Button button2=new Button("2");
        add(button2,BorderLayout.CENTER);
        Button button3=new Button("Button 3");
        add(button3,BorderLayout.WEST);
        Button button4=new Button("Long-Named Button 4");
        add(button4,BorderLayout.SOUTH);
        Button button5=new Button("Button 5");
        add(button5,BorderLayout.EAST);
        
        addWindowListener(new Conclusion());
        setVisible(true);
    }

    class Conclusion extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
        }
    }
    
}
