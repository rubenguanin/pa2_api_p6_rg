package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoCif implements Impuesto {

    @Override
    public double AplicarImpuesto(double valor) {
        System.out.println("IMPUESTO POR Valor en Aduana  APLICADO ");
        return valor * 0.05;
        
    }


}
