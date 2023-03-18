
package ArrayIndexOutOfBoundsException;

public class Principal {

    public static void main(String[] args) {
        int []a=new int[1];
        try{
            a[2]=1;
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("SE SALE DEL TAMAÑO DEL ARREGLO."+'\n'+"ERROR:"+" ("+e+")");
        }
    }
    
}
