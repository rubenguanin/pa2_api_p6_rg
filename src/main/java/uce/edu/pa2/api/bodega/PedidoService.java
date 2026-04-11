package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class PedidoService {

    @Inject
    private NotificadorMail notificadorMail;

    public void registrar(Pedido pedido) {

        System.out.println("registrando pedido para el cliente: " + pedido.getCliente());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("GUARDANDO EN LA BASE DE DATOS ");
        //Sin inyeccion
        //NotficadorMail n1 = new NotificadorMail();
        
        //Con DI por el contenedor 
        notificadorMail.enviar(pedido.getCorreo(), "Su pedido ha sido registrado con exito");

    }
}
