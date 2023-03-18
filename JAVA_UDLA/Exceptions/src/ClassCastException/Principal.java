
package ClassCastException;

public class Principal {

    public static void main(String[] args) {
        try{
            Object i = Integer.valueOf(42);
            String s = (String)i; 
        }catch(ClassCastException e){
            System.out.println("EL DATO ES NULO."+'\n'+"ERROR:"+" ("+e+")");
        }
    }
    
}
