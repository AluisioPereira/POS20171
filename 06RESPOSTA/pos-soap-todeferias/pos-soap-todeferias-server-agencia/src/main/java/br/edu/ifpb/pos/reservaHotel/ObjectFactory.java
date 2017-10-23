
package br.edu.ifpb.pos.reservaHotel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.reservaHotel package. 
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

    private final static QName _RemoverReservaHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "removerReservaHotelResponse");
    private final static QName _SalvarReservaHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "salvarReservaHotelResponse");
    private final static QName _AtualizarReservaHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "atualizarReservaHotelResponse");
    private final static QName _ListarTodasReservaHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "listarTodasReservaHotelResponse");
    private final static QName _RemoverReservaHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "removerReservaHotel");
    private final static QName _ListarTodasReservaHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "listarTodasReservaHotel");
    private final static QName _EncontrarReservaHotelResponse_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "encontrarReservaHotelResponse");
    private final static QName _SalvarReservaHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "salvarReservaHotel");
    private final static QName _AtualizarReservaHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "atualizarReservaHotel");
    private final static QName _EncontrarReservaHotel_QNAME = new QName("http://hotel.pos.ifpb.edu.br/", "encontrarReservaHotel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.reservaHotel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoverReservaHotelResponse }
     * 
     */
    public RemoverReservaHotelResponse createRemoverReservaHotelResponse() {
        return new RemoverReservaHotelResponse();
    }

    /**
     * Create an instance of {@link SalvarReservaHotelResponse }
     * 
     */
    public SalvarReservaHotelResponse createSalvarReservaHotelResponse() {
        return new SalvarReservaHotelResponse();
    }

    /**
     * Create an instance of {@link AtualizarReservaHotelResponse }
     * 
     */
    public AtualizarReservaHotelResponse createAtualizarReservaHotelResponse() {
        return new AtualizarReservaHotelResponse();
    }

    /**
     * Create an instance of {@link ListarTodasReservaHotelResponse }
     * 
     */
    public ListarTodasReservaHotelResponse createListarTodasReservaHotelResponse() {
        return new ListarTodasReservaHotelResponse();
    }

    /**
     * Create an instance of {@link RemoverReservaHotel }
     * 
     */
    public RemoverReservaHotel createRemoverReservaHotel() {
        return new RemoverReservaHotel();
    }

    /**
     * Create an instance of {@link ListarTodasReservaHotel }
     * 
     */
    public ListarTodasReservaHotel createListarTodasReservaHotel() {
        return new ListarTodasReservaHotel();
    }

    /**
     * Create an instance of {@link SalvarReservaHotel }
     * 
     */
    public SalvarReservaHotel createSalvarReservaHotel() {
        return new SalvarReservaHotel();
    }

    /**
     * Create an instance of {@link EncontrarReservaHotelResponse }
     * 
     */
    public EncontrarReservaHotelResponse createEncontrarReservaHotelResponse() {
        return new EncontrarReservaHotelResponse();
    }

    /**
     * Create an instance of {@link AtualizarReservaHotel }
     * 
     */
    public AtualizarReservaHotel createAtualizarReservaHotel() {
        return new AtualizarReservaHotel();
    }

    /**
     * Create an instance of {@link EncontrarReservaHotel }
     * 
     */
    public EncontrarReservaHotel createEncontrarReservaHotel() {
        return new EncontrarReservaHotel();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverReservaHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "removerReservaHotelResponse")
    public JAXBElement<RemoverReservaHotelResponse> createRemoverReservaHotelResponse(RemoverReservaHotelResponse value) {
        return new JAXBElement<RemoverReservaHotelResponse>(_RemoverReservaHotelResponse_QNAME, RemoverReservaHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarReservaHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "salvarReservaHotelResponse")
    public JAXBElement<SalvarReservaHotelResponse> createSalvarReservaHotelResponse(SalvarReservaHotelResponse value) {
        return new JAXBElement<SalvarReservaHotelResponse>(_SalvarReservaHotelResponse_QNAME, SalvarReservaHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarReservaHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "atualizarReservaHotelResponse")
    public JAXBElement<AtualizarReservaHotelResponse> createAtualizarReservaHotelResponse(AtualizarReservaHotelResponse value) {
        return new JAXBElement<AtualizarReservaHotelResponse>(_AtualizarReservaHotelResponse_QNAME, AtualizarReservaHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasReservaHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "listarTodasReservaHotelResponse")
    public JAXBElement<ListarTodasReservaHotelResponse> createListarTodasReservaHotelResponse(ListarTodasReservaHotelResponse value) {
        return new JAXBElement<ListarTodasReservaHotelResponse>(_ListarTodasReservaHotelResponse_QNAME, ListarTodasReservaHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverReservaHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "removerReservaHotel")
    public JAXBElement<RemoverReservaHotel> createRemoverReservaHotel(RemoverReservaHotel value) {
        return new JAXBElement<RemoverReservaHotel>(_RemoverReservaHotel_QNAME, RemoverReservaHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasReservaHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "listarTodasReservaHotel")
    public JAXBElement<ListarTodasReservaHotel> createListarTodasReservaHotel(ListarTodasReservaHotel value) {
        return new JAXBElement<ListarTodasReservaHotel>(_ListarTodasReservaHotel_QNAME, ListarTodasReservaHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarReservaHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "encontrarReservaHotelResponse")
    public JAXBElement<EncontrarReservaHotelResponse> createEncontrarReservaHotelResponse(EncontrarReservaHotelResponse value) {
        return new JAXBElement<EncontrarReservaHotelResponse>(_EncontrarReservaHotelResponse_QNAME, EncontrarReservaHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarReservaHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "salvarReservaHotel")
    public JAXBElement<SalvarReservaHotel> createSalvarReservaHotel(SalvarReservaHotel value) {
        return new JAXBElement<SalvarReservaHotel>(_SalvarReservaHotel_QNAME, SalvarReservaHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarReservaHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "atualizarReservaHotel")
    public JAXBElement<AtualizarReservaHotel> createAtualizarReservaHotel(AtualizarReservaHotel value) {
        return new JAXBElement<AtualizarReservaHotel>(_AtualizarReservaHotel_QNAME, AtualizarReservaHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarReservaHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hotel.pos.ifpb.edu.br/", name = "encontrarReservaHotel")
    public JAXBElement<EncontrarReservaHotel> createEncontrarReservaHotel(EncontrarReservaHotel value) {
        return new JAXBElement<EncontrarReservaHotel>(_EncontrarReservaHotel_QNAME, EncontrarReservaHotel.class, null, value);
    }

}
