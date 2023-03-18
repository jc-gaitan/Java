
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class inception {

    public static void main(String[] args) throws IOException {
        int can;
        String text;
        Stack<String> pila = new Stack<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        can = Integer.parseInt(br.readLine());
        String t[];
        for (int i = 0; i < can; i++) {
            text = br.readLine();
            if(text.equals("Test")){
                if(pila.empty()){
                    System.out.println("Not in a dream");
                }else{
                    System.out.println(pila.peek());
                }
            }else if(text.equals("Kick")){
                if(!pila.empty()){
                    pila.pop();
                }
            }else{
                t = text.split(" ");
                pila.push(t[1]);
            }
        }
    }
    
}
