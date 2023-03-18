package proyectoFinal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Argenis Figueroa
 */
public class ventanaProyecto extends JFrame implements KeyListener, ActionListener{
    
    validar v = new validar();
    hiloTiempo t;
    
    JPanel pletras, popciones, pcronometro;
    JComboBox velocidad;
    JTextField tiempo;
    JTextArea historial, registro;
    JScrollPane scroll, scroll1;
    JButton play, reanudar, terminar, suspender;
    JLabel cronometro, letras;
    int velo = 50;
    boolean x = true;
    
    ventanaProyecto(){
        setTitle("JUEGO DE LETRAS");
        Componentes();
        setSize(900, 700);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public void Componentes(){
        pcronometro = new JPanel();
        pcronometro.setBackground(Color.PINK);
        
        tiempo = new JTextField();
        tiempo.setPreferredSize(new Dimension(200, 50));
        tiempo.setBorder(BorderFactory.createTitledBorder("Digite el tiempo del juego"));
        tiempo.addKeyListener(this);
        pcronometro.add(tiempo);  
        
        String[] opc = {"Velocidad letras", "100 milisegundo", "500 milisegundos", "1 segundo", "2 segundo"};
        velocidad = new JComboBox(opc);
        velocidad.addActionListener(this);
        pcronometro.add(velocidad);  
        
        ImageIcon iniciar = new ImageIcon(getClass().getResource("/imagenes/play.jpg"));
        play = new JButton(new ImageIcon(iniciar.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        play.addActionListener(this);
        play.setEnabled(false);
        pcronometro.add(play);
        
        ImageIcon suspen = new ImageIcon(getClass().getResource("/imagenes/pause.jpg"));
        suspender = new JButton(new ImageIcon(suspen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        suspender.setEnabled(false);
        suspender.addActionListener(this);
        pcronometro.add(suspender);
        
        ImageIcon reanu = new ImageIcon(getClass().getResource("/imagenes/volver.png"));
        reanudar = new JButton(new ImageIcon(reanu.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        reanudar.setEnabled(false);
        reanudar.addActionListener(this);
        pcronometro.add(reanudar);
        
        ImageIcon termi = new ImageIcon(getClass().getResource("/imagenes/finalizar.jpg"));
        terminar = new JButton(new ImageIcon(termi.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        terminar.setEnabled(false);
        terminar.addActionListener(this);
        pcronometro.add(terminar);
              
                
        pletras = new JPanel();
        pletras.setBackground(Color.LIGHT_GRAY);
        pletras.setBorder(BorderFactory.createTitledBorder("Recorrido de derecha a izquierda"));
        pletras.setLayout(null);        
        
        letras = new JLabel();
        letras.setBounds(5, 20, 100, 100);
        pletras.add(letras);
        
        popciones = new JPanel(new GridBagLayout());
        popciones.setBackground(Color.PINK);
        GridBagConstraints c = new GridBagConstraints();
        
        registro = new JTextArea(5, 15);
        registro.setEnabled(false);
        registro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Registro"));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(0, 5, 0, 0);
        scroll1 = new JScrollPane(registro);
        registro.setLineWrap(true);
        popciones.add(scroll1, c);
        
        historial = new JTextArea(5, 15);
        historial.setEnabled(false);
        historial.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
                Color.DARK_GRAY), "Historial"));
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        scroll = new JScrollPane(historial);
        historial.setLineWrap(true);
        popciones.add(scroll, c);
        
        cronometro = new JLabel("0 segundos");
        cronometro.setPreferredSize(new Dimension(250, 60));
        cronometro.setFont(new Font("Arial", Font.BOLD, 28));
        cronometro.setBorder(BorderFactory.createTitledBorder("Tiempo Restante"));
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        popciones.add(cronometro, c);        
                                         
        add(pcronometro, BorderLayout.NORTH);
        add(pletras, BorderLayout.CENTER);
        add(popciones, BorderLayout.SOUTH);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == velocidad){           
            if(velocidad.getSelectedIndex() == 1){
                if(x){
                    velo = 100;
                    play.setEnabled(true);
                    x = false;
                }else{
                    t.l.c = 100;
                }
            }else if(velocidad.getSelectedIndex() == 2){
                if(x){
                    velo = 500;
                    play.setEnabled(true);
                    x = false;
                }else{
                    t.l.c = 500;
                }
            }else if(velocidad.getSelectedIndex() == 3){
                if(x){
                    velo = 1000;
                    play.setEnabled(true);
                    x = false;
                }else{
                    t.l.c = 1000;
                }
            }else if(velocidad.getSelectedIndex() == 4){
                if(x){
                    velo = 2000;
                    play.setEnabled(true);
                    x = false;
                }else{
                    t.l.c = 2000;
                }
            }
        }else if (e.getSource().equals(play)){ 
            t = new hiloTiempo(Integer.parseInt(tiempo.getText()), cronometro, letras, velo, historial, registro);
            t.start();
            play.setEnabled(false);
            suspender.setEnabled(true);
            terminar.setEnabled(true);
            tiempo.setEnabled(false);
        } else if (e.getSource().equals(suspender)){
            t.suspend();
            t.l.suspend();
            suspender.setEnabled(false);
            reanudar.setEnabled(true);
            terminar.setEnabled(false);
            tiempo.setEnabled(false);
        }else if(e.getSource().equals(reanudar)){
            t.resume();
            t.l.resume();
            reanudar.setEnabled(false);
            suspender.setEnabled(true);
            terminar.setEnabled(true);
            tiempo.setEnabled(false);
        }else if(e.getSource().equals(terminar)){
            t.stop();
            t.l.stop();
            terminar.setEnabled(false);
            suspender.setEnabled(false);
            tiempo.setEnabled(true);
            letras.setBounds(5, 20, 100, 100);
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        v.validarNumero(e, tiempo);
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        v.validarVacio(tiempo, play);
    }
   
}
