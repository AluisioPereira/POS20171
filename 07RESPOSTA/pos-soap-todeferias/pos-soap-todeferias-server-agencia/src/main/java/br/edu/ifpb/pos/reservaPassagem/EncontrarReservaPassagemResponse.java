
package br.edu.ifpb.pos.reservaPassagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de encontrarReservaPassagemResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="encontrarReservaPassagemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://passagem.pos.ifpb.edu.br/}reservaPassagem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encontrarReservaPassagemResponse", propOrder = {
    "_return"
})
public class EncontrarReservaPassagemResponse {

    @XmlElement(name = "return")
    protected ReservaPassagem _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link ReservaPassagem }
     *     
     */
    public ReservaPassagem getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservaPassagem }
     *     
     */
    public void setReturn(ReservaPassagem value) {
        this._return = value;
    }

}
