package FlowLayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame {

    public Ventana() {
        setTitle("FlowLayout");
        setSize(400, 75);
        setBackground(Color.white);
        setLocationRelativeTo(null);
        
        setLayout(new FlowLayout());
        Button button1=new Button("Button 1");
        add(button1);
        Button button2=new Button("2");
        add(button2);
        Button button3=new Button("Button 3");
        add(button3);
        Button button4=new Button("Long-Named Button 4");
        add(button4);
        Button button5=new Button("Button 5");
        add(button5);
        
        /*add(button2,FlowLayout.LEFT);
        add(button1,FlowLayout.LEFT);
        add(button5, FlowLayout.RIGHT);
        add(button4, FlowLayout.RIGHT);
        add(button3, FlowLayout.RIGHT);*/
        
        addWindowListener(new Conclusion());
        setVisible(true); 
    }

    class Conclusion extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
        }
    }
}
