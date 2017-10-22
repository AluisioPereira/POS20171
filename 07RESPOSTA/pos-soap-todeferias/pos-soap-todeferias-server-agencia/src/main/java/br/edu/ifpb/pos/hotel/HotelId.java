
package br.edu.ifpb.pos.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de hotelId complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="hotelId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnpjHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelId", propOrder = {
    "cnpjHotel"
})
public class HotelId {

    protected String cnpjHotel;

    /**
     * Obtém o valor da propriedade cnpjHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjHotel() {
        return cnpjHotel;
    }

    /**
     * Define o valor da propriedade cnpjHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjHotel(String value) {
        this.cnpjHotel = value;
    }

}
