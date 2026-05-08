package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
@Priority(2)
@ApplicationScoped
public class ImpuestoIce  implements Impuesto{

    @Override
    public double AplicarImpuesto(double valor) {
         System.out.println(" Impuesto a los Consumos Especiales Aplicado");
        return valor * 0.75;
    }

}
