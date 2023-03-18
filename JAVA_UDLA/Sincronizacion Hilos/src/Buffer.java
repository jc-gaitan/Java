
public class Buffer {
    private char contenido;
    private boolean disponible=false;
    
    public Buffer(){ 
    }
    
//    public void poner(char c){ //solo recibe y actualiza
//        contenido=c;
//        disponible=true;
//    }
    
//    public char recoger(){  //no necesita parametros, solo debe traer
//        if(disponible){
//            disponible=false;
//            return contenido;
//        }
//        return '*'; //('\t');
//    }
//    
    public synchronized void poner (char c){
        while (disponible) {
            try {
                wait();
            } catch (Exception e) {
            }
            
        }
        contenido=c;
        disponible=true;
        notify();
    }
    
    public synchronized char recoger(){
        while (!disponible) {
            try {
                wait();
            } catch (Exception e) {
            }
            
        }
       disponible =false;
       notify();
       return contenido;
    }
}
