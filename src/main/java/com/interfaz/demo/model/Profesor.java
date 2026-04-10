package com.interfaz.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Profesor extends Persona implements Autenticable, Evaluador {
    private String especialidad;

    protected Profesor() {
    }

    public Profesor(String nombre, String correo, String especialidad) {
        super(nombre, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public boolean login(String usuario, String password) {
        return usuario != null && password != null && !usuario.isEmpty() && !password.isEmpty();
    }

    @Override
    public void evaluarEstudiante(Estudiante estudiante, double nota) {
        estudiante.setNota(nota);
        System.out.println("Estudiante " + estudiante.getNombre() + " evaluado con nota: " + nota);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
