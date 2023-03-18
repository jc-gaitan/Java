
package Principal;

public class Estudiante {
    String nombre;
    String apellido;
    String Fecha_Naci;
    String numDoc;
    String tipoDoc;
    String celular;
    String correo;
    String nota;
    String programa;
    int fechaEntrega;
    
    public Estudiante(String nombre, String apellido, String Fecha_Naci, String numDoc, boolean tipoDoc, String celular, String correo, String nota, String programa){
        this.nombre = nombre;
        this.apellido = apellido;
        this.Fecha_Naci = Fecha_Naci;
        this.numDoc = numDoc;
        if(tipoDoc){//bocc
            this.tipoDoc = "CC";
        }else{
            this.tipoDoc = "TI";
        }
        this.celular = celular;
        this.correo = correo;
        this.nota = nota;
        this.programa = programa;
        FechaEntrega();
    }
    
    public void FechaEntrega(){
        String x;
        x = numDoc.substring(numDoc.length()-1);
        //System.out.println(x);
        fechaEntrega = Integer.parseUnsignedInt(x);
        
        switch(fechaEntrega){
            case 0:
                fechaEntrega = 1;
                break;
            case 1:
                fechaEntrega = 2;
                break;
            case 2:
                fechaEntrega = 3;
                break;
            case 3:
                fechaEntrega = 4;
                break;
            case 4:
                fechaEntrega = 5;
                break;
            case 5:
                fechaEntrega = 6;
                break;
            case 6:
                fechaEntrega = 7;
                break;
            case 7:
                fechaEntrega = 8;
                break;
            case 8:
                fechaEntrega = 9;
                break;
            case 9:
                fechaEntrega = 10;
                break;
        }
    }

    @Override
    public String toString() {
        return nombre + apellido + Fecha_Naci + numDoc + tipoDoc + celular + correo + nota + programa + fechaEntrega;
    }
    
    
}
