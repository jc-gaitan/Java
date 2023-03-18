package EjercicioAWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ventana extends Frame implements ActionListener {

    Button calcular;
    Label num1, num2;
    TextField campo1, campo2;
    TextField resultado;
    
    public Ventana() {
        calcular = new Button("calcular");
        calcular.setForeground(Color.GREEN);
        
        num1 = new Label("Sumando 1: ");
        num1.setFont(new Font("Monospaced", Font.BOLD, 12));
        num1.setForeground(Color.magenta);//Cambiar el color de la letras
        
        num2 = new Label("Sumando 2: ");
        num2.setFont(new Font("Calibri", Font.PLAIN, 12));//cambiar tipo y tamaño de letra
        num2.setForeground(Color.cyan);
        
        campo1 = new TextField();
        campo2 = new TextField();
        resultado = new TextField();
        resultado.setEditable(false);//no deja modificar un TextField

        setTitle("Sumar");
        setSize(420, 135);
        this.setBackground(Color.PINK);//cambiar el color de la ventana
        
        num1.setBounds(50, 50, 80, 20);
        campo1.setBounds(130, 50, 100, 20);
        num2.setBounds(50, 80, 80, 20);
        campo2.setBounds(130, 80, 100, 20);
        
        calcular.setBounds(250, 50, 100, 20);
        calcular.addActionListener(this);//Evento de los botones
        resultado.setBounds(250, 80, 100, 20);
        
        add(calcular);
        add(num1);
        add(num2);
        add(campo1);
        add(campo2);
        add(resultado);
        
        setLayout(null);

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        this.addWindowListener(l);

        this.setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==calcular){
            double num1, num2;
            num1 = Double.parseDouble(campo1.getText());
            num2 = Double.parseDouble(campo2.getText());
            resultado.setText(String.valueOf(num1+num2));
        }
    }

}
