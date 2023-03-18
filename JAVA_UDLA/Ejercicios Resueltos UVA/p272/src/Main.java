
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        String a = "";
        int p = 0;
        String b = "";

        while (esc.hasNext()) {
            a = esc.nextLine();
            for (int i = 0; i < a.length(); i++) {
                if (a.substring(i, i + 1).equals("\"") && p == 0) {
                    //a=a.replace(a.substring(i, i+1), "``");
                    b += "``";
                    p++;
                } else if (a.substring(i, i + 1).equals("\"") && p == 1) {
                    //a=a.replace(a.substring(i, i+1), "''");
                    b += "''";
                    p--;
                } else {
                    b += a.substring(i, i + 1);
                }
            }
            System.out.println(b);
            b = "";
        }
        esc.close();

    }

}
