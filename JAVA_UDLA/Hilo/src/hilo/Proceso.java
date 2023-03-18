package hilo;

public class Proceso extends Thread {

    String mensaje;

    public Proceso(String msg) {
        super(msg);
    }

    public void run() {
        for (int i = 0; i < 150; i++) {
            System.out.println("["+mensaje+"] --> "+i);
        }
        System.out.println("Este proceso ha terminado:" + this.getName());
    }

    public void setMensaje(String msj) {
        this.mensaje = msj;
    }
}
