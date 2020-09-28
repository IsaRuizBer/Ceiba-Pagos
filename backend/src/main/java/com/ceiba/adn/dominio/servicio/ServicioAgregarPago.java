package com.ceiba.adn.dominio.servicio;

import com.ceiba.adn.dominio.modelo.entidad.Pago;
import com.ceiba.adn.dominio.puerto.repositorio.RespositorioPago;

public class ServicioAgregarPago {

    private final RespositorioPago repositorioPago;

    public ServicioAgregarPago(RespositorioPago repositorioPago) {
        this.repositorioPago = repositorioPago;
    }

    public Pago ejecutar(Pago pago){
       return repositorioPago.agregar(pago);
    }

    public boolean existePago(Pago pago){
        return this.repositorioPago.existe(pago);
    }


}
