
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int x;
        int num;
        int num2;
        x = esc.nextInt();
        int a, b;

        for (int i = 0; i < x; i++) {
            a=0;
            b=100;
            num = esc.nextInt();
            for (int j = 0; j < num; j++) {
                num2 = esc.nextInt();
                if (num2 > a) {
                    a = num2;
                }
                if (num2 < b) {
                    b = num2;
                }
            }
            System.out.println((a - b) * 2);
        }
    }

}
