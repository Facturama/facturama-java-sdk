
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.Facturama.sdk_java.Container.FacturamaApi;
import com.Facturama.sdk_java.Services.*;
import com.Facturama.sdk_java.Models.*;
import java.util.List;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pepe
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println( "Ejemplos de consumo de la FacturamaAPI, con el usuario de 'pruebas'" );
            
       try {     
            // Creación de la instancia
            FacturamaApi facturama = createApiInstance();           
        
            // Prueba de la funcionalidad básica del servicio de clientes
            sampleClients(facturama);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
     /**
    * Creación de una instancia del SDK con los datos del usuario de pruebas
    * Remplaza  estos datos por los de tu cuenta
    * Considera que mientras la bandera de 'isDevMode' está en 'false' 
    * se considera un ambiente de pruebas ( no se consumen folios, las facturas realzadas son apócrifas)
    */
    private static FacturamaApi createApiInstance(){
        String user = "pruebas";
        String password = "pruebas2011";
        Boolean isDevMode = true;
        
        return new FacturamaApi(user, password, isDevMode);
    }
    
    
    
    /**
     * Ejemplos de funcionalidad basica de los servicios de "Clientes" 
     * @param facturama Instancia de la api de facturama
     */
    private static void sampleClients( FacturamaApi facturama) throws IOException{                  
         List<Client> lstClients = facturama.Clients().List();         
         Integer clientsBefore = lstClients.size();                       
        
         // Creacion de cliente
        Client newClient = sampleClientsCreate(facturama);                
         
         // El ciente obtenido (clientRetrived) seria el mismo que (newClientSaved)         
         String clientRetrivedId = newClient.getId();                 
         Client clientRetrived = facturama.Clients().Retrieve(clientRetrivedId);
         
         // Se modifica el RFC
         clientRetrived.setRfc("XAXX010101000");    
         
         // Edicion
         facturama.Clients().Update(clientRetrived,clientRetrived.getId() );         
         System.out.println( "Cliente Editado" );                          
                  
         // Eliminación
         facturama.Clients().Remove(clientRetrivedId);
         
         // Comparativa de la cantidad de clientes al inicio y final de la prueba,
         // para confirmar que se ha eliminado
         List<Client> lstClientsAfter = facturama.Clients().List();         
         Integer clientsAfter = lstClientsAfter.size();
         
         if(Objects.equals(clientsBefore, clientsAfter)){
             System.out.println( "Creación y eliminacion de cliente correcta!" );
         }else{
             System.out.println( "Creación y eliminacion de cliente erronea!" );
         }
                  
         System.out.println( "Fin del ejemplo de clientes" );
       
    }
    
    private static Client sampleClientsCreate(FacturamaApi facturama) throws IOException{
        Client newClient = new Client();    
         
         Address clientAddress = new Address();
         clientAddress.setCountry("MEXICO");
         clientAddress.setExteriorNumber("1230");
         clientAddress.setInteriorNumber("B");
         clientAddress.setLocality("San Luis");                  
         clientAddress.setMunicipality("San Luis Potosí");         
         clientAddress.setNeighborhood("Lomas 4ta");
         clientAddress.setState("San Luis Potosí");
         clientAddress.setStreet("Cañada de Gomez");
         clientAddress.setZipCode("78220");
         
         newClient.setAddress(clientAddress);         
         newClient.setCfdiUse("P01");
         newClient.setRfc("ESO1202108R2");
         newClient.setEmail("diego@facturama.com.mx");
         newClient.setName("Expresion en Software");
         
         
         return facturama.Clients().Create(newClient);
    }
}
