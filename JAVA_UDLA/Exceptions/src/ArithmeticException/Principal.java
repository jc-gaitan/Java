
package ArithmeticException;

public class Principal {

    public static void main(String[] args) {
        try{
            System.out.println(3/0);
            System.out.println("Hice la division");
        }catch(ArithmeticException e){
            System.out.println("LA DIVISION NO PERMITIDA."+'\n'+"ERROR:"+" ("+e+")");
        }
    }
    
}
