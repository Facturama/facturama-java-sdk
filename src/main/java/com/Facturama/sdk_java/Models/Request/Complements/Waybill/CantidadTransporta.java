package com.Facturama.sdk_java.Models.Request.Complements.Waybill;
import java.math.BigDecimal;

public class CantidadTransporta {


    private BigDecimal Cantidad;
    private String IDOrigen;
    private String IDDestino;
    private String CvesTransporte;

    // Getters y Setters
    public BigDecimal getCantidad() {
        return Cantidad;
    }

    public void setCantidad(BigDecimal Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getIDOrigen() {
        return IDOrigen;
    }

    public void setIDOrigen(String IDOrigen) {
        this.IDOrigen = IDOrigen;
    }

    public String getIDDestino() {
        return IDDestino;
    }

    public void setIDDestino(String IDDestino) {
        this.IDDestino = IDDestino;
    }

    public String getCvesTransporte() {
        return CvesTransporte;
    }

    public void setCvesTransporte(String CvesTransporte) {
        this.CvesTransporte = CvesTransporte;
    }
}