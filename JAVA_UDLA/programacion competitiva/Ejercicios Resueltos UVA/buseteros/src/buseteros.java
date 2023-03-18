
import java.util.Scanner;

public class buseteros {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        String name;
        int paradas;
        int acum;
        int tiempo;
        int can;
        int num[] = new int[2];
        String names[] = new String[2];

        try {

            while (true) {
                for (int j = 0; j < 2; j++) {
                    acum = 0;
                    name = esc.next();
                    paradas = esc.nextInt();
                    for (int i = 0; i < paradas; i++) {
                        tiempo = esc.nextInt();
                        can = esc.nextInt();
                        acum = acum + (tiempo * can);
                    }
                    num[j] = acum;
                    names[j] = name;
                }

                if (num[0] > num[1]) {
                    System.out.println("Gano el conductor " + names[1]);
                } else if (num[0] < num[1]) {
                    System.out.println("Gano el conductor " + names[0]);
                } else {
                    System.out.println("Empate");
                }
            }

        } catch (Exception e) {

        }

    }

}
