
public class Banco {

    String nombre;
    private long codigo;
    private Cuenta cuentas[];
    private int i;

    public Banco(String nombre, long codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        cuentas = new Cuenta[5];
        i = 0;
    }

    public String AñadirCuenta(String titular, double saldo) {
        String text = "";

        for (int i = 0; i < cuentas.length; i++) {
            String numero = String.valueOf(codigo);
            numero += i;

            if (cuentas[i] == null) {
                cuentas[i] = new Cuenta(titular, Long.valueOf(numero), saldo);
                text = "LA CUENTA HA SIDO CREADA, SU NUMERO DE CUENTA ES: " + cuentas[i].getNumeroCuenta();
                break;
            }
        }

        if (text.equals("")) {
            text = "NO HAY ESPACIO PARA CREAR MAS CUENTAS.";
        }

        return text;

    }

    public String EliminarCuenta(long numeroCuenta) {
        String text = "";

        if (BuscarCuenta(numeroCuenta)) {
            cuentas[i] = null;
            text = "LA CUENTA HA SIDO ELIMINADA";
        } else {
            text = "NO EXISTE LA CUENTA";
        }

        return text;
    }

    public boolean BuscarCuenta(long numeroCuenta) {
        boolean x = false;

        for (i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                if (cuentas[i].getNumeroCuenta() == numeroCuenta) {
                    x = true;
                    break;
                }
            }
        }

        return x;

    }

    public String Retirar(long numerocuenta, double valor) {
        String text = "";
        if (BuscarCuenta(numerocuenta)) {
            text = "El retiro se ha realizado con exito, por un monto de: " + cuentas[i].Retirar(valor);
        } else {
            text = "LA CUENTA NO EXISTE";
        }

        return text;
    }

    public String Ingresar(long numerocuenta, double valor) {
        String text = "";
        if (BuscarCuenta(numerocuenta)) {
            cuentas[i].IngresarDinero(valor);
            text = "SE GUARDO EL DINERO CON EXITO";
        } else {
            text = "LA CUENTA NO EXISTE";
        }

        return text;
    }

    public String VerSaldo(long numeroCuenta) {
        String text = "";

        if (BuscarCuenta(numeroCuenta)) {
            return "El saldo de la cuenta es: " + cuentas[i].getSaldo();
        } else {
            return "LA CUENTA NO EXISTE";
        }

    }

    public double Dinero() {
        double dinero = 0;

        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                dinero += cuentas[i].getSaldo();
            }
        }

        return dinero;

    }

    public Cuenta BuscarCuenta2(long numeroCuenta) {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                if (cuentas[i].getNumeroCuenta() == numeroCuenta) {
                    return cuentas[i];
                }
            }
        }
        return null;
    }

    public String Transferencia(long origen, long destino, double valor) {
        Cuenta ori = BuscarCuenta2(origen);
        Cuenta des = BuscarCuenta2(destino);

        if (ori != null && des != null) {
            valor = ori.Retirar(valor);
            des.IngresarDinero(valor);
            return "La transferencia se ha realizado con exito. ";
        } else {
            return "Alguna de las dos cuentas no existe";
        }
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

}
