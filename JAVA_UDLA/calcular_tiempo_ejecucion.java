public class Main {
    public static void main(String[] args) {
        // Obtener el tiempo de inicio
        long startTime = System.currentTimeMillis(); // o System.nanoTime() para mayor precisión

        // Coloque aquí el código que desea medir

        // Obtener el tiempo de finalización
        long endTime = System.currentTimeMillis(); // o System.nanoTime()

        // Calcular la duración en milisegundos (o nanosegundos)
        long duration = endTime - startTime;

        System.out.println("Tiempo de ejecución: " + duration + " ms");
    }
}