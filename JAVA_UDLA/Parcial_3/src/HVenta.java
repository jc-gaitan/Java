
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HVenta extends Thread {

    Emergente emergente;
    Manzanas Cantidad;
    int numero;
    JLabel manzana;
    
    ImageIcon[] ImagenesManzanas;
    ImageIcon Iconmanzana;
    int conImagen;
    int cantiVen;
    HTemporizador tempo;
    JLabel mensajeGran;
    JLabel mensajeCli;
    ImageIcon[] PGran;
    ImageIcon[] PClien;

    HMovimientoI HMI;

    int a = 0;

    ImageIcon ImagenesCliente1[][];
    ImageIcon ImagenesCliente2[][];
    JLabel animacion;
    JLabel animacion2;
    
    ImageIcon icon;
    

    public HVenta(int x, JLabel manzana, ImageIcon[] ImagenesManzanas, Emergente emergente, HTemporizador tempo,
            JLabel mensajeGran, JLabel mensajeCli, ImageIcon[] PGran, ImageIcon[] PClien, ImageIcon ImagenesCliente1[][],
            ImageIcon ImagenesCliente2[][], JLabel animacion) {

        Cantidad = new Manzanas();
        numero = x;
        this.manzana = manzana;
        this.ImagenesManzanas = ImagenesManzanas;
        conImagen = 0;
        cantiVen = 0;
        this.emergente = emergente;
        this.tempo = tempo;
        this.mensajeGran = mensajeGran;
        this.mensajeCli = mensajeCli;
        this.PGran = PGran;
        this.PClien = PClien;
        this.animacion = animacion;
    }

    public synchronized void HacerVenta(int cantidad) throws InterruptedException {
        if (Cantidad.getCantidad() >= cantidad) {
            System.out.println(cantidad);

            sleep(400);
            ImageIcon IconMen, IconMens;
            switch (cantidad) {
                case 1:
                    IconMen = new ImageIcon(PClien[0].getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
                    mensajeCli.setIcon(IconMen);

                    sleep(600);
                    IconMens = new ImageIcon(PGran[1].getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
                    mensajeGran.setIcon(IconMens);

                    break;
                case 2:
                    IconMen = new ImageIcon(PClien[1].getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
                    mensajeCli.setIcon(IconMen);

                    sleep(600);
                    IconMens = new ImageIcon(PGran[2].getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
                    mensajeGran.setIcon(IconMens);

                    break;
            }

            sleep(1000);
            Cantidad.Vender(cantidad);
            conImagen += cantidad;
            cantiVen += cantidad;

            Iconmanzana = new ImageIcon(ImagenesManzanas[conImagen].getImage().getScaledInstance(200, 230, Image.SCALE_DEFAULT));
            manzana.setIcon(Iconmanzana);

            IconMen = new ImageIcon(PClien[2].getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            mensajeCli.setIcon(IconMen);

            System.out.println("Hay " + Cantidad.getCantidad() + " manzanas");
            sleep(400);

            ImageIcon ini = new ImageIcon(getClass().getResource("/Otras/inicio.png"));
            ini = new ImageIcon(ini.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            mensajeCli.setIcon(ini);
            mensajeGran.setIcon(ini);

            sleep(600);

            if (a == 0) {
                icon = new ImageIcon(getClass().getResource("/Cliente2Derecha/0.gif"));
                icon = new ImageIcon(icon.getImage().getScaledInstance(192, 336, Image.SCALE_DEFAULT));
                animacion.setIcon(icon);
                
                a++;
            } else {
                
                icon = new ImageIcon(getClass().getResource("/Cliente1Derecha/0.gif"));
                icon = new ImageIcon(icon.getImage().getScaledInstance(192, 336, Image.SCALE_DEFAULT));
                animacion.setIcon(icon);
           
                a--;
            }

        }
    }

    @Override
    public void run() {
        while (tempo.isAlive()) {
            int cantidad = (int) (Math.random() * 2) + 1;

            try {
                if (Cantidad.getCantidad() <= 2) {
                    Cantidad.setCantidad(10);
                    sleep(1000);
                    Iconmanzana = new ImageIcon(ImagenesManzanas[0].getImage().getScaledInstance(200, 230, Image.SCALE_DEFAULT));
                    manzana.setIcon(Iconmanzana);
                    conImagen = 0;
                }
                ImageIcon IconMen = new ImageIcon(PGran[0].getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
                mensajeGran.setIcon(IconMen);
                
                this.HacerVenta(cantidad);                
                
            } catch (InterruptedException ex) {
                System.out.println("Alerta ..registrar log de seguridad");
            }
        }
        emergente.CanVendida.setText("La cantidad vendida es: " + cantiVen);
        emergente.DineroReco.setText("El dinero recolectado: " + (1000 * cantiVen));
        emergente.setVisible(true);
        System.exit(0);
    }

}
