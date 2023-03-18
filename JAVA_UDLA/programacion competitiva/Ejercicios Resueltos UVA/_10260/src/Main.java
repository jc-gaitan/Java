
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String letras;

        try {
            while (true) {
                letras = br.readLine();
                System.out.println(verificar(letras));
            }
        } catch (Exception e) {

        }

    }

    public static String verificar(String numero) {
        char a;
        String w = "";
        int x1,x2,x3,x4,x5,x6;
        x1 = x2 = x3 = x4 = x5 = x6 = 0;

        for (int i = 0; i < numero.length(); i++) {
            a = numero.charAt(i);//convertir string a char
            if ((a == 70 || a == 66 || a == 80 || a == 86) && x1 == 0) {
                w += 1;
                x1++;
                x2 = x3 = x4 = x5 = x6 = 0;
            } else if ((a == 67 || a == 71 || a == 74 || a == 75 || a == 81 || a == 83 || a == 88 || a == 90) && x2 == 0) {
                w += 2;
                x2++;
                x1 = x3 = x4 = x5 = x6 = 0;
            } else if ((a == 68 || a == 84) && x3 == 0) {
                w += 3;
                x3++;
                x2 = x1 = x4 = x5 = x6 = 0;
            } else if ((a == 76) && x4 == 0) {
                w += 4;
                x4++;
                x2 = x3 = x1 = x5 = x6 = 0;
            } else if ((a == 77 || a == 78) && x5 == 0) {
                w += 5;
                x5++;
                x2 = x3 = x4 = x1 = x6 = 0;
            } else if ((a == 82) && x6 == 0) {
                w += 6;
                x6++;
                x2 = x3 = x4 = x5 = x1 = 0;
            }else if(a == 65 || a == 69 || a == 73 || a == 79 || a == 85 || a == 72 || a == 87 || a == 89){
                x1 = x2 = x3 = x4 = x5 = x6 = 0;
            }
        }
        return w;
    }

}
