
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

    static String arre[];
    static int x=0;
    
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader tec = new BufferedReader(isr);

        int casos;
        int instru;
        int res;
        String a;
        int x;

        try {
            casos = Integer.parseInt(tec.readLine());
            for (int i = 0; i < casos; i++) {
                res = 0;
                instru = Integer.parseInt(tec.readLine());
                arre = new String[instru];

                for (int j = 0; j < instru; j++) {
                    arre[j] = tec.readLine();
                    if (arre[j].equals("LEFT")) {
                        res--;
                    } else if (arre[j].equals("RIGHT")) {
                        res++;
                    } else {
                        
                        /*StringTokenizer st = new StringTokenizer(arre[j]);
                        a = st.nextToken();
                        a = st.nextToken();
                        a = st.nextToken();
                        x = (Integer.parseInt(a)) - 1;*/
                        if (recur(j).equals("LEFT")) {
                            res--;
                        } else {
                            res++;
                        }
                    }
                }
                System.out.println(res);
            }
        } catch (Exception ex) {
        }

    }

    public static String recur(int j) {
        String a;
        StringTokenizer st = new StringTokenizer(arre[j]);
        a = st.nextToken();
        if (a.equals("SAME")) {
            a = st.nextToken();
            a = st.nextToken();
            x = (Integer.parseInt(a)) - 1;
            recur(x);
            return arre[x];
        }else{
            return arre[x];
        }
        
    }

}
