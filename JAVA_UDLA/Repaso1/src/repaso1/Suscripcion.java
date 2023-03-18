
package repaso1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame; //
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Suscripcion extends JFrame implements ActionListener{
    
    Ventana ventana;
    int p;
    int w;
    Validar validar;
    JTextArea Novedades;
    Novedad novedad;
    
    private JComboBox televisores;
    private JComboBox canales;
    
    private String op[] = {"Opciones","1","2","3","4","5","6","7","8","9","10"};
    private String opCan[] = {"Opciones","1-20","21-50","51-100"};
    
    private Border borde;
    private TitledBorder titleTv;
    private TitledBorder titleCanales;
    
    private JButton calcular;
    private JButton registrar;
    
    private JLabel Precio;
    
    public Suscripcion(){
        
        setTitle("Suscripcion");
        
        Componentes();
        setLayout(new GridBagLayout());
        Organizar();
        
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
    }
    
    public void Componentes(){
        borde = BorderFactory.createLineBorder(Color.BLACK);

        p = -1;
        w = -1;
        
        
        Novedades = new JTextArea(12,22);
        Novedades.setEditable(false);
        validar = new Validar(Novedades);
        novedad = new Novedad(this, true, Novedades);

        televisores = new JComboBox(op);
        televisores.addActionListener(this);
        titleTv = new TitledBorder(borde, "Cantidad de TV:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        televisores.setBorder(titleTv);

        canales = new JComboBox(opCan);
        canales.addActionListener(this);
        titleCanales = new TitledBorder(borde, "Cantidad de canales:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        canales.setBorder(titleCanales);
        
        calcular = new JButton("PRECIO DE SUSCRIPCION");
        calcular.addActionListener(this);
        registrar = new JButton("REGISTRAR CLIENTE");
        registrar.addActionListener(this);
        
        Precio = new JLabel("Valor por Suscripcion:                  ");
    }
    
    
    public void Organizar(){
        GridBagConstraints c = new GridBagConstraints();

        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 5;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4, 4, 0, 0);
        add(televisores, c);

        c.gridx = 5;
        c.gridy = 0;
        c.gridwidth = 5;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(canales, c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 5;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(calcular, c);
        
        c.gridx = 5;
        c.gridy = 3;
        c.gridwidth = 5;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(Precio, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 10;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(registrar, c);
    }

    public JComboBox getTelevisores() {
        return televisores;
    }

    public void setTelevisores(JComboBox televisores) {
        this.televisores = televisores;
    }

    public JComboBox getCanales() {
        return canales;
    }

    public void setCanales(JComboBox canales) {
        this.canales = canales;
    }

    public String[] getOp() {
        return op;
    }

    public void setOp(String[] op) {
        this.op = op;
    }

    public String[] getOpCan() {
        return opCan;
    }

    public void setOpCan(String[] opCan) {
        this.opCan = opCan;
    }

    public Border getBorde() {
        return borde;
    }

    public void setBorde(Border borde) {
        this.borde = borde;
    }

    public TitledBorder getTitleTv() {
        return titleTv;
    }

    public void setTitleTv(TitledBorder titleTv) {
        this.titleTv = titleTv;
    }

    public TitledBorder getTitleCanales() {
        return titleCanales;
    }

    public void setTitleCanales(TitledBorder titleCanales) {
        this.titleCanales = titleCanales;
    }

    public JLabel getPrecio() {
        return Precio;
    }

    public void setPrecio(JLabel Precio) {
        this.Precio = Precio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           
        if (e.getSource() == getTelevisores()) {
            
            if (getTelevisores().getSelectedIndex() == 1 || getTelevisores().getSelectedIndex() == 2) {
                w = 0;
            } else if (getTelevisores().getSelectedIndex() == 3) {
                w = 2000;
            } else if (getTelevisores().getSelectedIndex() == 4) {
                w = 4000;
            } else if (getTelevisores().getSelectedIndex() == 5) {
                w = 6000;
            } else if (getTelevisores().getSelectedIndex() == 6) {
                w = 8000;
            } else if (getTelevisores().getSelectedIndex() == 7) {
                w = 10000;
            } else if (getTelevisores().getSelectedIndex() == 8) {
                w = 12000;
            } else if (getTelevisores().getSelectedIndex() == 9) {
                w = 14000;
            } else if (getTelevisores().getSelectedIndex() == 10) {
                w = 16000;
            }
            
        } else if (e.getSource() == getCanales()) {
            if (getCanales().getSelectedIndex() == 1) {
                p = 0;
            } else if (getCanales().getSelectedIndex() == 2) {
                p = 5000;
            } else if (getCanales().getSelectedIndex() == 3) {
                p = 10000;
            }
        } else if (e.getSource() == calcular) {
            Novedades.setText("");
            validar.ValidarJComboBox(getTelevisores(), getTitleTv());
            validar.ValidarJComboBox(getCanales(), getTitleCanales());
            repaint();
            if (p != -1 && w != -1) {
                getPrecio().setText("Valor por Suscripcion: " + String.valueOf(10000 + w + p)+"     ");
            } else {
                novedad.setVisible(true);
            }
        }
          
    }
}
    
    

