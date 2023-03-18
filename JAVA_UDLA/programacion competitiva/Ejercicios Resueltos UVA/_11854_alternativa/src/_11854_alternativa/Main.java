package _11854;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int a, b, c;

        do {

            a = esc.nextInt();
            b = esc.nextInt();
            c = esc.nextInt();

            if (a != 0 && b != 0 && c != 0) {
                if ((a == Math.sqrt((b * b) + (c * c))) || (b == Math.sqrt((a * a) + (c * c)))
                        || (c == Math.sqrt((a * a) + (b * b)))) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }

        } while (a != 0 && b != 0 && c != 0);

    }

}
