
package br.edu.ifpb.pos.reservaHotel;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ServiceReservaHotelService", targetNamespace = "http://hotel.pos.ifpb.edu.br/", wsdlLocation = "http://localhost:8080/ServiceReservaHotelService/ServiceReservaHotel?WSDL")
public class ServiceReservaHotelService
    extends Service
{

    private final static URL SERVICERESERVAHOTELSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICERESERVAHOTELSERVICE_EXCEPTION;
    private final static QName SERVICERESERVAHOTELSERVICE_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "ServiceReservaHotelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServiceReservaHotelService/ServiceReservaHotel?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICERESERVAHOTELSERVICE_WSDL_LOCATION = url;
        SERVICERESERVAHOTELSERVICE_EXCEPTION = e;
    }

    public ServiceReservaHotelService() {
        super(__getWsdlLocation(), SERVICERESERVAHOTELSERVICE_QNAME);
    }

    public ServiceReservaHotelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ServiceReservaHotel
     */
    @WebEndpoint(name = "ServiceReservaHotelPort")
    public ServiceReservaHotel getServiceReservaHotelPort() {
        return super.getPort(new QName("http://hotel.pos.ifpb.edu.br/", "ServiceReservaHotelPort"), ServiceReservaHotel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceReservaHotel
     */
    @WebEndpoint(name = "ServiceReservaHotelPort")
    public ServiceReservaHotel getServiceReservaHotelPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://hotel.pos.ifpb.edu.br/", "ServiceReservaHotelPort"), ServiceReservaHotel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICERESERVAHOTELSERVICE_EXCEPTION!= null) {
            throw SERVICERESERVAHOTELSERVICE_EXCEPTION;
        }
        return SERVICERESERVAHOTELSERVICE_WSDL_LOCATION;
    }

}
