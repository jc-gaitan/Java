
import java.util.Scanner;

public class enanos {
    
    static int num[]=new int[9];
    
    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int acum=0;
        
        for(int i=0;i<num.length;i++){
            num[i]=esc.nextInt();
            acum+=num[i];
        }
        
        acum-=100;
        resta(acum);
        
        for(int i=0;i<num.length;i++){
            if(num[i]!=-1){
                System.out.println(num[i]);
            }
        }
    }
    
    public static void resta(int acum){
        int aux;
        boolean x;
        for(int i=0;i<num.length;i++){
           aux=acum;
           x=verificarnumero(aux-=num[i]);
           if(x){
               num[i]=-1;
               break;
           }
        }
    }
    
    public static boolean verificarnumero(int aux){
        for(int i=0;i<num.length;i++){
            if(aux==num[i]){
                num[i]=-1;
                return true;
            }
        }
        return false;
    }
}
