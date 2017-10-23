
package br.edu.ifpb.pos.passagem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de passagem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="passagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnpjEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataHoraChegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataHoraSaida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroPoutrona" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reservas" type="{http://passagem.pos.ifpb.edu.br/}reservaPassagem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passagem", propOrder = {
    "cnpjEmpresa",
    "dataHoraChegada",
    "dataHoraSaida",
    "destino",
    "id",
    "numeroPoutrona",
    "origem",
    "reservas"
})
public class Passagem {

    protected String cnpjEmpresa;
    protected String dataHoraChegada;
    protected String dataHoraSaida;
    protected String destino;
    protected int id;
    protected int numeroPoutrona;
    protected String origem;
    @XmlElement(nillable = true)
    protected List<ReservaPassagem> reservas;

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

    /**
     * Obtém o valor da propriedade dataHoraChegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHoraChegada() {
        return dataHoraChegada;
    }

    /**
     * Define o valor da propriedade dataHoraChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHoraChegada(String value) {
        this.dataHoraChegada = value;
    }

    /**
     * Obtém o valor da propriedade dataHoraSaida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    /**
     * Define o valor da propriedade dataHoraSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHoraSaida(String value) {
        this.dataHoraSaida = value;
    }

    /**
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
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
     * Obtém o valor da propriedade numeroPoutrona.
     * 
     */
    public int getNumeroPoutrona() {
        return numeroPoutrona;
    }

    /**
     * Define o valor da propriedade numeroPoutrona.
     * 
     */
    public void setNumeroPoutrona(int value) {
        this.numeroPoutrona = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Gets the value of the reservas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservaPassagem }
     * 
     * 
     */
    public List<ReservaPassagem> getReservas() {
        if (reservas == null) {
            reservas = new ArrayList<ReservaPassagem>();
        }
        return this.reservas;
    }

}
