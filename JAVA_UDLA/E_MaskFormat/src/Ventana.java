
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class Ventana extends JFrame
{

    private Border borde;
    JFormattedTextField arre[];
    JTextField celular;
    String names[];

    public Ventana()
    {
        setTitle("Registro Afiliado - TV Cable");

        Componentes();

        setLayout(new GridBagLayout());
        Organizar();

        //setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes()
    {
        borde = BorderFactory.createLineBorder(Color.BLACK);
        arre = new JFormattedTextField[5];
        String[] text = new String[5];
        names = new String[5];

        text[0] = "(###)-###-###";
        names[0] = "Celular";
        
        text[1] = "##U-ULU-LL";
        names[1] = "Numero historia clinica";
        
        text[2] = "#.###.###.###";
        names[2] = "Cedula";
        
        text[3] = "UUUL-##-LL";
        names[3] = "Codigo suscripcion";
        
        text[4] = "AAAAA**@gmail.com";
        names[4] = "correo";

        CrearLabel(text);
    }

    public void CrearLabel(String text[])
    {
        for (int i = 0; i < arre.length; i++) {
            MaskFormatter mascara = new MaskFormatter();
            try {
                mascara = new MaskFormatter(text[i]);
            } catch (ParseException e) {
                System.out.println(e);
            }
            arre[i] = new JFormattedTextField(mascara);
            arre[i].setBorder(new TitledBorder(borde, names[i], TitledBorder.CENTER, TitledBorder.ABOVE_TOP));
        }
    }

    private void Organizar()
    {
        GridBagConstraints c = new GridBagConstraints();

        for (int i = 0; i < arre.length; i++) {
            c.gridx = 0;
            c.gridy = i;
            c.gridwidth = 8;
            c.gridheight = 1;
            c.weightx = 0.0;
            c.weighty = 0.0;
            c.fill = GridBagConstraints.BOTH;
            c.insets = new Insets(4, 4, 4, 4);
            add(arre[i], c);
        }

    }
}
