
package saldo_hilos;

public  class cuenta implements Runnable {
    
    private retiro re =new retiro();
    
    public synchronized void Hacerretiro(int cantidad) throws InterruptedException{
        if (re.getSaldo() >= cantidad) {
            System.out.println(Thread.currentThread().getName()+"esta realizando un retiro de:"+cantidad+".");
            Thread.sleep(2000);
            re.retirobancario(cantidad);
            
            System.out.println(Thread.currentThread().getName()+":Retiro realizado.");
            System.out.println(Thread.currentThread().getName()+":Los fondos son de:"+re.getSaldo());
        }else{
            System.out.println("No hay suficiento dinero en la cuenta para realizar el retiro Sr."+Thread.currentThread().getName());
            System.out.println("Su saldo actual es de"+re.getSaldo());
        }
    }
    
    @Override
    public void run(){
        for (int i = 0; i <=5; i++) {
            try{
              this.Hacerretiro(10);
                if (re.getSaldo() < 0) {
                    System.out.println("La cuenta esta sobregirada.");
                    
                }
            }catch(InterruptedException ex){
                System.out.println("Alerta ..registrar log de seguridad");
            }
            
        }
        
    }
    
}
