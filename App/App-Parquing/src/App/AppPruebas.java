/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import App.Tiket_Plazas.Ticket;
import App.Tiket_Plazas.Plano;
import java.time.LocalDateTime;

/**
 *
 * @author Andrei
 */
public class AppPruebas {
    public static void main(String[] args) {
        Plano parking = new Plano();

        // Estacionar dos vehículos
        Ticket t1 = new Ticket("1234-ABC", LocalDateTime.now(), parking);
        Ticket t2 = new Ticket("9999-ZZZ", LocalDateTime.now(), parking);

        // Mostrar tickets
        System.out.println(t1);
        System.out.println(t2);

        // Mostrar el parking
        parking.mostrarParking();

        // Retirar un vehículo
        parking.liberar(t1.getId());

        // Mostrar parking actualizado
        parking.mostrarParking();
    }
}
