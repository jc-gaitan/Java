
package message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Message {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos;
        String palabra;
        int longi; 
        String matris[][];
        int c;
        
        try {
            casos = Integer.parseInt(br.readLine());
            
            c = 0;
            
            for(int i = 0; i < casos; i++){
                palabra = br.readLine();
                palabra +="**";
                longi = palabra.length();
                longi = (int) Math.sqrt(longi);
                //System.out.println(longi);
                
                matris = new String [longi][longi];
                
                for(int j = 0; j < longi; j++){
                    for(int k = 0; k < longi; k++){
                        matris [j][k] = palabra.substring(c,c+1);
                        c++;
                    }
                }
                
                for(int j = 0; j < longi; j++){
                    for(int k = 0; k < longi; k++){
                        System.out.print(matris [j][k]);
                    }
                    System.out.println("");
                }
                
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
