package cuadrado;

import java.util.Scanner;

public class Cuadrado {

    static int w;
    static String a = " * ";
    static String b = "   ";
    static String c = " - ";

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        w = esc.nextInt();

        SoloAsteriscos();
        System.out.println("");
        AsteriscoConLineas();
        System.out.println("");
        LineasConAsterisco();

    }

    public static void LineasConAsterisco() {

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {

                if (i == 0) {
                    System.out.print(c);
                } else if (i == w - 1) {
                    System.out.print(a);
                } else {
                    if (j == 0) {
                        System.out.print(a);
                    } else if (j == w - 1) {
                        System.out.print(c);
                    } else {
                        System.out.print(b);
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void AsteriscoConLineas() {

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {

                if (i == 0) {
                    System.out.print(a);
                } else if (i == w - 1) {
                    System.out.print(c);
                } else {
                    if (j == 0) {
                        System.out.print(c);
                    } else if (j == w - 1) {
                        System.out.print(a);
                    } else {
                        System.out.print(b);
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void SoloAsteriscos() {

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {

                if (i == 0 || i == w - 1) {
                    System.out.print(a);
                } else {
                    if (j == 0 || j == w - 1) {
                        System.out.print(a);
                    } else {
                        System.out.print(b);
                    }
                }
            }
            System.out.println("");
        }
    }

}
