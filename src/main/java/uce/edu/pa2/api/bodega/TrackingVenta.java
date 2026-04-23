package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
public class TrackingVenta {
    private long tiempoInicio=0;
    private long tiempoFinal=0;

    public void iniciar() {
        this.tiempoInicio = this.tiempoInicio + System.currentTimeMillis();

    }

    public void finalizar() {
        this. tiempoFinal = this.tiempoFinal +  System.currentTimeMillis();
        long tiempoEjecuccion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo ejecucion: " + tiempoEjecuccion + "ms");
    }

}
