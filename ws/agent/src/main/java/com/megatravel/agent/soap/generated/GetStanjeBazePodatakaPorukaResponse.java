//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.19 at 01:18:09 PM CEST 
//


package com.megatravel.agent.soap.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poruke" type="{http://www.megatravel.com/porukeservice/soap/dto}PorukaDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "poruke"
})
@XmlRootElement(name = "getStanjeBazePodatakaPorukaResponse", namespace = "http://www.megatravel.com/porukeservice/soap/dto")
public class GetStanjeBazePodatakaPorukaResponse {

    @XmlElement(namespace = "http://www.megatravel.com/porukeservice/soap/dto")
    protected List<PorukaDTO> poruke;

    /**
     * Gets the value of the poruke property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poruke property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoruke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PorukaDTO }
     * 
     * 
     */
    public List<PorukaDTO> getPoruke() {
        if (poruke == null) {
            poruke = new ArrayList<PorukaDTO>();
        }
        return this.poruke;
    }

}
