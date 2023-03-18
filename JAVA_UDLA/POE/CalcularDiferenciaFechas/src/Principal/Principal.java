package Principal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fechaInicial = dateFormat.parse("1998-10-16");
            Date fechaFinal = dateFormat.parse("2017-10-16");
            int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);//dias
            int years = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 3.154e+10);//años
            int meses = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 2.628e+9);//meses
            int decada = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 3.154e+11);//decada
            double siglo = (double) ((fechaFinal.getTime() - fechaInicial.getTime()) / 3.154e+12);//decada
            int semana = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 6.048e+8);//semana
            System.out.println("Hay " + dias + " dias de diferencia");
            System.out.println("Hay " + years + " años de diferencia");
            System.out.println("Hay " + meses + " meses de diferencia");
            System.out.println("Hay " + decada + " decada de diferencia");
            System.out.println("Hay " + siglo + " siglo de diferencia");
            System.out.println("Hay " + semana + " semana de diferencia");
            
            //fechaFinal.getTime() ---> obtiene lo milisegundos de la fecha
            
        } catch (Exception e) {

        }
    }

}
