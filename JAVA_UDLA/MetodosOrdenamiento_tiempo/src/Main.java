
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Metodos_Ordenamiento or = new Metodos_Ordenamiento();

        ArrayList<int[]> arl = new ArrayList<int[]>();

        int SizeOne = 10, SizeTwo = 50;

        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                arl.add(GenerarNumeros(SizeOne));
                SizeOne *= 10;
            } else {
                arl.add(GenerarNumeros(SizeTwo));
                SizeTwo *= 10;
            }
        }

        for (int i = 0; i < arl.size(); i++) {
            //System.out.println(Arrays.toString(arl.get(i)));
            System.out.println("Arreglo " + i + ": ");
            System.out.println("BubbleSort = " + or.bubbleSort(arl.get(i)) + " nanosegundos");
            System.out.println("SelectionSort = " + or.SelectionSort(arl.get(i)) + " nanosegundos");
            System.out.println("InsertionSort = " + or.InsertionSort(arl.get(i)) + " nanosegundos");
            System.out.println("shellsort = " + or.shellsort(arl.get(i)) + " nanosegundos");
            
            System.out.println("");
        }

    }

    public static int[] GenerarNumeros(int size) {
        int numeros[] = new int[size];
        int numeroAleatorio;
        for (int i = 0; i < size; i++) {
            numeroAleatorio = (int) (Math.random() * 199 + 100);
            numeros[i] = numeroAleatorio;
        }

        return numeros;
    }

    public static void MedirTiempo() {
        long startTime = System.nanoTime();

        // ...
        // El resto del código
        long endTime = System.nanoTime();

        long tiempo = (endTime - startTime);
    }

}
