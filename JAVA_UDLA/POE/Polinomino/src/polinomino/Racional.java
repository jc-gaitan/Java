/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomino;

/**
 *
 * @author Alberto Mazo
 */
public class Racional {

    private int Numerador;
    private int Denominador;

    public Racional() {
        Numerador = 0;
        Denominador = 1;
    }

    public Racional(int n, int d) {
        Numerador = n;
        Denominador = d;
    }

    public Racional Sumar(Racional obj2) {
        
        System.out.println(this);
        System.out.println(obj2);
        
        if (this.toString().equals("0")) {
            return new Racional(obj2.Numerador, obj2.Denominador);
        } else if (obj2.toString().equals("0")) {
            return new Racional(this.Numerador, this.Denominador);
        } else if (this.Denominador == obj2.Denominador) {
            return new Racional(this.Numerador + obj2.Numerador, this.Denominador);
        } else {
            return new Racional((this.Numerador * obj2.Denominador) + (this.Denominador * obj2.Numerador), this.Denominador * obj2.Denominador);
        }
    }

    @Override
    public String toString() {
        return Numerador == 0 ? "0" : Numerador + "/" + Denominador;
    }

}
