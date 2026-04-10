package com.interfaz.demo.service;
import com.interfaz.demo.model.Aprobador;
import org.springframework.stereotype.Service;

@Service
public class SolicitudService {
    private final Aprobador aprobador;

    public SolicitudService() {
        this.aprobador = null;
    }

    public SolicitudService(Aprobador aprobador) {
        this.aprobador = aprobador;
    }

    public void aprobarSolicitud(String codigoSolicitud) {
        if (aprobador == null) {
            throw new IllegalStateException("No hay aprobador configurado");
        }

        aprobador.aprobarSolicitud(codigoSolicitud);
    }
}
