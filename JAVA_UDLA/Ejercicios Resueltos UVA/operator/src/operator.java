
import java.util.Scanner;

public class operator {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int a, b;
        int cas = esc.nextInt();

        for (int i = 0; i < cas; i++) {
            a = esc.nextInt();
            b = esc.nextInt();
            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }

}
