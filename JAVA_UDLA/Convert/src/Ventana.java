
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.convertapi.*;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class Ventana extends JFrame implements ActionListener {

    JLabel a;
    JButton ar, conver;
    JComboBox tipo;
    JFileChooser fileChooser;
    String ruta, rutaSalida, tipoAr, tipoConver = "pdf";

    public Ventana() {
        Config.setDefaultSecret("tUmFscwsBRIXsEj6");//clave secreta API

        setTitle("Convert");
        Componentes();
        setSize(650, 200);
        getContentPane().setBackground(Color.white);

        setLayout(new GridBagLayout());
        Ordenar();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        pack();
    }

    public void Componentes() {
        a = new JLabel("Elija un archivo");

        ar = new JButton("Elegir archivo");
        ar.addActionListener(this);

        tipo = new JComboBox();
        tipo.addItem("pdf");
        tipo.addItem("docx");
        tipo.addItem("doc");
        tipo.addItem("txt");
        tipo.addActionListener(this);

        conver = new JButton("Convertir");
        conver.addActionListener(this);
        conver.setEnabled(false);

        fileChooser = new JFileChooser();
    }

    public void Ordenar() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;
        c.gridheight = 2;
        c.insets = new Insets(2, 0, 20, 0);
        add(a, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 4;
        c.gridheight = 2;
        c.insets = new Insets(0, 20, 30, 6);
        add(ar, c);

        c.gridx = 4;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.insets = new Insets(0, 5, 30, 6);
        add(tipo, c);

        c.gridx = 7;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.insets = new Insets(0, 5, 30, 20);
        add(conver, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ar) {
            //System.out.println("ar");
            fileChooser.showOpenDialog(fileChooser);
            ruta = fileChooser.getSelectedFile().getAbsolutePath();

            File f = new File(ruta);
            rutaSalida = f.getParent();

            //System.out.println(f.getName());
            String asd[] = f.getName().split("\\.");//separar el nombre del tipo del archivo
            tipoAr = asd[1];
            //System.out.println(tipoAr);
            conver.setEnabled(true);
            JOptionPane.showMessageDialog(
                    this,
                    "Tipo de archivo:  "+tipoAr+"\n"+Math.round(Math.ceil(rutaSalida.length()/1024.0))+"Kb");

        } else if (e.getSource() == conver) {
            //System.out.println("conver");

            try {
                ConvertApi.convert(tipoAr, tipoConver,
                        new Param("file", Paths.get(ruta))
                ).get().saveFile(Paths.get(rutaSalida)).get();

                JOptionPane.showMessageDialog(null, "El nuevo archivo se a guardado en: " + rutaSalida);
            } catch (Exception ex) {

            }
        } else if (e.getSource() == tipo) {
            if (tipo.getSelectedIndex() == 0) {
                tipoConver = "pdf";
            } else if (tipo.getSelectedIndex() == 1) {
                tipoConver = "docx";
            } else if (tipo.getSelectedIndex() == 2) {
                tipoConver = "doc";
            } else if (tipo.getSelectedIndex() == 3) {
                tipoConver = "txt";
            }
        }
    }
}
