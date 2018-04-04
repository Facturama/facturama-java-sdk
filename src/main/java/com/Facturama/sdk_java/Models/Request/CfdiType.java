package com.Facturama.sdk_java.Models.Request;


public enum CfdiType
{
    Ingreso("I"),
    Egreso("E"),
    Traslado("T"),
    Pago("P");   
    
    private String type;
    
    CfdiType(String type){
        this.type = type;
    }
    
    public String getValue(){
        return this.type;
    }
    
}
