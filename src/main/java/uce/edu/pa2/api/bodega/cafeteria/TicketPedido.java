package uce.edu.pa2.api.bodega.cafeteria;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.Pedido;

@Dependent
public class TicketPedido {

    public void generarTicket(String cliente) {
        System.out.println("Ticket generado para: " + cliente);
    }

}
