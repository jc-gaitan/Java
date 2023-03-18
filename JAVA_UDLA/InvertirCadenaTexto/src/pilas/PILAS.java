
package pilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class PILAS {
    
    //INVERTIR UNA CADENA DE TEXTO

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        Stack pila = new Stack();
        Scanner esc = new Scanner(System.in);
        String a = br.readLine();
        char caracter[] = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            caracter[i] =  a.charAt(i);
        }  
        for (int i = caracter.length-1; i >= 0; i--) {
            pila.add(caracter[i]);
        }
        System.out.println(pila);
    }
    
}
