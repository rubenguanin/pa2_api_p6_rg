package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class DescuentoIsd implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Isb");
        double valorADescontar = valor * 0.10;
        return valor - valorADescontar;
    }

}
