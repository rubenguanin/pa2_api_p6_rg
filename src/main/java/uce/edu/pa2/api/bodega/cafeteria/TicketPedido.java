package uce.edu.pa2.api.bodega.cafeteria;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.Pedido;

@Dependent
public class TicketPedido {
   private String cliente = "Rubén";

    public void generarTicket() {
        System.out.println("Ticket generado para: " + cliente);
    }
    

}
