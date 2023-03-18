package triangulotrinomial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int num;
        long res;

        while (esc.hasNextInt()) {
            res = 1;
            num = esc.nextInt();
            if (num == 0) {
                res = 1;
            } else {
                for (int i = 1; i < num + 1; i++) {
                    res *= 3;
                }
            }
            System.out.println(res);
        }
    }

}
