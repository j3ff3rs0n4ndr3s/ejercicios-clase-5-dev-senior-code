import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        /*Ejercicio 10 - Almacenamiento de configuraciones de una aplicación
Crea un programa que gestione las configuraciones de una aplicación. El programa debe permitir agregar nuevas 
configuraciones, actualizar configuraciones existentes y mostrar todas las configuraciones almacenadas. */
                    Scanner scanner = new Scanner(System.in);

                    // crear el listado de configuraciones 
List <String> configuracion = new LinkedList<>();
int opciones = 1;

while (opciones != 4) {
System.out.println("1. agregar nuevas configuraciones");
System.out.println("2. actualizar configuraciones");
System.out.println("3. mostrar configuraciones ");
System.out.println(" salir del programa");
opciones = scanner.nextInt();
scanner.nextLine();
        switch (opciones) {
        case 1:// agregar nuevas configuraciones 
            System.out.println(" agregar la configuracion :");
            String agregar = scanner.nextLine();
            configuracion.add(agregar);
            System.out.println("se agrego la siguiente configuracion : "+ agregar);
            break;
            case 2: // actualizar configuraciones existentes
System.out.println("Actualizar la configuracion:");
if (configuracion.isEmpty()) {
System.out.println("No hay configuraciones para actualizar.");
break;
}

// Mostrar configuraciones actuales
System.out.println("Configuraciones actuales:");
for (int i = 0; i < configuracion.size(); i++) {
System.out.println((i + 1) + ". " + configuracion.get(i));
}

// Pedir al usuario que ingrese el número de la configuración a actualizar
System.out.print("Ingrese el número de la configuración a actualizar: ");
int indice = scanner.nextInt();
scanner.nextLine(); // Consumir el salto de línea

// Verificar si el índice es válido
if (indice > 0 && indice <= configuracion.size()) {
System.out.print("Ingrese el nuevo valor para la configuración: ");
String nuevoValor = scanner.nextLine();
configuracion.set(indice - 1, nuevoValor);
System.out.println("Configuración actualizada con éxito.");
} else {
System.out.println("Índice inválido.");
}
break;         
                
case 3:// mostar todas las configuraciones
System.out.println(" Mostrando configuracion : ");
for (String mostrando : configuracion) {
    System.out.println(" configuracion : "+mostrando);
}
break;
case 4:// salir del programa
System.out.println(" finalizando programa");
break;
default:
break;
             }
        }
                    
                     
                   
                    


}
}
