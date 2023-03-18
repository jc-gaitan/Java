
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        String op;
        int can = 0;
        int num;

        num = esc.nextInt();
        for (int i = 0; i < num; i++) {
            op = esc.next();
            if (op.equals("donate")) {
                can += esc.nextInt();
            }else{
                System.out.println(can);
            }
        }

    }

}
