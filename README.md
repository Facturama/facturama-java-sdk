# Facturama SDK
Librería para consumir la API Web de Facturama.

## Dependencias 
* [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.2)
* [jcommande](https://mvnrepository.com/artifact/com.beust/jcommander/1.72)
* [joda-time](https://mvnrepository.com/artifact/joda-time/joda-time/2.9.9)
* [json](https://mvnrepository.com/artifact/org.json/json/20180130)
* [okhttp](https://mvnrepository.com/artifact/com.squareup.okhttp/okhttp/2.7.5)
* [okio](https://mvnrepository.com/artifact/com.squareup.okio/okio/1.6.0)

## Inicio rápido

#### Configuración  #####
Si el valor de la variable  ```isDevMode``` es ```true``` la librería esta en modo sandbox
 ```java
  new FacturamaApi("USUARIO","CONTRASEÑA", isDevMode);
 }
```
Y si el valor de la variable  ```isDevMode``` es ```false``` la librería esta en modo producción
 ```java
  new FacturamaApi("USUARIO","CONTRASEÑA",isDevMode);

```
## CFDI 3.3
Crear un objeto de tipo CFDI
 ```java
 com.Facturama.sdk_java.Models.Request.Cfdi cfdi = new com.Facturama.sdk_java.Models.Request.Cfdi();
 
 cfdi.setSerie("R");
 cfdi.setCurrency("MXN");
 cfdi.setExpeditionPlace("78116");
 cfdi.setPaymentConditions("CREDITO A SIETE DIAS");
 cfdi.setCfdiType( CfdiType.Ingreso.getValue());
 cfdi.setPaymentForm("03");
 cfdi.setPaymentMethod("PUE");
 
 Receiver  receiver = new Receiver();
 
 receiver.setRfc("RSS2202108U5");
 receiver.setName("RADIAL SOFTWARE SOLUTIONS");
 receiver.setCfdiUse("P01");
 
 cfdi.setReceiver(receiver);
 
 List<Item> lstItems = new ArrayList<>();
 
 item.setProductCode("10101504");
 item.setIdentificationNumber("EDL");
 item.setDescription("Estudios de viabilidad");
 item.setUnit("NO APLICA");
 item.setUnitCode("MTS");
 item.setUnitPrice(50.00);
 item.setQuantity(2.00);
 item.setSubtotal(100.00);
 
 List<Tax> lstTaxes = new ArrayList<>();
   
 tax.setTotal(16.00);
 tax.setName("IVA");
 tax.setRate(100.00);
 tax.setBase(0.160000);
 tax.setIsRetention(false);
 lstTaxes.add(tax);
     
 item.setTaxes(lstTaxes);
 item.setTotal(116.0);
 lstItems.add(item); 
     
 cfdi.setItems(lstItems);
 
```
Creacion de CFDI 3.3
 ```java
facturama.Cfdis().Create(cfdi);
```
Cancelación 
 ```java
 facturama.Cfdis().Remove(cfdiCreated.getId());
```
Descarga en el formato deseado xml, html ó pdf
 ```java
  String filePath = "factura";
  facturama.Cfdis().SavePdf(filePath+".pdf", "7eo51BvzV-E16gBx3nnxfQ2");
  facturama.Cfdis().SaveXml(filePath+".xml", "7eo51BvzV-E16gBx3nnxfQ2");
```
Consulta tus facturas en cualquier momento mediante una palabra clave ó algun atributo en específico
```.java
facturama.Cfdis().List("Expresion en Software");
facturama.Cfdis().ListFilterByRfc("ESO1202108R2");
```
## Otras Operaciones
* Consultar Perfil y Suscripción actual,
* Carga de Logo y Certificados Digitales
* CRUD de Productos, Clientes, Sucursales y Series.
