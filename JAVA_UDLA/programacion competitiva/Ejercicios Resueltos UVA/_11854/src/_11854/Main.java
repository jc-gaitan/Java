package _11854;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int num[] = new int[3];
        int h;
        double h1;

        do {

            for (int i = 0; i < num.length; i++) {
                num[i] = esc.nextInt();
            }

            Arrays.sort(num);
            h = num[2];

            h1 = (int) (Math.pow(num[0], 2) + Math.pow(num[1], 2));
            h1 = Math.sqrt(h1);

            if (num[0] != 0 && num[1] != 0 && num[2] != 0) {
                if (h == h1) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }

        } while (num[0] != 0 && num[1] != 0 && num[2] != 0);

    }

}
