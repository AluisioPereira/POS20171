
package br.edu.ifpb.pos.hotel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.hotel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SalvarHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "salvarHotel");
    private final static QName _SalvarHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "salvarHotelResponse");
    private final static QName _ListarTodasHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "listarTodasHotel");
    private final static QName _AtualizarHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "atualizarHotel");
    private final static QName _AtualizarHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "atualizarHotelResponse");
    private final static QName _ListarTodasHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "listarTodasHotelResponse");
    private final static QName _EncontrarHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "encontrarHotel");
    private final static QName _EncontrarHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "encontrarHotelResponse");
    private final static QName _RemoverHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "removerHotel");
    private final static QName _RemoverHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "removerHotelResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.hotel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalvarHotel }
     * 
     */
    public SalvarHotel createSalvarHotel() {
        return new SalvarHotel();
    }

    /**
     * Create an instance of {@link SalvarHotelResponse }
     * 
     */
    public SalvarHotelResponse createSalvarHotelResponse() {
        return new SalvarHotelResponse();
    }

    /**
     * Create an instance of {@link ListarTodasHotel }
     * 
     */
    public ListarTodasHotel createListarTodasHotel() {
        return new ListarTodasHotel();
    }

    /**
     * Create an instance of {@link AtualizarHotel }
     * 
     */
    public AtualizarHotel createAtualizarHotel() {
        return new AtualizarHotel();
    }

    /**
     * Create an instance of {@link AtualizarHotelResponse }
     * 
     */
    public AtualizarHotelResponse createAtualizarHotelResponse() {
        return new AtualizarHotelResponse();
    }

    /**
     * Create an instance of {@link EncontrarHotel }
     * 
     */
    public EncontrarHotel createEncontrarHotel() {
        return new EncontrarHotel();
    }

    /**
     * Create an instance of {@link EncontrarHotelResponse }
     * 
     */
    public EncontrarHotelResponse createEncontrarHotelResponse() {
        return new EncontrarHotelResponse();
    }

    /**
     * Create an instance of {@link RemoverHotel }
     * 
     */
    public RemoverHotel createRemoverHotel() {
        return new RemoverHotel();
    }

    /**
     * Create an instance of {@link RemoverHotelResponse }
     * 
     */
    public RemoverHotelResponse createRemoverHotelResponse() {
        return new RemoverHotelResponse();
    }

    /**
     * Create an instance of {@link ListarTodasHotelResponse }
     * 
     */
    public ListarTodasHotelResponse createListarTodasHotelResponse() {
        return new ListarTodasHotelResponse();
    }

    /**
     * Create an instance of {@link HotelId }
     * 
     */
    public HotelId createHotelId() {
        return new HotelId();
    }

    /**
     * Create an instance of {@link ClienteId }
     * 
     */
    public ClienteId createClienteId() {
        return new ClienteId();
    }

    /**
     * Create an instance of {@link ReservaHotel }
     * 
     */
    public ReservaHotel createReservaHotel() {
        return new ReservaHotel();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "salvarHotel")
    public JAXBElement<SalvarHotel> createSalvarHotel(SalvarHotel value) {
        return new JAXBElement<SalvarHotel>(_SalvarHotel_QNAME, SalvarHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "salvarHotelResponse")
    public JAXBElement<SalvarHotelResponse> createSalvarHotelResponse(SalvarHotelResponse value) {
        return new JAXBElement<SalvarHotelResponse>(_SalvarHotelResponse_QNAME, SalvarHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "listarTodasHotel")
    public JAXBElement<ListarTodasHotel> createListarTodasHotel(ListarTodasHotel value) {
        return new JAXBElement<ListarTodasHotel>(_ListarTodasHotel_QNAME, ListarTodasHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "atualizarHotel")
    public JAXBElement<AtualizarHotel> createAtualizarHotel(AtualizarHotel value) {
        return new JAXBElement<AtualizarHotel>(_AtualizarHotel_QNAME, AtualizarHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "atualizarHotelResponse")
    public JAXBElement<AtualizarHotelResponse> createAtualizarHotelResponse(AtualizarHotelResponse value) {
        return new JAXBElement<AtualizarHotelResponse>(_AtualizarHotelResponse_QNAME, AtualizarHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "listarTodasHotelResponse")
    public JAXBElement<ListarTodasHotelResponse> createListarTodasHotelResponse(ListarTodasHotelResponse value) {
        return new JAXBElement<ListarTodasHotelResponse>(_ListarTodasHotelResponse_QNAME, ListarTodasHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "encontrarHotel")
    public JAXBElement<EncontrarHotel> createEncontrarHotel(EncontrarHotel value) {
        return new JAXBElement<EncontrarHotel>(_EncontrarHotel_QNAME, EncontrarHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "encontrarHotelResponse")
    public JAXBElement<EncontrarHotelResponse> createEncontrarHotelResponse(EncontrarHotelResponse value) {
        return new JAXBElement<EncontrarHotelResponse>(_EncontrarHotelResponse_QNAME, EncontrarHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "removerHotel")
    public JAXBElement<RemoverHotel> createRemoverHotel(RemoverHotel value) {
        return new JAXBElement<RemoverHotel>(_RemoverHotel_QNAME, RemoverHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "removerHotelResponse")
    public JAXBElement<RemoverHotelResponse> createRemoverHotelResponse(RemoverHotelResponse value) {
        return new JAXBElement<RemoverHotelResponse>(_RemoverHotelResponse_QNAME, RemoverHotelResponse.class, null, value);
    }

}
