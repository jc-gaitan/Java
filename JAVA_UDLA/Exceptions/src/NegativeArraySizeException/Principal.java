
package NegativeArraySizeException;

public class Principal {

    public static void main(String[] args) {
        try{
            int [] a = new int[-1];
        }catch(java.lang.NegativeArraySizeException e){
            System.out.println("EL DATO ES NULO."+'\n'+"ERROR:"+" ("+e+")");
        }
    }
    
}
