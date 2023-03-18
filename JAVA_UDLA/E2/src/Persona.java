
public class Persona {
    
    private String nombre;
    private long cc;
    private int edad;
    private char genero;

    public Persona() {
    }

    public Persona(String nombre, long cc, int edad, char genero) {
        this.nombre = nombre;
        this.cc = cc;
        this.edad = edad;
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public long getCc() {
        return cc;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setCc(long cc) {
        this.cc = cc;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tcc: " + cc + "\tedad: " + edad + "\tgenero: " + genero;
    }
    
    
    
}
