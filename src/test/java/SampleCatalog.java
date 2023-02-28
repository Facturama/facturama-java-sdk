
import java.io.IOException;
import com.Facturama.sdk_java.Container.FacturamaApi;
import com.Facturama.sdk_java.Services.*;
import com.Facturama.sdk_java.Models.*;
import com.Facturama.sdk_java.Models.Request.ProductTax;
import com.Facturama.sdk_java.Models.Request.CfdiType;
import com.Facturama.sdk_java.Models.Request.Item;
import com.Facturama.sdk_java.Models.Request.Receiver;
import com.Facturama.sdk_java.Models.Request.GlobalInformation;
import com.Facturama.sdk_java.Models.Request.ThirdPartyAccount;
import com.Facturama.sdk_java.Models.Request.Tax;
import com.Facturama.sdk_java.Models.Response.Catalogs.*;
import com.Facturama.sdk_java.Models.Response.Catalogs.Cfdi.*;
import com.Facturama.sdk_java.Models.Response.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import com.Facturama.sdk_java.Models.Exception.FacturamaException;
import com.Facturama.sdk_java.Models.Request.Complements.Complements;
import com.Facturama.sdk_java.Models.Request.Complements.INE.IdContabilidad;
import com.Facturama.sdk_java.Models.Request.Payment;
import com.Facturama.sdk_java.Models.Request.RelatedDocument;
import com.Facturama.sdk_java.Models.Request.Complements.INE.Ine;
import com.Facturama.sdk_java.Models.Request.Complements.INE.IneEntidad;


import java.util.Calendar;
import java.util.Map;

/**
 *
 * @author Facturama
 */
public class SampleCatalog 
{
    public static void principal()
    {
        System.out.println("Ejemplo de uso de catalogos Facturama.");
        try
        {
            //Creación de la instancia
            FacturamaApi facturama = createApiInstance();
            sampleCatalogs(facturama);
            
        }
        catch (FacturamaException ex) 
        {                        
            // Se muestran los errores
            System.out.println( ex.getMessage() );
                        
            Map<String, String[]> messageDetail = ex.getModel().getDetails();
            messageDetail.entrySet().forEach((entry) -> {
                System.out.println(entry.getKey() + ": " +  String.join(",", entry.getValue() ));
            });                                   
            
        } 
        catch (Exception ex) 
        {
            System.out.println( "Error inesperado: " + ex.getMessage() );
        }
    }
    private static FacturamaApi createApiInstance()
    {
        String user =   "pruebas";
        String password="pruebas2011";
        Boolean isDevMode=true;
        return new FacturamaApi(user,password,isDevMode);
    }
    private static void sampleCatalogs(FacturamaApi facturama) throws IOException, FacturamaException, Exception
    {
   
        List<FiscalRegimen> lstFiscalRegimens=facturama.Catalogs().FiscalRegimens();
        Integer totalRegimens = lstFiscalRegimens.size(); 
        System.out.println(totalRegimens);
        
        for(int i=0 ; i<=totalRegimens - 1; i++ )
        {
            System.out.println(i);
            if(lstFiscalRegimens.get(i).getValue().compareTo("630")==0)
            {
                System.out.println(lstFiscalRegimens.get(i).getMoral());
                System.out.println(lstFiscalRegimens.get(i).getName());
                System.out.println(lstFiscalRegimens.get(i).getNatural());
                System.out.println(lstFiscalRegimens.get(i).getValue());
            }
        }   
    }
}
