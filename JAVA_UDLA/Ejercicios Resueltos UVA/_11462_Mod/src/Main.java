
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b=0;
        String a[];
        int[] num1;

        do {
            try {
                b = Integer.parseInt(br.readLine());
                String num = br.readLine();
                a = num.split(" ");
                num1 = new int[a.length];

                for (int i = 0; i < a.length; i++) {
                    num1[i] = Integer.parseInt(a[i]);
                }

                Arrays.sort(num1);

                System.out.print(num1[0]);
                for (int i = 1; i < num1.length; i++) {
                    System.out.print(" " + num1[i]);
                }
                System.out.println("");
            } catch (Exception e) {

            }
        } while (b != 0);
    }

}
