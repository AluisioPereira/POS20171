
package br.edu.ifpb.pos.biblioteca;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Biblioteca", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Biblioteca {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "encontrarLivro", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.EncontrarLivro")
    @ResponseWrapper(localName = "encontrarLivroResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.EncontrarLivroResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/encontrarLivroRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/encontrarLivroResponse")
    public void encontrarLivro(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removerLivro", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.RemoverLivro")
    @ResponseWrapper(localName = "removerLivroResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.RemoverLivroResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/removerLivroRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/removerLivroResponse")
    public void removerLivro(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "atualizarAutor", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.AtualizarAutor")
    @ResponseWrapper(localName = "atualizarAutorResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.AtualizarAutorResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/atualizarAutorRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/atualizarAutorResponse")
    public void atualizarAutor(
        @WebParam(name = "arg0", targetNamespace = "")
        Autor arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.pos.biblioteca.Livro>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarTodasLivro", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.ListarTodasLivro")
    @ResponseWrapper(localName = "listarTodasLivroResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.ListarTodasLivroResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/listarTodasLivroRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/listarTodasLivroResponse")
    public List<Livro> listarTodasLivro();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvarAutor", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.SalvarAutor")
    @ResponseWrapper(localName = "salvarAutorResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.SalvarAutorResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/salvarAutorRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/salvarAutorResponse")
    public void salvarAutor(
        @WebParam(name = "arg0", targetNamespace = "")
        Autor arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "atualizarLivro", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.AtualizarLivro")
    @ResponseWrapper(localName = "atualizarLivroResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.AtualizarLivroResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/atualizarLivroRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/atualizarLivroResponse")
    public void atualizarLivro(
        @WebParam(name = "arg0", targetNamespace = "")
        Livro arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "encontrarAutor", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.EncontrarAutor")
    @ResponseWrapper(localName = "encontrarAutorResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.EncontrarAutorResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/encontrarAutorRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/encontrarAutorResponse")
    public void encontrarAutor(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.pos.biblioteca.Autor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarTodasAutor", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.ListarTodasAutor")
    @ResponseWrapper(localName = "listarTodasAutorResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.ListarTodasAutorResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/listarTodasAutorRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/listarTodasAutorResponse")
    public List<Autor> listarTodasAutor();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removerAutor", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.RemoverAutor")
    @ResponseWrapper(localName = "removerAutorResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.RemoverAutorResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/removerAutorRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/removerAutorResponse")
    public void removerAutor(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvarLivro", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.SalvarLivro")
    @ResponseWrapper(localName = "salvarLivroResponse", targetNamespace = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.biblioteca.SalvarLivroResponse")
    @Action(input = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/salvarLivroRequest", output = "http://atividade4.server.soap.pos.pos.ifpb.edu.br/Biblioteca/salvarLivroResponse")
    public void salvarLivro(
        @WebParam(name = "arg0", targetNamespace = "")
        Livro arg0);

}