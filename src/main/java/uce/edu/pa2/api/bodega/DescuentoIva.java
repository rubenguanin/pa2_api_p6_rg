package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoIva implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Iva ");

        Double valorADescontar = valor * 0.15;

        // return valor *1.15
        return valor - valorADescontar;
    }

}
