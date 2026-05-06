package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoIce  implements Impuesto{

    @Override
    public double AplicarImpuesto(double valor) {
         System.out.println(" Impuesto a los Consumos Especiales Aplicado");
        return valor * 0.75;
    }

}
