package uce.edu.pa2.api.bodega;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

//Anotacion la cual va a servir para indicar que es un interceptor 
@InterceptorBinding

// Para clase, metodo o atritubo (Siempre de metodo para que intercepte logica
// de negocio)
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)

public @interface MedirTiempo {

}
