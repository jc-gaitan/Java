package lanzarexcepciones;

import java.io.IOException;

public class LanzarExcepciones {

    public static void main(String[] args) {
        String str1 = "120";
        String str2 = "3";
        String respuesta;
        int numerador, denominador, cociente;
        try {
            numerador = Integer.parseInt(str1);
            denominador = Integer.parseInt(str2);
            rango(numerador, denominador);
            cociente = numerador / denominador;
            respuesta = String.valueOf(cociente);
        } catch (NumberFormatException ex) {
            respuesta = "Se han introducido caracteres no numéricos";
        } catch (ArithmeticException ex) {
            respuesta = "División entre cero";
        } catch (EI ex) {
            respuesta = ex.getMessage();
        }
        System.out.println(respuesta);
    }

    static void rango(int num, int den) throws EI {
        if ((num > 100) || (den < -5)) {
            throw new EI("Números fuera de rango");
        }
    }
}
