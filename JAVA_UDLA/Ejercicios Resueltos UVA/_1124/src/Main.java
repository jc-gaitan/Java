
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        
        while(esc.hasNext()) {  
            System.out.println(esc.nextLine());  
        }  
        esc.close(); 
    }
    
}
