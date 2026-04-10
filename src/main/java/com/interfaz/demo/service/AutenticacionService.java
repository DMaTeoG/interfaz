package com.interfaz.demo.service;

import com.interfaz.demo.model.Autenticable;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionService {
    private final Autenticable autenticable;

    public AutenticacionService() {
        this.autenticable = null;
    }

    public AutenticacionService(Autenticable autenticable) {
        this.autenticable = autenticable;
    }

    public boolean login(String usuario, String password) {
        if (autenticable == null) {
            return usuario != null && !usuario.isBlank()
                    && password != null && !password.isBlank();
        }

        return autenticable.login(usuario, password);
    }
}
