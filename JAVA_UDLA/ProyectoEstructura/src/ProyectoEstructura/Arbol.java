
package ProyectoEstructura;

public class Arbol {
    
    NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public boolean Vacia() {
        return raiz == null;
    }

    public String insertar(Empleado dato) {
        NodoArbol nuevo = new NodoArbol(dato);

        if (Vacia()) {
            raiz = nuevo;
        } else {
            if (Buscar(dato.codigo) == null) {
                NodoArbol aux = raiz;
                NodoArbol padre;

                while (true) {
                    padre = aux;
                    if (dato.codigo < aux.dato.codigo) {
                        aux = aux.izquierda;
                        if (aux == null) {
                            padre.izquierda = nuevo;
                            break;
                        }
                    } else {
                        aux = aux.derecha;
                        if (aux == null) {
                            padre.derecha = nuevo;
                            break;
                        }
                    }
                }
            } else {
                return "El dato ya existe. ";
            }
        }
        return "El dato ha sido guardado. ";
    }

    public void InOrden(NodoArbol r) {
        if (r != null) {
            InOrden(r.izquierda);
            System.out.println(r.dato);
            InOrden(r.derecha);
        }
    }

    public void PreOrden(NodoArbol r) {
        if (r != null) {
            System.out.println(r.dato);
            PreOrden(r.izquierda);
            PreOrden(r.derecha);
        }
    }

    public void PosOrden(NodoArbol r) {
        if (r != null) {
            PosOrden(r.izquierda);
            PosOrden(r.derecha);
            System.out.println(r.dato);
        }
    }

    public NodoArbol Buscar(long dato) {
        NodoArbol aux = raiz;
        if (!Vacia()) {
            while (aux != null && aux.dato.codigo != dato) {
                if (dato < aux.dato.codigo) {
                    aux = aux.izquierda;
                } else {
                    aux = aux.derecha;
                }
            }
        }

        if (aux == null) {
            return null;
        }
        return aux;
    }

    public boolean Eliminar(long dato) {
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        boolean hijoizq = true;
        while (auxiliar.dato.codigo != dato) {
            padre = auxiliar;
            if (dato < auxiliar.dato.codigo) {
                hijoizq = true;//Se encuentra en el lado izquierdo
                auxiliar = auxiliar.izquierda;
            } else {
                hijoizq = false;//Se encuentra en el lado derecho
                auxiliar = auxiliar.derecha;
            }
            if (auxiliar == null) {
                return false;
            }
        }
        if (auxiliar.izquierda == null && auxiliar.derecha == null) {//Eliminar hoja(Nodo que no tiene hijos)
            if (auxiliar == raiz) {
                raiz = null;
            } else if (hijoizq) {
                padre.izquierda = null;
            } else {
                padre.derecha = null;
            }
        } else if (auxiliar.derecha == null) {//Eliminar padre con un solo hijo (IZQUIERDA)
            if (auxiliar == raiz) {
                raiz = auxiliar.izquierda;
            } else if (hijoizq) {
                padre.izquierda = auxiliar.izquierda;
            } else {
                padre.derecha = auxiliar.izquierda;
            }
        } else if (auxiliar.izquierda == null) {//Eliminar padre con un solo hijo (DERECHA)
            if (auxiliar == raiz) {
                raiz = auxiliar.derecha;
            } else if (hijoizq) {
                padre.izquierda = auxiliar.derecha;
            } else {
                padre.derecha = auxiliar.izquierda;
            }
        } else {//Eliminar padre con dos hijos (DERECHA E IZQUIERDA)
            NodoArbol reemplazo = ObtenerReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (hijoizq) {
                padre.izquierda = reemplazo;
            } else {
                padre.derecha = reemplazo;
            }
            reemplazo.izquierda = auxiliar.izquierda;
        }
        return true;
    }

    public NodoArbol ObtenerReemplazo(NodoArbol nodoreemplazo) {
        NodoArbol reemplazarpadre = nodoreemplazo;
        NodoArbol reemplazo = nodoreemplazo;
        NodoArbol auxiliar = nodoreemplazo.derecha;
        while (auxiliar != null) {
            reemplazarpadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.izquierda;
        }
        if (reemplazo != nodoreemplazo.derecha) {
            reemplazarpadre.izquierda = reemplazo.derecha;
            reemplazo.derecha = nodoreemplazo.derecha;
        }
        System.out.println("El Nodo Reemplazo es:" + reemplazo);
        return reemplazo;
    }

    public NodoArbol Raiz() {
        return raiz;
    }

    public void MostrarMayores(NodoArbol r) {
        if (r != null) {
            MostrarMayores(r.izquierda);
            if(r.dato.Ventas.RecorridoLista()){
                System.out.println(r.dato);
            }
            MostrarMayores(r.derecha);
        }
    }
 
}
