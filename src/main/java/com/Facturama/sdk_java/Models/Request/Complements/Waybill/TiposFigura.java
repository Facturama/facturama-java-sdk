package com.Facturama.sdk_java.Models.Request.Complements.Waybill;

public class TiposFigura {

    private PartesTransporte[] partesTransporte;
        private String tipoFigura;
        private String rfcFigura;
        private String numLicencia;
        private String nombreFigura;
        private String numRegIdTribFigura;
        private String residenciaFiscalFigura;
        private Domicilio domicilio;
    
        // Getters y Setters
        public PartesTransporte[] getPartesTransporte() {
            return partesTransporte;
        }
    
        public void setPartesTransporte(PartesTransporte[] partesTransporte) {
            this.partesTransporte = partesTransporte;
        }
    
        public String getTipoFigura() {
            return tipoFigura;
        }
    
        public void setTipoFigura(String tipoFigura) {
            this.tipoFigura = tipoFigura;
        }
    
        public String getRfcFigura() {
            return rfcFigura;
        }
    
        public void setRfcFigura(String rfcFigura) {
            this.rfcFigura = rfcFigura;
        }
    
        public String getNumLicencia() {
            return numLicencia;
        }
    
        public void setNumLicencia(String numLicencia) {
            this.numLicencia = numLicencia;
        }
    
        public String getNombreFigura() {
            return nombreFigura;
        }
    
        public void setNombreFigura(String nombreFigura) {
            this.nombreFigura = nombreFigura;
        }
    
        public String getNumRegIdTribFigura() {
            return numRegIdTribFigura;
        }
    
        public void setNumRegIdTribFigura(String numRegIdTribFigura) {
            this.numRegIdTribFigura = numRegIdTribFigura;
        }
    
        public String getResidenciaFiscalFigura() {
            return residenciaFiscalFigura;
        }
    
        public void setResidenciaFiscalFigura(String residenciaFiscalFigura) {
            this.residenciaFiscalFigura = residenciaFiscalFigura;
        }
    
        public Domicilio getDomicilio() {
            return domicilio;
        }
    
        public void setDomicilio(Domicilio domicilio) {
            this.domicilio = domicilio;
        }
    
}
