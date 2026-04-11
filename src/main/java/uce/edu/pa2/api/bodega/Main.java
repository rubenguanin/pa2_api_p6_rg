package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {
        @Inject

        private PedidoService pedidoService;

        @Override
        public int run(String... args) {
            Pedido pedido = new Pedido("Ruben Guanin", "Coca Cola", 100.0, "rb@gmail.com");
            //PedidoService service = new PedidoService();
            this.pedidoService.registrar(pedido);
            return 0;
        }
    }
    //.\mvnw.cmd quarkus:dev

}

