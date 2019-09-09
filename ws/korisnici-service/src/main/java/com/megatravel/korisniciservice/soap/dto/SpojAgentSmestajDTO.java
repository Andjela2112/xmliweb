//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.18 at 08:39:32 PM CEST 
//


package com.megatravel.korisniciservice.soap.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.megatravel.korisniciservice.model.SpojAgentSmestaj;


/**
 * <p>Java class for SpojAgentSmestajDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpojAgentSmestajDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="smestajId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpojAgentSmestajDTO", propOrder = {
    "id",
    "smestajId",
    "agentId"
})
public class SpojAgentSmestajDTO {

    protected long id;
    protected long smestajId;
    protected long agentId;

    public SpojAgentSmestajDTO() { }
    
    public SpojAgentSmestajDTO(SpojAgentSmestaj spoj) {
    	this.agentId = spoj.getAgent().getId();
    	this.smestajId = spoj.getSmestajId();
    	this.id = spoj.getId();
    }
    
    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the smestajId property.
     * 
     */
    public long getSmestajId() {
        return smestajId;
    }

    /**
     * Sets the value of the smestajId property.
     * 
     */
    public void setSmestajId(long value) {
        this.smestajId = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     */
    public long getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     */
    public void setAgentId(long value) {
        this.agentId = value;
    }

	public static List<SpojAgentSmestajDTO> transformisi(List<SpojAgentSmestaj> spojevi) {
		List<SpojAgentSmestajDTO> rezultat = new ArrayList<SpojAgentSmestajDTO>();
		for(SpojAgentSmestaj spoj : spojevi) {
			rezultat.add(new SpojAgentSmestajDTO(spoj));
		}
		return rezultat ;
	}

}