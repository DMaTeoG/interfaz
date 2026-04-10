package com.interfaz.demo.service;

import com.interfaz.demo.model.Profesor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorService {
    private List<Profesor> profesores = new ArrayList<>();

    public Profesor registrarProfesor(String nombre, String correo, String especialidad) {
        Profesor profesor = new Profesor(nombre, correo, especialidad);
        profesores.add(profesor);
        return profesor;
    }
}
