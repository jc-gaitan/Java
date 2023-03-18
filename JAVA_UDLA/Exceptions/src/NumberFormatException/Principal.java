
package NumberFormatException;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        String a;
        int b;
        try{
            System.out.println("Ingrese un numero entero: ");
            a = esc.next();
            b = Integer.parseInt(a);    
            System.out.println(b);
        }catch(NumberFormatException e){
            System.out.println("EL DATO INGRESADO NO ES UN NUMERO."+'\n'+"ERROR:"+" ("+e+")");
        }
    }
    
}
