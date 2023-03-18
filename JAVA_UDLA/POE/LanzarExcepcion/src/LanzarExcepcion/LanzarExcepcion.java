package LanzarExcepcion;

public class LanzarExcepcion {

    public static void main(String[] args) {
        double a, b, c;
        a = 15.0;
        b = 0.0;
        
        try{
            System.out.println("El resultado de la disivion de " + a + " entre " + b + " es " + divi(a, b));
        }catch(Exception e){
            System.out.println("No se puede realizar la division por 0.0");
            System.out.println("el objeto lanzado "+e.toString());
        }

        

    }

    public static double divi(double a, double b) throws Exception {
        double rta;
        if (b != 0) {
            rta = a / b;
        } else {
            throw new Exception();
        }
        return rta;

    }
}
