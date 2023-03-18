
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class Suscripcion extends JPanel{
    
    private JComboBox televisores;
    private JComboBox canales;
    
    private String op[] = {"Opciones","1","2","3","4","5","6","7","8","9","10"};
    private String opCan[] = {"Opciones","1-20","21-50","51-100"};
    
    private JLabel fechaIni;
    
    private Border borde;
    private TitledBorder titleTv;
    private TitledBorder titleCanales;
    
    private JButton calcular;
    private JButton registrar;
    
    private Date FechaHoy;
    private JDateChooser Calendario;
    
    private JLabel Precio;
    
    public Suscripcion(){
        Componentes();
        
        /*setLayout(new GridLayout(6,0,0,4));
        add(televisores);
        add(canales);
        add(fechaIni);
        add(Calendario);
        add(calcular);
        add(registrar);*/
        setLayout(new GridBagLayout());
        Organizar();
    }
    
    public void Componentes(){
        borde = BorderFactory.createLineBorder(Color.BLACK);

        televisores = new JComboBox(op);
        titleTv = new TitledBorder(borde, "Cantidad de TV:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        televisores.setBorder(titleTv);

        canales = new JComboBox(opCan);
        titleCanales = new TitledBorder(borde, "Cantidad de canales:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        canales.setBorder(titleCanales);

        fechaIni = new JLabel("Fecha de Inicio: ");
        
        calcular = new JButton("PRECIO DE SUSCRIPCION");
        registrar = new JButton("REGISTRAR CLIENTE");
        
        Precio = new JLabel("Valor por Suscripcion:                  ");
        
        Calendario = new com.toedter.calendar.JDateChooser();
        Calendario.setForeground(Color.BLACK);
        Calendario.getDateEditor().setEnabled(false);
        FechaHoy = new Date();
        Calendario.setDate(FechaHoy);
        Calendario.setMinSelectableDate(FechaHoy);
        
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
        c.gridy = 1;
        c.gridwidth = 10;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(fechaIni, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 10;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(Calendario, c);
        
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

    public JButton getCalcular() {
        return calcular;
    }

    public void setCalcular(JButton calcular) {
        this.calcular = calcular;
    }

    public JButton getRegistrar() {
        return registrar;
    }

    public void setRegistrar(JButton registrar) {
        this.registrar = registrar;
    }

    public Date getFechaHoy() {
        return FechaHoy;
    }

    public void setFechaHoy(Date FechaHoy) {
        this.FechaHoy = FechaHoy;
    }

    public JDateChooser getCalendario() {
        return Calendario;
    }

    public void setCalendario(JDateChooser Calendario) {
        this.Calendario = Calendario;
    }

    public JLabel getPrecio() {
        return Precio;
    }

    public void setPrecio(JLabel Precio) {
        this.Precio = Precio;
    }

}
