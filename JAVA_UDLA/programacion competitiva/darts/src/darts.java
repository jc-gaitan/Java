
import java.util.Scanner;

public class darts {

    public static void main(String[] args) {
//        Eratostenes miObjeto = new Eratostenes();
//        System.out.print("{");
//        // Se llama al metodo Principal
//        miObjeto.Principal();
//        System.out.println("}");

        int numer[] = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599,};
        Scanner esc = new Scanner(System.in);
        try {
            int casos = esc.nextInt();
            for (int j = 0; j < casos; j++) {
                int n = esc.nextInt();
                int resul = esc.nextInt();
                //coger el arreglo hasta n
                int aux = 0;
                int con = 0;
                int num[] = new int[n];
                for (int i = 0; i < n; i++) {
                    num[i] = numer[i];
                }

                aux = resul / num[num.length - 1];
                con = aux;//cantidad de lansamientos
                aux = aux * num[num.length - 1];
                aux = resul - aux;
                int kk = 0;
                while (aux > 0) {
                    kk = busquedaBinaria(num, aux);
                    aux = aux - kk;
                    con++;
                }

                System.out.println(con);
            }

        } catch (Exception e) {
        }
    }

    public static int busquedaBinaria(int vector[], int dato) {
        int n = vector.length;
        int centro = 0, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro] == dato) {
                return vector[centro];
            } else if (dato < vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return vector[centro - 1];
    }

}
