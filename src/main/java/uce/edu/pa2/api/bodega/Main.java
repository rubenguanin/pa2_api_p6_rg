package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        // Modelo de Ioc Dependency Injection
        // @Inject
        // private PedidoService pedidoService;

        // @Override
        // public int run(String... args) {
        // MAIL (>100)
        // Pedido pedido1 = new Pedido("Ruben Guanin", "Laptop", 150.0, "rb@gmail.com");
        // this.pedidoService.registrar(pedido1);

        // SMS (entre 50 y 100)
        // Pedido pedido2 = new Pedido("Ruben Guanin", "Teclado", 80.0, "rb@gmail.com");
        // this.pedidoService.registrar(pedido2);

        // WHATSAPP (<50)
        // Pedido pedido3 = new Pedido("Ruben Guanin", "Audifonos", 30.0,
        // "rb@gmail.com");
        // this.pedidoService.registrar(pedido3);

        // return 0;
        // }

        // Modelo IoC Lookup
        // private PedidoService pedidoService =
        // CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) {

            // MAIL (>100)
            Pedido pedido1 = new Pedido("Ruben Guanin", "Laptop", 150.0, "rb@gmail.com");
            PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

            pedidoService.registrar(pedido1);

            // SMS (entre 50 y 100)
            Pedido pedido2 = new Pedido("Ruben Guanin", "Teclado", 80.0, "rb@gmail.com");
            pedidoService.registrar(pedido2);

            // WHATSAPP (<50)
            Pedido pedido3 = new Pedido("Ruben Guanin", "Audifonos", 30.0, "rb@gmail.com");

            pedidoService.registrar(pedido3);

            return 0;
        }

    }
    // .\mvnw.cmd quarkus:dev

}
