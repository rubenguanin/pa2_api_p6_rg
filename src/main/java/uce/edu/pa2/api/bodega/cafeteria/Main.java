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
        CafeteriaService cafeteriaService;

        @Override
        public int run(String... args) throws Exception {
            System.out.println("INICIANDO CAFETERIA");

            cafeteriaService.procesarPedido();

            cafeteriaService.procesarPedido();

            cafeteriaService.procesarPedido();

            return 0;
        }

    }
}
