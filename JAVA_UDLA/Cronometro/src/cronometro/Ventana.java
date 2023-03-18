package cronometro;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener {

    JPanel num;
    JLabel numeros;
    JComboBox segundos;
    String opciones[] = {"SEGUNDOS","0.5","1", "2", "4", "10"};
    JButton play, reiniciar;
    Font font;
    boolean x;

    Proceso hilo;
    
    int w = 0;
    
    public Ventana() {
        setTitle("Cronometro");
        Componentes();
        setLayout(new GridBagLayout());
        organizar();
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes() {
        play = new JButton("PLAY   ");
        play.setEnabled(false);
        play.addActionListener(this);
        
        reiniciar = new JButton("REINICIAR");
        reiniciar.setEnabled(false);
        reiniciar.addActionListener(this);

        font = new Font("Times New Roman", Font.BOLD, 50);
        numeros = new JLabel("0");
        numeros.setFont(font);
        numeros.setForeground(Color.DARK_GRAY);//cambiar el color de la letra
        numeros.setAlignmentX(CENTER_ALIGNMENT);//centra el componente

        ImageIcon photoplay = new ImageIcon(getClass().getResource("/Imagen/play.png"));
        ImageIcon ima1 = new ImageIcon(photoplay.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
        play.setIcon(ima1);
        

        ImageIcon photorein = new ImageIcon(getClass().getResource("/Imagen/reiniciar.png"));
        ImageIcon ima2 = new ImageIcon(photorein.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
        reiniciar.setIcon(ima2);

        segundos = new JComboBox(opciones);
        segundos.addActionListener(this);
        //segundos.setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Velocidad", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));

        num = new JPanel();
        num.setLayout(new BoxLayout(num, BoxLayout.Y_AXIS));
        num.add(numeros);
        
        x = true;
        
    }

    public void organizar() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 7;
        c.gridheight = 5;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(4, 4, 4, 4);
        add(num, c);

        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(segundos, c);

        c.gridx = 2;
        c.gridy = 7;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(play, c);

        c.gridx = 3;
        c.gridy = 7;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 4, 4, 4);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(reiniciar, c);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == play && x) {
            if(w == 0){
                hilo.start();
                w++;
            }else{
                hilo.resume();
            }
            
            reiniciar.setEnabled(true);
            ImageIcon photopause = new ImageIcon(getClass().getResource("/Imagen/pause.png"));
            ImageIcon ima = new ImageIcon(photopause.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
            play.setIcon(ima);
            play.setText("PAUSE");
            x = false;
        } else if (ae.getSource() == play) {
            hilo.suspend();
            
            reiniciar.setEnabled(true);
            ImageIcon photoplay = new ImageIcon(getClass().getResource("/Imagen/play.png"));
            ImageIcon ima1 = new ImageIcon(photoplay.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
            play.setIcon(ima1);
            play.setText("PLAY   ");
            x = true;
        }else if(ae.getSource() == reiniciar){
            hilo.stop();
            
            numeros.setText("0");
            ImageIcon photoplay = new ImageIcon(getClass().getResource("/Imagen/play.png"));
            ImageIcon ima1 = new ImageIcon(photoplay.getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
            play.setIcon(ima1);
            play.setText("PLAY   ");
            reiniciar.setEnabled(false);
            segundos.setEnabled(true);
            play.setEnabled(false);
            segundos.setSelectedIndex(0);
            w = 0;
            x = true;
        }
        else if(ae.getSource() == segundos){
            long velocidad = 0;
            if(segundos.getSelectedIndex() == 1){
                velocidad = 500;
                play.setEnabled(true);
                segundos.setEnabled(false);
            }else if(segundos.getSelectedIndex() == 2){
                velocidad = 1000;
                play.setEnabled(true);
                segundos.setEnabled(false);
            }else if(segundos.getSelectedIndex() == 3){
                velocidad = 2000;
                play.setEnabled(true);
                segundos.setEnabled(false);
            }else if(segundos.getSelectedIndex() == 4){
                velocidad = 4000;
                play.setEnabled(true);
                segundos.setEnabled(false);
            }else if(segundos.getSelectedIndex() == 5){
                velocidad = 10000;
                play.setEnabled(true);
                segundos.setEnabled(false);
            }
            hilo = new Proceso(velocidad, numeros);
        }

    }

}
