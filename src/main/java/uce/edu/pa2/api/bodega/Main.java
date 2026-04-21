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
        private AmbitoAplicacion ambitoAplicacion;

        @Inject
        private ClaseIntermedia claseIntermedia;

        @Inject
        private AmbitoRequest ambitoRequest;
        @Inject
        private AmbitoInject    ambitoInjec;
        @Inject
        private AmbitoSingleton ambitoSingleton;
        @Override
        public int run(String... args) {

            System.out.println(this.ambitoAplicacion);

            System.out.println(this.ambitoAplicacion.incrementar());
            System.out.println(this.ambitoAplicacion.incrementar());

            System.out.println(this.ambitoAplicacion.incrementar());

            this.claseIntermedia.imprimirObjetoValor();

           // System.out.println("Request Scope");
            //System.out.println(this.ambitoRequest.incrementar();
            //System.out.println(this.ambitoRequest.incrementar();
            //System.out.println(this.ambitoRequest.incrementar();


            System.out.println("-----Ambito dependet-------");
            System.out.println(this.ambitoInjec.incrementar());
            System.out.println(this.ambitoInjec.incrementar());
            System.out.println(this.ambitoInjec.incrementar());

            this.claseIntermedia.imprimirObjetoValorInject();
 

            System.out.println("-----Ambito Singleton------");
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());


            this.claseIntermedia.imprimirObjetoValorSingleton();

            return 0;
        }

    }
    // .\mvnw.cmd quarkus:dev

}
