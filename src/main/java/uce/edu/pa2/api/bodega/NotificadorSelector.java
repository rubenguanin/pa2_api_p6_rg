package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped

public class NotificadorSelector {
    @Inject
    private NotificadorMail mail;
    @Inject
    private NotificadorSms sms;
    @Inject
    private NotificadorWh wh;

    public Notificador seleccionar(double total) {
        if (total > 100) {
            // MAIL
            return mail;
        } else if (total >= 50) {

            return sms;
        } else {
            return wh;
        }
    }
}