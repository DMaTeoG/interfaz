package com.interfaz.demo.service;

import com.interfaz.demo.model.Notificable;
import org.springframework.stereotype.Service;

@Service
public class NotificacionService {
    private final Notificable notificable;

    public NotificacionService() {
        this.notificable = null;
    }

    public NotificacionService(Notificable notificable) {
        this.notificable = notificable;
    }

    public void enviarNotificacion(String mensaje) {
        if (notificable == null) {
            throw new IllegalStateException("No hay destinatario configurable para notificacion");
        }

        notificable.enviarNotificacion(mensaje);
    }
}
