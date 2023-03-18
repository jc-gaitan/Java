import javax.swing.JLabel;

public class HMovimiento1 extends Thread {

    JLabel campo;
    boolean conti;
    String nombre;
    long tiempo = (long) (Math.random() * 100) + 50;
    HMovimiento p;

    public HMovimiento1(JLabel campo, boolean x, String nombre, HMovimiento p) {
        this.campo = campo;
        this.conti = x;
        this.nombre = nombre;
        this.p = p;
    }

    @Override
    public void run() {
        /*while (p.isAlive()) {

        }*/
        int x = campo.getLocation().x;
        int y = campo.getLocation().y;
        boolean estado = false;
        boolean aux = true;
        long tiempoi = System.currentTimeMillis();

        while (conti) {
            try {
                if(p.isAlive()){
                    
                }else{
                    if (aux) {

                    sleep(tiempo);
                    x += 10;
                    campo.setLocation(x, y);
//                    System.out.println("y" + campo.getLocation().y);

                }
                if (x >= 780) {
                    long tiempof = System.currentTimeMillis();
                    long tt = tiempof - tiempoi;

                    System.out.println("tiempo final " + tt + " " + nombre);
                    aux = conti = false;
                    //System.out.println("tiempo "+tiempo);
                }
                }
                
            } catch (InterruptedException ex) {

            }
        }
    }

}
