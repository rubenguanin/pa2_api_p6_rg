package uce.edu.pa2.api.bodega.cafeteria;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.Main.App;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private CafeteriaService cafeteriaService;
        private String cliente1 = "Ruben";
        private String cliente2 = "Alejandro";
        private String cliente3 = "G";

        @Override
        public int run(String... args) throws Exception {
            System.out.println("INICIANDO CAFETERIA");

            cafeteriaService.procesarPedido(cliente1);

            cafeteriaService.procesarPedido(cliente2);

            cafeteriaService.procesarPedido(cliente3);

            return 0;
        }

    }
}
