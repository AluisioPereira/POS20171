
package br.edu.ifpb.pos.reservaPassagem;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.reservaPassagem package. 
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

    private final static QName _ListarTodasReservaPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "listarTodasReservaPassagemResponse");
    private final static QName _ListarTodasReservaPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "listarTodasReservaPassagem");
    private final static QName _RemoverReservaPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "removerReservaPassagemResponse");
    private final static QName _EncontrarReservaPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "encontrarReservaPassagem");
    private final static QName _AtualizarReservaPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "atualizarReservaPassagemResponse");
    private final static QName _RemoverReservaPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "removerReservaPassagem");
    private final static QName _SalvarReservaPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "salvarReservaPassagemResponse");
    private final static QName _AtualizarReservaPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "atualizarReservaPassagem");
    private final static QName _SalvarReservaPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "salvarReservaPassagem");
    private final static QName _EncontrarReservaPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "encontrarReservaPassagemResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.reservaPassagem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AtualizarReservaPassagem }
     * 
     */
    public AtualizarReservaPassagem createAtualizarReservaPassagem() {
        return new AtualizarReservaPassagem();
    }

    /**
     * Create an instance of {@link SalvarReservaPassagem }
     * 
     */
    public SalvarReservaPassagem createSalvarReservaPassagem() {
        return new SalvarReservaPassagem();
    }

    /**
     * Create an instance of {@link SalvarReservaPassagemResponse }
     * 
     */
    public SalvarReservaPassagemResponse createSalvarReservaPassagemResponse() {
        return new SalvarReservaPassagemResponse();
    }

    /**
     * Create an instance of {@link AtualizarReservaPassagemResponse }
     * 
     */
    public AtualizarReservaPassagemResponse createAtualizarReservaPassagemResponse() {
        return new AtualizarReservaPassagemResponse();
    }

    /**
     * Create an instance of {@link RemoverReservaPassagem }
     * 
     */
    public RemoverReservaPassagem createRemoverReservaPassagem() {
        return new RemoverReservaPassagem();
    }

    /**
     * Create an instance of {@link EncontrarReservaPassagemResponse }
     * 
     */
    public EncontrarReservaPassagemResponse createEncontrarReservaPassagemResponse() {
        return new EncontrarReservaPassagemResponse();
    }

    /**
     * Create an instance of {@link ListarTodasReservaPassagem }
     * 
     */
    public ListarTodasReservaPassagem createListarTodasReservaPassagem() {
        return new ListarTodasReservaPassagem();
    }

    /**
     * Create an instance of {@link ListarTodasReservaPassagemResponse }
     * 
     */
    public ListarTodasReservaPassagemResponse createListarTodasReservaPassagemResponse() {
        return new ListarTodasReservaPassagemResponse();
    }

    /**
     * Create an instance of {@link EncontrarReservaPassagem }
     * 
     */
    public EncontrarReservaPassagem createEncontrarReservaPassagem() {
        return new EncontrarReservaPassagem();
    }

    /**
     * Create an instance of {@link RemoverReservaPassagemResponse }
     * 
     */
    public RemoverReservaPassagemResponse createRemoverReservaPassagemResponse() {
        return new RemoverReservaPassagemResponse();
    }

    /**
     * Create an instance of {@link ClienteId }
     * 
     */
    public ClienteId createClienteId() {
        return new ClienteId();
    }

    /**
     * Create an instance of {@link ReservaPassagem }
     * 
     */
    public ReservaPassagem createReservaPassagem() {
        return new ReservaPassagem();
    }

    /**
     * Create an instance of {@link PassagemId }
     * 
     */
    public PassagemId createPassagemId() {
        return new PassagemId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasReservaPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "listarTodasReservaPassagemResponse")
    public JAXBElement<ListarTodasReservaPassagemResponse> createListarTodasReservaPassagemResponse(ListarTodasReservaPassagemResponse value) {
        return new JAXBElement<ListarTodasReservaPassagemResponse>(_ListarTodasReservaPassagemResponse_QNAME, ListarTodasReservaPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasReservaPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "listarTodasReservaPassagem")
    public JAXBElement<ListarTodasReservaPassagem> createListarTodasReservaPassagem(ListarTodasReservaPassagem value) {
        return new JAXBElement<ListarTodasReservaPassagem>(_ListarTodasReservaPassagem_QNAME, ListarTodasReservaPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverReservaPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "removerReservaPassagemResponse")
    public JAXBElement<RemoverReservaPassagemResponse> createRemoverReservaPassagemResponse(RemoverReservaPassagemResponse value) {
        return new JAXBElement<RemoverReservaPassagemResponse>(_RemoverReservaPassagemResponse_QNAME, RemoverReservaPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarReservaPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "encontrarReservaPassagem")
    public JAXBElement<EncontrarReservaPassagem> createEncontrarReservaPassagem(EncontrarReservaPassagem value) {
        return new JAXBElement<EncontrarReservaPassagem>(_EncontrarReservaPassagem_QNAME, EncontrarReservaPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarReservaPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "atualizarReservaPassagemResponse")
    public JAXBElement<AtualizarReservaPassagemResponse> createAtualizarReservaPassagemResponse(AtualizarReservaPassagemResponse value) {
        return new JAXBElement<AtualizarReservaPassagemResponse>(_AtualizarReservaPassagemResponse_QNAME, AtualizarReservaPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverReservaPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "removerReservaPassagem")
    public JAXBElement<RemoverReservaPassagem> createRemoverReservaPassagem(RemoverReservaPassagem value) {
        return new JAXBElement<RemoverReservaPassagem>(_RemoverReservaPassagem_QNAME, RemoverReservaPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarReservaPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "salvarReservaPassagemResponse")
    public JAXBElement<SalvarReservaPassagemResponse> createSalvarReservaPassagemResponse(SalvarReservaPassagemResponse value) {
        return new JAXBElement<SalvarReservaPassagemResponse>(_SalvarReservaPassagemResponse_QNAME, SalvarReservaPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarReservaPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "atualizarReservaPassagem")
    public JAXBElement<AtualizarReservaPassagem> createAtualizarReservaPassagem(AtualizarReservaPassagem value) {
        return new JAXBElement<AtualizarReservaPassagem>(_AtualizarReservaPassagem_QNAME, AtualizarReservaPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarReservaPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "salvarReservaPassagem")
    public JAXBElement<SalvarReservaPassagem> createSalvarReservaPassagem(SalvarReservaPassagem value) {
        return new JAXBElement<SalvarReservaPassagem>(_SalvarReservaPassagem_QNAME, SalvarReservaPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarReservaPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "encontrarReservaPassagemResponse")
    public JAXBElement<EncontrarReservaPassagemResponse> createEncontrarReservaPassagemResponse(EncontrarReservaPassagemResponse value) {
        return new JAXBElement<EncontrarReservaPassagemResponse>(_EncontrarReservaPassagemResponse_QNAME, EncontrarReservaPassagemResponse.class, null, value);
    }

}
