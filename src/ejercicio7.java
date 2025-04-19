import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        /* desarrolla un programa  que gestione una lista de estudiantes inscritos en un curso.
        el programa debe permitir agregar nuevos estudianes ,  eliminar estudiantes que se 
        han dado de baja y mostrar todos los estudiantes inscritos en el orden que fueron agregados 
        */ 
                  Scanner scanner = new Scanner(System.in);
                   // crear la lista 
    ArrayList<String> listaEstudiante = new ArrayList<>();
    
    
    int opciones = 0 ;
    
                 // menu de opciones 
                 while (opciones != 4) {
                    System.out.println("\n---- Lista de estudiantes ----");
                    System.out.println("1. Agregar estudiante");
                    System.out.println("2. Eliminar estudiante");
                    System.out.println("3. Ver estudiantes");
                    System.out.println("4. Salir del programa");
                    System.out.print("Digite una opción (1 a 4): ");
        
                    // Leer opción
                    opciones = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
        
                    switch (opciones) {
                        case 1:
                            System.out.print("Ingrese nombre del estudiante: ");
                            String nuevoEstudiante = scanner.nextLine();
                            listaEstudiante.add(nuevoEstudiante);
                            break;
        
                        case 2:
                            System.out.print("Ingrese nombre del estudiante a eliminar: ");
                            String estudianteEliminar = scanner.nextLine();
                            if (listaEstudiante.remove(estudianteEliminar)) {
                                System.out.println("Estudiante eliminado con éxito.");
                            } else {
                                System.out.println("Estudiante no encontrado en la lista.");
                            }
                            break;
        
                        case 3:
                            System.out.println("Lista actual de estudiantes:");
                            for (String estudiante : listaEstudiante) {
                                System.out.println("- " + estudiante);
                            }
                            break;
        
                        case 4:
                            System.out.println("Saliendo del programa...");
                            break;
        
                        default:
                            System.out.println("Opción inválida. Por favor, digite un número del 1 al 4.");
                            break;
                    }
                }
        
                scanner.close();
     } 
                   
                  
                   
                  
    }

