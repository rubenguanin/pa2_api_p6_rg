package uce.edu.pa2.api.bodega.cafeteria;

import jakarta.inject.Singleton;

@Singleton
public class Impuestos {
    private final double IVA  = 0.15;
    public double getIva(){
        return IVA;
    }

}
