package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    // Va a tartarla como una lista la cual vamos a poder iterar sobre ella
    private Instance<Descuento> descuentos;

    public void procesar(Compra compra) {
        double total = compra.getSubtotal();
        for (Descuento des : descuentos) {
            total = des.aplicar(total);

            // des.aplicar(compra.getSubtotal());
        }
        compra.setTotal(total);
        System.out.println("Su valor a a pagar es: " + compra.getTotal());
    }

}