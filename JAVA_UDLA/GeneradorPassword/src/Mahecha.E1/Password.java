package mahecha;

public class Password {

    int longitud;
    String contraseña;

    public Password() {
        longitud = 8;
        contraseña = generar();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        contraseña = generar();
    }
    
    public Password(String contraseña) {
        this.contraseña = contraseña;
        longitud = contraseña.length();
    }

    public String generar() {
        String text = "";
        int a;
        char b;
        boolean x;

        for (int i = 0; i <= longitud - 1; i++) {
            x = true;
            if (((int) (Math.random() * 2) + 1) % 2 == 0) {
                text += (int) (Math.random() * 9);
            } else {
                while (x) {
                    a = (int) (Math.random() * 58) + 65;

                    if (a < 91) {
                        b = (char) a;
                        text += b;
                        x = false;
                    } else if (a > 96) {
                        b = (char) a;
                        text += b;
                        x = false;
                    }

                }

            }
        }

        return text;
    }

    public boolean esFuerte() {
        String a;
        char b;
        int num;
        int may = 0;
        int min = 0;
        int nume = 0;

        for (int i = 0; i < longitud; i++) {
            a = contraseña.substring(i, i + 1);
            b = a.charAt(0);
            num = (int) b;
            if (num >= 65 && num <= 90) {
                may++;
            } else if (num >= 97 && num <= 122) {
                min++;
            } else if (num >= 48 && num <= 57) {
                nume++;
            }
        }

        if (may > 2 && min > 1 && nume > 5) {
            return true;
        }else{
            return false;
        }
    }
    
    public void generargenerarPassword(){
        contraseña = generar();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
        setLongitud(contraseña.length());
    }

    @Override
    public String toString() {
        return "Password{" + "longitud=" + longitud + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    

}
