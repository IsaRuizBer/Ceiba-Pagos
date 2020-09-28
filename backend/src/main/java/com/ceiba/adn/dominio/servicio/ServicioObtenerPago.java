package com.ceiba.adn.dominio.servicio;

import com.ceiba.adn.dominio.modelo.dto.DtoPago;
import com.ceiba.adn.dominio.modelo.entidad.Pago;
import com.ceiba.adn.dominio.puerto.repositorio.RespositorioPago;

import java.util.List;

public class ServicioObtenerPago {

    private final RespositorioPago repositorioPago;


    public ServicioObtenerPago(RespositorioPago repositorioPago) {
        this.repositorioPago = repositorioPago;
    }

    public List<DtoPago> ejecutar() {
        return (List<DtoPago>) repositorioPago.obtenerPagos();
    }
}
