package campusarreglo;

public class bloques {

    int numBloque;
    salones[] salon;

    public bloques(int numBloque, int cantSalon) {
        this.numBloque = numBloque;
        this.salon = new salones[cantSalon];
    }

    public void CrearSalon(int numSalones, String tipo, int cantSilla, int pos) {
        salon[pos] = new salones(numSalones, tipo,cantSilla);
    }

    public String mostrarSalon() {
        String salida = "";
        for (int i = 0; i < salon.length; i++) {
            salida += salon[i].mostrarSalones();
        }
        return salida;
    }

    public String EliminarSalon(salones salon[], int numsalon) {
        for (int i = 0; i < salon.length; i++) {
            if (salon[i].numSalones == numsalon) {
                salon[i] = null;
                return "Se elimino con exito";
            }
        }
        return "Esa mierda no existe";
    }

    public String ModificarSalon(salones salon[], int numsalon, int op, String dato) {//op es la opcion que desea modificar
        for (int i = 0; i < salon.length; i++) {
            if (salon[i].numSalones == numsalon) {
                switch (op) {
                    case 1://numero salon
                        salon[i].numSalones = Integer.parseInt(dato);
                        return "La salon fue modificado";
                    case 2://tipo
                        salon[i].tipo = dato;
                        return "La salon fue modificado";
                    case 3://Sillas ---> esta mierda esta perra

                        return "La silla fue modificada";
                }
            }
        }
        return "La silla no existe";
    }

    public String mostrarBloques() {
        return "\tNumero del bloque: " + numBloque + "\n--------------------- Salon ---------------------\n" + mostrarSalon();
    }
    
    public int BuscarSalon(int num){
        for (int i = 0; i < salon.length; i++) {
            if(salon[i].numSalones == num){
                return i;
            }
        }
        return -1;
    }

}
