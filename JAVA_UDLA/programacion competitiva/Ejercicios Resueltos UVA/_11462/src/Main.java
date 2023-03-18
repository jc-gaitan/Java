
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int n;
        int a[];
        
        do{
            n = esc.nextInt();
            a = new int [n];
            for(int i=0;i<n;i++){
                a[i]=esc.nextInt();
            }
            
            Arrays.sort(a);
            
            for(int i=0;i<n;i++){
                if(i==n-1){
                    System.out.print(a[i]);
                    System.out.println("");
                }else{
                    System.out.print(a[i]+" ");
                }
            }
        }while(n!=0);
    }
    
}
