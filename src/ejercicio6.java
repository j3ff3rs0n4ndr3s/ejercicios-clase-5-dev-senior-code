import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        /*Ejercicio 6 - Contar la frecuencia de palabras en un texto.
Escribe un programa que cuente la frecuencia de cada palabra en un texto dado. 
El programa debe leer el texto, dividirlo en palabras y utilizar una estructura de datos 
adecuada para almacenar y contar la frecuencia de cada palabra. Finalmente, debe mostrar la
frecuencia de cada palabra. */
     Scanner scanner = new Scanner(System.in);

     System.out.println(" agregar texto ");
     String texto = scanner.nextLine();

     String[] palabras = texto.split(" ");
    
     String [] palabrasUnicas = new String[palabras.length];
     int []  frecuencia = new int[palabras.length];
     int indice = 0;
     for (String palabra : palabras) {
        boolean existe = false;
        for (int i = 0; i < indice; i++) {
            if (palabra.equalsIgnoreCase(palabrasUnicas[i]))
            frecuencia[i]++;
            break;
            
        }
           if (!existe) {
        palabrasUnicas[indice] = palabra;
        frecuencia [indice] = 1;
        indice++;

     }
     }
     
System.out.println(" frecuencia de cada palabra ");
        for (int i = 0; i < indice; i++) {
            System.out.println(palabrasUnicas[1]+ " : "+ frecuencia[i]);
        }
}
}
