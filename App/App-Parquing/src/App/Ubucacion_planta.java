/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *@author jovcubni
 * @author Andrei
 */
public class Ubucacion_planta {
    private int planta;
    private int plaza;

    public Ubucacion_planta(int planta, int plaza) {
        this.planta = planta;
        this.plaza = plaza;
    }

    public int getPlanta() {
        return planta;
    }

    public int getPlaza() {
        return plaza;
    }

    @Override
    public String toString() {
        return "Ubucacion_planta{" + "planta=" + planta + ", plaza=" + plaza + '}';
    }
    
}
