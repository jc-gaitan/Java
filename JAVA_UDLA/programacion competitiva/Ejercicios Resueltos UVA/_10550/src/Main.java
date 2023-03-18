
import java.util.Scanner;

public class Main {//10550

    static int candado[] = new int[40];

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int a, b, c, d;
        int grados;

        for (int i = 0; i < 40; i++) {
            candado[i] = i;
        }

        a = esc.nextInt();
        b = esc.nextInt();
        c = esc.nextInt();
        d = esc.nextInt();

        while (a != 0 || b != 0 || c != 0 || d != 0) {
            grados=0;
            grados += Derecha(a, b);
            grados += Izquierda(b, c);
            grados += Derecha(c, d);

            System.out.println((grados + (360 * 3)));
            
            a = esc.nextInt();
            b = esc.nextInt();
            c = esc.nextInt();
            d = esc.nextInt();
        }

    }

    public static int Derecha(int pos, int num) {
        int x = 0;
        while (candado[pos] != num) {
            if (pos <= 0) {
                pos = candado.length;
            }
            x++;
            pos--;
        }
        return x * 9;
    }

    public static int Izquierda(int pos, int num) {
        int x = 0;
        while (candado[pos] != num) {
            x++;
            pos++;
            if (pos >= candado.length) {
                pos = 0;
            }
        }
        return x*9;
    }

}
