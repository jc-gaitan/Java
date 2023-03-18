/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomino;

import java.util.Scanner;

public class Polinomio {

    private int[] coeficientes;
    private int grado;

    public Polinomio() {
        grado = 0;
        coeficientes = null;
    }

    public void setGrado(int grado) {
        this.grado = grado;
        coeficientes = new int[this.grado + 1];
    }

    public Polinomio(int grado) {
        this.grado = grado;
        coeficientes = new int[this.grado + 1];
        LlenarPolinomio();

    }

    private void LlenarPolinomio() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < coeficientes.length; i++) {
            System.out.println("Ingrese el coeficiente de: x^" + i);
            coeficientes[i] = sc.nextInt();
        }
    }

    public Polinomio(String data) {
        String arr[] = data.split(" ");
        coeficientes = new int[arr.length];
        this.grado = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            coeficientes[coeficientes.length - 1 - i] = Integer.parseInt(arr[i]);
        }
    }

    public Polinomio Sumar(Polinomio obj2) {
        
        Polinomio obj3 = new Polinomio();
        obj3.setGrado(obj2.grado > this.grado ? obj2.grado : this.grado);

        for (int i = 0; i < obj3.coeficientes.length; i++) {
            int coeficiente = (i < this.coeficientes.length ? this.coeficientes[i] : 0);
            coeficiente += (i < obj2.coeficientes.length ? obj2.coeficientes[i] : 0);
            obj3.coeficientes[i] = coeficiente;
        }

        return obj3;
    }

    @Override
    public String toString() {
        String data = "";
        for (int i = 0; i < coeficientes.length; i++) {
            if (coeficientes[i] > 0 && i != 0) {
                data = "+ " + data;
            }
            data = (coeficientes[i] == 0 ? "" : coeficientes[i] + (i != 0 ? "x^" + i + " " : "")) + data;
        }

        return data.replace("+ -", "-").replace("-", "- ");
        
        //return java.util.Arrays.toString(coeficientes);
    }
}
