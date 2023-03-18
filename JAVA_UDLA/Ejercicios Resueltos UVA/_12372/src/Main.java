
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int cas=esc.nextInt();
        int an,al,lon;
        
        for(int i=0;i<cas;i++){
            lon=esc.nextInt();
            an=esc.nextInt();
            al=esc.nextInt();
            if(lon <= 20 && an <= 20 && al <= 20){
                System.out.println("Case "+(i+1)+": good");
            }else{
                System.out.println("Case "+(i+1)+": bad");
            }
        }
    }
    
}
