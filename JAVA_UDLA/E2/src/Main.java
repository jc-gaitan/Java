
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        int tamano;
        Persona per;
        String nombre;
        long cc;
        int edad;
        char genero;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        System.out.print("Ingrese el tamaño del censo: ");
        try {
            tamano = Integer.parseInt(br.readLine());
            Censo censo = new Censo(tamano);
            for (int i = 0; i < tamano; i++) {
                System.out.println("\nPersona numero " + (i+1));
                System.out.print("Ingrese el nombre: ");
                nombre = br.readLine();
                System.out.print("Ingrese la cc: ");
                cc = Long.parseLong(br.readLine());
                System.out.print("Ingrese la edad: ");
                edad = Integer.parseInt(br.readLine());
                System.out.print("Ingrese el genero (H-M): ");
                genero = br.readLine().charAt(0);
                per = new Persona(nombre, cc, edad, genero);
                censo.Eresgistrar(per);
            }
            System.out.println(censo.Consulta());
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
