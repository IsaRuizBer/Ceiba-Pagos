package com.ceiba.adn.testdatabuilder;

import com.ceiba.adn.dominio.modelo.entidad.Pago;

import java.math.BigDecimal;

public class PagoTestDataBuilder {

    public BigDecimal monto;
    public String estado;
    public String documento;

    public PagoTestDataBuilder(){
        this.monto= new BigDecimal(850.000);
        this.estado="AL día";
        this.documento="104235698";
    }
    public PagoTestDataBuilder conMonto(BigDecimal monto){
        this.monto= monto;
        return this;
    }

    public PagoTestDataBuilder conEstado(String estado){
        this.estado= estado;
        return this;
    }

    public PagoTestDataBuilder conDocumento(String documento){
        this.documento= documento;
        return this;
    }

    public Pago build(){return new Pago(monto,estado,documento);}

}
