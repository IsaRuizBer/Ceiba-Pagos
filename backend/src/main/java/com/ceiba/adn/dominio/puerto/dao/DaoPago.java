package com.ceiba.adn.dominio.puerto.dao;

import com.ceiba.adn.dominio.modelo.dto.DtoPago;

import java.util.Collection;

public interface DaoPago {

    /**
     * Permite obtener los pagos
     * @return
     */
    Collection<DtoPago> obtenerPagos();
}
