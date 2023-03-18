
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fracciones {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int casos;
        String num;
        int deci;
        double res = 0;
        int p = 0;

        try {
            casos = Integer.parseInt(br.readLine());
            for (int i = 0; i < casos; i++) {
                num = br.readLine();
                deci = decimale(num);

                p = (int) Math.pow(10, deci);
                res = Double.parseDouble(num) * p;

                if (deci == -1) {
                    System.out.println(num + "/1");
                } else {
                    System.out.println(simplificar(res, p));
                }
            }
        } catch (IOException ex) {
        }

    }

    public static int decimale(String num) {
        int con = -1;
        for (int i = 0; i < num.length(); i++) {
            if (con >= 0) {
                con++;
            } else if (num.substring(i, i + 1).equals(".")) {
                con++;
            }
        }
        return con;
    }

    public static String simplificar(double a, int b) {
        String text = "";
        for (int i = 10; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                a = a / i;
                b = b / i;
                i++;
            }
        }
        text = (int) a + "/" + b;
        return text;
    }

}
