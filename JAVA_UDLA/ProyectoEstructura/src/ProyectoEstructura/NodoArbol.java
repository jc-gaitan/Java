
package ProyectoEstructura;

public class NodoArbol {
    Empleado dato;
    NodoArbol derecha;
    NodoArbol izquierda;

    public NodoArbol(Empleado dato) {
        this.dato = dato;
        derecha = izquierda = null;
    }

    @Override
    public String toString() {
        return "El valor del dato: " + dato.toString();
    }
    
}
