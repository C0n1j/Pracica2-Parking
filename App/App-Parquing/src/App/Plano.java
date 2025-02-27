/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;
  import java.util.Arrays;
/**
 * @author jovcubni
 * @author Andrei
 */
public class Plano {


    private int[][] plazas; //3 plantas

    public Plano() {
        plazas = new int[3][20]; //plazas vacias
    }

    // Busca la primera plaza libre y devuelve una Ubicacion
    public Ubicacion estacionar(int ticketId) {
        for (int planta = 0; planta < plazas.length; planta++) {
            for (int plaza = 0; plaza < plazas[planta].length; plaza++) {
                if (plazas[planta][plaza] == 0) { // Si la plaza está libre
                    plazas[planta][plaza] = ticketId; // Ocupa la plaza con el ID del ticket
                    return new Ubicacion(planta, plaza);
                }
            }
        }
        return null; // Parking lleno
    }

    // Libera una plaza cuando el coche se va
    public boolean liberar(int ticketId) {
        for (int planta = 0; planta < plazas.length; planta++) {
            for (int plaza = 0; plaza < plazas[planta].length; plaza++) {
                if (plazas[planta][plaza] == ticketId) { // Si encontramos el ticket ID en la plaza
                    plazas[planta][plaza] = 0; // Liberamos la plaza
                    return true;
                }
            }
        }
        return false; 
    }

    public void mostrarParking() {
        System.out.println("Plano del Parking:");
        for (int[] planta : plazas) {
            System.out.println(Arrays.toString(planta));
        }
    }
  
}
