/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomino;

import java.util.Scanner;

/**
 *
 * @author Alberto Mazo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Grupo logica = new Grupo();
        logica.MostrarEstudiantes();
        logica.CalcularPromedio();
        logica.SuperaroNo();

//        System.out.println("Ingrese el primer polinomio");
//        Polinomio obj = new Polinomio("5 8 -3 20 -10 1");
//        sc = new Scanner(System.in);
//        System.out.println("Ingrese el grado del segundo polinomio");
//        Polinomio obj2 = new Polinomio("-3 0 4 -5");
//
//        Polinomio obj3 = obj.Sumar(obj2);
//        System.out.println(obj);
//        System.out.println(obj2);
//        System.out.println(obj3);
    }

}
