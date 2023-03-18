
import java.util.Scanner;

public class Principal {

    static Banco bancos[];

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int res = 0;
        int cantidad;
        int pos;
        double saldo;
        String nombre;
        long codigo;

        try {

            System.out.println("Cuantos bancos desea crear: ");
            cantidad = esc.nextInt();
            bancos = new Banco[cantidad];

            for (int i = 0; i < bancos.length; i++) {
                System.out.println("\nIngrese el nombre del banco numero " + (i + 1) + ": ");
                nombre = esc.next();
                System.out.println("Ingrese el codigo del banco: ");
                codigo = esc.nextLong();
                bancos[i] = new Banco(nombre, codigo);
            }
            
            Menu(res, esc);
            
        } catch (Exception e) {
            System.out.println("SE PRODUJO UN ERROR INESPERADO");
            System.exit(0);
        }

    }

    static public void Menu(int res, Scanner esc) {
        boolean x, y;
        x = y = true;
        int pos;
        double saldo;
        String nombre;
        long codigo;

        while (x) {
            System.out.println("\nMenu");
            System.out.println("1. Escojer banco.");
            System.out.println("2. Salir");
            res = esc.nextInt();

            switch (res) {
                case 1:

                    System.out.println("Ingrese el codigo del banco que desea manipular: ");
                    codigo = esc.nextLong();
                    pos = BuscarBanco(codigo);

                    if (pos != -1) {

                        while (y) {
                            System.out.println("\nMenu Banco");
                            System.out.println("1. Añadir cuenta. ");
                            System.out.println("2. Eliminar cuenta. ");
                            System.out.println("3. Retirar dinero. ");
                            System.out.println("4. Ingresar dinero. ");
                            System.out.println("5. Ver datos de una cuenta. ");
                            System.out.println("6. Hacer transferencia entre cuentas. ");
                            System.out.println("7. Ver el dinero del banco. ");
                            System.out.println("8. Salir. ");
                            res = esc.nextInt();

                            switch (res) {
                                case 1:
                                    System.out.println("Ingrese el nombre del titular: ");
                                    nombre = esc.next();
                                    System.out.println("Ingrese el saldo de la cuenta: ");
                                    saldo = esc.nextDouble();
                                    System.out.println(bancos[pos].AñadirCuenta(nombre, saldo));
                                    y = true;
                                    break;
                                case 2:
                                    System.out.println("Ingrese el numero de la cuenta que desea eliminar: ");
                                    codigo = esc.nextLong();
                                    System.out.println(bancos[pos].EliminarCuenta(codigo));
                                    y = true;
                                    break;
                                case 3:
                                    System.out.println("Ingrese el numero de cuenta: ");
                                    codigo = esc.nextLong();
                                    System.out.println("Ingrese la cantidad que desea retirar: ");
                                    saldo = esc.nextDouble();
                                    System.out.println(bancos[pos].Retirar(codigo, saldo));
                                    y = true;
                                    break;
                                case 4:
                                    System.out.println("Ingrese el numero de cuenta: ");
                                    codigo = esc.nextLong();
                                    System.out.println("Ingrese la cantidad que desea guardar: ");
                                    saldo = esc.nextDouble();
                                    System.out.println(bancos[pos].Ingresar(codigo, saldo));
                                    y = true;
                                    break;
                                case 5:
                                    System.out.println("Ingrese el numero de cuenta: ");
                                    codigo = esc.nextLong();
                                    System.out.println(bancos[pos].BuscarCuenta2(codigo).toString());
                                    y = true;
                                    break;
                                case 6:
                                    System.out.println("Ingrese el numero de cuenta Origen: ");
                                    codigo = esc.nextLong();
                                    System.out.println("Ingrese el numero de cuenta Destino: ");
                                    long des = esc.nextLong();
                                    System.out.println("Ingrese el valor a transferir: ");
                                    bancos[pos].Transferencia(codigo, des, esc.nextDouble());
                                    y = true;
                                    break;
                                case 7:
                                    System.out.println("El Banco cuenta con: " + bancos[pos].Dinero());
                                    y = true;
                                    break;
                                case 8:
                                    y = false;
                                    break;
                                default:
                                    System.out.println("LA OPCION NO EXITE");
                                    y = true;
                            }
                        }

                    } else {
                        System.out.println("EL BANCO NO EXISTE");
                    }

                    x = true;
                    break;
                case 2:
                    x = false;
                    break;
                default:
                    System.out.println("LA OPCION NO EXISTE");
                    x = true;
            }
        }
    }

    public static int BuscarBanco(long codigo) {
        int pos = -1;

        for (int i = 0; i < bancos.length; i++) {
            if (bancos[i].getCodigo() == codigo) {
                pos = i;
            }
        }

        return pos;
    }

}
