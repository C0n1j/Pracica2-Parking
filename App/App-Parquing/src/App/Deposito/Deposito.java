package App.Deposito;

import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * Class Deposito.
 */
public class Deposito {
    
    double precio;//Lo que le cuesta
    double pago;//Lo que introduce el usuario
    
     /**
     * The main method.
     *
     * @param args the arguments
     **
     *@author jovcubni
     * @author Andrei
     */
    public static void main(String[] args) {
        Deposito dep = new Deposito();
        Deposito deposito = new Deposito();
        deposito.realizarPago(dep.precio,dep.pago ); 
    }
    
    /** The deposito. */
    private TipoMoneda deposito;

    /**
     * Instantiates a new deposito.
     */
    public Deposito() {
        deposito = new TipoMoneda();
    }

    /**
     * Realizar pago.
     *
     * @param precio the precio
     * @param pago the pago
     * @return true, if successful
     */
    public boolean realizarPago(double precio, double pago) {
        if (pago < precio) {
            System.out.println("Pago insuficiente.");
            return false;
        }

        double cambio = pago - precio;
        if (!proporcionarCambio(cambio)) {
            System.out.println("No hay suficiente cambio disponible.");
            return false;
        }

        deposito.agregarMoneda(pago, 1); // Agregamos el pago al depósito
        System.out.println("Pago realizado con exito.");
        return true;
    }

    /**
     * Proporcionar cambio.
     *
     * @param cambio the cambio
     * @return true, if successful
     */
    public boolean proporcionarCambio(double cambio) {
    if (cambio == 0) return true;

    double[] valores = {20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05};
    ArrayList<Double> cambioEntregado = new ArrayList<>();

    for (double valor : valores) {
        while (cambio >= valor && deposito.getCantidad(valor) > 0) {
            cambio -= valor;
            cambio = Math.round(cambio * 100.0) / 100.0; 
            deposito.retirarMoneda(valor, 1);
            cambioEntregado.add(valor);
        }
    }

    if (cambio > 0) {
        System.out.println("No se pudo dar el cambio exacto.");
        return false;
    }

    System.out.println("Cambio entregado: " + cambioEntregado);
    return true;
}



}
