public class MemoriaRAM {

    public static void main(String[] args) {
        
        // Obtener la instancia de la clase Runtime
        Runtime runtime = Runtime.getRuntime();

        // Obtener la memoria total disponible
        long memoriaTotal = runtime.totalMemory();

        // Obtener la memoria libre disponible
        long memoriaLibre = runtime.freeMemory();

        // Calcular la memoria utilizada
        long memoriaUtilizada = memoriaTotal - memoriaLibre;

        // Imprimir la cantidad de memoria RAM disponible y utilizada
        System.out.println("Memoria RAM disponible: " + memoriaLibre / 1024 + " KB");
        System.out.println("Memoria RAM utilizada: " + memoriaUtilizada / 1024 + " KB");
    }
}