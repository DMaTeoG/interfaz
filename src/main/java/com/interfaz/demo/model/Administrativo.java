package com.interfaz.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Administrativo extends Persona implements Aprobador, Notificable {
    private String area;

    protected Administrativo() {
    }

    public Administrativo(String nombre, String correo, String area) {
        super(nombre, correo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public void aprobarSolicitud(String codigoSolicitud) {
        System.out.println("Solicitud aprobada: " + codigoSolicitud);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación enviada por administrativo: " + mensaje);
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
