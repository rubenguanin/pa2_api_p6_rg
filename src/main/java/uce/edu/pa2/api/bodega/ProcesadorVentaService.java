package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @Inject
    private TrackingVenta trackingVenta;

    public void procesar(Venta venta) {

        // Iniciar Venta
        System.out.println("Procesando el pedido");

        this.trackingVenta.iniciar();
        // Puede ser consultar el stovk de cada item
        // consulta base de datos

        // Finalizar venta

        // simular tiemop de espera
        try {
            Thread.sleep(100);

        } catch (Exception e) {

        }   
        this.trackingVenta.finalizar();

        // registra estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }

}
