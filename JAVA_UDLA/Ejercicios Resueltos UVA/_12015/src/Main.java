
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int popu[];
        String url[];
        int casos = esc.nextInt();
        int x, y;
        String a;

        for (int i = 0; i < casos; i++) {
            popu = new int[10];
            url = new String[10];
            
            popu[0] = 0;
            x = 1;
            for (int j = 1; j <= 10; j++) {
                a = esc.next();
                y = esc.nextInt();
                if (popu[0] < y) {
                    if(x>1){
                        popu = new int[10];
                        url = new String[10];
                    }
                    popu[0] = y;
                    url[0] = a;
                    
                } else if (popu[0] == y) {
                    popu[x] = y;
                    url[x] = a;
                    x++;
                }//

            }

            System.out.println("Case #" + (i + 1) + ":");
            for (int k = 0; k < 10; k++) {
                if (url[k] != null) {
                    System.out.println(url[k]);
                }
            }
        }
    }

}
