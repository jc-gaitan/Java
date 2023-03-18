
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int t=esc.nextInt();
        int num[]=new int[3];
        
        
        for(int i=0;i<t;i++){           
            num[0]=esc.nextInt();
            num[1]=esc.nextInt();
            num[2]=esc.nextInt();
            Arrays.sort(num);
            System.out.println("Case "+(i+1)+": "+num[1]);
            
        }
    }
    
}
