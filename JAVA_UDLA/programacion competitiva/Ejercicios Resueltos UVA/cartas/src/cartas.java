
import java.util.Scanner;

public class cartas {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        String a = esc.next();
        int p = 0, k = 0, h = 0, t = 0;
        boolean x = true;

        for (int i = 0; i < a.length() - 2; i += 3) {
            for (int j = i + 3; j < a.length() - 2; j += 3) {
                if (a.subSequence(i, i + 3).equals(a.substring(j, j + 3))) {
                    System.out.println("ERROR");
                    x = false;
                }
            }
        }

        if (x) {
            for (int i = 0; i < a.length() - 2; i += 3) {
                if (a.subSequence(i, i+1).equals("P")) {
                    p++;
                } else if (a.subSequence(i, i+1).equals("K")) {
                    k++;
                } else if (a.subSequence(i, i+1).equals("H")) {
                    h++;
                } else {
                    t++;
                }
            }
            System.out.println((13 - p) + " " + (13 - k) + " " + (13 - h) + " " + (13 - t));
        }

    }

}
