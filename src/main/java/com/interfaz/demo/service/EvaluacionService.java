package com.interfaz.demo.service;

import com.interfaz.demo.model.Evaluador;
import com.interfaz.demo.model.Estudiante;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionService {
    private final Evaluador evaluador;

    public EvaluacionService() {
        this.evaluador = null;
    }

    public EvaluacionService(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public void evaluarEstudiante(Estudiante estudiante, double nota) {
        if (evaluador == null) {
            throw new IllegalStateException("No hay evaluador configurado");
        }

        evaluador.evaluarEstudiante(estudiante, nota);
    }
}
