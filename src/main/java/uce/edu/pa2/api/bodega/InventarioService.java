package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class InventarioService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo // SE va a ejceutar antes del metodo el interceptor
    // todo lo que este arriba de context.proced

    public void registrar(Venta venta) {

        System.out.println("Registrando el pedido ");

        try {
            Thread.sleep(500);

        } catch (Exception e) {

        }

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

        System.out.println("Final  registro del pedido ");

    }

}
