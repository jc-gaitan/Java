package ProyectoEstructura;

public class NodoLista {

    Venta dato;
    NodoLista siguiente;

    public NodoLista(NodoLista sig, Venta d) {
        siguiente = sig;
        dato = d;
    }

}
