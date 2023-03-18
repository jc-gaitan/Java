
public class Metodos_Ordenamiento {

    long startTime;
    long endTime;
    long tiempo;

    public long shellsort(int A[]) {
        int salto, aux, i;
        boolean cambios;

        startTime = System.nanoTime();
        
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++) // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
        
        endTime = System.nanoTime();
        tiempo = (endTime - startTime);
        
        return tiempo;
    }

    public long InsertionSort(int[] A) {
        
        startTime = System.nanoTime();
        
        for (int i = 1; i < A.length; i++) { // Insert i'th record
            int j;
            int temp = A[i];
            for (j = i; (j > 0) && (temp < A[j - 1]); j--) {
                A[j] = A[j - 1];
            }
            A[j] = temp;
        }
        
        endTime = System.nanoTime();
        tiempo = (endTime - startTime);
        
        return tiempo;
    }

    public long SelectionSort(int arr[]) {
        
        startTime = System.nanoTime();
        
        int n = arr.length;
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        
        endTime = System.nanoTime();
        tiempo = (endTime - startTime);
        
        return tiempo;
    }

    public long bubbleSort(int arr[]) {
        
        startTime = System.nanoTime();
        
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        endTime = System.nanoTime();
        tiempo = (endTime - startTime);
        
        return tiempo;
    }

}
