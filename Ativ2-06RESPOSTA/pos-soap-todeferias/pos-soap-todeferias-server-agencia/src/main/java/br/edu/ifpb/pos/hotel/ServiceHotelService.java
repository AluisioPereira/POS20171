
package br.edu.ifpb.pos.hotel;

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
@WebServiceClient(name = "ServiceHotelService", targetNamespace = "http://hotel.pos.ifpb.edu.br/", wsdlLocation = "http://localhost:8080/ServiceHotelService/ServiceHotel?WSDL")
public class ServiceHotelService
    extends Service
{

    private final static URL SERVICEHOTELSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEHOTELSERVICE_EXCEPTION;
    private final static QName SERVICEHOTELSERVICE_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "ServiceHotelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServiceHotelService/ServiceHotel?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEHOTELSERVICE_WSDL_LOCATION = url;
        SERVICEHOTELSERVICE_EXCEPTION = e;
    }

    public ServiceHotelService() {
        super(__getWsdlLocation(), SERVICEHOTELSERVICE_QNAME);
    }

    public ServiceHotelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ServiceHotel
     */
    @WebEndpoint(name = "ServiceHotelPort")
    public ServiceHotel getServiceHotelPort() {
        return super.getPort(new QName("http://hotel.pos.ifpb.edu.br/", "ServiceHotelPort"), ServiceHotel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceHotel
     */
    @WebEndpoint(name = "ServiceHotelPort")
    public ServiceHotel getServiceHotelPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://hotel.pos.ifpb.edu.br/", "ServiceHotelPort"), ServiceHotel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEHOTELSERVICE_EXCEPTION!= null) {
            throw SERVICEHOTELSERVICE_EXCEPTION;
        }
        return SERVICEHOTELSERVICE_WSDL_LOCATION;
    }

}
