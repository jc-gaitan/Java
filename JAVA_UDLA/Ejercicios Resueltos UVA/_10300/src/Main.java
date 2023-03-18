
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int casos=esc.nextInt();
        int agri;
        long num[]=new long[3];
        long res;
        
        for(int i=0;i<casos;i++){
            res=0;
            agri=esc.nextInt();
            for(int j=0;j<agri;j++){
                num[0]=esc.nextLong();
                num[1]=esc.nextLong();
                num[2]=esc.nextLong();
                if(num[1]!=0){
                    res+=num[0]*num[2];
                }
            }
            System.out.println(res);
        }
    }
    
}
