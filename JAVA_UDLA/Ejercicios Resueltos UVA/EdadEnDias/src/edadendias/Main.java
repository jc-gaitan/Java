package edadendias;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year = 365;
        int mes = 30;
        int num;
        int res;

        Scanner esc = new Scanner(System.in);

        while (esc.hasNextInt()) {
            num = esc.nextInt();
            res = num / year;
            System.out.println(res + " ano(s)");
            num -= res * year;
            res = num / mes;
            System.out.println(res + " mes(es)");
            num -= res * mes;
            System.out.println(num + " dia(s)");
        }

    }

}
