import java.util.Scanner;

public class ejercicio2 {

public static void main(String[] args) {
 /*Ejercicio 2 - Matriz de Rotación
Escribe un programa que tome una matriz cuadrada (array bidimensional) y la rote 90 grados en el 
sentido de las agujas del reloj.
Pide al usuario el el tamaño de la dimensión de la matriz (ten en cuenta que si el usuario ingresa 
el valor 3, la matriz será de 3 x 3).
Todos los valores del contenido de la matriz, los cuales deben ser leídos por teclado con los 
valores ingresados por el usuario.

Por ejemplo, si la matriz de entrada es:

1  2  3
4  5  6
7  8  9
La matriz rotada debe ser:

7  4  1
8  5  2
9  6  3 */
                   Scanner scanner = new Scanner(System.in);
     System.out.println(" ingrese el tamaño de matriz : ");
    int cantidadMatriz = scanner.nextInt();
                   
  int [][] matriz = new int[cantidadMatriz][cantidadMatriz];  
  int contador = 1;
   System.out.println(" ingresar los numeros de la matriz : ");
     for (int i = 0; i < matriz.length; i++) {
       
        for (int j = 0; j < matriz.length; j++) {
            
            System.out.println(" numero "+ contador+" : ");
            int numeros = scanner.nextInt();
            matriz [j][i] = numeros;
            contador++;
        }
        
     }
     for (int i = 0; i < matriz.length ; i++) {
        for (int j = (cantidadMatriz)-1 ; j > -1 ; j--) {
            System.out.print("  "+matriz[i][j]+ " ");
        }
        System.out.println();
     }
  
}
}