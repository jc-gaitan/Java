
import java.util.Scanner;

public class aves {

    public static void main(String[] args) {
        Scanner esc=new Scanner(System.in);
        int num;
        //char res[];
        String res;
        
        
        String Adrian, Bruno, Goran;
        Adrian="ABCABCABCABC";
        Bruno="BABCBABCBABC";
        Goran="CCAABBCCAABB";
        
        int adrian=0, bruno=0, goran=0;
        int w=0;
        
        num=esc.nextInt();
        res=esc.next();
        //res=new char [num];
        
        /*for(int i=0;i<num;i++){
            res[i]=esc.next().charAt(0);//pedir por teclado un char
        }*/
        
        for(int i=0;i<res.length();i++){
            
            
            if(w>=Adrian.length()){
                w-=Adrian.length();
            }
            
            adrian+=VerificarRespuestas(res.substring(i, i + 1),Adrian.substring(w, w + 1));
            bruno+=VerificarRespuestas(res.substring(i, i + 1),Bruno.substring(w, w + 1));
            goran+=VerificarRespuestas(res.substring(i, i + 1),Goran.substring(w, w + 1));
            
            /*if (res.substring(i, i + 1).toUpperCase().equals(Adrian.substring(i, i + 1))) {
                System.out.println("Adrian");
                adrian++;
            }
            if (res.substring(i, i + 1).toUpperCase().equals(Bruno.substring(i, i + 1))) {
                System.out.println("Bruno");
                bruno++;
            }
            if (res.substring(i, i + 1).toUpperCase().equals(Goran.substring(i, i + 1))) {
                goran++;
                System.out.println("Goran");
            }*/
            w++;
        }   
        
        if(adrian==bruno && adrian==goran){
            System.out.println(adrian);
            System.out.println("Adrian\nBruno\nGoran");
        }else if(adrian==bruno && adrian>goran){
            System.out.println(adrian);
            System.out.println("Adrian\nBruno");
        }else if(adrian==goran && adrian>bruno){
            System.out.println(adrian);
            System.out.println("Adrian\nGoran");
        }else if(bruno==goran && bruno>adrian){
            System.out.println(bruno);
            System.out.println("Bruno\nGoran");
        }else if(adrian > bruno && adrian > goran){
            System.out.println(adrian);
            System.out.println("Adrian");
        }else if(bruno > adrian && bruno > goran){
            System.out.println(bruno);
            System.out.println("Bruno");
        }else if(goran > adrian && goran > bruno){
            System.out.println(goran);
            System.out.println("Goran");
        }
        
    }

    public static int VerificarRespuestas(String res, String a){
        //String res1=String.valueOf(res);//convertir un char en String

        int con=0;
        if (res.equals(a)) {
            con++;
        }
        return con;
    }
    
}
