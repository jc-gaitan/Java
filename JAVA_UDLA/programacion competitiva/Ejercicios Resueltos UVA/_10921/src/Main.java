
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(flujo);
        String a;
        char[] Caracteres;
        String men;

        try {
            while (true) {
                men = "";
                a = br.readLine();
                a = a.toLowerCase();
                Caracteres = a.toCharArray();
                for (int i = 0; i < Caracteres.length; i++) {
                    if (Character.isLetter(Caracteres[i])) {
                        switch (Caracteres[i]) {
                            case 97:
                                men += 2;
                                break;
                            case 98:
                                men += 2;
                                break;
                            case 99:
                                men += 2;
                                break;
                            case 100:
                                men += 3;
                                break;
                            case 101:
                                men += 3;
                                break;
                            case 102:
                                men += 3;
                                break;
                            case 103:
                                men += 4;
                                break;
                            case 104:
                                men += 4;
                                break;
                            case 105:
                                men += 4;
                                break;
                            case 106:
                                men += 5;
                                break;
                            case 107:
                                men += 5;
                                break;
                            case 108:
                                men += 5;
                                break;
                            case 109:
                                men += 6;
                                break;
                            case 110:
                                men += 6;
                                break;
                            case 111:
                                men += 6;
                                break;
                            case 112:
                                men += 7;
                                break;
                            case 113:
                                men += 7;
                                break;
                            case 114:
                                men += 7;
                                break;
                            case 115:
                                men += 7;
                                break;
                            case 116:
                                men += 8;
                                break;
                            case 117:
                                men += 8;
                                break;
                            case 118:
                                men += 8;
                                break;
                            case 119:
                                men += 9;
                                break;
                            case 120:
                                men += 9;
                                break;
                            case 121:
                                men += 9;
                                break;
                            case 122:
                                men += 9;
                                break;
                        }
                    }else{
                        men += Caracteres[i];
                    }
                }
                System.out.println(men);
            }
        } catch (Exception e) {

        }
    }

}
