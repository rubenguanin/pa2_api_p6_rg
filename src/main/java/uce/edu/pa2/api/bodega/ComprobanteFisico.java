package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisico implements ComprobanteStartegia{

    @Override
    public void generar(String cliente, double total) {
            System.out.println("Imprimiendo comprobante físico para " + cliente);

    }


}
