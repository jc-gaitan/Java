package mahecha;

import java.util.Scanner;

public class Principal {

    static Scanner esc = new Scanner(System.in);
    static Password a;

    public static void main(String[] args) {
        int res;
        System.out.println("1. Contraseña por defecto. ");
        System.out.println("2. Ingresar Contraseña. ");
        System.out.println("3. Ingresar longitud. ");
        res = esc.nextInt();
        switch (res) {
            case 1:
                a = new Password();
                break;
            case 2:
                a = new Password(esc.next());
                break;
            case 3:
                a = new Password(esc.nextInt());
                break;
        }
        
        while(Menu()){          
        }
    }

    public static boolean Menu() {
        int res;
        System.out.println("MENU");
        System.out.println("1. Verificar si es fuerte. ");
        System.out.println("2. Generar nueva contraseña. ");
        System.out.println("3. Ingresar nueva contraseña. ");
        System.out.println("4. Ver la contraseña. ");
        System.out.println("5. Ver la longitud. ");
        System.out.println("6. Salir. ");
        res = esc.nextInt();

        switch (res) {
            case 1:
                if (a.esFuerte()) {
                    System.out.println("La contraseña es FUERTE. ");
                } else {
                    System.out.println("La contraseña NO es FUERTE. ");
                }
                return true;
            case 2:
                a.generargenerarPassword();
                System.out.println("Su nueva contraseña es: "+a.getContraseña());
                System.out.println("La longitud de su contraseña es: "+a.getLongitud());
                return true;
            case 3:
                a.setContraseña(esc.next());
                System.out.println("Su nueva contraseña es: "+a.getContraseña());
                System.out.println("La longitud de su contraseña es: "+a.getLongitud());
                return true;
            case 4:
                System.out.println("Su contraseña es: "+a.getContraseña());
                return true;
            case 5:
                System.out.println("La longitud de su contraseña es: "+a.getLongitud());
                return true;
            case 6:
                return false;
            default:
                System.out.println("LA OPCION NO EXISTE");
                return true;
        }

    }

}
