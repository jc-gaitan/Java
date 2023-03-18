
package InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int a; 
        
        try{//un try puede tener varios catch
            System.out.println("Ingrese un numero entero: ");
            a = esc.nextInt();
            System.out.println("EL numero es: "+a);
        }catch(InputMismatchException e){//entre los parentesis del catch, va el nombre de la excepcion que se quiere atrapar, con una variable
            System.out.println("EL DATO INGRESADO NO ES UN NUMERO."+'\n'+"ERROR:"+" ("+e+")");
        }
        
    }
    
}
