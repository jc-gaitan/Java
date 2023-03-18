/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

/**
 *
 * @author Argenis Figueroa
 */
public class verificarCuenta implements Runnable{
    private cuentaBancaria cb = new cuentaBancaria();
    private synchronized void hacerRetiro(int cantidad) throws InterruptedException{
        if(cb.getSaldo()>= cantidad){
            System.out.println(Thread.currentThread().getName() + "realizando un retiro: " + cantidad + ".");
            Thread.sleep(2000);
            cb.retiro(cantidad);
            System.out.println(Thread.currentThread().getName() + "retiro realizado");
            System.out.println(Thread.currentThread().getName() + "los fondos son de : " + cb.getSaldo());
        }else{
            System.out.println("No hay dinero suficiente " + Thread.currentThread().getName()); 
            System.out.println("Saldo actual" + cb.getSaldo());
            Thread.sleep(2000);
        }
    }

    @Override
    public void run() {
        for (int i=0; i<=5; i++){
            try{
                this.hacerRetiro(10);
                if(cb.getSaldo()<0){
                    System.out.println("la cuenta esta sobregirada");
                }
            }catch(InterruptedException ex){
                System.out.println("Alerta... registra log de seguridad ");
                
            }
        }
    }
    
}
