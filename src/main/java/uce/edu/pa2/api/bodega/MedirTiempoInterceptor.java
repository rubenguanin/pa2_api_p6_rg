package uce.edu.pa2.api.bodega;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor

public class MedirTiempoInterceptor {

    // Decir al metodo que se va a ejecutar al rededor de la ejecucion de un metodo
    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {
System.out.println("Se ejecuto antes del metodo ");
        long inicio = System.currentTimeMillis();

        // Inicia la ejecucion del metodo
        Object resultado = context.proceed(); 
        
        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido);

        return resultado;
    }

}
