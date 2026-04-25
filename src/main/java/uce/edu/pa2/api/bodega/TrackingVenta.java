package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
public class TrackingVenta {
    private long tiempoInicio = 0;
    private long tiempoFinal = 0;
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones = 0;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();

    }

    public void finalizar() {
        this.tiempoFinal = System.currentTimeMillis();
        long tiempoEjecuccion = tiempoFinal - tiempoInicio;
        this.tiempoTotalAcumulado += tiempoEjecuccion;
        this.numeroOperaciones++;
        System.out.println("Tiempo ejecucion: " + tiempoEjecuccion + "ms");
        System.out.println("Tiempo aculumado: " + this.tiempoTotalAcumulado + "ms");
        System.out.println("Tiempo de opreaciones: " + this.numeroOperaciones);

    }

}
