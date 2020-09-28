package com.ceiba.adn.dominio.modelo.dto;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
public class DtoPago {

    public BigDecimal monto;
    public String estado;
    public String documento;

    public DtoPago(BigDecimal monto, String estado, String documento) {
        this.monto = monto;
        this.estado = estado;
        this.documento = documento;
    }
}
