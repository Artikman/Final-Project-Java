
package JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}PassengerQuantity"/>
 *         &lt;element ref="{}BasisCodes"/>
 *         &lt;element ref="{}PassengerFare"/>
 *         &lt;element ref="{}Extension"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Source" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "passengerQuantity",
    "basisCodes",
    "passengerFare",
    "extension"
})
@XmlRootElement(name = "PTC")
public class PTC {

    @XmlElement(name = "PassengerQuantity", required = true)
    protected PassengerQuantity passengerQuantity;
    @XmlElement(name = "BasisCodes", required = true)
    protected BasisCodes basisCodes;
    @XmlElement(name = "PassengerFare", required = true)
    protected PassengerFare passengerFare;
    @XmlElement(name = "Extension", required = true)
    protected Extension extension;
    @XmlAttribute(name = "Source", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String source;

    /**
     * Gets the value of the passengerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerQuantity }
     *     
     */
    public PassengerQuantity getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Sets the value of the passengerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerQuantity }
     *     
     */
    public void setPassengerQuantity(PassengerQuantity value) {
        this.passengerQuantity = value;
    }

    /**
     * Gets the value of the basisCodes property.
     * 
     * @return
     *     possible object is
     *     {@link BasisCodes }
     *     
     */
    public BasisCodes getBasisCodes() {
        return basisCodes;
    }

    /**
     * Sets the value of the basisCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasisCodes }
     *     
     */
    public void setBasisCodes(BasisCodes value) {
        this.basisCodes = value;
    }

    /**
     * Gets the value of the passengerFare property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFare }
     *     
     */
    public PassengerFare getPassengerFare() {
        return passengerFare;
    }

    /**
     * Sets the value of the passengerFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFare }
     *     
     */
    public void setPassengerFare(PassengerFare value) {
        this.passengerFare = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Extension }
     *     
     */
    public Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extension }
     *     
     */
    public void setExtension(Extension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
