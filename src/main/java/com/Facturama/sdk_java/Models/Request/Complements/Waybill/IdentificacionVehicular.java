package com.Facturama.sdk_java.Models.Request.Complements.Waybill;

public class IdentificacionVehicular {

    private String configVehicular;
    private String pesoBrutoVehicular;
    private String placaVM;
    private int anioModeloVM;

    // Getters y Setters
    public String getConfigVehicular() {
        return configVehicular;
    }

    public void setConfigVehicular(String configVehicular) {
        this.configVehicular = configVehicular;
    }

    public String getPesoBrutoVehicular() {
        return pesoBrutoVehicular;
    }

    public void setPesoBrutoVehicular(String pesoBrutoVehicular) {
        this.pesoBrutoVehicular = pesoBrutoVehicular;
    }

    public String getPlacaVM() {
        return placaVM;
    }

    public void setPlacaVM(String placaVM) {
        this.placaVM = placaVM;
    }

    public int getAnioModeloVM() {
        return anioModeloVM;
    }

    public void setAnioModeloVM(int anioModeloVM) {
        this.anioModeloVM = anioModeloVM;
    }
}
