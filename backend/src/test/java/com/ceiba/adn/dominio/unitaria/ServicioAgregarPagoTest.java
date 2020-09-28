package com.ceiba.adn.dominio.unitaria;

import com.ceiba.adn.dominio.modelo.entidad.Pago;
import com.ceiba.adn.dominio.puerto.repositorio.RespositorioPago;
import com.ceiba.adn.dominio.servicio.ServicioAgregarPago;
import com.ceiba.adn.testdatabuilder.PagoTestDataBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class ServicioAgregarPagoTest {

 @Test
    public void agregarPagoTest(){
  //arrange
  Pago pago= new PagoTestDataBuilder().build();
  RespositorioPago repo = Mockito.mock(RespositorioPago.class);
  Mockito.when(repo.agregar(pago)).thenReturn(pago);
//act
  ServicioAgregarPago servicio= new ServicioAgregarPago(repo);
  Pago pagoS = servicio.ejecutar(pago);
//assert
  assertNotNull(pagoS);
 }

 public void validarExistePago(){
  //arrange
  Pago pago = new PagoTestDataBuilder().build();
  RespositorioPago repo= Mockito.mock(RespositorioPago.class);
  Mockito.when(repo.existe(pago)).thenReturn(true);
  //act
  ServicioAgregarPago servicio= new ServicioAgregarPago(repo);
  boolean existe=servicio.existePago(pago);
  //assert
  assertTrue(existe);
 }

 @Test
 public void noExistePago(){
  //arrange
  Pago pago = new PagoTestDataBuilder().build();
  RespositorioPago repo= Mockito.mock(RespositorioPago.class);
  Mockito.when(repo.existe(pago)).thenReturn(false);
  //act
  ServicioAgregarPago servicio= new ServicioAgregarPago(repo);
  boolean existe=servicio.existePago(pago);
  //assert
  assertFalse(existe);
 }

}
