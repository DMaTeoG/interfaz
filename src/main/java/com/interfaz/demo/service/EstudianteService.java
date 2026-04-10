package com.interfaz.demo.service;
import com.interfaz.demo.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EstudianteService {
    private Map<String, Estudiante> estudiantes = new HashMap<>();

    public Estudiante registrarEstudiante(String nombre, String correo, String codigo) {
        Estudiante estudiante = new Estudiante(nombre, correo, codigo);
        estudiantes.put(codigo, estudiante);
        return estudiante;
    }

    public Estudiante obtenerEstudiante(String codigo) {
        return estudiantes.get(codigo);
    }
}

