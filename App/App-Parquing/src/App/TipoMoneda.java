package App;

// TODO: Auto-generated Javadoc
/**
 * The Class TipoMoneda.
 */
public class TipoMoneda {
    
    /** The valores. */
    private final double[] valores = {20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05};
    
    /** The cantidades. */
    private int[] cantidades;

    /**
     * Instantiates a new tipo moneda.
     */
    public TipoMoneda() {
        cantidades = new int[valores.length];
        for (int i = 0; i < cantidades.length; i++) {
            cantidades[i] = 100; // Inicializamos con 100 monedas/billetes de cada tipo
        }
    }

    /**
     * Gets the cantidad.
     *
     * @param valor the valor
     * @return the cantidad
     */
    public int getCantidad(double valor) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valor) {
                return cantidades[i];
            }
        }
        return 0; // Si no encuentra el valor, retorna 0
    }

    /**
     * Agregar moneda.
     *
     * @param valor the valor
     * @param cantidad the cantidad
     */
    public void agregarMoneda(double valor, int cantidad) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valor) {
                cantidades[i] += cantidad;
                return;
            }
        }
    }

    /**
     * Retirar moneda.
     *
     * @param valor the valor
     * @param cantidad the cantidad
     * @return true, if successful
     */
    public boolean retirarMoneda(double valor, int cantidad) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valor && cantidades[i] >= cantidad) {
                cantidades[i] -= cantidad;
                return true;
            }
        }
        return false; // No hay suficiente dinero para retirar
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Depósito actual:\n");
        for (int i = 0; i < valores.length; i++) {
            sb.append("Moneda/Billete ").append(valores[i]).append("€: ").append(cantidades[i]).append("\n");
        }
        return sb.toString();
    }
}
