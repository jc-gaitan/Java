
package Principal;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Estadistica extends JDialog implements ActionListener{
    
    JLabel a,b;
    
    String[] programas = {"Programas", "Ingenieria Sistemas", "Medicina Veterinaria", "Derecho", "Quimica", "Contaduria Publica"};
    JComboBox programa;
    
    String [] dias = {"Opciones","1","2","3","4","5","6","7","8","9","10"};
    
    JComboBox dia;

    Container conten;
    
    JLabel excelencia,permanencia,can1,can2;
    JLabel cosExce,cosPer,cos1,cos2;
    
    int di;
    String k;
    
    JButton salir;
    
    Ventana padre;
    
    int ex = 0;
    int per = 0;
    
    public Estadistica(Ventana padre, boolean modal){
        super(padre,modal);
        this.padre = padre;
        setTitle("Estadistica");
        //setLocationRelativeTo(null);
        
        Componentes();         
        conten = getContentPane();
        conten.setLayout(new GridBagLayout());
        organizar();
        
        

        pack();     
    }

    public void Componentes(){
        a = new JLabel("Facultad: ");        
        programa = new JComboBox(programas);
        programa.addActionListener(this);
        dia = new JComboBox(dias);
        dia.addActionListener(this);
        b = new JLabel("Dias: "); 
        excelencia = new JLabel("º Excelencia: ");
        permanencia = new JLabel("º Permanencia: ");
        can1 = new JLabel("");
        can2 = new JLabel("");
        
        cosExce = new JLabel("Dinero a entregar: ");
        cosPer = new JLabel("Dinero a entregar: ");
        cos1 = new JLabel("");
        cos2 = new JLabel("");
        
        salir = new JButton("Salir");
        salir.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == dia){
            switch (dia.getSelectedIndex()) {
                case 0:
                    di = -1;
                    can1.setText(" ");
                    can2.setText(" ");
                    cos1.setText(" ");
                    cos2.setText(" ");
                    break;
                case 1:
                    di = 1;
                    break;
                case 2:
                    di = 2;
                    break;
                case 3:
                    di = 3;
                    break;
                case 4:
                    di = 4;
                    break;
                case 5:
                    di = 5;
                    break;
                case 6:
                    di = 6;
                    break;
                case 7:
                    di = 7;
                    break;
                case 8:
                    di = 8;
                    break;
                case 9:
                    di = 9;
                    break;
                case 10:
                    di = 10;
                    break;
                default:
                    break;
            }
            
            Buscar();
            can1.setText(String.valueOf(ex));
            can2.setText(String.valueOf(per));
            cos1.setText(String.valueOf((ex)*600000));
            cos2.setText(String.valueOf((per)*400000));
            /*dia.setSelectedItem("Opciones");
            programa.setSelectedItem("Programas");*/
            
        }else if (e.getSource() == programa) {
            if(programa.getSelectedIndex() == 0){
                k = "Programas";
                Buscar2();
                can1.setText(String.valueOf(ex));
                can2.setText(String.valueOf(per));
                cos1.setText(String.valueOf((ex)*600000));
                cos2.setText(String.valueOf((per)*400000));
            }else if (programa.getSelectedIndex() == 1) {
                k = "Ingenieria de Sistemas";
                Buscar();
                can1.setText(String.valueOf(ex));
                can2.setText(String.valueOf(per));
                cos1.setText(String.valueOf((ex)*600000));
                cos2.setText(String.valueOf((per)*400000));
            } else if (programa.getSelectedIndex() == 2) {
                k = "Medicina Veterinaria";
                Buscar();
                can1.setText(String.valueOf(ex));
                can2.setText(String.valueOf(per));
                cos1.setText(String.valueOf((ex)*600000));
                cos2.setText(String.valueOf((per)*400000));
            } else if (programa.getSelectedIndex() == 3) {
                k = "Derecho";
                Buscar();
                can1.setText(String.valueOf(ex));
                can2.setText(String.valueOf(per));
                cos1.setText(String.valueOf((ex)*600000));
                cos2.setText(String.valueOf((per)*400000));
            } else if (programa.getSelectedIndex() == 4) {
                k = "Quimica";
                Buscar();
                can1.setText(String.valueOf(ex));
                can2.setText(String.valueOf(per));
                cos1.setText(String.valueOf((ex)*600000));
                cos2.setText(String.valueOf((per)*400000));
            } else if (programa.getSelectedIndex() == 5) {
                k = "Contaduria Publica";
                Buscar();
                can1.setText(String.valueOf(ex));
                can2.setText(String.valueOf(per));
                cos1.setText(String.valueOf((ex)*600000));
                cos2.setText(String.valueOf((per)*400000));
            }
            
        }else if(e.getSource() == salir){
            setVisible(false);
        }
        
        
    }

    public void Buscar(){
        ex = 0;
        per = 0;
        for(int i=0;i<padre.in.listaEx.size();i++){
            Estudiante a = padre.in.listaEx.get(i);
            if(a.fechaEntrega == di && a.programa == k){
                ex++;
            }
        }
        
        for(int i=0;i<padre.in.listaPer.size();i++){
            Estudiante a = padre.in.listaPer.get(i);
            if(a.fechaEntrega == di && a.programa == k){
                per++;
            }
        }
    }
    
    public void Buscar2(){
        ex = 0;
        per = 0;
        for(int i=0;i<padre.in.listaEx.size();i++){
            Estudiante a = padre.in.listaEx.get(i);
            if(a.fechaEntrega == di){
                ex++;
            }
        }
        
        for(int i=0;i<padre.in.listaPer.size();i++){
            Estudiante a = padre.in.listaPer.get(i);
            if(a.fechaEntrega == di){
                per++;
            }
        }
    }
    
    public void organizar(){
        GridBagConstraints c = new GridBagConstraints();
        //Insets margen = new Insets(15, 15, 15, 15);
        c.gridx = 0;//indicamos la posicion de nuestro componente en el eje x (columnas)
        c.gridy = 0;//indicamos la posicion de nuestro componente en el eje y (filas)
        c.gridwidth = 1;//cuantas columnas va a ocupar
        c.gridheight = 1;//cuantas filas va a ocupar
        c.weightx = 1.0;//(0.0 no aumenta cuando la ventana aumenta)
        c.weighty = 1.0;//(1.0 aumenta en la misma relacion que aumenta la ventana)
        c.fill = GridBagConstraints.BOTH;//aumenta la celda en la que se encuentra(filas o columnas)
        c.insets=new Insets(4,4,0,4);
        conten.add(a,c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 2;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets=new Insets(4,0,0,0);
        c.fill = GridBagConstraints.BOTH;
        conten.add(programa,c);
        
        c.insets=new Insets(4,8,0,4);
        c.gridx = 3;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        conten.add(b,c);
        
        c.insets=new Insets(4,0,0,4);
        c.gridx = 4;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        conten.add(dia,c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,0);
        conten.add(excelencia,c);
        
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,0);
        conten.add(can1,c);
        
        c.gridx = 2;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,0);
        conten.add(cosExce,c);
        
        c.gridx = 3;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,0,0,0);
        conten.add(cos1,c);
        
        c.insets=new Insets(4,4,0,0);
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        conten.add(permanencia,c);
        
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,0);
        conten.add(can2,c);
        
        c.gridx = 2;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,4,0,0);
        conten.add(cosPer,c);
        
        c.gridx = 3;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(4,0,0,0);
        conten.add(cos2,c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridheight = 1;
        c.gridwidth = 5;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        c.insets=new Insets(8,4,4,4);
        conten.add(salir,c);
    }
    
}
