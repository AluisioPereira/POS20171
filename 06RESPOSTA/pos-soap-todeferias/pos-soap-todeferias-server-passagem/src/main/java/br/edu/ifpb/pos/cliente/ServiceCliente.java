
package br.edu.ifpb.pos.cliente;

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
@WebService(name = "ServiceCliente", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceCliente {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "encontrarCliente", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.EncontrarCliente")
    @ResponseWrapper(localName = "encontrarClienteResponse", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.EncontrarClienteResponse")
    public void encontrarCliente(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvarCliente", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.SalvarCliente")
    @ResponseWrapper(localName = "salvarClienteResponse", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.SalvarClienteResponse")
    public void salvarCliente(
        @WebParam(name = "arg0", targetNamespace = "")
        Cliente arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "atualizarCliente", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.AtualizarCliente")
    @ResponseWrapper(localName = "atualizarClienteResponse", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.AtualizarClienteResponse")
    public void atualizarCliente(
        @WebParam(name = "arg0", targetNamespace = "")
        Cliente arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removerCliente", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.RemoverCliente")
    @ResponseWrapper(localName = "removerClienteResponse", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.RemoverClienteResponse")
    public void removerCliente(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.pos.cliente.Cliente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarTodasCliente", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.ListarTodasCliente")
    @ResponseWrapper(localName = "listarTodasClienteResponse", targetNamespace = "http://cliente.server.todeferias.soap.pos.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.cliente.ListarTodasClienteResponse")
    public List<Cliente> listarTodasCliente();

}
