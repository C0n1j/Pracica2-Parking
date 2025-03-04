/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Tiket_Plazas;
// TODO: Auto-generated Javadoc

/**
 * The Class Ubicacion.
 *
 * @author jovcubni
 * @author Andrei
 */

public class Ubicacion {
    
    /** The planta. */
    private int planta;
    
    /** The plaza. */
    private int plaza;

    /**
     * Instantiates a new ubicacion.
     *
     * @param planta the planta
     * @param plaza the plaza
     */
    //constructor
    public Ubicacion(int planta, int plaza) {
        this.planta = planta;
        this.plaza = plaza;
    }

    /**
     * Gets the planta.
     *
     * @return the planta
     */
    public int getPlanta() {
        return planta;
    }

    /**
     * Gets the plaza.
     *
     * @return the plaza
     */
    public int getPlaza() {
        return plaza;
    }

    /**
     * Sets the planta.
     *
     * @param planta the new planta
     */
    public void setPlanta(int planta) {
        this.planta = planta;
    }

    /**
     * Sets the plaza.
     *
     * @param plaza the new plaza
     */
    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "piso=" + planta + ", plaza=" + plaza;
    }
}