/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Tiket_Plazas;

import App.Tiket_Plazas.Ubicacion;
import App.Tiket_Plazas.Plano;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *@author jovcubni
 * @author Andrei
 */
public class Ticket {
    private static int contador = 0; //contador de tipo estatico para crear id unicos
    private int id;
    private String matricula;
    private LocalDateTime fecha_hora;
    private Ubicacion ubicacion;
    
    //constructor
    public Ticket(String matricula, LocalDateTime fecha_hora, Plano plano) {
        this.id = ++contador; //cada vez que se genere un ticket, se incrementa
        this.matricula = matricula;
        this.fecha_hora = fecha_hora;
        this.ubicacion = plano.estacionar(id);//se asigna la plaza si se puede

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

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        return "Ticket{id=" + id + ", fechaHora=" + fecha_hora.format(formatter) + ", matricula=" + matricula + ", sitio=" + ubicacion + '}';
    }
}