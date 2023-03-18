
package Memento;

import java.awt.Graphics;

public class Originator {
     private Graphics estado;

    public void setEstado(Graphics estado) {
        this.estado = estado;
    }

    public Graphics getEstado() {
        return estado;
    }

    public Memento guardar() {
        return new Memento(estado);
    }

    public void restaurar(Memento m) {
        this.estado = m.getEstado();
    }
}
