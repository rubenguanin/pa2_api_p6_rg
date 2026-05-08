package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
@Priority(3)

@ApplicationScoped

public class ImpuestoFodinfa implements Impuesto{

    @Override
    public double AplicarImpuesto(double valor) {
        System.out.println("Impuesto por Fondo de Desarrollo para la Infancia Aplicado");
        return valor* 0.05;
    }

}
