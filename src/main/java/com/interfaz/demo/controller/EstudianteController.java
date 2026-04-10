package com.interfaz.demo.controller;

import com.interfaz.demo.model.Estudiante;
import com.interfaz.demo.service.EstudianteService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    public Estudiante crearEstudiante(String nombre, String correo, String codigo) {
        return estudianteService.registrarEstudiante(nombre, correo, codigo);
    }

    public Estudiante buscarEstudiante(String codigo) {
        return estudianteService.obtenerEstudiante(codigo);
    }
}
