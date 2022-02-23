# Facturama-Javascript-SDK

[NOTA] Este documento esta disponble en [Español]

Library to consume the Web API and Multiissuer API of Facturama.

## Check the Facturama guide here.

[Guide](https://apisandbox.facturama.mx/guias)

## Dependencies

* [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.2)
* [jcommande](https://mvnrepository.com/artifact/com.beust/jcommander/1.72)
* [joda-time](https://mvnrepository.com/artifact/joda-time/joda-time/2.9.9)
* [json](https://mvnrepository.com/artifact/org.json/json/20180130)
* [okhttp](https://mvnrepository.com/artifact/com.squareup.okhttp/okhttp/2.7.5)
* [okio](https://mvnrepository.com/artifact/com.squareup.okio/okio/1.6.0)

## Configuration

If the value of the ```isDevMode``` variable is ```true```, the library is in sandbox mode.
```.rb
  new FacturamaApi("USUARIO","CONTRASEÑA", isDevMode);
```
If the value of the  ```isDevMode ``` variable is ```false```, the library is in sandbox mode.
 ```.rb
  new FacturamaApi("USUARIO","CONTRASEÑA",isDevMode);
```

## Web API operations

- Create, get, cancel CFDIs; download XMLs and PDFs and send them by email;
- Check profile and current subscription;
- Logo and digital certificates uploading;
- CRUDs for Product, Customer, Branch office and series.

*All operations will be reflected on Facturama's web app.*

Some examples: [here](https://github.com/Facturama/facturama-java-sdk/wiki/API-Web)

## Mult-issuer API operations

- Create, get, cancel CFDIs; download XMLs and PDFs;
- CRUD for digital sign certificates ("CSD", "Certificados de los Sellos Digitales").

*These operations will not be reflected on Facturama's web app.*

Some examples: [here](https://github.com/Facturama/facturama-java-sdk/wiki/API-Multiemisor)

With this client you can start to work, in this step you're ready to make API calls on behalf of the user.

## I want to contribute!
That is great! Just fork the project in GitHub, create a topic branch, write some code, and add some tests for your new code.

Thanks for helping!

[Español]: ./README.md
