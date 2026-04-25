package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;

        @Inject
        private ProcesadorVentaEnLinea procesadorVentaEnLinea;

        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Ruben", 70.0);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Daniel", 40.0);
            this.procesadorVentaService.procesar(v2);
            Venta v3 = new Venta("Pablo", 20.0);
            this.procesadorVentaService.procesar(v3);

            Venta v4 = new Venta("Rigoberto", 20.0);
            this.procesadorVentaService1.procesar(v4);
            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();

            Venta v5 = new Venta("Rigoberto", 20.0);
            this.procesadorVentaEnLinea.procesar(v5);
            return 0;
        }

    }
    // .\mvnw.cmd quarkus:dev

}


 