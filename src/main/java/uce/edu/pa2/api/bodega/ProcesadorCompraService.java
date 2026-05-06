package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    // Va a tartarla como una lista la cual vamos a poder iterar sobre ella
    private Instance<Impuesto> impuesto;

    public void procesar(Compra compra) {
        double subtotal = compra.getSubtotal();
        double total = subtotal;
        for (Impuesto imp : impuesto) {
            double valorImpuesto = imp.AplicarImpuesto(subtotal);
            total += valorImpuesto;
            // des.aplicar(compra.getSubtotal());
        }
        compra.setTotal(total);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Su valor a a pagar mas Impuesto es: " + compra.getTotal());
    }

}
