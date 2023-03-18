
package Principal;

import java.awt.Image;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HiloTemporizador extends Thread {
    
    JLabel temp;
    ImageIcon[] ImagenesTemp;
    
    public HiloTemporizador(JLabel temp, ImageIcon[] ImagenesTemp){
        this.temp = temp;
        this.ImagenesTemp = ImagenesTemp;
    }
        
    public void run() {
        
        for(int i = 146; i >= 0; --i){
            try {
                sleep(500);
                temp.setIcon(new ImageIcon(ImagenesTemp[i].getImage().getScaledInstance(687, 42, Image.SCALE_DEFAULT)));
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        
    }
}
