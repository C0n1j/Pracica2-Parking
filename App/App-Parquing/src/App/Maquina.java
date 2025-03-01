/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *@author jovcubni
 * @author Andrei
 */
import java.util.ArrayList;

public class Maquina {
    private double precioPorMinuto;
    private Plano parking;
    private Deposito deposito;
    private ArrayList<Ticket> tickets; // Lista de tickets generados

    public Maquina(double precioPorMinuto) {
        this.precioPorMinuto = precioPorMinuto;
        this.parking = new Plano();
        this.deposito = new Deposito();
        this.tickets = new ArrayList<>();
    }

    // Método para generar un ticket si hay espacio en el parking
    public Ticket generarTicket(String matricula) {
        Ticket ticket = new Ticket(matricula, java.time.LocalDateTime.now(), parking);
        if (ticket.getUbicacion() != null) {
            tickets.add(ticket);
            System.out.println("✅ Ticket generado: " + ticket);
        } else {
            System.out.println("🚫 No hay espacio disponible en el parking.");
            return null;
        }
        return ticket;
    }

    // Método para procesar el pago y liberar el vehículo
    public boolean pagarTicket(int ticketId, double cantidadIntroducida) {
        Ticket ticket = buscarTicket(ticketId);
        if (ticket == null) {
            System.out.println("❌ Ticket no encontrado.");
            return false;
        }

        long minutos = java.time.Duration.between(ticket.getFecha_hora(), java.time.LocalDateTime.now()).toMinutes();
        double total = minutos * precioPorMinuto;
        if (minutos == 0) total = precioPorMinuto; // Mínimo 1 minuto de cobro

        System.out.println("💰 Total a pagar: " + total + "€");

        if (!deposito.realizarPago(total, cantidadIntroducida)) {
            System.out.println("🚫 Error en el pago.");
            return false;
        }

        parking.liberar(ticketId);
        tickets.remove(ticket);
        System.out.println("✅ Vehículo retirado.");
        return true;
    }

    // Busca un ticket por ID
    private Ticket buscarTicket(int ticketId) {
        for (Ticket t : tickets) {
            if (t.getId() == ticketId) {
                return t;
            }
        }
        return null;
    }

    public void mostrarEstado() {
        System.out.println("📊 Estado de la máquina:");
        parking.mostrarParking();
        System.out.println(deposito);
    }
}

