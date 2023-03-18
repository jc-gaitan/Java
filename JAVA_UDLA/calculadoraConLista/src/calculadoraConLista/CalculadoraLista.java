
package ventana13;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class CalculadoraLista extends JFrame implements ActionListener{
    
    double num, nu;
    JButton Borrar;
    JLabel num1, num2, resul;
    JTextField campo1, campo2;
    JTextField resultado;
    Operaciones op = new Operaciones();

    JList listaNombres;
    String[] opc = {"Sumar", "Restar", "Multiplicar", "Dividir"};// crea la lista 
   
    public CalculadoraLista() {
        
        listaNombres = new JList(opc);
        
        
        Borrar = new JButton("Clear");// boton de borrar
        num1 = new JLabel("Numero 1: ");
        num2 = new JLabel("Numero 2: ");
        resul = new JLabel("Resultado: ");
        campo1 = new JTextField();
        campo1.setColumns(8);
        campo2 = new JTextField();
        campo2.setColumns(8);
        resultado = new JTextField();
        resultado.setEditable(false);//no deja modificar un TextField

        setTitle("Calculadora");
        
        setLayout(new GridBagLayout());
        Organizar();
        
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }
    
    private void Organizar() {
        GridBagConstraints c = new GridBagConstraints();
        
        //Insets (int superior, int izquierda, int abajo, int derecha)
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(num1,c);
        
        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 5;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(campo1,c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(num2,c);
        
        c.gridx = 3;
        c.gridy = 2;
        c.gridwidth = 5;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 4);
        add(campo2,c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 5;
        c.gridheight = 5;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 0);
        add(listaNombres,c);
        
        c.gridx = 0;
        c.gridy = 9;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 6, 0);
        add(resul,c);
        
        c.gridx = 3;
        c.gridy = 9;
        c.gridwidth = 5;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 6, 4);
        add(resultado,c);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     
        if (ae.getSource() == Borrar) {
            campo1.setText("");
            campo2.setText("");
            resultado.setText("");
        }

    }
    
}
