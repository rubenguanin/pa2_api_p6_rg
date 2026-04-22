package uce.edu.pa2.api.bodega.cafeteria;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ContadorVisitasLocales {
    private int contadorVisitas = 0;

    public void registraVisita() {
        contadorVisitas++;
    }

    public int getVisitas() {
        return contadorVisitas;
    }

}
