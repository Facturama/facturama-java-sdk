package com.Facturama.sdk_java.Models.Request.Complements.Waybill;
import java.math.BigDecimal;

public class DetalleMercancia {

    private String unidadPesoMerc;
        private BigDecimal pesoBruto;
        private BigDecimal pesoNeto;
        private BigDecimal pesoTara;
        private int numPiezas;
    
        // Getters y Setters
        public String getUnidadPesoMerc() {
            return unidadPesoMerc;
        }
    
        public void setUnidadPesoMerc(String unidadPesoMerc) {
            this.unidadPesoMerc = unidadPesoMerc;
        }
    
        public BigDecimal getPesoBruto() {
            return pesoBruto;
        }
    
        public void setPesoBruto(BigDecimal pesoBruto) {
            this.pesoBruto = pesoBruto;
        }
    
        public BigDecimal getPesoNeto() {
            return pesoNeto;
        }
    
        public void setPesoNeto(BigDecimal pesoNeto) {
            this.pesoNeto = pesoNeto;
        }
    
        public BigDecimal getPesoTara() {
            return pesoTara;
        }
    
        public void setPesoTara(BigDecimal pesoTara) {
            this.pesoTara = pesoTara;
        }
    
        public int getNumPiezas() {
            return numPiezas;
        }
    
        public void setNumPiezas(int numPiezas) {
            this.numPiezas = numPiezas;
        }
    
}
