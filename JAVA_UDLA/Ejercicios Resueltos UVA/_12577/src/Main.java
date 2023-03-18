
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        String a="";
        int i=1;
        
        a=esc.next();
        while(!a.equals("*")){
            if(a.equals("Hajj")){
                System.out.println("Case "+i+": Hajj-e-Akbar");
            }else{
                System.out.println("Case "+i+": Hajj-e-Asghar");
            }
            i++;
            a=esc.next();
        }
    }

}
