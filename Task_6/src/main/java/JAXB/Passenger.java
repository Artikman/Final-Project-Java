
package JAXB;

import java.math.BigInteger;
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
 *         &lt;element ref="{}RemoteSystemPTCs"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PassengerAge" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PassengerCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="PassengerReference" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "remoteSystemPTCs"
})
@XmlRootElement(name = "Passenger")
public class Passenger {

    @XmlElement(name = "RemoteSystemPTCs", required = true)
    protected RemoteSystemPTCs remoteSystemPTCs;
    @XmlAttribute(name = "PassengerAge", required = true)
    protected BigInteger passengerAge;
    @XmlAttribute(name = "PassengerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String passengerCode;
    @XmlAttribute(name = "PassengerReference", required = true)
    protected BigInteger passengerReference;

    /**
     * Gets the value of the remoteSystemPTCs property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteSystemPTCs }
     *     
     */
    public RemoteSystemPTCs getRemoteSystemPTCs() {
        return remoteSystemPTCs;
    }

    /**
     * Sets the value of the remoteSystemPTCs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteSystemPTCs }
     *     
     */
    public void setRemoteSystemPTCs(RemoteSystemPTCs value) {
        this.remoteSystemPTCs = value;
    }

    /**
     * Gets the value of the passengerAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerAge() {
        return passengerAge;
    }

    /**
     * Sets the value of the passengerAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerAge(BigInteger value) {
        this.passengerAge = value;
    }

    /**
     * Gets the value of the passengerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerCode() {
        return passengerCode;
    }

    /**
     * Sets the value of the passengerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerCode(String value) {
        this.passengerCode = value;
    }

    /**
     * Gets the value of the passengerReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerReference() {
        return passengerReference;
    }

    /**
     * Sets the value of the passengerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerReference(BigInteger value) {
        this.passengerReference = value;
    }

}
