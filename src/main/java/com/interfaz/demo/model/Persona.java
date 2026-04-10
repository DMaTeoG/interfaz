package com.interfaz.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String nombre;
    protected String correo;

    protected Persona() {
    }

    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
