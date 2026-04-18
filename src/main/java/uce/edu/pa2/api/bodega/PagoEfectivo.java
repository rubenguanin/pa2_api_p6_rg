package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoEfectivo implements PagoStrategia {

    @Override
    public void realizar(double valor) {
        System.out.println("Pantalla Cobrar");
        System.out.println("Relizando Cobro...");
    }

}
