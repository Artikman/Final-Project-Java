
package JAXB;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Air"/>
 *         &lt;element ref="{}PricingInfo"/>
 *         &lt;element ref="{}TicketingInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "air",
    "pricingInfo",
    "ticketingInfo"
})
@XmlRootElement(name = "Itinerary")
public class Itinerary {

    @XmlElement(name = "Air", required = true)
    protected Air air;
    @XmlElement(name = "PricingInfo", required = true)
    protected PricingInfo pricingInfo;
    @XmlElement(name = "TicketingInfo", required = true)
    protected TicketingInfo ticketingInfo;

    /**
     * Gets the value of the air property.
     * 
     * @return
     *     possible object is
     *     {@link Air }
     *     
     */
    public Air getAir() {
        return air;
    }

    /**
     * Sets the value of the air property.
     * 
     * @param value
     *     allowed object is
     *     {@link Air }
     *     
     */
    public void setAir(Air value) {
        this.air = value;
    }

    /**
     * Gets the value of the pricingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInfo }
     *     
     */
    public PricingInfo getPricingInfo() {
        return pricingInfo;
    }

    /**
     * Sets the value of the pricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInfo }
     *     
     */
    public void setPricingInfo(PricingInfo value) {
        this.pricingInfo = value;
    }

    /**
     * Gets the value of the ticketingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfo }
     *     
     */
    public TicketingInfo getTicketingInfo() {
        return ticketingInfo;
    }

    /**
     * Sets the value of the ticketingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfo }
     *     
     */
    public void setTicketingInfo(TicketingInfo value) {
        this.ticketingInfo = value;
    }

}
