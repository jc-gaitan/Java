
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Ventana extends JFrame implements ActionListener, KeyListener {

    JTabbedPane principal;
    Datos datos;
    Suscripcion suscripcion;
    SimpleDateFormat sdf;

    Validar validar;

    JTextArea Novedades;

    int p;
    int w;
    
    Emergente emergente;

    JTextArea registrados;
    //ArrayList <String> Registrados;
    
    JPanel registro;
    
    public Ventana() {
        setTitle("Registro Afiliado - TV Cable");

        Componentes();
        add(principal);

        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes() {
        p = -1;
        w = -1;
        datos = new Datos();
        suscripcion = new Suscripcion();

        Eventos();
        
        Novedades = new JTextArea(12,22);
        Novedades.setEditable(false);
        validar = new Validar(Novedades);
        emergente = new Emergente(this, true, Novedades);
        registrados = new JTextArea();
        registrados.setEditable(false);
        
        registro = new JPanel();
        registro.setLayout(new BoxLayout(registro,BoxLayout.Y_AXIS));
        JScrollPane scroll = new JScrollPane(registrados);
        registro.add(scroll);
        
        principal = new JTabbedPane();
        principal.setBackground(null);
        principal.add("Datos", datos);
        principal.add("Suscripcion", suscripcion);
        principal.add("Registro", registro);
        principal.setEnabledAt(2, false);
    }

    public void Eventos() {
        datos.getNombre().addKeyListener(this);
        datos.getApellido().addKeyListener(this);
        datos.getCodigo().addKeyListener(this);

        suscripcion.getTelevisores().addActionListener(this);
        suscripcion.getCanales().addActionListener(this);
        suscripcion.getCalcular().addActionListener(this);
        suscripcion.getRegistrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == suscripcion.getRegistrar()) {
            //System.out.println((datos.getCodigo().getText()).trim());
            Novedades.setText("");
            validar.VacioJTextField(datos.getNombre(), datos.getTitleName());
            validar.VacioJTextField(datos.getApellido(), datos.getTitleApe());
            validar.VacioJFormattedTextField(datos.getCodigo(), datos.getTitleCode());
            validar.ValidarJComboBox(suscripcion.getTelevisores(), suscripcion.getTitleTv());
            validar.ValidarJComboBox(suscripcion.getCanales(), suscripcion.getTitleCanales());
            validar.ValidarCheckBox(datos.getDrama(), datos.CheckBox);
            validar.ValidarCheckBox(datos.getTerror(), datos.CheckBox);
            validar.ValidarCheckBox(datos.getAccion(), datos.CheckBox);
            validar.ValidarCheckBox(datos.getRomantico(), datos.CheckBox);
            validar.ValidarCheckBox(datos.getInfantil(), datos.CheckBox);
            
            sdf = new SimpleDateFormat("dd");
            validar.ValidarFecha(sdf.format(suscripcion.getCalendario().getDate()));
            
            if(!Novedades.getText().equals("")){
                emergente.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "El cliente ha sido registrado");
                suscripcion.getPrecio().setText("Valor por Suscripcion: " + String.valueOf(10000 + w + p)+"     ");
                principal.setEnabledAt(2, true);
                registrados.setText("Nombre: "+datos.getNombre().getText()+"\nApellido: "+datos.getApellido().getText()+"\n"+suscripcion.getPrecio().getText()+"\n\n"+registrados.getText());
                
                datos.getNombre().setText("");
                datos.getApellido().setText("");
                datos.getCodigo().setText("");
                suscripcion.getTelevisores().setSelectedIndex(0);
                suscripcion.getCanales().setSelectedIndex(0);
                datos.getDrama().setSelected(false);
                datos.getTerror().setSelected(false);
                datos.getAccion().setSelected(false);
                datos.getRomantico().setSelected(false);
                datos.getInfantil().setSelected(false);
                suscripcion.getCalendario().setDate(suscripcion.getFechaHoy());
                suscripcion.getPrecio().setText("Valor por Suscripcion:                  ");
                p = -1;
                w = -1;                
            }
            
            repaint();
        } else if (e.getSource() == suscripcion.getTelevisores()) {

            if (suscripcion.getTelevisores().getSelectedIndex() == 1 || suscripcion.getTelevisores().getSelectedIndex() == 2) {
                w = 0;
            } else if (suscripcion.getTelevisores().getSelectedIndex() == 3) {
                w = 2000;
            } else if (suscripcion.getTelevisores().getSelectedIndex() == 4) {
                w = 4000;
            } else if (suscripcion.getTelevisores().getSelectedIndex() == 5) {
                w = 6000;
            } else if (suscripcion.getTelevisores().getSelectedIndex() == 6) {
                w = 8000;
            } else if (suscripcion.getTelevisores().getSelectedIndex() == 7) {
                w = 10000;
            } else if (suscripcion.getTelevisores().getSelectedIndex() == 8) {
                w = 12000;
            } else if (suscripcion.getTelevisores().getSelectedIndex() == 9) {
                w = 14000;
            } else if (suscripcion.getTelevisores().getSelectedIndex() == 10) {
                w = 16000;
            }
            
        } else if (e.getSource() == suscripcion.getCanales()) {
            if (suscripcion.getCanales().getSelectedIndex() == 1) {
                p = 0;
            } else if (suscripcion.getCanales().getSelectedIndex() == 2) {
                p = 5000;
            } else if (suscripcion.getCanales().getSelectedIndex() == 3) {
                p = 10000;
            }
        } else if (e.getSource() == suscripcion.getCalcular()) {
            Novedades.setText("");
            validar.ValidarJComboBox(suscripcion.getTelevisores(), suscripcion.getTitleTv());
            validar.ValidarJComboBox(suscripcion.getCanales(), suscripcion.getTitleCanales());
            repaint();
            if (p != -1 && w != -1) {
                suscripcion.getPrecio().setText("Valor por Suscripcion: " + String.valueOf(10000 + w + p)+"     ");
            } else {
                emergente.setVisible(true);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        validar.ValidarTipo(e, datos);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == datos.getApellido()) {
            validar.PrimerMayuscula(datos.getApellido());
        }

    }

}
