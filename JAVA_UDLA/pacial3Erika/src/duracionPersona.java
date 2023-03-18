
import javax.swing.JLabel;


public class duracionPersona extends Thread {
    
    sincronizacion asd;
    JLabel a;
    int tiem;
    
    public duracionPersona(JLabel a, int tiem, sincronizacion f){
        this.a = a;
        this.tiem = tiem;
        asd = f;
    }

    public void run() {
        for (int i = tiem; i >= 0; i--) {
            try {
                Thread.sleep(1000);
                a.setText(a.getText().substring(0, 1)+i+" Seg");
            } catch (InterruptedException ex) {
            }
        }
        asd.Desocupar();
    }

}
