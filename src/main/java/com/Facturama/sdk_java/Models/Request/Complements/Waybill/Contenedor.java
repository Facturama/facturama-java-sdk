package com.Facturama.sdk_java.Models.Request.Complements.Waybill;


public class Contenedor {

    private String matriculaContenedor;
        private String tipoContenedor;
        private String numPrecinto;
        private String idCCPRelacionado;
        private String placaVMCCP;
        private String fechaCertificacionCCP;
        private RemolquesCCP[] remolquesCCP;
    
        // Getters y Setters
        public String getMatriculaContenedor() {
            return matriculaContenedor;
        }
    
        public void setMatriculaContenedor(String matriculaContenedor) {
            this.matriculaContenedor = matriculaContenedor;
        }
    
        public String getTipoContenedor() {
            return tipoContenedor;
        }
    
        public void setTipoContenedor(String tipoContenedor) {
            this.tipoContenedor = tipoContenedor;
        }
    
        public String getNumPrecinto() {
            return numPrecinto;
        }
    
        public void setNumPrecinto(String numPrecinto) {
            this.numPrecinto = numPrecinto;
        }
    
        public String getIdCCPRelacionado() {
            return idCCPRelacionado;
        }
    
        public void setIdCCPRelacionado(String idCCPRelacionado) {
            this.idCCPRelacionado = idCCPRelacionado;
        }
    
        public String getPlacaVMCCP() {
            return placaVMCCP;
        }
    
        public void setPlacaVMCCP(String placaVMCCP) {
            this.placaVMCCP = placaVMCCP;
        }
    
        public String getFechaCertificacionCCP() {
            return fechaCertificacionCCP;
        }
    
        public void setFechaCertificacionCCP(String fechaCertificacionCCP) {
            this.fechaCertificacionCCP = fechaCertificacionCCP;
        }
    
        public RemolquesCCP[] getRemolquesCCP() {
            return remolquesCCP;
        }
    
        public void setRemolquesCCP(RemolquesCCP[] remolquesCCP) {
            this.remolquesCCP = remolquesCCP;
        }
    
}
