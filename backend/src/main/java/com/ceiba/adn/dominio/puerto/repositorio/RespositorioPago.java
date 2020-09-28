package com.ceiba.adn.dominio.puerto.repositorio;

import com.ceiba.adn.dominio.modelo.dto.DtoPago;
import com.ceiba.adn.dominio.modelo.entidad.Pago;

import java.util.Collection;
import java.util.List;

public interface RespositorioPago {

    /**
     * Permite crear las el pago
     * @param pago
     */
    Pago agregar(Pago pago);

    /**
     * Permite determinar si previamente se registro el pago
     * @param pago
     * @return si existe o no
     */
    boolean existe(Pago pago);

    /**
     * Permite obtener los pagos
     * @return
     */
    Collection<DtoPago> obtenerPagos();

}
