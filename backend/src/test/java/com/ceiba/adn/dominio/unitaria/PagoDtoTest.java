package com.ceiba.adn.dominio.unitaria;

import com.ceiba.adn.dominio.modelo.dto.DtoPago;
import com.ceiba.adn.testdatabuilder.PagoDtoTestDataBuilder;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PagoDtoTest {

    @Test
    public void pagoDtoTest(){
        //arrange
        PagoDtoTestDataBuilder pagoDtoTestDataBuilder= new PagoDtoTestDataBuilder();
        //act
        DtoPago pago=   pagoDtoTestDataBuilder.build();

        //assert
       assertEquals("104235698",pago.documento);
       assertEquals(new BigDecimal(850.000),pago.monto);
       assertEquals("AL día",pago.estado);
    }


}
