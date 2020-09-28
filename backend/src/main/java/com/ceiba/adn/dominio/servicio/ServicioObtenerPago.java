package com.ceiba.adn.dominio.servicio;

import com.ceiba.adn.dominio.modelo.dto.DtoPago;
import com.ceiba.adn.dominio.puerto.dao.DaoPago;

import java.util.List;

public class ServicioObtenerPago {


    private final DaoPago respositorio;


    public ServicioObtenerPago(DaoPago respositorio) {
        this.respositorio = respositorio;
    }

    public List<DtoPago> ejecutar() {
        return  respositorio.obtenerPagos();
    }
}
