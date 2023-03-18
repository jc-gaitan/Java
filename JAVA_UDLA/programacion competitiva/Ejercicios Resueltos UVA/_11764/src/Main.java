
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int a = esc.nextInt();
        int b;
        int num[];
        int alto;
        int bajo;

        for (int i = 0; i < a; i++) {
            alto=0;
            bajo=0;
            b = esc.nextInt();
            num=new int[b];
            num[0]=esc.nextInt();
            for (int j = 1; j < b; j++) {
                num[j]=esc.nextInt();
                if(num[j-1]>num[j]){
                    bajo++;
                }else if(num[j-1]<num[j]){
                    alto++;
                }
            }
            System.out.println("Case "+(i+1)+": "+alto+" "+bajo);
        }
    }

}
