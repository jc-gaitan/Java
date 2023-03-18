
package hilos2;

public class Buffer {
    
   private char contenido;
   private boolean disponible = false;
   
   public Buffer(){
   }
   
//   public void poner(char c){
//       contenido = c;
//       disponible = true;
//   }
   
   public synchronized void poner(char c){
      while(disponible){
           try{
               wait();
            }catch(InterruptedException e){
              
            }
        }
       contenido=c;
       disponible=true;
       notify(); // informa sobre la situacion
    }
   
//   public char recoger(){
//       if(disponible){
//           disponible = false;
//           return contenido;
//       }
//       return '=';
//   }
   
   synchronized char recoger(){
      while(!disponible){
           try{
               wait();
            }catch(InterruptedException e){ 
                
            }
        }
       disponible=false;
       notify();
       return contenido;
    }
}
