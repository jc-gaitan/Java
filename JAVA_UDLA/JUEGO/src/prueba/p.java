
package prueba;

public class p {

   
    public static void main(String[] args) {
     int t,h,m,s;
     t=3700;
     
      h=t/60;
        if (t%60==0) {
           
            System.out.println("d "+h);
        }else{
            m=t%60;
            System.out.println(h+"a "+m);
        } 
            
    }
    
}
