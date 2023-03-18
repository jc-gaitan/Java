
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < num; j++) {
                String a = br.readLine();
                String asd[] = a.split(" ");
                int num1[] = new int[asd.length];
                for(int k = 0 ; k < asd.length; k++){
                    num1[k]=Integer.parseInt(asd[k]);
                }
                Arrays.sort(num1);
                System.out.println("Case " + (j + 1) + ": " + num1[num1.length-1]);
            }
        } catch (Exception e) {

        }
    }

}
