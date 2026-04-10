package com.interfaz.demo.service;

import com.interfaz.demo.model.Administrativo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;  

@Service
public class AdministrativoService {
    private final List<Administrativo> administrativos = new ArrayList<>();

    public Administrativo registrarAdministrativo(String nombre, String correo, String area) {
        Administrativo administrativo = new Administrativo(nombre, correo, area);
        administrativos.add(administrativo);
        return administrativo;
    }
    
}
