
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        String a=esc.next();
        int i=1;
        while(!a.equals("#")){
            if(a.equals("HELLO")){
                System.out.println("Case "+i+": ENGLISH");
            }else if(a.equals("HOLA")){
                System.out.println("Case "+i+": SPANISH");
            }else if(a.equals("HALLO")){
                System.out.println("Case "+i+": GERMAN");
            }else if(a.equals("BONJOUR")){
                System.out.println("Case "+i+": FRENCH");
            }else if(a.equals("CIAO")){
                System.out.println("Case "+i+": ITALIAN");
            }else if(a.equals("ZDRAVSTVUJTE")){
                System.out.println("Case "+i+": RUSSIAN");
            }else{
                System.out.println("Case "+i+": UNKNOWN");
            }
            a=esc.next();
            i++;
        }
        
    }
    
}
