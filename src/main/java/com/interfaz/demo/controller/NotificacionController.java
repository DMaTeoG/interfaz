package com.interfaz.demo.controller;

import com.interfaz.demo.service.NotificacionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificacionController {
    private final NotificacionService notificacionService;

    public NotificacionController(NotificacionService notificacionService) {
        this.notificacionService = notificacionService;
    }

    public void notificar(String mensaje) {
        notificacionService.enviarNotificacion(mensaje);
    }
}
