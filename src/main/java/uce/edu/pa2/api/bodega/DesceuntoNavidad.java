package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DesceuntoNavidad implements Descuento {

    @Override
    public double aplicar(double valor) {

        System.out.println("Aplicando Descuento por Navidad ");
        double valorADescontar = valor * 0.50;
        return valor - valorADescontar;

    }

}
