
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int t=esc.nextInt();
        int n,m;
        
        while(t>0){
            n=esc.nextInt();
            m=esc.nextInt();
            
            n/=3;
            m/=3;
            
            System.out.println(n*m);
            t--;
        }
            
        
    }
    
}
