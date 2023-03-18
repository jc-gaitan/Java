
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class feliz {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int nume;
        int acum = 0;

        try {
            int num = Integer.parseInt(br.readLine());

            for (int i = 0; i < num; i++) {
                numero = Integer.parseInt(br.readLine());
                /*String numeros[] = numero.split("");
                //nume = new int[numeros.length];
                for (int j = 0; j < numeros.length; j++) {
                    nume = Integer.parseInt(numeros[j]);
                    nume = nume * nume;
                    acum = acum + nume;
                }*/
                int w = operacion(numero);
                if (w == 1) {
                    System.out.println("feliz");
                } else {
                    System.out.println("desafortunado");
                }
            }
        } catch (Exception e) {

        }

    }

    public static int operacion(int numero) {
        String a = String.valueOf(numero);
        int num;
        int acum = 0;
        String res = "20";
        int w = 0;
        

        //num = Integer.parseInt(a.substring(0, 1));
        for (int i = 0; i < a.length(); i++) {
            num = Integer.parseInt(a.substring(i, i + 1));
            numero = num * num;
            acum = acum + numero;
        }
        res = String.valueOf(acum);
        if (res.length() != 1) {
            w = operacion(acum);
        }else{
            w = acum;
        }
        return w;
        
        /*if(acum==1){
            return acum;
        }else{
           return operacion(acum);
        }*/
    }

}
