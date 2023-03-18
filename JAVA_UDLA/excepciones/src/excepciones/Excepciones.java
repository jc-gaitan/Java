
package excepciones;

public class Excepciones {

    public static void main(String[] args) {
        try{//un try puede tener varios catch
            System.out.println(3/0);
            System.out.println("Hice la division");
        }catch(ArithmeticException e){//entre los parentesis del catch, va el nombre de la excepcion que se quiere atrapar, con una variable
            System.out.println("LA DIVISION NO PERMITIDA."+'\n'+"ERROR:"+" ("+e+")");
        }catch(NullPointerException e){
            System.out.println("Punto nulo");
        }catch(Exception e){//siempre se poner de ultimo.
            System.out.println("ERROR");
        }finally{//cuando hay un finally siempre se ejecuta independientemente de si hay algun error o no.
            System.out.println("EJECUTO");
        }

    }
    
}
