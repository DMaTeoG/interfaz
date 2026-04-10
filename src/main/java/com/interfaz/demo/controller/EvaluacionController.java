package com.interfaz.demo.controller;

import com.interfaz.demo.model.Estudiante;
import com.interfaz.demo.service.EstudianteService;
import com.interfaz.demo.service.EvaluacionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluacionController {
    private final EstudianteService estudianteService;
    private final EvaluacionService evaluacionService;

    public EvaluacionController(EstudianteService estudianteService, EvaluacionService evaluacionService) {
        this.estudianteService = estudianteService;
        this.evaluacionService = evaluacionService;
    }

    public void evaluar(String codigoEstudiante, double nota) {
        Estudiante estudiante = estudianteService.obtenerEstudiante(codigoEstudiante);
        if (estudiante == null) {
            throw new IllegalArgumentException("No existe estudiante con codigo: " + codigoEstudiante);
        }

        evaluacionService.evaluarEstudiante(estudiante, nota);
    }
}
