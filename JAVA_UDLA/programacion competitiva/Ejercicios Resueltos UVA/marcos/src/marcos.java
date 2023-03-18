
import java.util.Scanner;

public class marcos {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        String peter[][] = new String[5][5];
        String wendy[][] = new String[5][5];
        String letras;
        letras = esc.next();
        String superma[][] = new String[5][(5 * letras.length()) - (letras.length() - 1)];

        peter[0][0] = ".";
        peter[0][1] = ".";
        peter[0][2] = "#";
        peter[0][3] = ".";
        peter[0][4] = ".";

        peter[1][0] = ".";
        peter[1][1] = "#";
        peter[1][2] = ".";
        peter[1][3] = "#";
        peter[1][4] = ".";

        peter[2][0] = "#";
        peter[2][1] = ".";
        peter[2][2] = "X";
        peter[2][3] = ".";
        peter[2][4] = "#";

        peter[3][0] = ".";
        peter[3][1] = "#";
        peter[3][2] = ".";
        peter[3][3] = "#";
        peter[3][4] = ".";

        peter[4][0] = ".";
        peter[4][1] = ".";
        peter[4][2] = "#";
        peter[4][3] = ".";
        peter[4][4] = ".";

        wendy[0][0] = ".";
        wendy[0][1] = ".";
        wendy[0][2] = "*";
        wendy[0][3] = ".";
        wendy[0][4] = ".";

        wendy[1][0] = ".";
        wendy[1][1] = "*";
        wendy[1][2] = ".";
        wendy[1][3] = "*";
        wendy[1][4] = ".";

        wendy[2][0] = "*";
        wendy[2][1] = ".";
        wendy[2][2] = "X";
        wendy[2][3] = ".";
        wendy[2][4] = "*";

        wendy[3][0] = ".";
        wendy[3][1] = "*";
        wendy[3][2] = ".";
        wendy[3][3] = "*";
        wendy[3][4] = ".";

        wendy[4][0] = ".";
        wendy[4][1] = ".";
        wendy[4][2] = "*";
        wendy[4][3] = ".";
        wendy[4][4] = ".";

        int w = 0, k = 0, p = 0,l=0;

        if (letras.length() == 1) {
            for (int i = 0; i < superma.length; i++) {
                for (int j = 0; j < superma[i].length; j++) {
                    if (peter[i][j].equals("X")) {
                        superma[i][j] = letras.substring(k, k + 1);
                        k++;
                    } else {
                        superma[i][j] = peter[i][j];
                    }
                    w++;

                }
            }
        } else {
            for (int i = 0; i < superma.length; i++) {
                for (int j = 0; j < superma[i].length; j++) {
                    if (w >= peter.length) {
                        w = 0;
                        j--;
                    }
                    if (peter[i][w].equals("X")) {
                        superma[i][j] = letras.substring(k, k + 1);
                        k++;
                    } else if ( superma[i][j] != null && superma[i][j].equals("*") ) {
                        superma[i][j] = wendy[i][w];
                    } else{
                        superma[i][j] = peter[i][w];
                    }
                    
                    if(p==10 && superma[i][j]=="#" || p==11 && superma[i][j]=="#" || p==12 && superma[i][j]=="#"){
                        superma[i][j] = wendy[i][w];
                        p=-5;
                    }
                    if(l==13 && superma[i][j]=="#" || l==14 && superma[i][j]=="#" ){
                        superma[i][j] = wendy[i][w];
                        l=-1;
                    }
                    /*p==12 && superma[i][j].equals("#") || p==11 && superma[i][j].equals("#") || p==13 && superma[i][j].equals("#") || p==10 && superma[i][j].equals("#") || p==14 && superma[i][j].equals("#")
                    */
                    w++;
                    p++;
                    l++;
                }
                w = 0;
                p = 0;
                l = 0;
            }
        }

        for (int i = 0; i < superma.length; i++) {
            for (int j = 0; j < superma[i].length; j++) {
                System.out.print(superma[i][j]);
            }
            System.out.println("");
        }

    }

}
