
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(flujo);
        StringBuilder sbf;
        String a;
        String[] asd;

        try {
            while (true) {
                a = br.readLine();
                asd = a.split(" ");
                char[] aCaracteres = a.toCharArray();
                for (int i = 0; i < asd.length; i++) {
                    sbf = new StringBuilder(asd[i]);
                    if(i==asd.length-1){
                        System.out.print(sbf.reverse());
                    }else{
                        System.out.print(sbf.reverse() + " ");
                    }
                }
                System.out.println("");
            }
        } catch (Exception e) {

        }

    }

}
