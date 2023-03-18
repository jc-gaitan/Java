/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomino;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Grupo {

    Estudiante[] Arr;

    double Promedio;

    public Grupo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de estudiantes");
        Arr = new Estudiante[sc.nextInt()];

        for (int i = 0; i < Arr.length; i++) {
            sc = new Scanner(System.in);

            System.out.println("Estudiante " + (i + 1));
            System.out.println("Ingrese nombre");
            String nom = sc.nextLine();

            sc = new Scanner(System.in);

            System.out.println("Ingrese nota 1");
            double n1 = sc.nextDouble();
            System.out.println("Ingrese nota 2");
            double n2 = sc.nextDouble();
            System.out.println("Ingrese nota 3");
            double n3 = sc.nextDouble();
            Estudiante e = new Estudiante(nom, n1, n2, n3);
            Arr[i] = e;
        }
    }

    public void MostrarEstudiantes() {
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i].nombre + " Promedio: " + Arr[i].Promedio());
        }
    }

    public void CalcularPromedio() {

        double acu = 0;
        for (int i = 0; i < Arr.length; i++) {
            acu += Arr[i].Promedio();
        }
        Promedio = (acu / Arr.length);
        System.out.println("Promedio del grupo: " + Promedio);
    }

    public void SuperaroNo() {
        String Sup = "", NoSup = "";
        for (int i = 0; i < Arr.length; i++) {
            if (Promedio >= Arr[i].Promedio()) {
                NoSup += Arr[i].nombre + ", ";
            } else {
                Sup += Arr[i].nombre + ", ";
            }
        }

        System.out.println("Superaron: " + Sup);
        System.out.println("No Superaron: " + NoSup);
    }

}
