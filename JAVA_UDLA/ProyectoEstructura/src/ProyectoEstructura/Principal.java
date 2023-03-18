package ProyectoEstructura;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Principal {

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader tec = new BufferedReader(isr);

    public static void main(String[] args) {
        Arbol a = new Arbol();
        int res = 0;
        
// este es 
        try {
            System.out.println("Opcion: ");
            System.out.println("1. Crear manualmente los Empleados. ");
            System.out.println("2. Crear automaticamente los Empleados. ");
            res = Integer.parseInt(tec.readLine());
            if (res == 2) {
                Empleado b = new Empleado("Jorge Calderon", 981016607);
                a.insertar(b);
                b.LlenarVentas(new Venta("25-10-2017", "1523DFA", "AHG152", 1000, 3));
                b.LlenarVentas(new Venta("24-08-2017", "156HJK", "TYR786", 10523, 2));
                b.LlenarVentas(new Venta("30-05-2017", "753HGF", "RTG123", 12032, 5));
                b.LlenarVentas(new Venta("01-08-2017", "023GH", "ASD013", 4783, 6));

                b = new Empleado("Julian Cabrera", 55078612);
                a.insertar(b);
                b.LlenarVentas(new Venta("05-09-2017", "145AFG", "RTY8452", 5230, 2));
                b.LlenarVentas(new Venta("25-11-2017", "012FGH", "ERT1452", 10563, 5));

                b = new Empleado("Andres Rojas", 1117561426);
                a.insertar(b);
                b.LlenarVentas(new Venta("25-10-2017", "012ERT", "AQE752", 25300, 3));
                b.LlenarVentas(new Venta("28-10-2017", "745QWE", "CXZ012", 1530, 5));

                b = new Empleado("Maicol Restrepo", 1114528745);
                a.insertar(b);
                b.LlenarVentas(new Venta("25-10-2017", "145POL", "DFS172", 14203, 3));
                b.LlenarVentas(new Venta("04-05-2017", "730MJK", "QWE032", 500, 10));
                b.LlenarVentas(new Venta("16-10-2017", "1523DFA", "AHG152", 1056, 10));
            }

            while (Menu(a)) {
            }
        } catch (Exception ex) {
        }
    }

    public static boolean Menu(Arbol a) {
        int res = 0;
        String nombre;
        long codigo;
        NodoArbol aux;

        String fecha;
        String codVenta;
        String codProducto;
        double precio;
        int cantidad;
        boolean x;

        try {
            System.out.println("MENU. ");
            System.out.println("1. Agregar Empleado. ");
            System.out.println("2. Buscar Empleado. ");
            System.out.println("3. Eliminar Empleado. ");
            System.out.println("4. Mostrar Empleados. ");
            System.out.println("5. Eliminar Venta. ");
            System.out.println("6. Agregar Venta. ");
            System.out.println("7. Modificar Venta.");
            //System.out.println("8. Mostrar El empleado con el mayor numero de ventas. ");
            System.out.println("8. Mostrar los Empleados con Ventas mayores a 50.000");
            System.out.println("9. Salir. ");
            res = Integer.parseInt(tec.readLine());

            switch (res) {
                case 1:
                    //Empleado(String nombre, long codigo)
                    System.out.println("Ingrese el nombre del Empleado: ");
                    nombre = tec.readLine();
                    System.out.println("Ingrese el codigo del Empleado: ");
                    codigo = Long.parseLong(tec.readLine());
                    Empleado b = new Empleado(nombre, codigo);
                    a.insertar(b);
                    x = true;
                    while (x) {
                        System.out.println("1. Ingresar Venta. ");
                        System.out.println("2. No ingresar mas ventas. ");
                        res = Integer.parseInt(tec.readLine());
                        switch (res) {
                            case 1:
                                System.out.println("Ingrese la fecha de la venta (dia-mes-año): ");
                                fecha = tec.readLine();
                                System.out.println("Ingrese el codigo de la venta: ");
                                codVenta = tec.readLine();
                                System.out.println("Ingrese el codigo del producto: ");
                                codProducto = tec.readLine();
                                System.out.println("Ingrese el precio del producto: ");
                                precio = Double.parseDouble(tec.readLine());
                                System.out.println("Ingrese la cantidad: ");
                                cantidad = Integer.parseInt(tec.readLine());
                                b.LlenarVentas(new Venta(fecha, codVenta, codProducto, precio, cantidad));
                                break;
                            case 2:
                                x = false;
                                break;
                        }
                    }
                    return true;
                   
                case 2:
                    System.out.println("Ingrese el codigo del Empleado que desea buscar: ");
                    codigo = Long.parseLong(tec.readLine());
                    aux = a.Buscar(codigo);
                    if (aux == null) {
                        System.out.println("El empleado NO EXISTE. ");
                    } else {
                        System.out.println("El empleado es:\n" + aux.dato);
                    }
                    return true;
                case 3:
                    System.out.println("Ingrese el codigo del Empleado que desea Eliminar: ");
                    codigo = Long.parseLong(tec.readLine());
                    if (a.Eliminar(codigo)) {
                        System.out.println("EL EMPLEADO HA SIDO ELIMINADO. ");
                    } else {
                        System.out.println("EL EMPLEADO NO EXISTE. ");
                    }
                    return true;
                case 4:
                    a.InOrden(a.raiz);
                    return true;
                case 5:
                    System.out.println("Ingrese el codigo del empleado: ");
                    codigo = Long.parseLong(tec.readLine());
                    aux = a.Buscar(codigo);
                    if (aux != null) {
                        System.out.println("Ingrese el codigo de la Venta que desea Eliminar: ");
                        codVenta = tec.readLine();
                        if (aux.dato.Ventas.Eliminar(codVenta)) {
                            System.out.println("LA VENTA HA SIDO ELIMINADA. ");
                        } else {
                            System.out.println("LA VENTA NO EXISTE. ");
                        }
                    } else {
                        System.out.println("EL EMPLEADO NO EXISTE. ");
                    }

                    return true;
                case 6:

                    System.out.println("Ingrese el codigo del empleado: ");
                    codigo = Long.parseLong(tec.readLine());
                    aux = a.Buscar(codigo);

                    if (aux != null) {

                        System.out.println("Ingrese la nueva fecha de la venta (dia-mes-año): ");
                        fecha = tec.readLine();
                        System.out.println("Ingrese el nuevo codigo de la venta: ");
                        codVenta = tec.readLine();
                        System.out.println("Ingrese el nuevo codigo del producto: ");
                        codProducto = tec.readLine();
                        System.out.println("Ingrese el nuevo precio del producto: ");
                        precio = Double.parseDouble(tec.readLine());
                        System.out.println("Ingrese la nueva  cantidad: ");
                        cantidad = Integer.parseInt(tec.readLine());
                        aux.dato.Ventas.Insertar(new Venta(fecha, codVenta, codProducto, precio, cantidad));
                        System.out.println("LA VENTA HA SIDO GUARDADA. ");
                    } else {
                        System.out.println("EL EMPLEADO NO EXISTE. ");
                    }
                    return true;
                case 7:
                    while (res != 5) {

                        System.out.println("Ingrese el codigo del empleado: ");
                        codigo = Long.parseLong(tec.readLine());
                        aux = a.Buscar(codigo);

                        if (aux != null) {
                            System.out.println("Ingrese el codigo de la Venta que desea MODIFICAR: ");
                            codVenta = tec.readLine();
                            NodoLista aux2 = aux.dato.Ventas.Buscar2(codVenta);
                            if (aux2 != null) {
//                               
                                System.out.println("QUE DESEA MODIFICAR? ");
                                System.out.println("1. La Fecha. ");
                                System.out.println("2. El codigo de producto. ");
                                System.out.println("3. El precio de producto. ");
                                System.out.println("4. La cantidad. ");
                                System.out.println("5.Salir");
                                res = Integer.parseInt(tec.readLine());
                                switch (res) {
                                    case 1:
                                        System.out.println("Ingrese la fecha de la venta (dia-mes-año): ");
                                        fecha = tec.readLine();
                                        aux2.dato.fecha = fecha;
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el codigo del producto: ");
                                        codProducto = tec.readLine();
                                        aux2.dato.codProducto = codProducto;
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el precio del producto: ");
                                        precio = Double.parseDouble(tec.readLine());
                                        aux2.dato.precio = precio;
                                        aux2.dato.venta = aux2.dato.cantidad * aux2.dato.precio;
                                        break;
                                    case 4:
                                        System.out.println("Ingrese la cantidad: ");
                                        cantidad = Integer.parseInt(tec.readLine());
                                        aux2.dato.cantidad = cantidad;
                                        aux2.dato.venta = aux2.dato.cantidad * aux2.dato.precio;
                                        break;
                                    default:
                                        System.out.println("LA OPCION NO EXISTE. ");
                                }

                            } else {
                                System.out.println("LA VENTA NO EXISTE. ");

                            }
                        } else {
                            System.out.println("EL EMPLEADO NO EXISTE. ");
                        }
                    }

                    return true;
                case 8:
                    a.MostrarMayores(a.raiz);
                    return true;
                case 9:
                    return false;
                default:
                    System.out.println("LA OPCION NO EXISTE. ");
            }
        } catch (Exception ex) {

        }
        return true;
    }

}
