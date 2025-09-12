package com.Facturama.sdk_java.Models.Request.Complements.Waybill;
import java.math.BigDecimal;

public class Seguros {

        private String aseguraRespCivil;
        private String polizaRespCivil;
        private String aseguraMedAmbiente;
        private String polizaMedAmbiente;
        private String aseguraCarga;
        private String polizaCarga;
        private BigDecimal primaSeguro;
    
        // Getters y Setters
        public String getAseguraRespCivil() {
            return aseguraRespCivil;
        }
    
        public void setAseguraRespCivil(String aseguraRespCivil) {
            this.aseguraRespCivil = aseguraRespCivil;
        }
    
        public String getPolizaRespCivil() {
            return polizaRespCivil;
        }
    
        public void setPolizaRespCivil(String polizaRespCivil) {
            this.polizaRespCivil = polizaRespCivil;
        }
    
        public String getAseguraMedAmbiente() {
            return aseguraMedAmbiente;
        }
    
        public void setAseguraMedAmbiente(String aseguraMedAmbiente) {
            this.aseguraMedAmbiente = aseguraMedAmbiente;
        }
    
        public String getPolizaMedAmbiente() {
            return polizaMedAmbiente;
        }
    
        public void setPolizaMedAmbiente(String polizaMedAmbiente) {
            this.polizaMedAmbiente = polizaMedAmbiente;
        }
    
        public String getAseguraCarga() {
            return aseguraCarga;
        }
    
        public void setAseguraCarga(String aseguraCarga) {
            this.aseguraCarga = aseguraCarga;
        }
    
        public String getPolizaCarga() {
            return polizaCarga;
        }
    
        public void setPolizaCarga(String polizaCarga) {
            this.polizaCarga = polizaCarga;
        }
    
        public BigDecimal getPrimaSeguro() {
            return primaSeguro;
        }
    
        public void setPrimaSeguro(BigDecimal primaSeguro) {
            this.primaSeguro = primaSeguro;
        }
    
}
