
import java.util.Scanner;
import java.util.Arrays;

public class abc {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int num[] = new int[3];
        int aux;
        String letras;
        
        num[0] = esc.nextInt();
        num[1] = esc.nextInt();
        num[2] = esc.nextInt();
        letras=esc.next();
        
        /*for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]>num[j]){
                    aux=num[i];
                    num[i]=num[j];
                    num[j]=aux;
                }
            }
        }*/
        
        Arrays.sort(num);
        
        /*if(letras.substring(0, 1).equals("A")){
            System.out.print(num[0]+" ");  
        }else if(letras.substring(0, 1).equals("B")){
            System.out.print(num[1]+" ");
        }else{
            System.out.print(num[2]+" ");
        }
        
        if(letras.substring(1, 2).equals("A")){
            System.out.print(num[0]+" ");
        }else if(letras.substring(1, 2).equals("B")){
            System.out.print(num[1]+" ");
        }else{
            System.out.print(num[2]+" ");
        }
        
        if(letras.substring(2, 3).equals("A")){
           System.out.print(num[0]+" "); 
        }else if(letras.substring(2, 3).equals("B")){
            System.out.print(num[1]+" ");
        }else{
            System.out.print(num[2]+" ");
        }
        System.out.println("\b");*/
        
        System.out.println(num[letras.substring(0, 1).charAt(0) - "A".charAt(0)]+" "+num[letras.substring(1, 2).charAt(0) - "A".charAt(0)]+" "+num[letras.substring(2, 3).charAt(0) - "A".charAt(0)]);
    }

}
