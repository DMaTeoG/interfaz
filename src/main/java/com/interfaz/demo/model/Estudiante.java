package com.interfaz.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Estudiante extends Persona implements Notificable, Autenticable {
    private String codigo;
    private double nota;

    protected Estudiante() {
    }

    public Estudiante(String nombre, String correo, String codigo) {
        super(nombre, correo);
        this.codigo = codigo;
        this.nota = 0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación al estudiante: " + mensaje);
    }

    @Override
    public boolean login(String usuario, String password) {
        return usuario != null && password != null && !usuario.isEmpty() && !password.isEmpty();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", codigo='" + codigo + '\'' +
                ", nota=" + nota +
                '}';
    }
}
