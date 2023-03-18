
import java.util.Scanner;

public class modulo {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);

        int num1;
        int acum = 0;
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = esc.nextInt() % 42;
        }
                
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]==num[j]){
                    num[j]=-1;
                }
            }
        }
                
        for (int i = 0; i < num.length; i++) {
            if(num[i]!=-1){
                acum++;
            }
        }
        
        if(acum==0){
            System.out.println("1");
        }else{
            System.out.println(acum);
        }
        
    }
}
