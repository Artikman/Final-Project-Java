
package JAXB;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Attributes"/>
 *           &lt;sequence>
 *             &lt;element ref="{}PricingSystem"/>
 *             &lt;element ref="{}Provider"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}FlightSupplementalInfo"/>
 *           &lt;element ref="{}BookingClassAvailability"/>
 *           &lt;element ref="{}Eticket"/>
 *           &lt;element ref="{}TerminalInformation"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}InventorySystem" minOccurs="0"/>
 *         &lt;element ref="{}Source" minOccurs="0"/>
 *         &lt;element ref="{}Base" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}TaxInfos"/>
 *           &lt;element ref="{}FeeInfos"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}Total"/>
 *           &lt;element ref="{}Segment" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}Passenger" minOccurs="0"/>
 *         &lt;element ref="{}Carrier" minOccurs="0"/>
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
    "attributes",
    "pricingSystem",
    "provider",
    "flightSupplementalInfo",
    "bookingClassAvailability",
    "eticket",
    "terminalInformation",
    "inventorySystem",
    "source",
    "base",
    "taxInfos",
    "feeInfos",
    "total",
    "segment",
    "passenger",
    "carrier"
})
@XmlRootElement(name = "Extension")
public class Extension {

    @XmlElement(name = "Attributes")
    protected Attributes attributes;
    @XmlElement(name = "PricingSystem")
    protected PricingSystem pricingSystem;
    @XmlElement(name = "Provider")
    protected Provider provider;
    @XmlElement(name = "FlightSupplementalInfo")
    protected FlightSupplementalInfo flightSupplementalInfo;
    @XmlElement(name = "BookingClassAvailability")
    protected BookingClassAvailability bookingClassAvailability;
    @XmlElement(name = "Eticket")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String eticket;
    @XmlElement(name = "TerminalInformation")
    protected TerminalInformation terminalInformation;
    @XmlElement(name = "InventorySystem")
    protected InventorySystem inventorySystem;
    @XmlElement(name = "Source")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String source;
    @XmlElement(name = "Base")
    protected Base base;
    @XmlElement(name = "TaxInfos")
    protected TaxInfos taxInfos;
    @XmlElement(name = "FeeInfos")
    protected FeeInfos feeInfos;
    @XmlElement(name = "Total")
    protected Total total;
    @XmlElement(name = "Segment")
    protected List<Segment> segment;
    @XmlElement(name = "Passenger")
    protected Passenger passenger;
    @XmlElement(name = "Carrier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String carrier;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the pricingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSystem }
     *     
     */
    public PricingSystem getPricingSystem() {
        return pricingSystem;
    }

    /**
     * Sets the value of the pricingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSystem }
     *     
     */
    public void setPricingSystem(PricingSystem value) {
        this.pricingSystem = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the flightSupplementalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSupplementalInfo }
     *     
     */
    public FlightSupplementalInfo getFlightSupplementalInfo() {
        return flightSupplementalInfo;
    }

    /**
     * Sets the value of the flightSupplementalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSupplementalInfo }
     *     
     */
    public void setFlightSupplementalInfo(FlightSupplementalInfo value) {
        this.flightSupplementalInfo = value;
    }

    /**
     * Gets the value of the bookingClassAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassAvailability }
     *     
     */
    public BookingClassAvailability getBookingClassAvailability() {
        return bookingClassAvailability;
    }

    /**
     * Sets the value of the bookingClassAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassAvailability }
     *     
     */
    public void setBookingClassAvailability(BookingClassAvailability value) {
        this.bookingClassAvailability = value;
    }

    /**
     * Gets the value of the eticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEticket() {
        return eticket;
    }

    /**
     * Sets the value of the eticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEticket(String value) {
        this.eticket = value;
    }

    /**
     * Gets the value of the terminalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalInformation }
     *     
     */
    public TerminalInformation getTerminalInformation() {
        return terminalInformation;
    }

    /**
     * Sets the value of the terminalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalInformation }
     *     
     */
    public void setTerminalInformation(TerminalInformation value) {
        this.terminalInformation = value;
    }

    /**
     * Gets the value of the inventorySystem property.
     * 
     * @return
     *     possible object is
     *     {@link InventorySystem }
     *     
     */
    public InventorySystem getInventorySystem() {
        return inventorySystem;
    }

    /**
     * Sets the value of the inventorySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventorySystem }
     *     
     */
    public void setInventorySystem(InventorySystem value) {
        this.inventorySystem = value;
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

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Base }
     *     
     */
    public Base getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base }
     *     
     */
    public void setBase(Base value) {
        this.base = value;
    }

    /**
     * Gets the value of the taxInfos property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfos }
     *     
     */
    public TaxInfos getTaxInfos() {
        return taxInfos;
    }

    /**
     * Sets the value of the taxInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfos }
     *     
     */
    public void setTaxInfos(TaxInfos value) {
        this.taxInfos = value;
    }

    /**
     * Gets the value of the feeInfos property.
     * 
     * @return
     *     possible object is
     *     {@link FeeInfos }
     *     
     */
    public FeeInfos getFeeInfos() {
        return feeInfos;
    }

    /**
     * Sets the value of the feeInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInfos }
     *     
     */
    public void setFeeInfos(FeeInfos value) {
        this.feeInfos = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Total }
     *     
     */
    public Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Total }
     *     
     */
    public void setTotal(Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment }
     * 
     * 
     */
    public List<Segment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment>();
        }
        return this.segment;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link Passenger }
     *     
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passenger }
     *     
     */
    public void setPassenger(Passenger value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

}
