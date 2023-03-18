package hilo3;

public class Proceso13 extends Thread {

    private String nombre;

    public Proceso13(String s) {
        nombre = s;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + " " + i);
            try {
                Thread.sleep(2000);//2000 milisegundos
            } catch (InterruptedException e) {
            }
        }

    }
}
