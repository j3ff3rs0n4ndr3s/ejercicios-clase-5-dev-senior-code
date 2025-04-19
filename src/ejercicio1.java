import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ejercicio1 {
public static void main(String[] args) throws Exception {
/*Ejercicios
Ejercicio 1 - Funciones con uso de arrays
Escribe un programa que para un array de tamaño n (dado por el usuario) de números enteros 
que son ingresados por teclado, realice las siguientes funciones e imprime el resultado en pantalla:

La suma de todos los elementos.
Encontrar el valor máximo
Encontrar el valor mínimo.
Invertir por completo el array.
Ordenar el array de mayor a menor.
Obtener el promedio de los elementos del array.
Encontrar la moda (el número que mas se repite) */
    Scanner scanner = new Scanner(System.in);

    System.out.println(" ingrese el tamaño del arreglo : ");
    int nArreglo = scanner.nextInt();
    int [] arreglo = new int[nArreglo];
    extracted(scanner, nArreglo, arreglo);
    getSuma(arreglo);
    getMaxInt(nArreglo, arreglo);
    getMinimo(arreglo);
    invertido(arreglo);
    mayorAmenor(arreglo);
    Promedio(arreglo);
    int moda = calcularModa(arreglo);
    System.out.println(" moda de los numeros "+ moda);

    

    
}

public static int calcularModa(int [] arreglo) {
    int moda = arreglo [0];
    int maxFrecuencia = 0;
    for (int i = 0 ; i < arreglo.length;i++){
        int frecuencia = 0;
        for (int j = 0 ; j < arreglo.length;j++) {
            if (arreglo[i] == arreglo[j]){
                frecuencia ++;
            }
        }
        if (frecuencia > maxFrecuencia){
            maxFrecuencia = frecuencia;
            moda = arreglo[i];
        }
    }
    return moda;
}


private static void Promedio(int[] arreglo) {
    double promedio = Arrays.stream(arreglo).average().getAsDouble();

    System.out.println(" promedio de los numeros : " + promedio);
}




private static void mayorAmenor(int[] arreglo) {
    
    Arrays.sort(arreglo);
    System.out.println(" de mayor a menor : ");
    for (int i = arreglo.length - 1;i >=0;i--){
        System.out.println(arreglo[i]+ " ");
    }

}




private static void invertido(int[] arreglo) {
    Arrays.sort(arreglo);
    System.out.println("arreglo invertido " + Arrays.toString(arreglo));
}




private static void getMinimo(int[] arreglo) {
int minimo = Arrays.stream(arreglo).min().getAsInt();
System.out.println( " valor minimno en el arreglo "+minimo);
}




private static void getSuma(int[] arreglo) {
int suma = arreglo[0];
suma = Arrays.stream(arreglo).sum();
System.out.println( " la suma de los numero es : "+suma);
}




private static void extracted(Scanner scanner, int nArreglo, int[] arreglo) {
System.out.println(" ingresar los numero que van dentro del arreglo : ");
for (int i = 0; i < nArreglo; i++) {
    System.out.println(" numero : "+(i+1));
    arreglo[i] = scanner.nextInt(); 
    
}
}

private static void getMaxInt(int nArreglo, int[] arreglo) {
int maxInt = Integer.MAX_VALUE;
maxInt = arreglo[0];

System.out.println(" valor maximo en el arreglo : "+ maxInt);
}
}
