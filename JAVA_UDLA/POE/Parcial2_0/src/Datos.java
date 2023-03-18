
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class Datos extends JPanel {

    private JTextField nombre;
    private JTextField apellido;
    private JTextField codigo;

    private JCheckBox drama, terror, accion, romantico, infantil;
    JPanel CheckBox;

    private Border borde;
    private TitledBorder titleName;
    private TitledBorder titleApe;
    private TitledBorder titleCode;

    private JLabel genero;
    private GridBagConstraints c;

    public Datos() {
        Componentes();

        setLayout(new GridBagLayout());
        Organizar();
    }

    public void Componentes() {
        borde = BorderFactory.createLineBorder(Color.BLACK);
        c = new GridBagConstraints();

        nombre = new JTextField(8);
        titleName = new TitledBorder(borde, "Nombre:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        nombre.setBorder(titleName);

        apellido = new JTextField(8);
        titleApe = new TitledBorder(borde, "Apellido:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        apellido.setBorder(titleApe);

        codigo = new JFormattedTextField(mascara());
        titleCode = new TitledBorder(borde, "Codigo de seguridad:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        codigo.setBorder(titleCode);

        genero = new JLabel("Generos");
        
        drama = new JCheckBox("Drama");
        terror = new JCheckBox("Terror");
        accion = new JCheckBox("Accion");
        romantico = new JCheckBox("Romantico");
        infantil = new JCheckBox("Infantil");
        
        CheckBox = new JPanel();
        CheckBox.setLayout(new GridBagLayout());
        OrganizarCheckBox();

    }

    private MaskFormatter mascara() {
        MaskFormatter mascara = new MaskFormatter();
        try {
            // Creamos el formato de nuestra contraseña
            // # -> un número 
            // U -> letra mayúscula 
            // L -> letra minúscula
            // * -> cualquier caracter 
            // ' -> caracteres de escape
            // A -> cualquier letra o número 
            // ? -> cualquier caracter
            // H -> cualquier caracter hexagonal (0-9, a-f or A-F).
            mascara = new MaskFormatter("UUUUL-##-LL");

        } catch (ParseException e) {
            // Algún error que pueda ocurrir
            e.printStackTrace();
        }
        return mascara;
    }

    public void Organizar() {
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(nombre, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(apellido, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(codigo, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 8;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 0, 4);
        add(genero, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 4, 4, 2);
        add(CheckBox, c);
    }
    
    
    private void OrganizarCheckBox() {
        //Insets (int superior, int izquierda, int abajo, int derecha)
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 0);
        CheckBox.add(drama, c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 0);
        CheckBox.add(terror, c);

        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 0);
        CheckBox.add(accion, c);

        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 0);
        CheckBox.add(romantico, c);

        c.gridx = 4;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 4, 4, 4);
        CheckBox.add(infantil, c);
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextField getApellido() {
        return apellido;
    }

    public void setApellido(JTextField apellido) {
        this.apellido = apellido;
    }

    public JTextField getCodigo() {
        return codigo;
    }

    public void setCodigo(JTextField codigo) {
        this.codigo = codigo;
    }

    public JCheckBox getDrama() {
        return drama;
    }

    public void setDrama(JCheckBox drama) {
        this.drama = drama;
    }

    public JCheckBox getTerror() {
        return terror;
    }

    public void setTerror(JCheckBox terror) {
        this.terror = terror;
    }

    public JCheckBox getAccion() {
        return accion;
    }

    public void setAccion(JCheckBox accion) {
        this.accion = accion;
    }

    public JCheckBox getRomantico() {
        return romantico;
    }

    public void setRomantico(JCheckBox romantico) {
        this.romantico = romantico;
    }

    public JCheckBox getInfantil() {
        return infantil;
    }

    public void setInfantil(JCheckBox infantil) {
        this.infantil = infantil;
    }

    public TitledBorder getTitleName() {
        return titleName;
    }

    public void setTitleName(TitledBorder titleName) {
        this.titleName = titleName;
    }

    public TitledBorder getTitleApe() {
        return titleApe;
    }

    public void setTitleApe(TitledBorder titleApe) {
        this.titleApe = titleApe;
    }

    public TitledBorder getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(TitledBorder titleCode) {
        this.titleCode = titleCode;
    }

}
