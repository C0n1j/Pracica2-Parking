/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;
import java.util.Arrays;
/**
 *@author jovcubni
 * @author Andrei
 */

public class Ubicacion {
    private int planta;
    private int plaza;

    public Ubicacion(int planta, int plaza) {
        this.planta = planta;
        this.plaza = plaza;
    }

    public int getPlanta() {
        return planta;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    @Override
    public String toString() {
        return "piso=" + planta + ", plaza=" + plaza;
    }
}