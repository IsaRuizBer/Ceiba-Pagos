package com.ceiba.adn.testdatabuilder;

import com.ceiba.adn.dominio.modelo.dto.DtoPago;

import java.math.BigDecimal;

public class PagoDtoTestDataBuilder {

    private BigDecimal monto;
    private String estado;
    private String documento;

    public PagoDtoTestDataBuilder(){
        this.monto= new BigDecimal(850.000);
        this.estado="AL día";
        this.documento="104235698";
    }
    public PagoDtoTestDataBuilder conMonto(BigDecimal monto){
        this.monto= monto;
        return this;
    }

    public PagoDtoTestDataBuilder conEstado(String estado){
        this.estado= estado;
        return this;
    }

    public PagoDtoTestDataBuilder conDocumento(String documento){
        this.documento= documento;
        return this;
    }

    public DtoPago build(){return new DtoPago(monto,estado,documento);}
}
