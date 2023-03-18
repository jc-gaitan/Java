package ventana12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    double num, nu;
    JButton Borrar;
    JLabel num1, num2, resul;
    JTextField campo1, campo2;
    JTextField resultado;
    Operaciones op = new Operaciones();

    String[] opc = {"Operaciones ", "Sumar", "Restar", "Multiplicar", "Dividir"};// crea la lista de la seleccion
    JComboBox combo;// el de la seleccion
    
    Operaciones opera;

    public Ventana() {

        combo = new JComboBox(opc);// Permite seleccionar la opcion
        combo.addActionListener(this);

        Borrar = new JButton("Clear");// boton de borrar
        num1 = new JLabel("Numero 1: ");
        num2 = new JLabel("Numero 2: ");
        resul = new JLabel("Resultado");
        campo1 = new JTextField();
        campo2 = new JTextField();
        resultado = new JTextField();
        resultado.setEditable(false);//no deja modificar un TextField

        setTitle("Calculadora");
        setSize(420, 250);

        num1.setBounds(50, 50, 80, 20);
        campo1.setBounds(130, 50, 100, 20);
        num2.setBounds(50, 80, 80, 20);
        campo2.setBounds(130, 80, 100, 20);
        resul.setBounds(50, 110, 80, 20);
        Borrar.setBounds(150, 140, 80, 20);
        Borrar.addActionListener(this);
        resultado.setBounds(130, 110, 100, 20);

        combo.setBounds(50, 170, 80, 20);

        add(num1);
        add(num2);
        add(campo1);
        add(campo2);
        add(resultado);
        add(resul);
        add(Borrar);
        add(combo);

        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == Borrar) {
            campo1.setText("");
            campo2.setText("");
            resultado.setText("");
        }

        if (ae.getSource() == combo) {
            
            opera = new Operaciones();
            
            if (combo.getSelectedIndex() == 0) {
                
            } else if (combo.getSelectedIndex() == 1) {
                resultado.setText(String.valueOf(opera.Sumar(Double.parseDouble(campo1.getText()), Double.parseDouble(campo2.getText()))));
            }else if (combo.getSelectedIndex() == 2) {
                resultado.setText(String.valueOf(opera.Restar(Double.parseDouble(campo1.getText()), Double.parseDouble(campo2.getText()))));
            }else if (combo.getSelectedIndex() == 3) {
                resultado.setText(String.valueOf(opera.Multiplicar(Double.parseDouble(campo1.getText()), Double.parseDouble(campo2.getText()))));
            }else if (combo.getSelectedIndex() == 4) {
                resultado.setText(String.valueOf(opera.Dividir(Double.parseDouble(campo1.getText()), Double.parseDouble(campo2.getText()))));
            }
        }

    }
}
