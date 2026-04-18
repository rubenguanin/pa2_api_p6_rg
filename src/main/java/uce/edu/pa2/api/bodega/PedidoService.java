package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    // Cnstructor
    // @Inject
    // private NotificadorMail notificadorMail;
    // @Inject
    // public PedidoService(NotificadorMail notificadorMail) {
    // this.notificadorMail = notificadorMail;
    // }

    // Atributo
    // @Inject
    // private NotificadorMail notificadorMail;

    // DI por metodo
    /*
     * private NotificadorMail notificadorMail;
     * 
     * @Inject
     * public void setNotificador(NotificadorMail notificadorMail) {
     * this.notificadorMail = notificadorMail;
     * }
     */

    @Inject
    private NotificadorSelector selector;

    @Inject
    private ComprobantePDF pdf;

    @Inject
    private ComprobanteFisico fisico;
     
    private ComprobanteStartegia comprobante;

    public void registrar(Pedido pedido, PagoStrategia pago) {
        System.out.println("Registrando pedido");
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        pago.realizar(pedido.getTotal());

        // this.comprobante.generar(cliente, total,);
        // NotificadorMail n1 = new NotificadorMail(); Sin inyeccion DI

        if (pedido.getDestino() != null && !pedido.getDestino().isEmpty()) {
            pdf.generar(pedido.getCliente(), pedido.getTotal());
        } else {
            fisico.generar(pedido.getCliente(), pedido.getTotal());
        }

        // DI por el contenedor
        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Pedido registrado");
    }
}