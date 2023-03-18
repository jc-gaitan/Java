
import java.util.Scanner;

public class _12468 {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int num[] = new int[100];
        int subir = 0, bajar = 0;
        int i;

        for (int j = 0; j < num.length; j++) {
            num[j] = j;
        }

        a = esc.nextInt();//canal actualmente
        b = esc.nextInt();//canal al que me gustaría acceder

        while (a != -1 && b != -1) {

            i = a;
            while (num[i] != b) {
                if (i == 99) {
                    i = 0;
                }
                i++;
                subir++;
            }

            i=a;
            while(num[i] != b){
                if(i==0){
                    i=num.length;
                }
                i--;
                bajar++;
            }

            if (subir > bajar) {
                System.out.println(bajar);
            } else {
                System.out.println(subir);
            }

            subir = 0;
            bajar = 0;

            a = esc.nextInt();//canal actualmente
            b = esc.nextInt();//canal al que me gustaría acceder
        }
    }

}
