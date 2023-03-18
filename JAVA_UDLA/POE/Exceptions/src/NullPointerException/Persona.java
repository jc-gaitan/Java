
package NullPointerException;

public class Persona {
    
    int edad;
    
    public Persona(int edad){
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad: " + edad + '}';
    }
    
}
