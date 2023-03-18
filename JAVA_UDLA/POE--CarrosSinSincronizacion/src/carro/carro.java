package carro;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class carro extends Thread {
    JLabel label;
    int tiempo;

    public carro(JLabel label, int tiempo) {
        this.label=label;
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        
        while(label.getLocation().x<765){
            //System.out.println(label.getLocation().x);
            label.setLocation(label.getLocation().x+10, label.getLocation().y);
            try {
                sleep((int) (Math.random()*tiempo+1));
            } catch (InterruptedException ex) {
                Logger.getLogger(carro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    /*for(int i=0;i<=limite;i++) {
        //label.setBounds(i,posicioninicial,100, 100);
        if(label.getLocation().x<765){
            label.setLocation(label.getLocation().x+10, label.getLocation().y);
            //System.out.println(label.getLocation().x);
        }else{//manda el otro muñeco
            
        }
         try {
            sleep(20);
        }catch (ArrayIndexOutOfBoundsException exc){
           
        } catch (InterruptedException ex) {
            Logger.getLogger(Carros.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }*/

}

}
