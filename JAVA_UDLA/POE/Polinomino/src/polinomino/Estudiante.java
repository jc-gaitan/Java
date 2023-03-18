/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomino;

/**
 *
 * @author estudiante
 */
public class Estudiante {

    double n1, n2, n3;
    String nombre;

    public Estudiante() {
    }

    public Estudiante(String nom, double n1, double n2, double n3) {
        nombre = nom;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double Promedio() {
        return ((n1 + n2 + n3) / 3);
    }

}
