
import java.util.Scanner;

public class Main {//12157

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int cas=esc.nextInt();
        int a; int b;
        int mile=0,juice=0;
        int aux=0;
        
        for(int i=0;i<cas;i++){
            a=esc.nextInt();
            for(int j=0;j<a;j++){
                b=esc.nextInt();
                aux=b;
                if(aux%30==0){
                    aux/=30;
                    mile+=aux*10;
                    mile+=10;
                }else{
                    aux/=30;
                    mile+=10;
                    mile+=aux*10;
                }
                aux=b;
                if(aux%60==0){
                    aux/=60;
                    juice+=aux*15;
                    juice+=15;
                }else{
                    aux/=60;
                    juice+=15;
                    juice+=aux*15;
                }
                
            }
            if(mile>juice){
                System.out.println("Case "+(i+1)+": Juice "+juice);
            }else if(mile<juice){
                System.out.println("Case "+(i+1)+": Mile "+mile);
            }else{
                System.out.println("Case "+(i+1)+": Mile Juice "+mile);
            }
            mile=0;
            juice=0;
        }
        
    }
    
}
