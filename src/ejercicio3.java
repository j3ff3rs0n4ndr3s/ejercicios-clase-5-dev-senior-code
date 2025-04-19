import java.util.Scanner;

public class ejercicio3 {

public static void main(String[] args) {
    /* Ejercicio 3 - Gestión de una lista de tareas pendientes.
Desarrolla un programa que gestione una lista de tareas pendientes. El programa debe permitir 
agregar nuevas tareas, eliminar tareas completadas y mostrar todas las tareas pendientes en el
orden en que fueron agregadas. Además, debe permitir acceder a una tarea específica por su posición
en la lista.*/
            Scanner scanner = new Scanner(System.in);
            String [] tareas = new String[10]  ;
            int opciones = 0 ;
            int contador = 0;
do {
    System.out.println(" gestor de tareas ");
System.out.println("1. agregar tarea ");
System.out.println("2. eliminar tarea ");
System.out.println("3. mostrar tareas  ");
System.out.println("4. acceder a tarea   ");
System.out.println("5. salir");

 opciones = scanner.nextInt();
 scanner.nextLine ();
switch (opciones){ 
    case 1:
        contador = agregarTareas(scanner, tareas, contador);
            
        
    break;
    case 2:
        contador = eliminarTareas(scanner, tareas, contador);

    break;
    case 3:
        
         mostarTareas(tareas, contador);
    break;
    case 4 :
        accederAtarea(scanner, tareas, contador);
      break;
    case 5:
        System.out.println(" saliendo del programa : ");  
    break;
    
default:
         System.out.println(" opcion invalida volver a elegir entre las opciones ");
    break;
}

} while (opciones == 1 || opciones <= 4);
    }

private static void accederAtarea(Scanner scanner, String[] tareas, int contador) {
    if (contador > 0) {
        System.out.println("ingrese a la posicion de la tarea a acceder (1- "+contador+"): ");
        int posicion = scanner.nextInt();
        scanner.nextLine();
        if (posicion >= 1 && posicion <= contador ) {
            System.out.println(" tarea en la posicion " +posicion+ ":"+ tareas[posicion - 1]);
            
        } else {
            System.out.println(" posicion invalida ");
        }
    } else {
        System.out.println(" no hay tareas pendientes ");
    }
}

private static void mostarTareas(String[] tareas, int contador) {
    if (contador > 0) {
        System.out.println(" tareas pendientes : ");
        for (int i = 0; i < contador; i++) {
            System.out.println((i+1)+ ". " +tareas[i]);
            
        }
     } else {
        System.out.println(" no hay tareas pendientes ");
        
     }
}

private static int eliminarTareas(Scanner scanner, String[] tareas, int contador) {
    System.out.println(" eliminar tareas : ");
    if (contador > 0) {
        System.out.println("ingrese la posicion de la tarea a eliminar (1-" +contador+"): ");
        int posicion = scanner.nextInt();
        scanner.nextLine();

        if (posicion>=1 && posicion <= contador) {
            for (int i = posicion -1 ; i < contador -1 ; i++) {
                tareas[i] = tareas[i+1];
                
            }
            contador--;
            System.out.println(" tarea eliminada con exito .");
        }else {
            System.out.println(" posicion invalida ");
        }
        
    } else {
        System.out.println(" no hay tareas pendientes ");
        
    }
    return contador;
}

private static int agregarTareas(Scanner scanner, String[] tareas, int contador) {
    if (contador < 10) {
      System.out.println(" ingrese la tarea :"); 
      tareas [contador]  = scanner.nextLine(); 
      contador++;
      System.out.println(" tarea agregada con exito ");    
    } else {
        System.out.println(" no se puede agregar mas tareas ");
        
    }
    return contador;
}
}