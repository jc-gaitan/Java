
import java.util.ArrayList;

public class OperacionesS1 {

    double a, b, landa0, miu1;
    int s;

    double ro, c, cn, acucn = 0, aux = 0, p0 = 0, pn = 0, acupn = 0, npn = 0, acunpn = 0, n1pn = 0, acun1pn = 0, w = 0, wq = 0;
    double landan, acunlandan = 0;

    ArrayList<Double> cns = new ArrayList<Double>();//arreglo de cn
    ArrayList<Double> pns = new ArrayList<Double>();//arreglo de pn
    ArrayList<Double> npns = new ArrayList<Double>();//arreglo de npn
    ArrayList<Double> n1pns = new ArrayList<Double>();//arreglo de (n-1)pn
    ArrayList<Double> lns = new ArrayList<Double>();//arreglo de (n-1)pn

    public OperacionesS1(double a, double b, double landa0, double miu1, int s) {
        this.a = a;
        this.b = b;
        this.landa0 = landa0;
        this.miu1 = miu1;
        this.s = s;
    }

    public void Operaciones() {
        c = a + b;
        //System.out.println("c = " + c);

        ro = landa0 / (miu1 * s);
        //System.out.println("ro = " + ro);

        for (int n = 0; n < 150; n++) {
            //calcular landaN

            aux = (n + 1);
            landan = Math.pow(aux, -b);
            landan = landan * landa0;
            lns.add(landan);
            //System.out.println(landan);

            //landaPromedio
            //aux = landan * pns.get(n);
            //acunlandan = acunlandan + aux;
            //acunlandan=1;
        }

        //System.out.println(acunlandan);//calcular landaPromedio

        for (int n = 0; n < 150; n++) {//calcular cn

            cn = (lns.get(n) / miu1);
            cn = Math.pow(cn, n);
            aux = factorial(n);
            aux = Math.pow(aux, c);
            
            cn = cn/aux;
            
            cns.add(cn);
            acucn = acucn + cn;
        }

        p0 = 1 / acucn;//calcular P0
        //System.out.println("P0 = " + String.format("%.8f", p0));

        for (int n = 0; n < 150; n++) {//calcular pn
            pn = p0 * cns.get(n);
            pns.add(pn);
            acupn = acupn + pn;
        }

        //System.out.println("sumatoria Pn = " + (int) Math.ceil(acupn));//sumatoria Pn
        for (int n = 0; n < 150; n++) {//calcular n*pn
            npn = n * pns.get(n);
            acunpn = acunpn + npn;
            npns.add(npn);
        }

        //System.out.println("L = " + String.format("%.8f", acunpn));//calcular L
        for (int n = 0; n < 150; n++) {//calcular (n-s)*pn 
            if (n >= s) {
                n1pn = (n - s) * pns.get(n);
            }
            acun1pn = acun1pn + n1pn;
            n1pns.add(n1pn);
        }
        
        //landa promedio
        for (int n = 0; n < 150; n++) {
            //landaPromedio
            aux = lns.get(n) * pns.get(n);
            acunlandan = acunlandan + aux;
            //System.out.println(aux);
        }

        //System.out.println("Lq = " + String.format("%.8f", acun1pn));//calcular Lq
        w = acunpn / acunlandan;//calcular W
        wq = acun1pn / acunlandan;//calcular Wq

    }

    public double factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    public String[][] GenArreglos() {
        String tabla[][] = new String[150][5];

        for (int j = 0; j < 150; j++) {
            tabla[j][0] = String.valueOf(j);
            tabla[j][1] = String.valueOf(cns.get(j));
            tabla[j][2] = String.valueOf(pns.get(j));
            tabla[j][3] = String.valueOf(npns.get(j));
            tabla[j][4] = String.valueOf(n1pns.get(j));
        }

        return tabla;
    }
}
