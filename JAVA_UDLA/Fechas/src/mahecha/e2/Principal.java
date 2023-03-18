
package mahecha.e2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int dia,mes,año;
        Scanner esc = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        dia = esc.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = esc.nextInt();
        System.out.println("Ingrese el año: ");
        año = esc.nextInt();
        Fecha a = new Fecha(dia,mes,año);
        
        if(a.bisiesto()){
            System.out.println("EL AÑO ES BISIESTO");
        }else{
            System.out.println("EL AÑO NO ES BISIESTO");
        }
        
        System.out.println("Ingrese el mes que desea saber cuantos dias tiene: ");
        System.out.println(a.diasMes(esc.nextInt()));
        System.out.println("FECHA CORTA: "+a.corta());
        System.out.println("DIAS TRANSCURRIDOS DESDE 1-1-1900: "+a.diasTranscurridos());
        System.out.println("FECHA LARGA: "+a.larga());
        
        System.out.println("SABER LOS DIAS ENTRE LAS FECHAS (antes de la fecha actual)");
        System.out.println("Ingrese el dia: ");
        dia = esc.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = esc.nextInt();
        System.out.println("Ingrese el año: ");
        año = esc.nextInt();
        System.out.println(a.diasEntre(dia, mes, año));
        
    }
    
}
