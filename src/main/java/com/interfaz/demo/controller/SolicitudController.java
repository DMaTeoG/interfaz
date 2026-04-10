package com.interfaz.demo.controller;

import com.interfaz.demo.service.SolicitudService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolicitudController {
    private final SolicitudService solicitudService;

    public SolicitudController(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }

    public void aprobar(String codigoSolicitud) {
        solicitudService.aprobarSolicitud(codigoSolicitud);
    }
}
