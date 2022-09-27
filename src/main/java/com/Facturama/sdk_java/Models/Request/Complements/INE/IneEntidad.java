/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Facturama.sdk_java.Models.Request.Complements.INE;

import java.util.*;


/**
 *
 * @author Facturama
 */
public class IneEntidad 
{
    private List<IdContabilidad> Contabilidad;
    private String ClaveEntidad;
    private String Ambito;
    private Boolean AmbitoSpecified;
    
    public List<IdContabilidad> getContabilidad()
    {
        return Contabilidad;
    }

    public void setContabilidad(List<IdContabilidad> Contabilidad)
    {
        this.Contabilidad=Contabilidad;
    }
    
    public String getClaveEntidad()
    {
        return ClaveEntidad;
    }

    public void setClaveEntidad(String ClaveEntidad)
    {
        this.ClaveEntidad=ClaveEntidad;
    }
    
    public String getAmbito()
    {
        return Ambito;
    }

    public void setAmbito(String Ambito)
    {
        this.Ambito=Ambito;
    }
    
    public Boolean getAmbitoSpecified()
    {
        return AmbitoSpecified;
    }

    public void setAmbitoSpecified(Boolean AmbitoSpecified)
    {
        this.AmbitoSpecified=AmbitoSpecified;
    }
    
    
}
