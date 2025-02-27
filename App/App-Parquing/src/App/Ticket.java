/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class Ticket.
 *
 * @author jovcubni
 * @author Andrei
 */
public class Ticket {
    
    /** The contador. */
    private static int contador = 0;
    
    /** The id. */
    private int id;
    
    /** The matricula. */
    private String matricula;
    
    /** The fecha hora. */
    private LocalDateTime fecha_hora;
    
    /** The ubicacion. */
    private Ubicacion ubicacion;

    /**
     * Instantiates a new ticket.
     *
     * @param matricula the matricula
     * @param fecha_hora the fecha hora
     * @param parking the parking
     */
    public Ticket(String matricula, LocalDateTime fecha_hora, Plano parking) {
        this.id = ++contador;
        this.matricula = matricula;
        this.fecha_hora = fecha_hora;
        this.ubicacion = parking.estacionar(id); 

        if (ubicacion == null) {
            System.out.println("? Parking lleno, no se puede estacionar el vehículo.");
        }
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the matricula.
     *
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Gets the fecha hora.
     *
     * @return the fecha hora
     */
    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        return "Ticket{id=" + id + ", fechaHora=" + fecha_hora.format(formatter) +", matricula=" + matricula + ", sitio=" + ubicacion + '}';
    }
}