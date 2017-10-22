
package br.edu.ifpb.pos.hotel;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ServiceHotel", targetNamespace = "http://hotel.pos.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceHotel {


    /**
     * 
     * @param arg0
     * @return
     *     returns br.edu.ifpb.pos.hotel.Hotel
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarHotel", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.EncontrarHotel")
    @ResponseWrapper(localName = "encontrarHotelResponse", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.EncontrarHotelResponse")
    public Hotel encontrarHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvarHotel", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.SalvarHotel")
    @ResponseWrapper(localName = "salvarHotelResponse", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.SalvarHotelResponse")
    public void salvarHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Hotel arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.pos.hotel.Hotel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarTodasHotel", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.ListarTodasHotel")
    @ResponseWrapper(localName = "listarTodasHotelResponse", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.ListarTodasHotelResponse")
    public List<Hotel> listarTodasHotel();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "atualizarHotel", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.AtualizarHotel")
    @ResponseWrapper(localName = "atualizarHotelResponse", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.AtualizarHotelResponse")
    public void atualizarHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Hotel arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removerHotel", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.RemoverHotel")
    @ResponseWrapper(localName = "removerHotelResponse", targetNamespace = "http://hotel.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.hotel.RemoverHotelResponse")
    public void removerHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
