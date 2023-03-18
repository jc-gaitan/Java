
public class Main {

    public static void main(String[] args) {
        /*String a = "qwertyuiopasdfghjkl;zxcvbnm,./";
        a = a.toUpperCase();
        char letras[] = a.toCharArray();
        char letra = 'e';
        String l = "e";
        String text = "";
        for (int i = 0; i < letras.length; i++) {
            if(letras[i] == letra){
                text += letras[i];
            }
        }*/
        
        /*
        
        char w = 'w';
        System.out.println((int)'a'-96+"\n\n");
        String asd = "1452";
        char lou[] = asd.toCharArray();
        for (int i = 0; i < asd.length(); i++) {
            System.out.println(lou[i]);
        }
        
        */
        String name = "shanto";
        name = name.toLowerCase();
        char lname[] = name.toCharArray();
        int acum = 0;
        for (int i = 0; i < lname.length; i++) {
            acum += lname[i]-96;
        }
        String numero = "";
        numero += acum;
        System.out.println(numero);
        char nacum[]= numero.toCharArray();
        acum = 0;
        for (int i = 0; i < nacum.length; i++) {
            acum += nacum[i]-48;
        }
        System.out.println(acum);
        
    }
    
}
