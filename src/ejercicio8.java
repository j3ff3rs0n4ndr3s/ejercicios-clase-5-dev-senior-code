import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ejercicio8 {
    public static void main(String[] args) {
       /*Crea un programa que encuentre todos los elementos únicos en una lista de números. El programa debe leer
        una lista de números que puede contener duplicados y utilizar una estructura de datos adecuada para identificar
         y mostrar los números únicos. */ 
         Scanner scanner = new Scanner(System.in);
         List<Integer> numeros = new ArrayList<>();
         
         System.out.println("PROGRAMA PARA ENCONTRAR NÚMEROS ÚNICOS");
         System.out.println("Ingrese números (número negativo para terminar):");
 
         int numero;
         do {
             System.out.print("Ingrese un número: ");
             numero = scanner.nextInt();
             if (numero > 0) {
                 numeros.add(numero);
             }
         } while (numero > 0);
 
         // Mapa para contar la frecuencia de cada número
         Map<Integer, Integer> frecuencia = new HashMap<>();
 
         for (int n : numeros) {
             frecuencia.put(n, frecuencia.getOrDefault(n, 0) + 1);
         }
 
         // Mostrar solo los números que aparecen una vez
         System.out.println("Números únicos (que aparecen solo una vez):");
         for (Map.Entry<Integer, Integer> entrada : frecuencia.entrySet()) {
             if (entrada.getValue() == 1) {
                 System.out.println(entrada.getKey());
             }
         }
     }
 }
