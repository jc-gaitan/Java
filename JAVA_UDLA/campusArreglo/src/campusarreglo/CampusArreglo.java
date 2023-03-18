package campusarreglo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CampusArreglo {

    static campus campu[] = new campus[5];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int res;
    static int aux = 0;
    static int pos = 0;

    public static void main(String[] args) {

        while (menuCAMPUS());

        try {

            System.out.println("MENU BLOQUE");
            System.out.println("1. Ver BLOQUE");
            System.out.println("2. Crear BLOQUE");
            System.out.println("3. Eliminar BLOQUE");
            System.out.println("4. modificar BLOQUE");
            System.out.println("5. salir");
            res = Integer.parseInt(br.readLine());

            switch (res) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La OPCION NO EXISTE");
            }

            System.out.println("MENU SALON");
            System.out.println("1. Ver SALON");
            System.out.println("2. Crear SALON");
            System.out.println("3. Eliminar SALON");
            System.out.println("4. modificar SALON");
            System.out.println("5. salir");
            res = Integer.parseInt(br.readLine());

            switch (res) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La OPCION NO EXISTE");
            }

            System.out.println("MENU SILLA");
            System.out.println("1. Ver SILLA");
            System.out.println("2. Crear SILLA");
            System.out.println("3. Eliminar SILLA");
            System.out.println("4. modificar SILLA");
            System.out.println("5. salir");
            res = Integer.parseInt(br.readLine());

            switch (res) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La OPCION NO EXISTE");
            }

        } catch (Exception ex) {
            System.out.println("META BIEN LOS PUTOS DEDOS" + ex);
        }

        Scanner sc = new Scanner(System.in);
        salones salon = new salones(4102, "Laboratorio", 2);

        for (int i = 0; i < 2; i++) {
            System.out.println("Datos de la silla");
            System.out.println("Escriba el material");
            String material = sc.next();
            System.out.println("Escriba el color");
            String color = sc.next();
            System.out.println("Escriba el numero");
            int num = sc.nextInt();

            sillas s = new sillas(material, color, num);
            boolean respuesta = salon.ingresarSilla(s);

            if (respuesta == true) {
                System.out.println("Silla guardada");
            } else {
                System.out.println("Silla no guardada");
            }
        }

//        salon.crearSilla();
        System.out.println(salon.mostrarSillas());

    }

    public static boolean menuCAMPUS() {
        
        String name;
        
        int position = 0;
        int posi = 0;
        int blo = 0;
        int sa = 0;

        try {
            System.out.println("MENU CAMPUS");
            System.out.println("1. Ver CAMPUS");
            System.out.println("2. Crear CAMPUS");
            System.out.println("3. Eliminar CAMPUS");
            System.out.println("4. modificar CAMPUS");
            System.out.println("5. salir");
            res = Integer.parseInt(br.readLine());

            switch (res) {
                case 1:
                    for (int i = 0; i < campu.length; i++) {
                        if (campu[i] != null) {
                            System.out.println(campu[i].mostrarCampus());
                        } else {
                            aux++;
                        }
                    }
                    if (aux == campu.length) {
                        System.out.println("\n--- NO EXISTEN CAMPUS CREADOS ---\n");
                    }
                    return true;
                case 2:
                    System.out.println("\n--- CAMPUS ---");
                    System.out.println("Ingrese el nombre del campus: ");
                    String nombre = br.readLine();
                    System.out.println("Ingrese la cantidad de bloques que tiene: ");
                    int canBloques = Integer.parseInt(br.readLine());

                    campu[pos] = new campus(nombre, canBloques);

                    for (int i = 0; i < canBloques; i++) {
                        System.out.println("\n--- BLOQUES ---");
                        System.out.println("Ingrese el numero del bloque: ");
                        int numBloque = Integer.parseInt(br.readLine());
                        System.out.println("Ingrese la cantidad de salones que tiene: ");
                        int canSalones = Integer.parseInt(br.readLine());

                        campu[pos].CrearBloque(numBloque, canSalones, i);

                        for (int j = 0; j < canSalones; j++) {
                            System.out.println("\n--- SALONES ---");
                            System.out.println("Ingrese el numero de salon: ");
                            int numSalon = Integer.parseInt(br.readLine());
                            System.out.println("Ingrese el tipo de salon: ");
                            String tipo = br.readLine();
                            System.out.println("Ingrese la cantidad de sillas: ");
                            int numSillas = Integer.parseInt(br.readLine());

                            campu[pos].bloque[i].CrearSalon(numSalon, tipo, numSillas, j);

                            for (int k = 0; k < numSillas; k++) {
                                System.out.println("\n--- SILLAS ---");
                                System.out.println("Ingrese el numero de silla: ");
                                int numSilla = Integer.parseInt(br.readLine());
                                System.out.println("Ingrese el material: ");
                                String material = br.readLine();
                                System.out.println("Ingrese el color: ");
                                String color = br.readLine();

                                campu[pos].bloque[i].salon[j].crearSilla(material, color, numSilla, k);

                            }
                        }
                    }

                    pos++;
                    return true;
                case 3:
                    System.out.println("Ingrese el nombre del campus que desea eliminar: ");
                    name = br.readLine();

                    position = buscarCampus(name.trim().toLowerCase());
                    posi = 0;
                    blo = 0;
                    sa = 0;

                    if (position != -1) {

                        System.out.println("\nCAMPUS A ELIMINAR = \n");
                        System.out.println(campu[position].mostrarCampus());
                        System.out.println("\n");

                        System.out.println("\nQUE DESEA ELIMINAR =  ");
                        System.out.println("1. Todo el campus");
                        System.out.println("2. Un bloque del campus");
                        System.out.println("3. Un salon del campus");
                        System.out.println("4. una silla del campus");
                        res = Integer.parseInt(br.readLine());
                        System.out.println("");
                        switch (res) {
                            case 1:
                                campu[position] = null;
                                System.out.println("El campus fue eliminado");
                                break;
                            case 2:
                                System.out.println("Ingrese el numero del bloque a elimnar: ");
                                res = Integer.parseInt(br.readLine());
                                posi = campu[position].BuscarBloque(res);
                                if (posi != -1) {
                                    campu[position].bloque[posi] = null;
                                    System.out.println("El bloque fue eliminado");
                                } else {
                                    System.out.println("El bloque NO EXISTE");
                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el numero del bloque: ");
                                res = Integer.parseInt(br.readLine());
                                blo = campu[position].BuscarBloque(res);

                                if (blo != -1) {
                                    System.out.println("Ingrese el numero del salon a elimnar: ");
                                    res = Integer.parseInt(br.readLine());

                                    posi = campu[position].bloque[blo].BuscarSalon(res);

                                    if (posi != -1) {
                                        campu[position].bloque[blo].salon[posi] = null;
                                        System.out.println("El salon fue eliminado");
                                    } else {
                                        System.out.println("El salon no existe");
                                    }
                                } else {
                                    System.out.println("El bloque NO EXISTE");
                                }

                                break;
                            case 4:
                                System.out.println("Ingrese el numero del bloque: ");
                                res = Integer.parseInt(br.readLine());
                                blo = campu[position].BuscarBloque(res);

                                if (blo != -1) {
                                    System.out.println("Ingrese el numero del salon: ");
                                    res = Integer.parseInt(br.readLine());
                                    sa = campu[position].bloque[blo].BuscarSalon(res);

                                    if (sa != -1) {
                                        System.out.println("Ingrese el numero de la silla a eliminar: ");

                                        posi = campu[position].bloque[blo].salon[sa].BuscarSilla(res);

                                        if (posi != -1) {
                                            campu[position].bloque[blo].salon[sa].silla[posi] = null;
                                            System.out.println("La silla fue eliminada");
                                        } else {
                                            System.out.println("La silla no existe");
                                        }
                                    } else {
                                        System.out.println("El salon no existe");
                                    }

                                } else {
                                    System.out.println("El bloque NO EXISTE");
                                }

                                break;
                            default:
                                System.out.println("La OPCION NO EXISTE");
                        }
                    } else {
                        System.out.println("El campus NO EXISTE");
                    }

                    return true;
                case 4://modificar
                    System.out.println("Ingrese el nombre del campus que desea modificar: ");
                    name = br.readLine();

                    position = buscarCampus(name.trim().toLowerCase());
                    
                    if(position != -1){
                        System.out.println("\nQUE DESEA MODIFICAR =  ");
                        System.out.println("1. El campus");
                        System.out.println("2. Un bloque del campus");
                        System.out.println("3. Un salon del campus");
                        System.out.println("4. una silla del campus");
                        res = Integer.parseInt(br.readLine());
                        System.out.println("");
                        
                        switch(res){
                            case 1:
                                
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("La OPCION NO EXISTE");
                                
                        }
                        
                    }else{
                        System.out.println("El campus NO EXISTE");
                    }
                    
                    return true;
                case 5://salir
                    return false;
                default:
                    System.out.println("La OPCION NO EXISTE");
            }
        } catch (Exception ex) {
            System.out.println("err " + ex);
        }

        return true;

    }

    public static int buscarCampus(String name) {
        for (int i = 0; i < campu.length; i++) {
            if (campu[i].nombre.trim().toLowerCase().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
