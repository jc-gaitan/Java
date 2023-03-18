
package Principal;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Incentivo extends JPanel{
    
    TitledBorder title;
    
    JLabel exce,perma,nore;
    JTextArea excele,permane,noreci;
    
    ModeloTabla a;
    ModeloTabla b;
    ModeloTabla c;
    
    List <Estudiante> listaEx;
    List <Estudiante> listaPer;
    List <Estudiante> listaNoRe;
    
    JTable tablaEx;
    JTable tablaPer;
    JTable tablaNoRe;
    
    JScrollPane js;
    JScrollPane js1;
    JScrollPane js2;
    
    JButton salir;
    
    JPanel Tablas;
    
    public Incentivo(){
        componentes();
        Paneles();
        title = BorderFactory.createTitledBorder("Incentivos");
        title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setBorder(title);
        
        add(exce);
        add(js);
        add(perma);
        add(js1);
        add(nore);
        add(js2);
        add(Tablas);
        Tablas.add(salir);
    }
    
    public void Paneles(){
        Tablas = new JPanel();
        setBackground(Color.WHITE);
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
    }
    
    public void componentes(){
        exce = new JLabel("Por Excelencia: ");
        exce.setAlignmentX(LEFT_ALIGNMENT);
        perma = new JLabel("Por Permanencia: ");
        nore = new JLabel("No Recive: ");

        listaEx = new ArrayList <>();
        listaPer = new ArrayList <>();
        listaNoRe = new ArrayList <>();
        
        a = new ModeloTabla(listaEx);
        b = new ModeloTabla(listaPer);
        c = new ModeloTabla(listaNoRe);
        
                
        tablaEx = new JTable(a);
        tablaEx.setBackground(Color.white);
        js = new JScrollPane(tablaEx);
        js.setPreferredSize(new Dimension(1200,150));
        tablaEx.setFillsViewportHeight(true);
        
        tablaPer = new JTable(b);
        tablaPer.setBackground(Color.white);
        js1 = new JScrollPane(tablaPer);
        js1.setPreferredSize(new Dimension(1200,150));
        tablaPer.setFillsViewportHeight(true);
        
        tablaNoRe = new JTable(c);
        tablaNoRe.setBackground(Color.white);
        js2 = new JScrollPane(tablaNoRe);
        js2.setPreferredSize(new Dimension(1200,150));
        tablaNoRe.setFillsViewportHeight(true);
        
        salir = new JButton("Salir");
        salir.setAlignmentX(RIGHT_ALIGNMENT);
        salir.setPreferredSize(new Dimension(1200,30));
    }
    
}
