
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class tea {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos;
        String res;
        String resPar;
        int con;

        try {
            casos = Integer.parseInt(br.readLine());

            for (int j = 0; j < casos; j++) {
                con = 0;
                res = br.readLine();
                resPar = br.readLine();
                String respu[] = resPar.split(" ");
                Arrays.sort(respu);

                for (int i = 0; i < respu.length; i++) {
                    if (respu[i].equals(res)) {
                        con++;
                    }

                    if (con > 0 && !respu[i].equals(res)) {
                        break;
                    }
                }
                System.out.println(con);
            }

        } catch (Exception e) {

        }

    }

}
