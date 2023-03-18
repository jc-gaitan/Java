
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class euclid {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        int r = 1, c = 0;
        int a1, b1, res = 0;
        
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        a1 = a;
        b1 = b;
        
        if (a > b) {
            while (r != 0) {
                c = a / b;
                r = a % b;
                a = b;
                b = r;
            }
        } else {
            c = b;
            b = a;
            a = c;
            while (r != 0) {
                c = a / b;
                r = a % b;
                a = b;
                b = r;
            }
        }
        
        
        
        
    }

}
