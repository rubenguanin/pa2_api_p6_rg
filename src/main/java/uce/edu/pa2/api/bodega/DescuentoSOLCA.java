package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoSOLCA implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Solca ");

        Double valorADescontar = valor * 0.20;

        // return valor *1.15
        return valor - valorADescontar;
    }

}
