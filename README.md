# Facturama SDK
Librería para consumir la API Web de Facturama.

##Dependencias 
* [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.2)
* [jcommande](https://mvnrepository.com/artifact/com.beust/jcommander/1.72)
* [joda-time](https://mvnrepository.com/artifact/joda-time/joda-time/2.9.9)
* [json](https://mvnrepository.com/artifact/org.json/json/20180130)
* [okhttp](https://mvnrepository.com/artifact/com.squareup.okhttp/okhttp/2.7.5)
* [okio](https://mvnrepository.com/artifact/com.squareup.okio/okio/1.6.0)

##Inicio rapido

#### Configuración  #####
Si el valor de la variable  ```isDevMode``` es ```true``` la librería esta en modo sandbox
 ```java
	   private static FacturamaApi createApiInstance(){
        String user = "pruebas";
        String password = "pruebas2010";
        Boolean isDevMode = true;
        
       return new FacturamaApi(user, password, isDevMode);
    }
```
Y si el valor de la variable  ```isDevMode``` es ```false``` la librería esta en modo producción
 ```java
	   private static FacturamaApi createApiInstance(){
        String user = "pruebas";
        String password = "pruebas2010";
        Boolean isDevMode = false;
        
       return new FacturamaApi(user, password, isDevMode);
    }
```
## CFDI 3.3


