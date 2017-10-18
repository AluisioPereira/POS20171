
package br.edu.ifpb.pos.passagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de reservaPassagem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reservaPassagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://passagem.pos.ifpb.edu.br/}clienteId" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passagem" type="{http://passagem.pos.ifpb.edu.br/}passagemId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservaPassagem", propOrder = {
    "cliente",
    "id",
    "passagem"
})
public class ReservaPassagem {

    protected ClienteId cliente;
    protected int id;
    protected PassagemId passagem;

    /**
     * Obtém o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link ClienteId }
     *     
     */
    public ClienteId getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteId }
     *     
     */
    public void setCliente(ClienteId value) {
        this.cliente = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade passagem.
     * 
     * @return
     *     possible object is
     *     {@link PassagemId }
     *     
     */
    public PassagemId getPassagem() {
        return passagem;
    }

    /**
     * Define o valor da propriedade passagem.
     * 
     * @param value
     *     allowed object is
     *     {@link PassagemId }
     *     
     */
    public void setPassagem(PassagemId value) {
        this.passagem = value;
    }

}
