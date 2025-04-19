import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
      /*Ejercicio 5 - Gestión de una cola de impresión
Desarrolla un programa que gestione una cola de documentos para imprimir. El programa debe permitir
 agregar documentos a la cola, eliminar el documento que se está imprimiendo actualmente y mostrar 
 todos los documentos en la cola en el orden en que fueron agregados. */  
               Scanner scanner = new Scanner(System.in);
     String[] documentos = new String[10];
     int indice = 0;

     while (true) {
        System.out.println(" gestion de cola de impresion ");
        System.out.println(" 1. agregar documento a la cola ");
        System.out.println(" 2. eliminar documento que se esta imprimiendo");
        System.out.println(" 3. mostrar todods los documentos en la cola ");
        System.out.println(" 4. salir");

        System.out.println(" ingrese su opcion ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
       switch (opcion) {
        case 1 :
            indice = extracted(scanner, documentos, indice);
            
            break;
        case 2 :
            indice = imprimiendo(documentos, indice);
        break ;
        case 3 :
            documentosEnLaCola(documentos, indice);
            break;
         case 4 :
         System.out.println(" Hasta luego ");
         return;
            
            default:
            System.out.println( " opcion invalida ");
            break;
       }
     }
    }

    private static void documentosEnLaCola(String[] documentos, int indice) {
        if (indice > 0) {
            System.out.println( " documentos en la cola ");
            for (int i = 0; i < indice; i++) {
                System.out.println((i+1)+". "+ documentos[i]);
            }
        } else {
            System.out.println(" La cola esta vacia. No hay documentos para mostrar.");
        }
    }

    private static int imprimiendo(String[] documentos, int indice) {
        if (indice > 0) {
            System.out.println(" se esta imprimirndo actualmente " +documentos[0]);
            for (int i = 0; i < indice; i++) {
                documentos[i] = documentos[i+1];
                 indice --;
                 System.out.println(" documento eliminado de la cola con exito : ");
            }
        }
        return indice;
    }

    private static int extracted(Scanner scanner, String[] documentos, int indice) {
        if (indice < 10) {
            System.out.println(" ingrese el nombre del documento ");
            documentos[indice] = scanner.nextLine();
            indice ++;
            System.out.println(" documento agregado a la cola con exito ");
           
        } else {
                System.out.println(" la cola esta llena . no se puede agregar mas documentos");
            }
        return indice;
    }
}
