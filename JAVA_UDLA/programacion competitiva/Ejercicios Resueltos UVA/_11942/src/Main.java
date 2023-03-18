
import java.util.Scanner;

public class Main {

    static int ayu;
    static int[] num;

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int n;
        n = esc.nextInt();
        num = new int[10];
        boolean x = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < num.length; j++) {
                num[j] = esc.nextInt();
            }

            if(x){
                System.out.println("Lumberjacks:");
                x = false;
            }

            if (MayoraMenor() == 9 || MenoraMayor() == 9) {
                System.out.println("Ordered");
            } else {
                System.out.println("Unordered");
            }
        }
    }

    public static int MayoraMenor() {
        ayu = num[0];
        int con = 0;
        for (int i = 1; i < num.length; i++) {
            if (ayu >= num[i]) {
                ayu = num[i];
                con++;
            } else {
                i = num.length + 1;
            }
        }
        return con;
    }

    public static int MenoraMayor() {
        ayu = num[0];
        int con = 0;
        for (int i = 1; i < num.length; i++) {
            if (ayu <= num[i]) {
                ayu = num[i];
                con++;
            } else {
                i = num.length + 1;
            }
        }
        return con;
    }

}
