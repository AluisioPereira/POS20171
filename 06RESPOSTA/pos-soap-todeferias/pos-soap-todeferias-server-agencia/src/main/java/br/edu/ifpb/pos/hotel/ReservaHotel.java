
package br.edu.ifpb.pos.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de reservaHotel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reservaHotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://hotel.pos.ifpb.edu.br/}clienteId" minOccurs="0"/>
 *         &lt;element name="hotel" type="{http://hotel.pos.ifpb.edu.br/}hotelId" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservaHotel", propOrder = {
    "cliente",
    "hotel",
    "id"
})
public class ReservaHotel {

    protected ClienteId cliente;
    protected HotelId hotel;
    protected int id;

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
     * Obtém o valor da propriedade hotel.
     * 
     * @return
     *     possible object is
     *     {@link HotelId }
     *     
     */
    public HotelId getHotel() {
        return hotel;
    }

    /**
     * Define o valor da propriedade hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelId }
     *     
     */
    public void setHotel(HotelId value) {
        this.hotel = value;
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

}
