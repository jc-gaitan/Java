
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int a=esc.nextInt();
        int b;
        String x="";
        
        while(a>0){
            b=esc.nextInt();
            b*=567;
            b/=9;
            b+=7492;
            b*=235;
            b/=47;
            b-=498;
            x+=b;
            System.out.println(x.substring(x.length()-2, x.length()-1));
            a--;
        }
    }
    
}
