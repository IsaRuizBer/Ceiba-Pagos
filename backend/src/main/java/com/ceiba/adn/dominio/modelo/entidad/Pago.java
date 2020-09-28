package com.ceiba.adn.dominio.modelo.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Table(name="Pago" )
public class Pago implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "monto", nullable = false)
    private BigDecimal monto;
    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name = "documento", nullable = false)
    private String documento;


    public Pago(){

    }

    public Pago( BigDecimal monto, String estado, String documento) {

        this.monto = monto;
        this.estado = estado;
        this.documento=documento;
    }
}
