package ProyectoEstructura;

public class Lista {//Lista circular simple

    NodoLista inicio;
    NodoLista ultimo;

    public Lista() {
        inicio = null;
        ultimo = null;
    }

    public boolean Vacia() {
        return inicio == null;
    }

    public boolean Buscar(String d) {
        NodoLista aux = inicio.siguiente;
        boolean t = false;
        while (aux != inicio && !aux.dato.codVenta.equals(d)) {
            aux = aux.siguiente;
        }
        if (aux.dato.codVenta.equals(d)) {
            t = true;
        }
        return t;
    }
    
    public NodoLista Buscar2(String d) {
        NodoLista aux = inicio.siguiente;
        while (aux != inicio && !aux.dato.codVenta.equals(d)) {
            aux = aux.siguiente;
        }
        if (aux.dato.codVenta.equals(d)) {
            return aux;
        }
        return null;
    }

    public void Insertar(Venta d) {
        if (Vacia()) {
            inicio = ultimo = new NodoLista(inicio, d);
            inicio.siguiente = inicio;
            ultimo.siguiente = inicio;
        } else {
            NodoLista nuevo = new NodoLista(inicio, d);
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public void InsertarElegido(String e, Venta d) {
        if (Buscar(e)) {
            NodoLista aux = inicio;
            while (!aux.dato.equals(e)) {
                aux = aux.siguiente;
            }
            if (aux.dato.equals(ultimo.dato)) {
                NodoLista nuevo = new NodoLista(inicio, d);
                ultimo.siguiente = nuevo;
                ultimo = nuevo;
            } else {
                NodoLista nuevo = new NodoLista(aux.siguiente, d);
                aux.siguiente = nuevo;
            }
        }
    }

    public String Mostrar() {
        String Lista = inicio.dato + "\n";
        NodoLista aux = inicio.siguiente;
        while (aux != inicio) {
            Lista += aux.dato + "\n";
            aux = aux.siguiente;
        }
        return Lista;
    }

    public boolean Eliminar(String d) {
        if (inicio.siguiente == inicio && inicio.dato.codVenta.equals(d)) {
            inicio = null;
            return true;
        } else {
            if (d.equals(inicio.dato.codVenta)) {
                ultimo.siguiente = inicio.siguiente;
                inicio = inicio.siguiente;
                return true;
            } else {
                if (Buscar(d)) {
                    NodoLista ant, aux;
                    ant = inicio;
                    aux = inicio.siguiente;
                    while (aux.siguiente != inicio && !aux.dato.codVenta.equals(d)) {
                        ant = ant.siguiente;
                        aux = aux.siguiente;
                    }
                    ant.siguiente = aux.siguiente;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean RecorridoLista() {
        NodoLista aux = inicio.siguiente;
        boolean t = false;
        while (aux != inicio && aux.dato.venta <= 50000) {
            aux = aux.siguiente;
        }
        if (aux.dato.venta >= 50000) {
            t = true;
        }
        return t;
    }
    
}
