
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int n = 0;
        int num;
        int con = 0;
        int i = 1;

        n = esc.nextInt();
        while (n != 0) {
            while (n > 0) {
                num = esc.nextInt();
                if (num != 0) {
                    con++;
                } else {
                    con--;
                }
                n--;
            }
            System.out.println("Case "+i+": "+con);
            i++;
            n = esc.nextInt();
            con=0;
        }
    }

}
