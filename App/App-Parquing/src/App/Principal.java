/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *@author jovcubni
 * @author Andrei
 */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maquina maquina = new Maquina(0.50);

        while (true) {
            System.out.println(" PARKING - MENÚ");
            System.out.println("1. Estacionar vehículo");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Ver estado del parking");
            System.out.println("4. Salir");
            System.out.print(" Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print(" Introduce la matrícula del vehículo: ");
                    String matricula = scanner.nextLine();
                    maquina.generarTicket(matricula);
                    break;
                case 2:
                    System.out.print(" Introduce el ID del ticket: ");
                    int ticketId = scanner.nextInt();
                    System.out.print(" Introduce la cantidad de dinero: ");
                    double dinero = scanner.nextDouble();
                    maquina.pagarTicket(ticketId, dinero);
                    break;
                case 3:
                    maquina.mostrarEstado();
                    break;
                case 4:
                    System.out.println(" Saliendo del sistema...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println(" Opción inválida, intenta de nuevo.");
            }
        }
    }
}