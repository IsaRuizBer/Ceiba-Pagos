package com.ceiba.adn.dominio.unitaria;

import com.ceiba.adn.dominio.modelo.dto.DtoPago;
import com.ceiba.adn.dominio.puerto.dao.DaoPago;
import com.ceiba.adn.dominio.servicio.ServicioObtenerPago;
import com.ceiba.adn.testdatabuilder.PagoDtoTestDataBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ServicioObtenerPagoTest {



    @Test
    public void obtenerPagosTest(){
        //arrange
        DtoPago pago = new PagoDtoTestDataBuilder().build();
        List<DtoPago> lista = Arrays.asList(pago);
        DaoPago repo= Mockito.mock(DaoPago.class);
        Mockito.when(repo.obtenerPagos()).thenReturn(lista);
        //act
        ServicioObtenerPago servicio = new ServicioObtenerPago(repo);
        List<DtoPago> resultado= servicio.ejecutar();

        //assert
        assertNotNull(resultado);
    }
}
