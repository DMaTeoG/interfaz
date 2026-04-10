package com.interfaz.demo.controller;

import com.interfaz.demo.model.Administrativo;
import com.interfaz.demo.service.AdministrativoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdministrativoController {
    private final AdministrativoService administrativoService;

    public AdministrativoController(AdministrativoService administrativoService) {
        this.administrativoService = administrativoService;
    }

    public Administrativo crearAdministrativo(String nombre, String correo, String area) {
        return administrativoService.registrarAdministrativo(nombre, correo, area);
    }
}
