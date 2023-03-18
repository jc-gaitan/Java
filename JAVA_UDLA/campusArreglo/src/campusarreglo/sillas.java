
package campusarreglo;

public class sillas {
    String material, color;
    int numSilla;

    public sillas(String material, String color, int numSilla) {
        this.material = material;
        this.color = color;
        this.numSilla = numSilla;
    }
    
    public sillas(){
        this.material = "Madera";
        this.color = "Cafe";
        this.numSilla = 1;
    }

    public String mostrarSillas() {
        return "\tNumero silla: " + numSilla +"\tMaterial: " + material + "\tColor: " + color +"\n\n";
    }
    
    
    
}
