package com.Facturama.sdk_java.Models.Request.Complements.Waybill;
  import java.math.BigDecimal;

public class GuiasIdentificacion {
        
        private String numeroGuiaIdentificacion;
        private String descripGuiaIdentificacion;
        private BigDecimal pesoGuiaIdentificacion;
    
        // Getters y Setters
        public String getNumeroGuiaIdentificacion() {
            return numeroGuiaIdentificacion;
        }
    
        public void setNumeroGuiaIdentificacion(String numeroGuiaIdentificacion) {
            this.numeroGuiaIdentificacion = numeroGuiaIdentificacion;
        }
    
        public String getDescripGuiaIdentificacion() {
            return descripGuiaIdentificacion;
        }
    
        public void setDescripGuiaIdentificacion(String descripGuiaIdentificacion) {
            this.descripGuiaIdentificacion = descripGuiaIdentificacion;
        }
    
        public BigDecimal getPesoGuiaIdentificacion() {
            return pesoGuiaIdentificacion;
        }
    
        public void setPesoGuiaIdentificacion(BigDecimal pesoGuiaIdentificacion) {
            this.pesoGuiaIdentificacion = pesoGuiaIdentificacion;
        }
    
}
