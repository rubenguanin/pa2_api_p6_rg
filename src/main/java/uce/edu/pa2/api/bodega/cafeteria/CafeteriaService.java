package uce.edu.pa2.api.bodega.cafeteria;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CafeteriaService {
    @Inject
    private ContadorVisitasLocales contadorVisitasLocales;
    @Inject
    private Impuestos impuestos;
    @Inject
    private TicketPedido ticketPedido;

    public void procesarPedido(String cliente) {
        contadorVisitasLocales.registraVisita();
        System.out.println("Visitas: " + contadorVisitasLocales.getVisitas());
        System.out.println("Con iva: " + impuestos.getIva());
        ticketPedido.generarTicket(cliente);
    }

}
