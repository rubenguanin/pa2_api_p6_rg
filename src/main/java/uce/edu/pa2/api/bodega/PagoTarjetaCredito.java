package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoTarjetaCredito implements PagoStrategia{

    @Override
    public void realizar(double valor) {
        System.out.println("Presenta Pantalla DAtos Tarjeta ");
        System.out.println("Realizando Cobro");
     }

}
