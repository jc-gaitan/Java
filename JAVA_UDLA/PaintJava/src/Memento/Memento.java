
package Memento;

import java.awt.Graphics;

public class Memento {
    private Graphics estado;

    public Memento(Graphics estado) {
        this.estado = estado;
    }

    public Graphics getEstado() {
        return estado;
    }
}
