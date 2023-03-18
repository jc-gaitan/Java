
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int nume;
        int acum = 0;

        try {
            int num = Integer.parseInt(br.readLine());

            for (int i = 0; i < num; i++) {
                numero = Integer.parseInt(br.readLine());
                int w = operacion(numero);
                if (w == 1) {
                    System.out.println("Case #"+(i+1)+": "+numero+" is a Happy number.");
                } else {
                    System.out.println("Case #"+(i+1)+": "+numero+" is an Unhappy number.");
                }
            }
        } catch (Exception e) {

        }

    }

    public static int operacion(int numero) {
        String a = String.valueOf(numero);
        int num;
        int acum = 0;
        String res = "20";
        int w = 0;
        
        for (int i = 0; i < a.length(); i++) {
            num = Integer.parseInt(a.substring(i, i + 1));
            numero = num * num;
            acum = acum + numero;
        }
        res = String.valueOf(acum);
        if (res.length() != 1) {
            w = operacion(acum);
        }else{
            w = acum;
        }
        return w;
    }

}
