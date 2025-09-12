package com.Facturama.sdk_java.Models.Request.Complements.Waybill;
import java.math.BigDecimal;

public class Mercancia {

    
        private String bienesTransp;
        private String claveSTCC;
        private String descripcion;
        private BigDecimal cantidad;
        private String claveUnidad;
        private String unidad;
        private String dimensiones;
        private String materialPeligroso;
        private String cveMaterialPeligroso;
        private String embalaje;
        private String descripEmbalaje;
        private String sectorCOFEPRIS;
        private String nombreIngredienteActivo;
        private String nomQuimico;
        private String denominacionGenericaProd;
        private String denominacionDistintivaProd;
        private String fabricante;
        private String fechaCaducidad;
        private String loteMedicamento;
        private String formaFarmaceutica;
        private String condicionesEspTransp;
        private String registroSanitarioFolioAutorizacion;
        private String permisoImportacion;
        private String folioImpoVUCEM;
        private String numCas;
        private String razonSocialEmpImp;
        private String numRegSanPlagCOFEPRIS;
        private String datosFabricante;
        private String datosFormulador;
        private String datosMaquilador;
        private String usoAutorizado;
    
        private BigDecimal pesoEnKg;
        private BigDecimal valorMercancia;
        private String moneda;
        private String fraccionArancelaria;
        private String uuidComercioExt;
        private String tipoMaterial;
        private String descripcionMaterial;
    
        private DocumentacionAduanera[] documentacionAduanera;
        private Pedimentos[] pedimentos;
        private GuiasIdentificacion[] guiasIdentificacion;
        private CantidadTransporta[] cantidadTransporta;
        private DetalleMercancia detalleMercancia;
    
        // Getters y Setters
        public String getBienesTransp() {
            return bienesTransp;
        }
    
        public void setBienesTransp(String bienesTransp) {
            this.bienesTransp = bienesTransp;
        }
    
        public String getClaveSTCC() {
            return claveSTCC;
        }
    
        public void setClaveSTCC(String claveSTCC) {
            this.claveSTCC = claveSTCC;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public BigDecimal getCantidad() {
            return cantidad;
        }
    
        public void setCantidad(BigDecimal cantidad) {
            this.cantidad = cantidad;
        }
    
        public String getClaveUnidad() {
            return claveUnidad;
        }
    
        public void setClaveUnidad(String claveUnidad) {
            this.claveUnidad = claveUnidad;
        }
    
        public String getUnidad() {
            return unidad;
        }
    
        public void setUnidad(String unidad) {
            this.unidad = unidad;
        }
    
        public String getDimensiones() {
            return dimensiones;
        }
    
        public void setDimensiones(String dimensiones) {
            this.dimensiones = dimensiones;
        }
    
        public String getMaterialPeligroso() {
            return materialPeligroso;
        }
    
        public void setMaterialPeligroso(String materialPeligroso) {
            this.materialPeligroso = materialPeligroso;
        }
    
        public String getCveMaterialPeligroso() {
            return cveMaterialPeligroso;
        }
    
        public void setCveMaterialPeligroso(String cveMaterialPeligroso) {
            this.cveMaterialPeligroso = cveMaterialPeligroso;
        }
    
        public String getEmbalaje() {
            return embalaje;
        }
    
        public void setEmbalaje(String embalaje) {
            this.embalaje = embalaje;
        }
    
        public String getDescripEmbalaje() {
            return descripEmbalaje;
        }
    
        public void setDescripEmbalaje(String descripEmbalaje) {
            this.descripEmbalaje = descripEmbalaje;
        }
    
        public String getSectorCOFEPRIS() {
            return sectorCOFEPRIS;
        }
    
        public void setSectorCOFEPRIS(String sectorCOFEPRIS) {
            this.sectorCOFEPRIS = sectorCOFEPRIS;
        }
    
        public String getNombreIngredienteActivo() {
            return nombreIngredienteActivo;
        }
    
        public void setNombreIngredienteActivo(String nombreIngredienteActivo) {
            this.nombreIngredienteActivo = nombreIngredienteActivo;
        }
    
        public String getNomQuimico() {
            return nomQuimico;
        }
    
        public void setNomQuimico(String nomQuimico) {
            this.nomQuimico = nomQuimico;
        }
    
        public String getDenominacionGenericaProd() {
            return denominacionGenericaProd;
        }
    
        public void setDenominacionGenericaProd(String denominacionGenericaProd) {
            this.denominacionGenericaProd = denominacionGenericaProd;
        }
    
        public String getDenominacionDistintivaProd() {
            return denominacionDistintivaProd;
        }
    
        public void setDenominacionDistintivaProd(String denominacionDistintivaProd) {
            this.denominacionDistintivaProd = denominacionDistintivaProd;
        }
    
        public String getFabricante() {
            return fabricante;
        }
    
        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }
    
        public String getFechaCaducidad() {
            return fechaCaducidad;
        }
    
        public void setFechaCaducidad(String fechaCaducidad) {
            this.fechaCaducidad = fechaCaducidad;
        }
    
        public String getLoteMedicamento() {
            return loteMedicamento;
        }
    
        public void setLoteMedicamento(String loteMedicamento) {
            this.loteMedicamento = loteMedicamento;
        }
    
        public String getFormaFarmaceutica() {
            return formaFarmaceutica;
        }
    
        public void setFormaFarmaceutica(String formaFarmaceutica) {
            this.formaFarmaceutica = formaFarmaceutica;
        }
    
        public String getCondicionesEspTransp() {
            return condicionesEspTransp;
        }
    
        public void setCondicionesEspTransp(String condicionesEspTransp) {
            this.condicionesEspTransp = condicionesEspTransp;
        }
    
        public String getRegistroSanitarioFolioAutorizacion() {
            return registroSanitarioFolioAutorizacion;
        }
    
        public void setRegistroSanitarioFolioAutorizacion(String registroSanitarioFolioAutorizacion) {
            this.registroSanitarioFolioAutorizacion = registroSanitarioFolioAutorizacion;
        }
    
        public String getPermisoImportacion() {
            return permisoImportacion;
        }
    
        public void setPermisoImportacion(String permisoImportacion) {
            this.permisoImportacion = permisoImportacion;
        }
    
        public String getFolioImpoVUCEM() {
            return folioImpoVUCEM;
        }
    
        public void setFolioImpoVUCEM(String folioImpoVUCEM) {
            this.folioImpoVUCEM = folioImpoVUCEM;
        }
    
        public String getNumCas() {
            return numCas;
        }
    
        public void setNumCas(String numCas) {
            this.numCas = numCas;
        }
    
        public String getRazonSocialEmpImp() {
            return razonSocialEmpImp;
        }
    
        public void setRazonSocialEmpImp(String razonSocialEmpImp) {
            this.razonSocialEmpImp = razonSocialEmpImp;
        }
    
        public String getNumRegSanPlagCOFEPRIS() {
            return numRegSanPlagCOFEPRIS;
        }
    
        public void setNumRegSanPlagCOFEPRIS(String numRegSanPlagCOFEPRIS) {
            this.numRegSanPlagCOFEPRIS = numRegSanPlagCOFEPRIS;
        }
    
        public String getDatosFabricante() {
            return datosFabricante;
        }
    
        public void setDatosFabricante(String datosFabricante) {
            this.datosFabricante = datosFabricante;
        }
    
        public String getDatosFormulador() {
            return datosFormulador;
        }
    
        public void setDatosFormulador(String datosFormulador) {
            this.datosFormulador = datosFormulador;
        }
    
        public String getDatosMaquilador() {
            return datosMaquilador;
        }
    
        public void setDatosMaquilador(String datosMaquilador) {
            this.datosMaquilador = datosMaquilador;
        }
    
        public String getUsoAutorizado() {
            return usoAutorizado;
        }
    
        public void setUsoAutorizado(String usoAutorizado) {
            this.usoAutorizado = usoAutorizado;
        }
    
        public BigDecimal getPesoEnKg() {
            return pesoEnKg;
        }
    
        public void setPesoEnKg(BigDecimal pesoEnKg) {
            this.pesoEnKg = pesoEnKg;
        }
    
        public BigDecimal getValorMercancia() {
            return valorMercancia;
        }
    
        public void setValorMercancia(BigDecimal valorMercancia) {
            this.valorMercancia = valorMercancia;
        }
    
        public String getMoneda() {
            return moneda;
        }
    
        public void setMoneda(String moneda) {
            this.moneda = moneda;
        }
    
        public String getFraccionArancelaria() {
            return fraccionArancelaria;
        }
    
        public void setFraccionArancelaria(String fraccionArancelaria) {
            this.fraccionArancelaria = fraccionArancelaria;
        }
    
        public String getUuidComercioExt() {
            return uuidComercioExt;
        }
    
        public void setUuidComercioExt(String uuidComercioExt) {
            this.uuidComercioExt = uuidComercioExt;
        }
    
        public String getTipoMaterial() {
            return tipoMaterial;
        }
    
        public void setTipoMaterial(String tipoMaterial) {
            this.tipoMaterial = tipoMaterial;
        }
    
        public String getDescripcionMaterial() {
            return descripcionMaterial;
        }
    
        public void setDescripcionMaterial(String descripcionMaterial) {
            this.descripcionMaterial = descripcionMaterial;
        }
    
        public DocumentacionAduanera[] getDocumentacionAduanera() {
            return documentacionAduanera;
        }
    
        public void setDocumentacionAduanera(DocumentacionAduanera[] documentacionAduanera) {
            this.documentacionAduanera = documentacionAduanera;
        }
    
        public Pedimentos[] getPedimentos() {
            return pedimentos;
        }
    
        public void setPedimentos(Pedimentos[] pedimentos) {
            this.pedimentos = pedimentos;
        }
    
        public GuiasIdentificacion[] getGuiasIdentificacion() {
            return guiasIdentificacion;
        }
    
        public void setGuiasIdentificacion(GuiasIdentificacion[] guiasIdentificacion) {
            this.guiasIdentificacion = guiasIdentificacion;
        }
    
        public CantidadTransporta[] getCantidadTransporta() {
            return cantidadTransporta;
        }
    
        public void setCantidadTransporta(CantidadTransporta[] cantidadTransporta) {
            this.cantidadTransporta = cantidadTransporta;
        }
    
        public DetalleMercancia getDetalleMercancia() {
            return detalleMercancia;
        }
    
        public void setDetalleMercancia(DetalleMercancia detalleMercancia) {
            this.detalleMercancia = detalleMercancia;
        }
}
