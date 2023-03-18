package hilo2;

class UnHilo extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hilo: " + i);
        }

    }
}