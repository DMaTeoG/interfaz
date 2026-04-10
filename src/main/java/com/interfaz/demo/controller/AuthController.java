package com.interfaz.demo.controller;

import com.interfaz.demo.service.AutenticacionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final AutenticacionService autenticacionService;

    public AuthController(AutenticacionService autenticacionService) {
        this.autenticacionService = autenticacionService;
    }

    public boolean login(String usuario, String password) {
        return autenticacionService.login(usuario, password);
    }
}
