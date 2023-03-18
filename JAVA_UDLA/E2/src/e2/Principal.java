package e2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int a, b, res;
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        a = esc.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        b = esc.nextInt();
        Numero num = new Numero(a, b);

        do {
            System.out.println("MENU");
            System.out.println("1. SUMA. ");
            System.out.println("2. RESTA. ");
            System.out.println("3. MULTIPLICACION. ");
            System.out.println("4. DIVISION. ");
            System.out.println("5. CAMBIAR NUMEROS. ");
            System.out.println("6. VER LOS NUMEROS. ");
            System.out.println("7. SALIR. ");
            res = esc.nextInt();
        } while (Menu(res, num));

    }

    public static boolean Menu(int res, Numero num) {
        Operador ope = new Operador();
        Scanner esc = new Scanner(System.in);

        switch (res) {
            case 1:
                System.out.println("EL RESULTADO ES: "+ope.sumar(num.getNum1(), num.getNum2()));
                return true;
            case 2:
                System.out.println("EL RESULTADO ES: "+ope.restar(num.getNum1(), num.getNum2()));
                return true;
            case 3:
                System.out.println("EL RESULTADO ES: "+ope.multiplicar(num.getNum1(), num.getNum2()));
                return true;
            case 4:
                System.out.println("EL RESULTADO ES: "+ope.dividir(num.getNum1(), num.getNum2()));
                return true;
            case 5:
                int a,b;
                System.out.println("INGRESE EL PRIMER NUMERO: ");
                a = esc.nextInt();
                System.out.println("INGRESE EL SEGUNDO NUMERO: ");
                b = esc.nextInt();
                num.setNum1(a);
                num.setNum2(b);
                System.out.println("LOS NUMEROS SE HAN CAMBIADO CON EXITO. ");                
                return true;
            case 6:
                System.out.println("EL PRIMER NUMERO ES: "+num.getNum1());
                System.out.println("EL SEGUNDO NUMERO ES: "+num.getNum2());
                return true;
            case 7:
                System.out.println("Adios.");
                return false;
            default:
                System.out.println("LA OPCION NO EXISTE. ");
                return true;
        }
    }

}
