
public class Empleado {
    
    int codigo;
    String nombre;
    String apellido;
    char genero;
    double salario;
    int diasTrabajados;
    
    public Empleado(int codigo, String nombre, String apellido, char genero, double salario, int dias){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        diasTrabajados = dias;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", salario=" + salario + ", diasTrabajados=" + diasTrabajados;
    }
    
    public String toString2() {
        return  "Nombre: " + nombre + "\nApellido: " + apellido + "\nGenero: " + genero + "\nSalario: " + salario + "\nDias Trabajados: " + diasTrabajados + '\n' ;
    }
    
    
    
}
