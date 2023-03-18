
public class Cuenta {
    
    private String titular;
    private long numeroCuenta;
    private double saldo;
    
    public Cuenta(String titular, long numeroCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        saldo = 0;
    }
    
    public Cuenta(String titular, long numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void IngresarDinero(double cantidad){        
        saldo += cantidad;        
    }
    
    public double Retirar(double cantidad){
        double can;
        if(saldo < cantidad){
            can = saldo;
            saldo = 0;
            //return "La cuenta no tiene fondos suficientes, solo puedo retirar: "+saldo;
        }else{
            saldo -= cantidad;
            can = cantidad;
            //return "El retiro se ha realizado con exito. ";
        }
        
        return can;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta: " + "\nTitular: " + titular + "\nNumero de cuenta: " + numeroCuenta + "\nSaldo: " + saldo;
    }
    
}
