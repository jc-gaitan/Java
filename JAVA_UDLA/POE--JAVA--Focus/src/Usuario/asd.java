package Usuario;

public class asd {

    String nombre;
    String fruta;
    String bebida;
    char genero;
    

    public asd(String nombre, String fruta, String bebida, char genero) {
        this.nombre = nombre;
        this.fruta = fruta;
        this.bebida = bebida;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", fruta=" + fruta + ", bebida=" + bebida + ", genero=" + genero;
    }

}
