
package ArrayStoreException;

public class Principal {

    public static void main(String[] args) {
        Object x[] = new String[3];
        try{
            x[0] = new Integer(0);
        }catch(ArrayStoreException e){
            System.out.println("EL TIPO NO COINCIDE."+'\n'+"ERROR:"+" ("+e+")");
        }
    }
    
}
