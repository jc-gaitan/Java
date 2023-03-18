
import javax.swing.JLabel;

public class HMovimiento extends Thread {

    JLabel campo;
    boolean conti;
    String nombre;
 long tiempo =(long) (Math.random() * 100) + 50;

    public HMovimiento(JLabel campo, boolean x,String nombre) {
        this.campo = campo;
        this.conti = x;
        this.nombre=nombre;
       
    }

    @Override
    public void run() {
         int x = campo.getLocation().x;
        int y = campo.getLocation().y;
        boolean estado = false;
        boolean aux = true;
        long tiempoi=System.currentTimeMillis();
 
        while (conti) {
            try {
                if (aux) {
                      
                    sleep(tiempo);
                    x += 10;
                    campo.setLocation(x, y);
//                    System.out.println("y" + campo.getLocation().y);

                }
                if (x >= 780) {
                    long tiempof=System.currentTimeMillis();
                       long tt=tiempof-tiempoi;
                    
                    System.out.println("tiempo final " +tt+" "+nombre);
                    aux = conti=false; 
                    //System.out.println("tiempo "+tiempo);
                }
            } catch (InterruptedException ex) {

            }
        }

    }

}
