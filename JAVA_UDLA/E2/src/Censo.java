
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Censo {
    
    public int tamano; 
    public Persona personas[];
    public int x = 0;

    public Censo(int tamano) {
        this.tamano = tamano;
        personas = new Persona[this.tamano];
    }
    
    private void registrar(Persona per){
        try {
            //Persona per = new Persona(br.readLine(), Long.parseLong(br.readLine()), Integer.parseInt(br.readLine()), br.readLine().charAt(0));
            personas[x] = per;
            x++;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void Eresgistrar(Persona per){
        registrar(per);
    }
    
    public String ArregloCenso(){
        String Cpersonas = "";
        for (int i = 0; i < tamano; i++) {
            Cpersonas += personas[i] + "\n";
        }
        return Cpersonas;
    }
    
    public String Consulta(){
        
        int hombres = 0, mujeres = 0;
        int edadesH = 0, edadesM = 0;
        double promH = 0, promM = 0;
        String mensaje = "";
        
        for (int i = 0; i < tamano; i++) {
            if(personas[i].getGenero() == 'H' || personas[i].getGenero() == 'h'){
                hombres++;
                edadesH = edadesH + personas[i].getEdad();
            }else{
                mujeres++;
                edadesM = edadesM + personas[i].getEdad();
            }
        }
        
        if(hombres > 0){
            promH = edadesH / hombres;
            mensaje = "\nCantidad Hombres: " + hombres + "\tPromedio de edad: " + promH;
        }
        if(mujeres > 0){
            promM = edadesM / mujeres;
            mensaje += "\nCantidad Mujeres: " + mujeres + "\tPromedio de edad: " + promM;
        }
                     
        return mensaje;
    }
    
}
