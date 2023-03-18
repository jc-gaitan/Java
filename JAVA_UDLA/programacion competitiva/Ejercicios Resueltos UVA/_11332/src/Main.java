
import java.util.Scanner;

public class Main {

    static String x;
    
    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int a;
        a=esc.nextInt();
        
        while(a!=0){
            System.out.println(recur(a));
            a=esc.nextInt();
        }
        
    }
    
    public static int recur(int a){
        x="";
        int acum=0;
        x+=a;
        if(x.length()==1){
            return Integer.parseInt(x);
        }else{
            for(int i=0;i<x.length();i++){
                acum+=Integer.parseInt(x.substring(i, i+1));
            }
            recur(acum);
            return Integer.parseInt(x);
        }
    }
}
