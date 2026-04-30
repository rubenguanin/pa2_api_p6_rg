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
        private ProcesadorVentaServiceTiempo procesadorVentaServiceTiempo;

        @Inject
        private InventarioService inventarioService;

        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Ruben", 70.0);
            this.procesadorVentaServiceTiempo.procesar(v1);

            //Venta v2 = new Venta("Ruben", 70.0);
            //this.procesadorVentaServiceTiempo.reProcesar(v2);

             
            return 0;

        }

    }
    // .\mvnw.cmd quarkus:dev

}
