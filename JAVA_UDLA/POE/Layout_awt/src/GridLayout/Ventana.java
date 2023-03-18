
package GridLayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame{
    public Ventana(){
        setTitle("GridLayout");
        setSize(318, 140);
        setBackground(Color.white);
        setLocationRelativeTo(null);
        
        
        setLayout(new GridLayout(3,2));//filas,columnas
        add(new Button("Button 1"));
        Button button2=new Button("2");
        add(button2);
        Button button3=new Button("Button 3");
        add(button3);
        Button button4=new Button("Long-Named Button 4");
        add(button4);
        Button button5=new Button("Button 5");
        add(button5);
        
        addWindowListener(new Conclusion());
        setVisible(true);        
    }
    
    class Conclusion extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
        }
    }
}
