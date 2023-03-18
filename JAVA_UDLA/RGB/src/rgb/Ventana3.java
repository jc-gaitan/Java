
package rgb;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Ventana3 extends JFrame implements ActionListener{
    JPanel panelbotones, pcolor;
    JButton limpiar, boton1, boton2;
    public Ventana3(){
        this.setSize(500, 420);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLayout(null);
        setTitle("RGB- JBUTTON");
         setLocationRelativeTo(null);
         getContentPane().setBackground(Color.WHITE);
        setResizable(false);
      
         componentes();
    
    }
    private void componentes(){
        panelbotones=new JPanel();
        panelbotones.setBounds(50, 30, 300, 150);
        panelbotones.setLayout(null);
        add(panelbotones);
      
        
        
        
        boton1=new JButton("COLOR");
        boton1.setBounds(25, 20, 100, 40);
        panelbotones.add(boton1);
        boton1.addActionListener(this);
        
        
        
        
        boton2=new JButton("LIMPIAR");
        boton2.setBounds(130, 20, 100, 40);
        panelbotones.add(boton2);
         boton2.addActionListener(this);
        
        pcolor = new JPanel();
        pcolor.setBounds(50, 200, 300, 100);
        add(pcolor);
        }    

    @Override
    public void actionPerformed(ActionEvent e) {
        
         if(e.getSource() == boton1){
                  int red=(int)(Math.random()*255+1);
                  int green=(int)(Math.random()*255+1);
                  int blue=(int)(Math.random()*255+1);
                 pcolor.setBackground(new Color(red,green,blue));
               }
          if(e.getSource() == boton2){
                  
          pcolor.setBackground(null);
           }
          }
        
    }
    
    
    
