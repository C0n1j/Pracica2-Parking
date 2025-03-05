package App.Tiket_Plazas;
// TODO: Auto-generated Javadoc

/**
 * The Class Ubicacion.
 *
 * @author jovcubni
 * @author Andrei
 */
public class Ubicacion {
    
    private int planta; // numero de planta
    private int plaza; //numero de plaza

    /**
     * Instantiates a new ubicacion.
     *
     * @param planta the planta
     * @param plaza the plaza
     */
    public Ubicacion(int planta, int plaza) {
        this.planta = planta;
        this.plaza = plaza;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "planta=" + planta + ", plaza=" + plaza + '}';
    }
}