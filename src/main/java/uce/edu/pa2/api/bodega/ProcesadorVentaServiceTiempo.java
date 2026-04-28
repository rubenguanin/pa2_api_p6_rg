package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class ProcesadorVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo // SE va a ejceutar antes del metodo el interceptor 
    //todo lo que este arriba de context.proced
    
    public void procesar(Venta venta) {

        System.out.println("Procesado el pedido ");

        try {
            Thread.sleep(100);

        } catch (Exception e) {

        }

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }

@MedirTiempo
    public void reProcesar(Venta venta) {

        System.out.println("Reprocesado el pedido ");

        try {
            Thread.sleep(250);

        } catch (Exception e) {

        }

        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

        System.out.println("Finalizando el re proceso");
    }


}
