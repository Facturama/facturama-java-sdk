package com.Facturama.sdk_java.Models.Request.Complements.Waybill;

import java.math.BigDecimal;

public class ComplementoCartaPorte31 {

    public enum TranspInternac {
        Si,
        No
    }

    public enum TipoUbicacion {
        Origen,
        Destino
    }

    public enum RegistroISTMO {
        Sí
    }

    private String idCCP;
    private TranspInternac transpInternac;
    private RegimenAduaneroCPP[] regimenesAduaneros;
    private String entradaSalidaMerc;
    private String paisOrigenDestino;
    private String viaEntradaSalida;
    private BigDecimal totalDistRec;
    private RegistroISTMO registroISTMO;
    private String ubicacionPoloOrigen;
    private String ubicacionPoloDestino;
    private Ubicacion[] ubicaciones;
    private Mercancias mercancias;
    private TiposFigura[] figuraTransporte;

    // Getters y Setters
    public String getIdCCP() {
        return idCCP;
    }

    public void setIdCCP(String idCCP) {
        this.idCCP = idCCP;
    }

    public TranspInternac getTranspInternac() {
        return transpInternac;
    }

    public void setTranspInternac(TranspInternac transpInternac) {
        this.transpInternac = transpInternac;
    }

    public RegimenAduaneroCPP[] getRegimenesAduaneros() {
        return regimenesAduaneros;
    }

    public void setRegimenesAduaneros(RegimenAduaneroCPP[] regimenesAduaneros) {
        this.regimenesAduaneros = regimenesAduaneros;
    }

    public String getEntradaSalidaMerc() {
        return entradaSalidaMerc;
    }

    public void setEntradaSalidaMerc(String entradaSalidaMerc) {
        this.entradaSalidaMerc = entradaSalidaMerc;
    }

    public String getPaisOrigenDestino() {
        return paisOrigenDestino;
    }

    public void setPaisOrigenDestino(String paisOrigenDestino) {
        this.paisOrigenDestino = paisOrigenDestino;
    }

    public String getViaEntradaSalida() {
        return viaEntradaSalida;
    }

    public void setViaEntradaSalida(String viaEntradaSalida) {
        this.viaEntradaSalida = viaEntradaSalida;
    }

    public BigDecimal getTotalDistRec() {
        return totalDistRec;
    }

    public void setTotalDistRec(BigDecimal totalDistRec) {
        this.totalDistRec = totalDistRec;
    }

    public RegistroISTMO getRegistroISTMO() {
        return registroISTMO;
    }

    public void setRegistroISTMO(RegistroISTMO registroISTMO) {
        this.registroISTMO = registroISTMO;
    }

    public String getUbicacionPoloOrigen() {
        return ubicacionPoloOrigen;
    }

    public void setUbicacionPoloOrigen(String ubicacionPoloOrigen) {
        this.ubicacionPoloOrigen = ubicacionPoloOrigen;
    }

    public String getUbicacionPoloDestino() {
        return ubicacionPoloDestino;
    }

    public void setUbicacionPoloDestino(String ubicacionPoloDestino) {
        this.ubicacionPoloDestino = ubicacionPoloDestino;
    }

    public Ubicacion[] getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(Ubicacion[] ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public Mercancias getMercancias() {
        return mercancias;
    }

    public void setMercancias(Mercancias mercancias) {
        this.mercancias = mercancias;
    }

    public TiposFigura[] getFiguraTransporte() {
        return figuraTransporte;
    }

    public void setFiguraTransporte(TiposFigura[] figuraTransporte) {
        this.figuraTransporte = figuraTransporte;
    }

}
