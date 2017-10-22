
package br.edu.ifpb.pos.passagem;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.passagem package. 
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

    private final static QName _AtualizarPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "atualizarPassagemResponse");
    private final static QName _EncontrarPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "encontrarPassagemResponse");
    private final static QName _SalvarPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "salvarPassagemResponse");
    private final static QName _SalvarPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "salvarPassagem");
    private final static QName _ListarTodasPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "listarTodasPassagemResponse");
    private final static QName _AtualizarPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "atualizarPassagem");
    private final static QName _ListarTodasPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "listarTodasPassagem");
    private final static QName _RemoverPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "removerPassagem");
    private final static QName _RemoverPassagemResponse_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "removerPassagemResponse");
    private final static QName _EncontrarPassagem_QNAME = new QName("http://passagem.pos.ifpb.edu.br/", "encontrarPassagem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.passagem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AtualizarPassagem }
     * 
     */
    public AtualizarPassagem createAtualizarPassagem() {
        return new AtualizarPassagem();
    }

    /**
     * Create an instance of {@link ListarTodasPassagem }
     * 
     */
    public ListarTodasPassagem createListarTodasPassagem() {
        return new ListarTodasPassagem();
    }

    /**
     * Create an instance of {@link RemoverPassagem }
     * 
     */
    public RemoverPassagem createRemoverPassagem() {
        return new RemoverPassagem();
    }

    /**
     * Create an instance of {@link ListarTodasPassagemResponse }
     * 
     */
    public ListarTodasPassagemResponse createListarTodasPassagemResponse() {
        return new ListarTodasPassagemResponse();
    }

    /**
     * Create an instance of {@link SalvarPassagem }
     * 
     */
    public SalvarPassagem createSalvarPassagem() {
        return new SalvarPassagem();
    }

    /**
     * Create an instance of {@link SalvarPassagemResponse }
     * 
     */
    public SalvarPassagemResponse createSalvarPassagemResponse() {
        return new SalvarPassagemResponse();
    }

    /**
     * Create an instance of {@link EncontrarPassagem }
     * 
     */
    public EncontrarPassagem createEncontrarPassagem() {
        return new EncontrarPassagem();
    }

    /**
     * Create an instance of {@link RemoverPassagemResponse }
     * 
     */
    public RemoverPassagemResponse createRemoverPassagemResponse() {
        return new RemoverPassagemResponse();
    }

    /**
     * Create an instance of {@link AtualizarPassagemResponse }
     * 
     */
    public AtualizarPassagemResponse createAtualizarPassagemResponse() {
        return new AtualizarPassagemResponse();
    }

    /**
     * Create an instance of {@link EncontrarPassagemResponse }
     * 
     */
    public EncontrarPassagemResponse createEncontrarPassagemResponse() {
        return new EncontrarPassagemResponse();
    }

    /**
     * Create an instance of {@link Passagem }
     * 
     */
    public Passagem createPassagem() {
        return new Passagem();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "atualizarPassagemResponse")
    public JAXBElement<AtualizarPassagemResponse> createAtualizarPassagemResponse(AtualizarPassagemResponse value) {
        return new JAXBElement<AtualizarPassagemResponse>(_AtualizarPassagemResponse_QNAME, AtualizarPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "encontrarPassagemResponse")
    public JAXBElement<EncontrarPassagemResponse> createEncontrarPassagemResponse(EncontrarPassagemResponse value) {
        return new JAXBElement<EncontrarPassagemResponse>(_EncontrarPassagemResponse_QNAME, EncontrarPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "salvarPassagemResponse")
    public JAXBElement<SalvarPassagemResponse> createSalvarPassagemResponse(SalvarPassagemResponse value) {
        return new JAXBElement<SalvarPassagemResponse>(_SalvarPassagemResponse_QNAME, SalvarPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "salvarPassagem")
    public JAXBElement<SalvarPassagem> createSalvarPassagem(SalvarPassagem value) {
        return new JAXBElement<SalvarPassagem>(_SalvarPassagem_QNAME, SalvarPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "listarTodasPassagemResponse")
    public JAXBElement<ListarTodasPassagemResponse> createListarTodasPassagemResponse(ListarTodasPassagemResponse value) {
        return new JAXBElement<ListarTodasPassagemResponse>(_ListarTodasPassagemResponse_QNAME, ListarTodasPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "atualizarPassagem")
    public JAXBElement<AtualizarPassagem> createAtualizarPassagem(AtualizarPassagem value) {
        return new JAXBElement<AtualizarPassagem>(_AtualizarPassagem_QNAME, AtualizarPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "listarTodasPassagem")
    public JAXBElement<ListarTodasPassagem> createListarTodasPassagem(ListarTodasPassagem value) {
        return new JAXBElement<ListarTodasPassagem>(_ListarTodasPassagem_QNAME, ListarTodasPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "removerPassagem")
    public JAXBElement<RemoverPassagem> createRemoverPassagem(RemoverPassagem value) {
        return new JAXBElement<RemoverPassagem>(_RemoverPassagem_QNAME, RemoverPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "removerPassagemResponse")
    public JAXBElement<RemoverPassagemResponse> createRemoverPassagemResponse(RemoverPassagemResponse value) {
        return new JAXBElement<RemoverPassagemResponse>(_RemoverPassagemResponse_QNAME, RemoverPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://passagem.pos.ifpb.edu.br/", name = "encontrarPassagem")
    public JAXBElement<EncontrarPassagem> createEncontrarPassagem(EncontrarPassagem value) {
        return new JAXBElement<EncontrarPassagem>(_EncontrarPassagem_QNAME, EncontrarPassagem.class, null, value);
    }

}
