package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobantePDF implements ComprobanteStartegia {

    @Override
    public void generar(String cliente, double total) {
        System.out.println("Generando comprobante PDF para " + cliente);
 
    }

}
