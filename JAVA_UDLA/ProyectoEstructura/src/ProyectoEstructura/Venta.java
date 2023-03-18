package ProyectoEstructura;

public class Venta {

    String fecha;
    String codVenta;
    String codProducto;
    double precio;
    int cantidad;
    double venta;

    public Venta(String fecha, String codVenta, String codProducto, double precio, int cantidad) {
        this.fecha = fecha;
        this.codVenta = codVenta;
        this.codProducto = codProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        venta = this.precio * this.cantidad;
    }

    @Override
    public String toString() {
        return "Codigo Venta: " + codVenta + "\tFecha: " + fecha + "\t Codigo del Producto: " + codProducto + "\tPrecio: " + precio + "\tCantidad: " + cantidad + "\tVenta: " + venta;
    }

}
