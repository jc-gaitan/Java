
package usocalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UsoCalendar {

    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        Calendar calendario2 = new GregorianCalendar();
        
        int año = calendario2.get(Calendar.YEAR);
        int mes = calendario2.get(Calendar.MONTH)+1;
        int dia = calendario2.get(Calendar.DAY_OF_MONTH);
        
        int hora = calendario2.get(Calendar.HOUR);
        int minuto = calendario2.get(Calendar.MINUTE);
        int segundo = calendario2.get(Calendar.SECOND);
        
        System.out.println("0"+dia+"/0"+mes+"/"+año);
        
        System.out.println(hora+":"+minuto+":"+segundo);
        
    }
    
}
