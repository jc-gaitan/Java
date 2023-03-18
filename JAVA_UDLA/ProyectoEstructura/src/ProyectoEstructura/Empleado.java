package ProyectoEstructura;

public class Empleado {

    String nombre;
    long codigo;
    Lista Ventas;
    
    public Empleado(String nombre, long codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        Ventas=new Lista();
    }
    
    public void LlenarVentas(Venta a){
        Ventas.Insertar(a);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCodigo: " + codigo + "\nVentas: \n" + Ventas.Mostrar();
    }
    
    
   
}
