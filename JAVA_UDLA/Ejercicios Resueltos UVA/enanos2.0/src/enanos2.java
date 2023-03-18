import java.util.Scanner;

public class enanos2 {

    static int num[] = new int[9];

    public static void main(String[] args) {

        Scanner esc = new Scanner(System.in);
        int acum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = esc.nextInt();
            acum += num[i];
        }

        acum -= 100;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == acum) {
                    num[i] = -1;
                    num[j] = -1;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] != -1) {
                System.out.println(num[i]);
            }
        }
    }
}
