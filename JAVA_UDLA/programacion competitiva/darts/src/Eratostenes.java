/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   +                          CRIBA DE ERATOSTENES                            +
   + Este programa muestra numeros primos obtenidos mediante el algoritmo de  +
   + Eratostenes.                                                             + 
   + ENTRADA: No requiere entrada                                             + 
   + SALIDA: Numeros primos                                                   + 
   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

  /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   *                                ALGORITMO:                                *
   * Los numeros de 2 a N se consideran todos primos en un principio          *
   *                                                                          * 
   * Desde j = 2 hasta N - 1                                                  *
   *   Desde k = j hasta N/j                                                  *
   *     El Numero k*j se considera no primo.                                 *  
   *                                                                          *
   * Imprime los numeros que al final del proceso aun son primos              *
   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/ 
  
 public class Eratostenes
 {   // Abre clase Eratostenes
 private int Tamano_Arreglo = 600;
 //Basta cambiar este numero para obtener
 // los primos hasta ese limite

 /////////////////////////////////////////////
 // METODO PRINCIPAL
 /////////////////////////////////////////////

 public void Principal()

 { //ABRE PRINCIPAL 
 boolean Arreglo[];
 Arreglo = new boolean[Tamano_Arreglo + 1];
 for ( int i = 1; i < Tamano_Arreglo; i++ )
 Arreglo[i] = true; //EN PRINCIPIO TODOS LOS NUMEROS SE CONSIDERAN PRIMOS

 for ( int j = 2; j <= Tamano_Arreglo; j++ )
 if ( true == Arreglo[j] ) // Para numeros grandes este if hace una 
                           // diferencia de tiempo importante
 for ( int k = 2; k <= (Tamano_Arreglo)/j; k++ )
 Arreglo[k*j] = false;

 // Se llama al metodo Imprime
 Imprime( Arreglo, Tamano_Arreglo );

 } //CIERRA PRINCIPAL 

 //////////////////////////////////////////////
 // IMPRIME
 //////////////////////////////////////////////

 public void Imprime( boolean A[], int Tamano )

 { //ABRE IMPRIME
 int contador = 0;

 for ( int m = 2; m <= Tamano; m++ )
 { //ABRE FOR
 if ( true == A[m] )
 contador++;
 } //CIERRA FOR


 //System.out.printf("\n\nEstos son los %d numeros primos que hay ", contador);
 //System.out.printf("entre 1 y %d\n\n", Tamano_Arreglo);

 int salto = 1; 
 for ( int n = 1; n <= Tamano; n++ )
 { //ABRE FOR
 
     
 if ( true == A[n] )
 {
 //System.out.print("%4d\t", n, ",");
     System.out.print(n + ",");
 salto++;
 }
 if ( 10 == salto )
 {
// System.out.println();
 salto = 1;
 }
 } //CIERRA FOR

 //System.out.printf("\n");
 } //CIERRA IMPRIME  

 }   // Cierra clase Eratoste