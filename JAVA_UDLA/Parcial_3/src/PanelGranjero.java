
import java.awt.Color;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelGranjero extends JPanel{
    
    private JLabel granjero;
    private JLabel manzanas;
    
    public PanelGranjero(){
        Componentes();
        //setBackground(Color.RED);
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        add(granjero);
        add(manzanas);
    }

    private void Componentes() {
        ImageIcon granj = new ImageIcon(getClass().getResource("/Otras/granjero.png"));
        granj = new ImageIcon(granj.getImage().getScaledInstance(192, 336, Image.SCALE_DEFAULT));
        granjero = new JLabel(granj);
        
        ImageIcon manzana = new ImageIcon(getClass().getResource("/Manzanas/0.png"));
        manzana = new ImageIcon(manzana.getImage().getScaledInstance(200, 230, Image.SCALE_DEFAULT));
        manzanas = new JLabel(manzana);
    }

    public JLabel getManzanas() {
        return manzanas;
    }

    public void setManzanas(JLabel manzanas) {
        this.manzanas = manzanas;
    }
    
}
