
package NullPointerException;

public class Principal {

    public static void main(String[] args) {
        
        try{
            Persona a = null;
            a.toString();
        }catch(NullPointerException e){
            System.out.println("EL DATO ES NULO."+'\n'+"ERROR:"+" ("+e+")");
        }
    }
    
}
