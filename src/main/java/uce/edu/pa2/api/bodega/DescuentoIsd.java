package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoIsd implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Isb");
        double valorADescontar = valor * 0.10;
        return valor - valorADescontar;
    }

}
