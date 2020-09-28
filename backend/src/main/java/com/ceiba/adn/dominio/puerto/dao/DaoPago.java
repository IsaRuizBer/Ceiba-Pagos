package com.ceiba.adn.dominio.puerto.dao;

import com.ceiba.adn.dominio.modelo.dto.DtoPago;


import java.util.List;

public interface DaoPago {

    /**
     * Permite obtener los pagos
     * @return
     */
    List<DtoPago> obtenerPagos();
}
