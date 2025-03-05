/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Tiket_Plazas;
  import java.util.Arrays;
// TODO: Auto-generated Javadoc

/**
 * The Class Plano.
 *
 * @author jovcubni
 * @author Andrei
 */
public class Plano {


<<<<<<< HEAD
    /** The plazas. */
=======
   /** The plazas. */
>>>>>>> origin/main
    private int[][] plazas; 

    /**
     * Instantiates a new plano.
     */
    public Plano() {
        plazas = new int[3][20]; //3 plantas(son las filas), 20 plazas(son las columnas)
    }

    /**
     * Estacionar.
     *
     * @param ticketId the ticket id
     * @return Ubicacion, if successful
     */
<<<<<<< HEAD
    // Busca la primera plaza libre y devuelve una plaza libre
=======
    // Busca la primera plaza libre y devuelve la ubicación
>>>>>>> origin/main
    public Ubicacion estacionar(int ticketId) {
        for (int planta = 0; planta < plazas.length; planta++) {
            for (int plaza = 0; plaza < plazas[planta].length; plaza++) {
                if (plazas[planta][plaza] == 0) { // si la plaza esta libre
                    plazas[planta][plaza] = ticketId; // se ocupa esa plaza con el id del ticket
                    return new Ubicacion(planta, plaza);
                }
            }
        }
        return null; // Parking lleno
    }

    /**
     * Liberar.
     *
     * @param ticketId the ticket id
     * @return true, if successful
     */
    // Libera una plaza cuando el coche se va
    public boolean liberar(int ticketId) {
        for (int planta = 0; planta < plazas.length; planta++) {
            for (int plaza = 0; plaza < plazas[planta].length; plaza++) {
                if (plazas[planta][plaza] == ticketId) { // si encontramos el tiket...
                    plazas[planta][plaza] = 0; // esa plaza encontrada vuelve a 0, la liberamos para el siguiente
                    return true;
                }
            }
        }
        return false; 
    }

    /**
     * Mostrar parking.
     */
    public void mostrarParking() {
        for (int[] planta : plazas) {
            System.out.println(Arrays.toString(planta));
        }
    }
}
