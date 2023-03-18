
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    static Empleado ListaEmpleados[] = new Empleado[10];
    static int qwe = 3;

    public static void main(String[] args) {
        
        ListaEmpleados[0] = new Empleado(1256, "jose", "ewq", 'M', 980000, 19);
        ListaEmpleados[1] = new Empleado(5555, "asd", "www", 'M', 1540000, 25);
        ListaEmpleados[2] =new Empleado(9999, "dsa", "eqw", 'M', 1854000, 30);
        
        do {
            System.out.println("1. Crear empleado");
            System.out.println("2. Consultar empleado");
            System.out.println("3. Modificar datos empleado");
            System.out.println("4. Liquidar nomina");
            System.out.println("5. Salir");
        } while (menu());
    }

    public static boolean menu() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int option;
        String nombre, apellido;
        char genero;
        double salario;
        int dias, codigo;

        try {
            option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1:
                    codigo = (int)(Math.random() * 9999) + 1; 
                    System.out.println("Nombre empleado");
                    nombre = br.readLine();
                    System.out.println("Apellido");
                    apellido = br.readLine();
                    System.out.println("Genero");
                    genero = br.readLine().charAt(0);
                    System.out.println("Salario mensual");
                    salario = Double.parseDouble(br.readLine());
                    System.out.println("Dias trabajados");
                    dias = Integer.parseInt(br.readLine());
                    ListaEmpleados[qwe] = new Empleado(codigo, nombre, apellido, genero, salario, dias);
                    qwe++;
                    break;
                case 2:
                    if (ListaEmpleados.length > 0) {
                        System.out.println("----------Lista de empleado------------");
                        for (int i = 0; i < qwe; i++) {
                            System.out.println(ListaEmpleados[i].toString());
                        }
                        System.out.println("---------------------------------------");
                    } else {
                        System.out.println("No hay empleado");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del empleado: ");
                    int codigoB = Integer.parseInt(br.readLine());
                    int pos = existeEmpleado(codigoB, ListaEmpleados);
                    if(pos == -1){
                        System.out.println("El empleado no existe");
                    }else{
                        System.out.println("Modificar");
                        System.out.println("1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Genero");
                        System.out.println("4. Salario");
                        System.out.println("5. Dias Trabajados");
                        System.out.println("6. cancelar");
                        
                        option = Integer.parseInt(br.readLine());
                        switch(option){
                            case 1: 
                                System.out.println("Nuevo nombre empleado");
                                nombre = br.readLine();
                                ListaEmpleados[pos].nombre=nombre;
                                break;
                            case 2:
                                System.out.println("Nuevo apellido");
                                apellido = br.readLine();
                                ListaEmpleados[pos].apellido=apellido;
                                break;
                            case 3:
                                System.out.println("Nuevo genero");
                                genero = br.readLine().charAt(0);
                                ListaEmpleados[pos].genero=genero;
                                break;
                            case 4: 
                                System.out.println("Nuevo salario mensual");
                                salario = Double.parseDouble(br.readLine());
                                ListaEmpleados[pos].salario=salario;
                                break;
                            case 5:
                                System.out.println("Dias trabajados");
                                dias = Integer.parseInt(br.readLine());
                                ListaEmpleados[pos].diasTrabajados=dias;
                                break;
                            default:
                                
                        }
                    }
                    break;
                case 4:
                    double valorDia;
                    double salarioPagar;
                    for (int i = 0; i < qwe; i++) {
                        valorDia = ListaEmpleados[i].salario / 30;
                        salarioPagar = valorDia * ListaEmpleados[i].diasTrabajados;
                        if(salarioPagar>1755606){
                            System.out.println("Codigo Empleado: "+ListaEmpleados[i].codigo + "\tSalario: "+ salarioPagar +"\nAuxilio de transporta: No aplica");
                            System.out.println("");
                        }else{
                            System.out.println("Codigo Empleado: "+ListaEmpleados[i].codigo + "\tSalario: "+ salarioPagar+"\nAuxilio de transporta: 102854" +"\tTotal: " +(salarioPagar+102854));
                            System.out.println("");
                        }  
                    }
                    break;
                case 5:
                    return false;
                default:
                    System.out.println("La opcion no existe");
            }
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
            System.out.println("");
        }

        return true;
    }

    public static int existeEmpleado(int codigoB, Empleado ListaEmpleados[]) {
        for (int i = 0; i < ListaEmpleados.length; i++) {
            if (codigoB == ListaEmpleados[i].codigo) {
                System.out.println("----------El empleado que va a modificar es: -----------");
                System.out.println(ListaEmpleados[i].toString2());
                return i;
            }
        }
        return -1;
    }
    
   
}
