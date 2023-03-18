package campusarreglo;

public class campus {

    String nombre;
    bloques[] bloque;

    public campus(String nombre, int cantBloque) {
        this.nombre = nombre;
        this.bloque = new bloques[cantBloque];
    }

    public void CrearBloque(int numBloque, int cantSalon, int pos) {
        bloque[pos] = new bloques(numBloque, cantSalon);
    }
    
    public String EliminarBloque(bloques bloque[], int numBloque){
        for (int i = 0; i < bloque.length; i++) {
            if(bloque[i].numBloque == numBloque){
                bloque[i] = null;
                return "Se elimino con exito";
            }
        }
        return "Esa mierda no existe";
    }
    
    public String ModificarSalon(bloques bloque[], int numBloque, int op, String dato){//op es la opcion que desea modificar
        for (int i = 0; i < bloque.length; i++) {
            if(bloque[i].numBloque == numBloque){
                switch (op){
                    case 1://numero bloque
                        bloque[i].numBloque = Integer.parseInt(dato);
                        return "El bloque fue modificado";
                    case 2://Salon ---> esta perro
                        
                        return "La salon fue modificado";
                }
            }
        }
        return "La silla no existe";
    }

    public String mostrarBloques() {
        String salida = "";
        for (int i = 0; i < bloque.length; i++) {
            salida += bloque[i].mostrarBloques();
        }
        return salida;
    }

    public String mostrarCampus() {
        return "--------------------- CAMPUS ---------------------\n" + "Nombre: " + nombre + "\n--------------------- Bloque ---------------------\n " + mostrarBloques();
    }
    
    public int BuscarBloque(int num){
        for (int i = 0; i < bloque.length; i++) {
            if(bloque[i].numBloque == num){
                return i;
            }
        }
        return -1;
    }

}
