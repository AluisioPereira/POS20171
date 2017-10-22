
package br.edu.ifpb.pos.biblioteca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de salvarLivro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salvarLivro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://atividade4.server.soap.pos.pos.ifpb.edu.br/}livro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salvarLivro", propOrder = {
    "arg0"
})
public class SalvarLivro {

    protected Livro arg0;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link Livro }
     *     
     */
    public Livro getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Livro }
     *     
     */
    public void setArg0(Livro value) {
        this.arg0 = value;
    }

}
