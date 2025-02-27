/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author jovcubni
 * @author Andrei
 */
public class Ticket extends Ubicacion {
    private static int contador = 0; // Contador para IDs únicos
    private int id;
    private String matricula;
    private LocalDateTime fecha_hora;

    public Ticket(String matricula, LocalDateTime fecha_hora, int planta, int plaza) {
        super(planta, plaza);
        this.id = ++contador; // Asignamos un ID único incrementando el contador
        this.matricula = matricula;
        this.fecha_hora = fecha_hora;
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
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        return "Ticket{id=" + id + ", fechaHora=" + fecha_hora.format(formatter) + 
               ", matricula=" + matricula + ", sitio=piso=" + getPlanta() + ", plaza=" + getPlaza() + '}';
    }
}