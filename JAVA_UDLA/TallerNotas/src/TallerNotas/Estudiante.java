
package TallerNotas;

public class Estudiante {
    long identificacion;
    String  nombre;
    String  apellido;
    double promedio;

    public Estudiante(long identificacion, String nombre, String apellido, double promedio) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Identificacion: " + identificacion + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nPromedio: " + promedio;
    }
    
    
    
}
