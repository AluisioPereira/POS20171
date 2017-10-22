
package br.edu.ifpb.pos.passagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de passagemId complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="passagemId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnpjEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passagemId", propOrder = {
    "cnpjEmpresa"
})
public class PassagemId {

    protected String cnpjEmpresa;

    /**
     * Obtém o valor da propriedade cnpjEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    /**
     * Define o valor da propriedade cnpjEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjEmpresa(String value) {
        this.cnpjEmpresa = value;
    }

}
