import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
      /*Desarrolla un programa que simule la llegada y atención de clientes en un banco. El programa debe permitir
       agregar clientes a la cola cuando llegan y eliminar clientes de la cola cuando son atendidos, mostrando siempre
        el estado actual de la cola. */  
                        Scanner scanner = new Scanner(System.in);
                         // crear cola
                         Queue<String> cola = new LinkedList<>();
                         // menu de opciones
                         System.out.println(" Bienvenido al sitema de turnos del banco");
                         int opciones = 0;
                         while (opciones != 3){
                         System.out.println("menu de opciones ");
                         System.out.println(" 1. agregar clientes ");
                         System.out.println(" 2. atender cliente ");
                         System.out.println(" 3. salir del programa");
                         // mostrar el estado actual de la cola 
                        
                          if (cola.peek() == null) {
                            System.out.println(" no hay clientes por atender");
                            
                          }else {System.out.println("siguiente cliente en turno "+cola.size()+" "+cola.peek()); 
                           
                          }
                         opciones = scanner.nextInt();
                         scanner.nextLine();

                            switch (opciones) {
                            case 1: // agregar clientes
                                System.out.println("Agregar Cliente");
                                String agregar = scanner.nextLine();
                                cola.offer(agregar);
                                System.out.println(" cliente agregado con exito");
                                System.out.println(" clientes que quedan por atencion "+cola.size()+" "+cola);
                                break;
                             case 2 :// eliminar clientes 
                                 System.out.println(" cliente en atencion ");
                                 String eliminarCliente = cola.poll();
                                 System.out.println("cliente atendido : "+eliminarCliente);
                                 System.out.println(" clientes que quedan por atencion "+cola.size()+" "+cola);
                             break;
                             case 3 :// salir del programa
                             System.out.println(" clientes que faltaban por atencion "+cola.size()+" "+cola);
                              System.out.println(" que tenga un exelente dia");
                              System.out.println(" salio del programa");
                             break;
                            default:
                               System.out.println(" opcion no valida digite opcion 1 , 2 o 3");
                                break;
                         }}
                         
                         
                        
        
                        
                         

    }
}
