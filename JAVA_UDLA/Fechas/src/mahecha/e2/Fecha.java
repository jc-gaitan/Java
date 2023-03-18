
package mahecha.e2;

public class Fecha {
    int dia,mes,año;
    
    public Fecha(){
        dia = 1;
        mes = 1;
        año = 1990;
    }
    
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }
    
    /*public void leer(int dia, int mes, int año){
        if(dia >= 1 && dia <= 31){
            
        }
        if(mes >= 1 && mes <= 12){
            
        }
        if(año >= 1990 && año <= 2050){
            
        }
    }*/
    
    public boolean bisiesto(){
        if((año-1896)%4==0){
            return true;
        }else{
            return false;
        }
    }
    
    public int diasMes(int mes){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            return 31;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        }else{
            if(bisiesto()){
                return 29;
            }else{
                return 28;
            }
        }
    }
    
    private void valida(){
        if(mes > 12 || mes < 1){
            mes = 1;
        }
        if(año < 1900 || año > 2050){
            año = 1900;
        }
        if(dia > 31 && dia < 1){
            dia = 1;
        }
    }
    
    public String corta(){
        String text = "";
        text += dia+"-"+mes+"-"+año;
        return text;
    }

    public String larga(){
        String text = "";
        int dia = this.dia;
        
        if(this.dia > 7){
            dia -= 7;
        }
        
        switch(dia){
            case 1:
                text += "lunes "+this.dia;
                break;
            case 2:
                text += "martes "+this.dia;
                break;
            case 3:
                text += "miercoles "+this.dia;
                break;
            case 4:
                text += "jueves "+this.dia;
                break;
            case 5:
                text += "viernes "+this.dia;
                break;
            case 6:
                text += "sabado "+this.dia;
                break;
            case 7:
                text += "domingo "+this.dia;
                break;
        }
        
        switch(mes){
            case 1:
                text += " de enero de "+año;
                break;
            case 2:
                text += " de febrero de "+año;
                break;
            case 3:
                text += " de marzo de "+año;
                break;
            case 4:
                text += " de abril de "+año;
                break;
            case 5:
                text += " de mayo de "+año;
                break;
            case 6:
                text += " de junio de "+año;
                break;
            case 7:
                text += " de julio de "+año;
                break;
            case 8:
                text += " de agosto de "+año;
                break;
            case 9:
                text += " de septiembre de "+año;
                break;
            case 10:
                text += " de octubre de "+año;
                break;
            case 11:
                text += " de noviembre de "+año;
                break;
            case 12: 
                text += " de diciembre de "+año;
                break;
        }
        return text;
    }
    
    public int diasEntre(int dia, int mes, int año){
        int res = 0;
        res = this.dia-dia;
        res = res+((this.mes-mes)*30);
        res = res+((this.año-año)*365);
        return res;
    }
    
    public int diasTranscurridos(){//aproximadamente
        int res = 0;
        res = dia-1;
        res = res+((mes-1)*30);
        res = res+((año-1900)*365);
        return res;
    }
    
    public void siguiente(){
        if(dia == 31 && mes < 12){
            dia = 1;
            mes = mes+1;
        }else if(dia == 31 && mes == 12){
            dia = 1;
            mes = 1;
            año = año+1;
        }else{
            dia = dia+1;
        }
    }
    
    public void anterior(){
        if(dia == 1 && mes > 1){
            dia = 31;
            mes = mes-1;
        }else if(dia == 1 && mes == 1){
            dia = 31;
            mes = 12;
            año = año-1;
        }else{
            dia = dia-1;
        }
    }
    
    public boolean igualQue(int dia, int mes, int año){
        if(this.dia-dia == 0 && this.mes == 0 && this.año == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean mayorQue(int dia, int mes, int año){       
        if(dia-this.dia < 0 || mes-this.mes < 0 || año-this.año < 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean menorQue(int dia, int mes, int año){
       if(this.dia-dia < 0 || this.mes-mes < 0 || this.año-año < 0){
            return true;
        }else{
            return false;
        } 
    }
    
}
