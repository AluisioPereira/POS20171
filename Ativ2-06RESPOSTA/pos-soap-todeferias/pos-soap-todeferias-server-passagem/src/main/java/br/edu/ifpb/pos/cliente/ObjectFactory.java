
package br.edu.ifpb.pos.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.cliente package. 
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

    private final static QName _ListarTodasCliente_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "listarTodasCliente");
    private final static QName _AtualizarCliente_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "atualizarCliente");
    private final static QName _ListarTodasClienteResponse_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "listarTodasClienteResponse");
    private final static QName _AtualizarClienteResponse_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "atualizarClienteResponse");
    private final static QName _EncontrarClienteResponse_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "encontrarClienteResponse");
    private final static QName _RemoverClienteResponse_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "removerClienteResponse");
    private final static QName _SalvarCliente_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "salvarCliente");
    private final static QName _EncontrarCliente_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "encontrarCliente");
    private final static QName _RemoverCliente_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "removerCliente");
    private final static QName _SalvarClienteResponse_QNAME = new QName("http://cliente.pos.ifpb.edu.br/", "salvarClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AtualizarCliente }
     * 
     */
    public AtualizarCliente createAtualizarCliente() {
        return new AtualizarCliente();
    }

    /**
     * Create an instance of {@link ListarTodasClienteResponse }
     * 
     */
    public ListarTodasClienteResponse createListarTodasClienteResponse() {
        return new ListarTodasClienteResponse();
    }

    /**
     * Create an instance of {@link ListarTodasCliente }
     * 
     */
    public ListarTodasCliente createListarTodasCliente() {
        return new ListarTodasCliente();
    }

    /**
     * Create an instance of {@link RemoverClienteResponse }
     * 
     */
    public RemoverClienteResponse createRemoverClienteResponse() {
        return new RemoverClienteResponse();
    }

    /**
     * Create an instance of {@link SalvarCliente }
     * 
     */
    public SalvarCliente createSalvarCliente() {
        return new SalvarCliente();
    }

    /**
     * Create an instance of {@link EncontrarCliente }
     * 
     */
    public EncontrarCliente createEncontrarCliente() {
        return new EncontrarCliente();
    }

    /**
     * Create an instance of {@link RemoverCliente }
     * 
     */
    public RemoverCliente createRemoverCliente() {
        return new RemoverCliente();
    }

    /**
     * Create an instance of {@link SalvarClienteResponse }
     * 
     */
    public SalvarClienteResponse createSalvarClienteResponse() {
        return new SalvarClienteResponse();
    }

    /**
     * Create an instance of {@link AtualizarClienteResponse }
     * 
     */
    public AtualizarClienteResponse createAtualizarClienteResponse() {
        return new AtualizarClienteResponse();
    }

    /**
     * Create an instance of {@link EncontrarClienteResponse }
     * 
     */
    public EncontrarClienteResponse createEncontrarClienteResponse() {
        return new EncontrarClienteResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "listarTodasCliente")
    public JAXBElement<ListarTodasCliente> createListarTodasCliente(ListarTodasCliente value) {
        return new JAXBElement<ListarTodasCliente>(_ListarTodasCliente_QNAME, ListarTodasCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "atualizarCliente")
    public JAXBElement<AtualizarCliente> createAtualizarCliente(AtualizarCliente value) {
        return new JAXBElement<AtualizarCliente>(_AtualizarCliente_QNAME, AtualizarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "listarTodasClienteResponse")
    public JAXBElement<ListarTodasClienteResponse> createListarTodasClienteResponse(ListarTodasClienteResponse value) {
        return new JAXBElement<ListarTodasClienteResponse>(_ListarTodasClienteResponse_QNAME, ListarTodasClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "atualizarClienteResponse")
    public JAXBElement<AtualizarClienteResponse> createAtualizarClienteResponse(AtualizarClienteResponse value) {
        return new JAXBElement<AtualizarClienteResponse>(_AtualizarClienteResponse_QNAME, AtualizarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "encontrarClienteResponse")
    public JAXBElement<EncontrarClienteResponse> createEncontrarClienteResponse(EncontrarClienteResponse value) {
        return new JAXBElement<EncontrarClienteResponse>(_EncontrarClienteResponse_QNAME, EncontrarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "removerClienteResponse")
    public JAXBElement<RemoverClienteResponse> createRemoverClienteResponse(RemoverClienteResponse value) {
        return new JAXBElement<RemoverClienteResponse>(_RemoverClienteResponse_QNAME, RemoverClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "salvarCliente")
    public JAXBElement<SalvarCliente> createSalvarCliente(SalvarCliente value) {
        return new JAXBElement<SalvarCliente>(_SalvarCliente_QNAME, SalvarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "encontrarCliente")
    public JAXBElement<EncontrarCliente> createEncontrarCliente(EncontrarCliente value) {
        return new JAXBElement<EncontrarCliente>(_EncontrarCliente_QNAME, EncontrarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "removerCliente")
    public JAXBElement<RemoverCliente> createRemoverCliente(RemoverCliente value) {
        return new JAXBElement<RemoverCliente>(_RemoverCliente_QNAME, RemoverCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.pos.ifpb.edu.br/", name = "salvarClienteResponse")
    public JAXBElement<SalvarClienteResponse> createSalvarClienteResponse(SalvarClienteResponse value) {
        return new JAXBElement<SalvarClienteResponse>(_SalvarClienteResponse_QNAME, SalvarClienteResponse.class, null, value);
    }

}
