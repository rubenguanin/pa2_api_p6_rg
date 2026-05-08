package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(4)
public class DescuentoPorMayor implements Impuesto {
    public double AplicarImpuesto(double valor) {
        System.out.println("Descuento por Compar al mayor Aplicado");
        double descuento = valor * 0.05;
        valor = valor - descuento;
        return valor;
    }

}
