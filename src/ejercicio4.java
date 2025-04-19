import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
    /*Ejercicio 4 - Verificación de duplicados en una lista de correos electrónicos.
Escribe un programa que verifique si hay correos electrónicos duplicados en una lista.
El programa debe leer una lista de correos electrónicos y utilizar una estructura de datos adecuada
para identificar y reportar cualquier duplicado encontrado. */
            Scanner scanner = new Scanner(System.in);

            System.out.println(" ingrese la cantidad de correos electronicos ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            String[] correos = new String[cantidad];

            ingresrCorreos(scanner, cantidad, correos);

            HayDuplicados(cantidad, correos);
        
        
        
        
        
        }



    private static void HayDuplicados(int cantidad, String[] correos) {
        boolean hayDuplicados = false;
        for (int i = 0; i < cantidad; i++) {
           for (int j = i+1; j < cantidad; j++) {
               if (correos[i].equals(correos[j])) {
                   hayDuplicados = true;
                   System.out.println( " se encontro un duplicado : "+ correos[i]);
                   
               }
               
           }
           
        }
      if (!hayDuplicados) {
        System.out.println();
      }
    }

    

    private static void ingresrCorreos(Scanner scanner, int cantidad, String[] correos) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(" ingrese el correo electronico "+(i+1)+ ": ");
            correos[i] = scanner.nextLine();
            
        }
    }
}
