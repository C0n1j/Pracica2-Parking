/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *@author jovcubni
 * @author Andrei
 */
public class Ticket {
    private static int contador = 0;
    private int id;
    private String matricula;
    private LocalDateTime fecha_hora;
    private Ubicacion ubicacion; // Se debe asegurar que esto se inicializa correctamente

    public Ticket(String matricula, LocalDateTime fecha_hora, Plano plano) {
        this.id = ++contador;
        this.matricula = matricula;
        this.fecha_hora = fecha_hora;
        this.ubicacion = plano.estacionar(id); // Aquí aseguramos que se obtiene la ubicación

        if (ubicacion == null) {
            System.out.println("Parking lleno, no se puede estacionar el vehículo.");
        }
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public Ubicacion getUbicacion() { // Asegurar que este método existe
        return ubicacion;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        return "Ticket{id=" + id + ", fechaHora=" + fecha_hora.format(formatter) +
               ", matricula=" + matricula + ", sitio=" + ubicacion + '}';
    }
}
