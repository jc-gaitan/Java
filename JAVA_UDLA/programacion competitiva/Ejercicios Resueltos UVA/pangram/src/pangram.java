
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pangram {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos;
        int longtitud;
        String palabra;
        char caracter = 'a';

        try {
            casos = Integer.parseInt(br.readLine());
            for (int i = 0; i < casos; i++) {
                longtitud = Integer.parseInt(br.readLine());

                if (longtitud < 26) {
                    palabra = br.readLine();
                    System.out.println("NO");
                } else {
                    palabra = br.readLine();
                    palabra = palabra.trim().toLowerCase();

                    String w[] = palabra.split("");
                    Arrays.sort(w);

                    //caracter = new char[longtitud];

                    for (int j = 0; j < w.length; j++) {
                        char letra = w[j].charAt(0);
                        if ( letra == caracter) {
                            caracter++;
                        }
                    }

                    if (caracter == 123) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                    
                    caracter = 'a';
                    
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
