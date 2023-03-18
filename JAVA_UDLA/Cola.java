
package pila;

import java.util.LinkedList;
import java.util.Queue;


public class Cola {
public static void main(String[] args) 
  { 
    Queue<Integer> q = new LinkedList<>(); 
    // Agregando elementos {0, 1, 2, 3, 4} a la cola 
    for (int i=0; i<5; i++){
     q.offer(i); 
    }
    
    // Visualizando el contenido de la cola. 
    System.out.println("Elementos de la cola-"+q); 
  
    // Para eliminar la cabecera de la cola.
    int removedele = q.remove(); 
    System.out.println("Elemento removido-" + removedele); 
  
    System.out.println(q); 
  
    // Para ver la cabeza de la cola
    int head = q.peek(); 
    System.out.println("Cabeza de la cola-" + head); 
  
    // Restan todos los métodos de la interfaz collection , 
    // Como size and contains, que pueden ser utilizados en esta implementación
    int size = q.size(); 
    System.out.println("Tamaño de la cola-" + size); 
    
      System.out.println("  "+q.peek());
  } 
}
