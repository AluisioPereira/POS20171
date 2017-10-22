
package br.edu.ifpb.pos.passagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de salvarPassagem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salvarPassagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://passagem.pos.ifpb.edu.br/}passagem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salvarPassagem", propOrder = {
    "arg0"
})
public class SalvarPassagem {

    protected Passagem arg0;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link Passagem }
     *     
     */
    public Passagem getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Passagem }
     *     
     */
    public void setArg0(Passagem value) {
        this.arg0 = value;
    }

}
