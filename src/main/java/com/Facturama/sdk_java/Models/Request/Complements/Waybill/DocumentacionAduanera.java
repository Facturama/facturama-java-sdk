package com.Facturama.sdk_java.Models.Request.Complements.Waybill;

public class DocumentacionAduanera {

    private String tipoDocumento;
    private String numPedimento;
    private String identDocAduanero;
    private String rfcImpo;

    // Getters y Setters
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumPedimento() {
        return numPedimento;
    }

    public void setNumPedimento(String numPedimento) {
        this.numPedimento = numPedimento;
    }

    public String getIdentDocAduanero() {
        return identDocAduanero;
    }

    public void setIdentDocAduanero(String identDocAduanero) {
        this.identDocAduanero = identDocAduanero;
    }

    public String getRfcImpo() {
        return rfcImpo;
    }

    public void setRfcImpo(String rfcImpo) {
        this.rfcImpo = rfcImpo;
    }

}
