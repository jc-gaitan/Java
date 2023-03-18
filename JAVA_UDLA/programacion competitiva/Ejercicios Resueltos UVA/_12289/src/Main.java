
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int num=esc.nextInt();
        String a; int c=0;
        for(int i=0;i<num;i++){
            a=esc.next();
            if(a.length()>3){
                System.out.println("3");
            }else{
                if(a.substring(0, 1).equals("o")){
                    c++;
                }
                if(a.substring(1, 2).equals("n")){
                    c++;
                }
                if(a.substring(2, 3).equals("e")){
                    c++;
                }
                if(c>=2){
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }
            }
            c=0;
        }
    }
    
}
