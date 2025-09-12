package com.Facturama.sdk_java.Models.Request.Complements.Waybill;

import java.math.BigDecimal;

public class TransporteFerroviario {

    private String tipoDeServicio;
    private String tipoDeTrafico;
    private String nombreAseg;
    private String numPolizaSeguro;
    private String concesionario;
    private DerechosDePaso[] derechosDePaso;
    private Carro[] carro;

    // Getters y Setters
    public String getTipoDeServicio() {
        return tipoDeServicio;
    }

    public void setTipoDeServicio(String tipoDeServicio) {
        this.tipoDeServicio = tipoDeServicio;
    }

    public String getTipoDeTrafico() {
        return tipoDeTrafico;
    }

    public void setTipoDeTrafico(String tipoDeTrafico) {
        this.tipoDeTrafico = tipoDeTrafico;
    }

    public String getNombreAseg() {
        return nombreAseg;
    }

    public void setNombreAseg(String nombreAseg) {
        this.nombreAseg = nombreAseg;
    }

    public String getNumPolizaSeguro() {
        return numPolizaSeguro;
    }

    public void setNumPolizaSeguro(String numPolizaSeguro) {
        this.numPolizaSeguro = numPolizaSeguro;
    }

    public String getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(String concesionario) {
        this.concesionario = concesionario;
    }

    public DerechosDePaso[] getDerechosDePaso() {
        return derechosDePaso;
    }

    public void setDerechosDePaso(DerechosDePaso[] derechosDePaso) {
        this.derechosDePaso = derechosDePaso;
    }

    public Carro[] getCarro() {
        return carro;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }
}

// Clase DerechosDePaso
class DerechosDePaso {

    private String tipoDerechoDePaso;
    private String kilometrajePagado;

    public String getTipoDerechoDePaso() {
        return tipoDerechoDePaso;
    }

    public void setTipoDerechoDePaso(String tipoDerechoDePaso) {
        this.tipoDerechoDePaso = tipoDerechoDePaso;
    }

    public String getKilometrajePagado() {
        return kilometrajePagado;
    }

    public void setKilometrajePagado(String kilometrajePagado) {
        this.kilometrajePagado = kilometrajePagado;
    }
}

// Clase Carro
class Carro {

    private String tipoCarro;
    private String matriculaCarro;
    private String guiaCarro;
    private BigDecimal toneladasNetasCarro;
    private CarroContenedor[] contenedor;

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getMatriculaCarro() {
        return matriculaCarro;
    }

    public void setMatriculaCarro(String matriculaCarro) {
        this.matriculaCarro = matriculaCarro;
    }

    public String getGuiaCarro() {
        return guiaCarro;
    }

    public void setGuiaCarro(String guiaCarro) {
        this.guiaCarro = guiaCarro;
    }

    public BigDecimal getToneladasNetasCarro() {
        return toneladasNetasCarro;
    }

    public void setToneladasNetasCarro(BigDecimal toneladasNetasCarro) {
        this.toneladasNetasCarro = toneladasNetasCarro;
    }

    public CarroContenedor[] getContenedor() {
        return contenedor;
    }

    public void setContenedor(CarroContenedor[] contenedor) {
        this.contenedor = contenedor;
    }
}

// Clase CarroContenedor
class CarroContenedor {

    private String tipoContenedor;
    private BigDecimal pesoContenedorVacio;
    private BigDecimal pesoNetoMercancia;

    public String getTipoContenedor() {
        return tipoContenedor;
    }

    public void setTipoContenedor(String tipoContenedor) {
        this.tipoContenedor = tipoContenedor;
    }

    public BigDecimal getPesoContenedorVacio() {
        return pesoContenedorVacio;
    }

    public void setPesoContenedorVacio(BigDecimal pesoContenedorVacio) {
        this.pesoContenedorVacio = pesoContenedorVacio;
    }

    public BigDecimal getPesoNetoMercancia() {
        return pesoNetoMercancia;
    }

    public void setPesoNetoMercancia(BigDecimal pesoNetoMercancia) {
        this.pesoNetoMercancia = pesoNetoMercancia;
    }
}
