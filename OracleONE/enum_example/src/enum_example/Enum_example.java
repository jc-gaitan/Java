
package enum_example;

public class Enum_example {
    
    /*
    Se debe usar este tipo de datos cuando se van a representar constantes
    */

    public static void main(String[] args) {
        //Mostrar los valores del enum
        for (Dias dia: Dias.values()) {
            System.out.println("El dia de la semana es: " + dia);
        }
        
        Dias domingo = Dias.DOMINGO;
        System.out.println("\n"+ domingo);
        System.out.println(domingo.name());//nombre en el enum
        System.out.println(domingo.ordinal());//posicion dentro del enum
        System.out.println(domingo.toString());//convertir del tipo enum al tipo string
    }
    
}
