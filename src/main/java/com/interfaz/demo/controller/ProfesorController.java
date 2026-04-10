package com.interfaz.demo.controller;

import com.interfaz.demo.model.Profesor;
import com.interfaz.demo.service.ProfesorService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfesorController {
    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    public Profesor crearProfesor(String nombre, String correo, String especialidad) {
        return profesorService.registrarProfesor(nombre, correo, especialidad);
    }
}
