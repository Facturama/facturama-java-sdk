package com.Facturama.sdk_java.Models.Request.Complements.Waybill;

import java.math.BigDecimal;

public class Mercancias {

    private BigDecimal pesoBrutoTotal;
    private String unidadPeso;
    private BigDecimal pesoNetoTotal;
    private int numTotalMercancias;
    private BigDecimal cargoPorTasacion;
    private String logisticaInversaRecoleccionDevolucion;

    private Mercancia[] mercancia;
    private Autotransporte autotransporte;
    private TransporteMaritimo transporteMaritimo;
    private TransporteAereo transporteAereo;
    private TransporteFerroviario transporteFerroviario;

    // Getters y Setters
    public BigDecimal getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
        this.pesoBrutoTotal = pesoBrutoTotal;
    }

    public String getUnidadPeso() {
        return unidadPeso;
    }

    public void setUnidadPeso(String unidadPeso) {
        this.unidadPeso = unidadPeso;
    }

    public BigDecimal getPesoNetoTotal() {
        return pesoNetoTotal;
    }

    public void setPesoNetoTotal(BigDecimal pesoNetoTotal) {
        this.pesoNetoTotal = pesoNetoTotal;
    }

    public int getNumTotalMercancias() {
        return numTotalMercancias;
    }

    public void setNumTotalMercancias(int numTotalMercancias) {
        this.numTotalMercancias = numTotalMercancias;
    }

    public BigDecimal getCargoPorTasacion() {
        return cargoPorTasacion;
    }

    public void setCargoPorTasacion(BigDecimal cargoPorTasacion) {
        this.cargoPorTasacion = cargoPorTasacion;
    }

    public String getLogisticaInversaRecoleccionDevolucion() {
        return logisticaInversaRecoleccionDevolucion;
    }

    public void setLogisticaInversaRecoleccionDevolucion(String logisticaInversaRecoleccionDevolucion) {
        this.logisticaInversaRecoleccionDevolucion = logisticaInversaRecoleccionDevolucion;
    }

    public Mercancia[] getMercancia() {
        return mercancia;
    }

    public void setMercancia(Mercancia[] mercancia) {
        this.mercancia = mercancia;
    }

    public Autotransporte getAutotransporte() {
        return autotransporte;
    }

    public void setAutotransporte(Autotransporte autotransporte) {
        this.autotransporte = autotransporte;
    }

    public TransporteMaritimo getTransporteMaritimo() {
        return transporteMaritimo;
    }

    public void setTransporteMaritimo(TransporteMaritimo transporteMaritimo) {
        this.transporteMaritimo = transporteMaritimo;
    }

    public TransporteAereo getTransporteAereo() {
        return transporteAereo;
    }

    public void setTransporteAereo(TransporteAereo transporteAereo) {
        this.transporteAereo = transporteAereo;
    }

    public TransporteFerroviario getTransporteFerroviario() {
        return transporteFerroviario;
    }

    public void setTransporteFerroviario(TransporteFerroviario transporteFerroviario) {
        this.transporteFerroviario = transporteFerroviario;
    }
}
