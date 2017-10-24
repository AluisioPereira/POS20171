
package br.edu.ifpb.pos.biblioteca;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.biblioteca package. 
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

    private final static QName _AtualizarLivro_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "atualizarLivro");
    private final static QName _RemoverAutor_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "removerAutor");
    private final static QName _ListarTodasLivro_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "listarTodasLivro");
    private final static QName _RemoverAutorResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "removerAutorResponse");
    private final static QName _SalvarAutorResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "salvarAutorResponse");
    private final static QName _EncontrarAutor_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "encontrarAutor");
    private final static QName _AtualizarLivroResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "atualizarLivroResponse");
    private final static QName _ListarTodasAutorResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "listarTodasAutorResponse");
    private final static QName _AtualizarAutorResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "atualizarAutorResponse");
    private final static QName _EncontrarLivro_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "encontrarLivro");
    private final static QName _RemoverLivroResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "removerLivroResponse");
    private final static QName _EncontrarAutorResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "encontrarAutorResponse");
    private final static QName _ListarTodasLivroResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "listarTodasLivroResponse");
    private final static QName _SalvarAutor_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "salvarAutor");
    private final static QName _SalvarLivro_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "salvarLivro");
    private final static QName _SalvarLivroResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "salvarLivroResponse");
    private final static QName _EncontrarLivroResponse_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "encontrarLivroResponse");
    private final static QName _AtualizarAutor_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "atualizarAutor");
    private final static QName _ListarTodasAutor_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "listarTodasAutor");
    private final static QName _RemoverLivro_QNAME = new QName("http://atividade4.server.soap.pos.pos.ifpb.edu.br/", "removerLivro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.biblioteca
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AtualizarLivro }
     * 
     */
    public AtualizarLivro createAtualizarLivro() {
        return new AtualizarLivro();
    }

    /**
     * Create an instance of {@link EncontrarLivro }
     * 
     */
    public EncontrarLivro createEncontrarLivro() {
        return new EncontrarLivro();
    }

    /**
     * Create an instance of {@link AtualizarAutorResponse }
     * 
     */
    public AtualizarAutorResponse createAtualizarAutorResponse() {
        return new AtualizarAutorResponse();
    }

    /**
     * Create an instance of {@link AtualizarLivroResponse }
     * 
     */
    public AtualizarLivroResponse createAtualizarLivroResponse() {
        return new AtualizarLivroResponse();
    }

    /**
     * Create an instance of {@link ListarTodasAutorResponse }
     * 
     */
    public ListarTodasAutorResponse createListarTodasAutorResponse() {
        return new ListarTodasAutorResponse();
    }

    /**
     * Create an instance of {@link EncontrarAutor }
     * 
     */
    public EncontrarAutor createEncontrarAutor() {
        return new EncontrarAutor();
    }

    /**
     * Create an instance of {@link SalvarAutorResponse }
     * 
     */
    public SalvarAutorResponse createSalvarAutorResponse() {
        return new SalvarAutorResponse();
    }

    /**
     * Create an instance of {@link ListarTodasLivro }
     * 
     */
    public ListarTodasLivro createListarTodasLivro() {
        return new ListarTodasLivro();
    }

    /**
     * Create an instance of {@link RemoverAutorResponse }
     * 
     */
    public RemoverAutorResponse createRemoverAutorResponse() {
        return new RemoverAutorResponse();
    }

    /**
     * Create an instance of {@link RemoverAutor }
     * 
     */
    public RemoverAutor createRemoverAutor() {
        return new RemoverAutor();
    }

    /**
     * Create an instance of {@link SalvarLivro }
     * 
     */
    public SalvarLivro createSalvarLivro() {
        return new SalvarLivro();
    }

    /**
     * Create an instance of {@link SalvarLivroResponse }
     * 
     */
    public SalvarLivroResponse createSalvarLivroResponse() {
        return new SalvarLivroResponse();
    }

    /**
     * Create an instance of {@link EncontrarAutorResponse }
     * 
     */
    public EncontrarAutorResponse createEncontrarAutorResponse() {
        return new EncontrarAutorResponse();
    }

    /**
     * Create an instance of {@link ListarTodasLivroResponse }
     * 
     */
    public ListarTodasLivroResponse createListarTodasLivroResponse() {
        return new ListarTodasLivroResponse();
    }

    /**
     * Create an instance of {@link SalvarAutor }
     * 
     */
    public SalvarAutor createSalvarAutor() {
        return new SalvarAutor();
    }

    /**
     * Create an instance of {@link RemoverLivroResponse }
     * 
     */
    public RemoverLivroResponse createRemoverLivroResponse() {
        return new RemoverLivroResponse();
    }

    /**
     * Create an instance of {@link ListarTodasAutor }
     * 
     */
    public ListarTodasAutor createListarTodasAutor() {
        return new ListarTodasAutor();
    }

    /**
     * Create an instance of {@link RemoverLivro }
     * 
     */
    public RemoverLivro createRemoverLivro() {
        return new RemoverLivro();
    }

    /**
     * Create an instance of {@link AtualizarAutor }
     * 
     */
    public AtualizarAutor createAtualizarAutor() {
        return new AtualizarAutor();
    }

    /**
     * Create an instance of {@link EncontrarLivroResponse }
     * 
     */
    public EncontrarLivroResponse createEncontrarLivroResponse() {
        return new EncontrarLivroResponse();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "atualizarLivro")
    public JAXBElement<AtualizarLivro> createAtualizarLivro(AtualizarLivro value) {
        return new JAXBElement<AtualizarLivro>(_AtualizarLivro_QNAME, AtualizarLivro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "removerAutor")
    public JAXBElement<RemoverAutor> createRemoverAutor(RemoverAutor value) {
        return new JAXBElement<RemoverAutor>(_RemoverAutor_QNAME, RemoverAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "listarTodasLivro")
    public JAXBElement<ListarTodasLivro> createListarTodasLivro(ListarTodasLivro value) {
        return new JAXBElement<ListarTodasLivro>(_ListarTodasLivro_QNAME, ListarTodasLivro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "removerAutorResponse")
    public JAXBElement<RemoverAutorResponse> createRemoverAutorResponse(RemoverAutorResponse value) {
        return new JAXBElement<RemoverAutorResponse>(_RemoverAutorResponse_QNAME, RemoverAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "salvarAutorResponse")
    public JAXBElement<SalvarAutorResponse> createSalvarAutorResponse(SalvarAutorResponse value) {
        return new JAXBElement<SalvarAutorResponse>(_SalvarAutorResponse_QNAME, SalvarAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "encontrarAutor")
    public JAXBElement<EncontrarAutor> createEncontrarAutor(EncontrarAutor value) {
        return new JAXBElement<EncontrarAutor>(_EncontrarAutor_QNAME, EncontrarAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "atualizarLivroResponse")
    public JAXBElement<AtualizarLivroResponse> createAtualizarLivroResponse(AtualizarLivroResponse value) {
        return new JAXBElement<AtualizarLivroResponse>(_AtualizarLivroResponse_QNAME, AtualizarLivroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "listarTodasAutorResponse")
    public JAXBElement<ListarTodasAutorResponse> createListarTodasAutorResponse(ListarTodasAutorResponse value) {
        return new JAXBElement<ListarTodasAutorResponse>(_ListarTodasAutorResponse_QNAME, ListarTodasAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "atualizarAutorResponse")
    public JAXBElement<AtualizarAutorResponse> createAtualizarAutorResponse(AtualizarAutorResponse value) {
        return new JAXBElement<AtualizarAutorResponse>(_AtualizarAutorResponse_QNAME, AtualizarAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "encontrarLivro")
    public JAXBElement<EncontrarLivro> createEncontrarLivro(EncontrarLivro value) {
        return new JAXBElement<EncontrarLivro>(_EncontrarLivro_QNAME, EncontrarLivro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "removerLivroResponse")
    public JAXBElement<RemoverLivroResponse> createRemoverLivroResponse(RemoverLivroResponse value) {
        return new JAXBElement<RemoverLivroResponse>(_RemoverLivroResponse_QNAME, RemoverLivroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "encontrarAutorResponse")
    public JAXBElement<EncontrarAutorResponse> createEncontrarAutorResponse(EncontrarAutorResponse value) {
        return new JAXBElement<EncontrarAutorResponse>(_EncontrarAutorResponse_QNAME, EncontrarAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "listarTodasLivroResponse")
    public JAXBElement<ListarTodasLivroResponse> createListarTodasLivroResponse(ListarTodasLivroResponse value) {
        return new JAXBElement<ListarTodasLivroResponse>(_ListarTodasLivroResponse_QNAME, ListarTodasLivroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "salvarAutor")
    public JAXBElement<SalvarAutor> createSalvarAutor(SalvarAutor value) {
        return new JAXBElement<SalvarAutor>(_SalvarAutor_QNAME, SalvarAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "salvarLivro")
    public JAXBElement<SalvarLivro> createSalvarLivro(SalvarLivro value) {
        return new JAXBElement<SalvarLivro>(_SalvarLivro_QNAME, SalvarLivro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "salvarLivroResponse")
    public JAXBElement<SalvarLivroResponse> createSalvarLivroResponse(SalvarLivroResponse value) {
        return new JAXBElement<SalvarLivroResponse>(_SalvarLivroResponse_QNAME, SalvarLivroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "encontrarLivroResponse")
    public JAXBElement<EncontrarLivroResponse> createEncontrarLivroResponse(EncontrarLivroResponse value) {
        return new JAXBElement<EncontrarLivroResponse>(_EncontrarLivroResponse_QNAME, EncontrarLivroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "atualizarAutor")
    public JAXBElement<AtualizarAutor> createAtualizarAutor(AtualizarAutor value) {
        return new JAXBElement<AtualizarAutor>(_AtualizarAutor_QNAME, AtualizarAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "listarTodasAutor")
    public JAXBElement<ListarTodasAutor> createListarTodasAutor(ListarTodasAutor value) {
        return new JAXBElement<ListarTodasAutor>(_ListarTodasAutor_QNAME, ListarTodasAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", name = "removerLivro")
    public JAXBElement<RemoverLivro> createRemoverLivro(RemoverLivro value) {
        return new JAXBElement<RemoverLivro>(_RemoverLivro_QNAME, RemoverLivro.class, null, value);
    }

}
