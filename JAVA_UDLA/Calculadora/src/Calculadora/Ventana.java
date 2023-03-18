
package Calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    
    JPanel numeros;
    JButton tnumeros[];
    JButton punto;
    
    JPanel operaciones;
    JButton multi, divi,suma,resta;
    
    JTextArea campo;
    
    JPanel opciones;
    JButton decimal, fraccion, porcentaje, raiz;
    
    JPanel op;
    JButton igual, borrar, BorrarTodo;
    
    public Ventana(){
        Componentes();
        
        setTitle("Calculadora");
        setSize(254, 228);
        
        //setLayout(new BorderLayout());
        setLayout(new GridBagLayout());
        OrganizarVentana();
        
        /*
        add(campo,BorderLayout.NORTH);
        add(numeros,BorderLayout.CENTER);
        add(operaciones, BorderLayout.EAST);
        add(opciones, BorderLayout.WEST);
        add(op, BorderLayout.SOUTH);*/
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }
    
    public void Componentes(){
        tnumeros = new JButton[10];//arreglo de botones
        for(int i = 0; i < tnumeros.length; i++){
            tnumeros[i] = new JButton(String.valueOf(i));
            //String.valueOf(i) === convierte enteros a string
        }
        
        punto = new JButton(".");
        
        numeros = new JPanel();
        //numeros.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        numeros.setLayout(new GridBagLayout());
        OrganizarNumeros();
        
        campo = new JTextArea();
        campo.setRows(2);
        campo.setEditable(false);
        campo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        multi = new JButton("×");
        divi = new JButton("÷");
        suma = new JButton("+");
        resta = new JButton("-");
        
        operaciones = new JPanel();
        //operaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        operaciones.setLayout(new GridBagLayout());
        OrganizarOperaciones();
        
        decimal = new JButton("Dec");
        fraccion = new JButton("1/x");
        porcentaje = new JButton("%");
        raiz = new JButton("√");   
        
        opciones = new JPanel();
        opciones.setLayout(new GridBagLayout());
        OrganizarOpciones();
        
        igual = new JButton("=");
        borrar = new JButton("DEL");
        BorrarTodo = new JButton("AC");
        
        op = new JPanel();
        op.setLayout(new GridBagLayout());
        //op.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        OrganizarOp();
    }
    
    private void OrganizarNumeros() {
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
        numeros.add(tnumeros[7], c);
        
        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 0, 0);
        numeros.add(tnumeros[8], c);
        
        c.gridx = 6;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 0, 0, 4);
        numeros.add(tnumeros[9], c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 4, 0, 0);
        numeros.add(tnumeros[4], c);
        
        c.gridx = 3;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        numeros.add(tnumeros[5], c);
        
        c.gridx = 6;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 4);
        numeros.add(tnumeros[6], c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 4, 0, 0);
        numeros.add(tnumeros[1], c);
        
        c.gridx = 3;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        numeros.add(tnumeros[2], c);
        
        c.gridx = 6;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 4);
        numeros.add(tnumeros[3], c);
        
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 6;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 4, 0, 0);
        numeros.add(tnumeros[0], c);
        
        c.gridx = 6;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 4);
        numeros.add(punto, c);
    }

    private void OrganizarOperaciones() {
        GridBagConstraints c = new GridBagConstraints();
        
        //Insets (int superior, int izquierda, int abajo, int derecha)
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(9, 4, 0, 4);
        operaciones.add(suma, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(1, 4, 0, 4);
        operaciones.add(resta, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(1, 4, 0, 4);
        operaciones.add(multi, c);
        
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(1, 4, 4, 4);
        operaciones.add(divi, c);
    }

    private void OrganizarOpciones() {
        GridBagConstraints c = new GridBagConstraints();
        
        //Insets (int superior, int izquierda, int abajo, int derecha)
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(9, 4, 0, 4);
        opciones.add(decimal, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(1, 4, 0, 4);
        opciones.add(porcentaje, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(1, 4, 0, 4);
        opciones.add(raiz, c);
        
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(1, 4, 4, 4);
        opciones.add(fraccion, c);
    }

    private void OrganizarOp() {
        GridBagConstraints c = new GridBagConstraints();
        
        //Insets (int superior, int izquierda, int abajo, int derecha)
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 4, 0);
        op.add(igual, c);
        
        c.gridx = 4;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 1, 4, 0);
        op.add(borrar, c);
        
        c.gridx = 8;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 1, 4, 4);
        op.add(BorrarTodo, c);
    }

    private void OrganizarVentana() {
        GridBagConstraints c = new GridBagConstraints();
        
        //Insets (int superior, int izquierda, int abajo, int derecha)
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 3;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 4);
        add(campo, c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 4;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 4, 0, 0);
        add(opciones, c);
        
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 2;
        c.gridheight = 4;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        add(numeros, c);
        
        c.gridx = 3;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 4;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 4);
        add(operaciones, c);
        
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 4;
        c.gridheight = 2;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 4, 4, 4);
        add(op, c);
    }
    
}
