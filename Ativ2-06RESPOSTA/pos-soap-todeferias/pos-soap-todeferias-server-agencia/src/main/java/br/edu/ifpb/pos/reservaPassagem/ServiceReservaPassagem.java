
package br.edu.ifpb.pos.reservaPassagem;

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
@WebService(name = "ServiceReservaPassagem", targetNamespace = "http://passagem.pos.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceReservaPassagem {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "atualizarReservaPassagem", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.AtualizarReservaPassagem")
    @ResponseWrapper(localName = "atualizarReservaPassagemResponse", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.AtualizarReservaPassagemResponse")
    public void atualizarReservaPassagem(
        @WebParam(name = "arg0", targetNamespace = "")
        ReservaPassagem arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removerReservaPassagem", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.RemoverReservaPassagem")
    @ResponseWrapper(localName = "removerReservaPassagemResponse", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.RemoverReservaPassagemResponse")
    public void removerReservaPassagem(
        @WebParam(name = "arg0", targetNamespace = "")
        ReservaPassagem arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.pos.reservaPassagem.ReservaPassagem>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarTodasReservaPassagem", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.ListarTodasReservaPassagem")
    @ResponseWrapper(localName = "listarTodasReservaPassagemResponse", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.ListarTodasReservaPassagemResponse")
    public List<ReservaPassagem> listarTodasReservaPassagem();

    /**
     * 
     * @param arg0
     * @return
     *     returns br.edu.ifpb.pos.reservaPassagem.ReservaPassagem
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarReservaPassagem", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.EncontrarReservaPassagem")
    @ResponseWrapper(localName = "encontrarReservaPassagemResponse", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.EncontrarReservaPassagemResponse")
    public ReservaPassagem encontrarReservaPassagem(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvarReservaPassagem", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.SalvarReservaPassagem")
    @ResponseWrapper(localName = "salvarReservaPassagemResponse", targetNamespace = "http://passagem.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.reservaPassagem.SalvarReservaPassagemResponse")
    public void salvarReservaPassagem(
        @WebParam(name = "arg0", targetNamespace = "")
        ReservaPassagem arg0);

}
