package com.Facturama.sdk_java.Models.Request.Complements.Waybill;

public class Autotransporte {


    private String permSCT;
    private String numPermisoSCT; 
    private Seguros seguros;
    private IdentificacionVehicular identificacionVehicular;
    private Remolque[] remolques;

    
    // Getters y Setters
    public String getPermSCT() {
        return permSCT;
    }

    public void setPermSCT(String permSCT) {
        this.permSCT = permSCT;
    }

    public String getNumPermisoSCT() {
        return numPermisoSCT;
    }

    public void setNumPermisoSCT(String numPermisoSCT) {
        this.numPermisoSCT = numPermisoSCT;
    }

    public Seguros getSeguros() {
        return seguros;
    }

    public void setSeguros(Seguros seguros) {
        this.seguros = seguros;
    }

    public IdentificacionVehicular getIdentificacionVehicular() {
        return identificacionVehicular;
    }

    public void setIdentificacionVehicular(IdentificacionVehicular identificacionVehicular) {
        this.identificacionVehicular = identificacionVehicular;
    }

    public Remolque[] getRemolques() {
        return remolques;
    }

    public void setRemolques(Remolque[] remolques) {
        this.remolques = remolques;
    }
}