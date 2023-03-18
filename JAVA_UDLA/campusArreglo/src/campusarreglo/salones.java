
package campusarreglo;

public class salones {
    int numSalones;
    String tipo;
    sillas silla[];

    public salones(int numSalones, String tipo, int cantSilla) {
        this.numSalones = numSalones;
        this.tipo = tipo;
        this.silla = new sillas[cantSilla];
    }
    
    public void crearSilla(String material, String color, int numSilla, int pos){
        silla[pos] = new sillas(material, color, numSilla);      
    }
    
    public boolean ingresarSilla(sillas s){
        for (int i=0; i<silla.length; i++){
            if (silla[i] == null){
                silla[i] = s;
                return true;
            }
        } 
        return false;
    }
    
    public String mostrarSillas(){
        String salida = "";
        for (int i=0; i<silla.length; i++){
            salida += silla[i].mostrarSillas() ;
        } 
        return salida;
    }
    
    public String EliminarSilla(sillas sill[], int numSilla){
        for (int i = 0; i < sill.length; i++) {
            if(sill[i].numSilla == numSilla){
                sill[i] = null;
                return "Se elimino con exito";
            }
        }
        return "Esa mierda no existe";
    }
    
    public String ModificarSilla(sillas sill[], int numSilla, int op, String dato){//op es la opcion que desea modificar
        for (int i = 0; i < sill.length; i++) {
            if(sill[i].numSilla == numSilla){
                switch (op){
                    case 1://material
                        sill[i].material = dato;
                        return "La silla fue modificada";
                    case 2://color
                        sill[i].color = dato;
                        return "La silla fue modificada";
                    case 3://numero silla
                        sill[i].numSilla = Integer.parseInt(dato);
                        return "La silla fue modificada";
                }
            }
        }
        return "La silla no existe";
    }

    public String mostrarSalones() {
        return "\tNumero del salon: " + numSalones + "\ttipo: " + tipo + "\n--------------------- Sillas ---------------------\n " + mostrarSillas();
    }
    
    public int BuscarSilla(int num){
        for (int i = 0; i < silla.length; i++) {
            if(silla[i].numSilla == num){
                return i;
            }
        }
        return -1;
    }
    
    
    
}
