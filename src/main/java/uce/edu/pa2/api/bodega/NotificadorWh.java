package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class NotificadorWh implements Notificador {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el Wh al correo: " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
