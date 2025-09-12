package com.Facturama.sdk_java.Models.Request.Complements.Waybill;
import com.Facturama.sdk_java.Models.Request.Complements.Waybill.ComplementoCartaPorte31.TipoUbicacion;
import java.math.BigDecimal;


public class Ubicacion {

    private Domicilio domicilio;
    private TipoUbicacion tipoUbicacion;
    private String idUbicacion;
    private String rfcRemitenteDestinatario;
    private String nombreRemitenteDestinatario;
    private String numRegIdTrib;
    private String residenciaFiscal;
    private String numEstacion;
    private String nombreEstacion;
    private String navegacionTrafico;
    private String fechaHoraSalidaLlegada;
    private String tipoEstacion;
    private BigDecimal distanciaRecorrida;

    // Getters y Setters
    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public TipoUbicacion getTipoUbicacion() {
        return tipoUbicacion;
    }

    public void setTipoUbicacion(TipoUbicacion tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getRfcRemitenteDestinatario() {
        return rfcRemitenteDestinatario;
    }

    public void setRfcRemitenteDestinatario(String rfcRemitenteDestinatario) {
        this.rfcRemitenteDestinatario = rfcRemitenteDestinatario;
    }

    public String getNombreRemitenteDestinatario() {
        return nombreRemitenteDestinatario;
    }

    public void setNombreRemitenteDestinatario(String nombreRemitenteDestinatario) {
        this.nombreRemitenteDestinatario = nombreRemitenteDestinatario;
    }

    public String getNumRegIdTrib() {
        return numRegIdTrib;
    }

    public void setNumRegIdTrib(String numRegIdTrib) {
        this.numRegIdTrib = numRegIdTrib;
    }

    public String getResidenciaFiscal() {
        return residenciaFiscal;
    }

    public void setResidenciaFiscal(String residenciaFiscal) {
        this.residenciaFiscal = residenciaFiscal;
    }

    public String getNumEstacion() {
        return numEstacion;
    }

    public void setNumEstacion(String numEstacion) {
        this.numEstacion = numEstacion;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getNavegacionTrafico() {
        return navegacionTrafico;
    }

    public void setNavegacionTrafico(String navegacionTrafico) {
        this.navegacionTrafico = navegacionTrafico;
    }

    public String getFechaHoraSalidaLlegada() {
        return fechaHoraSalidaLlegada;
    }

    public void setFechaHoraSalidaLlegada(String fechaHoraSalidaLlegada) {
        this.fechaHoraSalidaLlegada = fechaHoraSalidaLlegada;
    }

    public String getTipoEstacion() {
        return tipoEstacion;
    }

    public void setTipoEstacion(String tipoEstacion) {
        this.tipoEstacion = tipoEstacion;
    }

    public BigDecimal getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(BigDecimal distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }
}

