
package JAXB;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the JAXB package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Eticket_QNAME = new QName("", "Eticket");
    private final static QName _Terminal_QNAME = new QName("", "terminal");
    private final static QName _Carrier_QNAME = new QName("", "Carrier");
    private final static QName _DepartureDate_QNAME = new QName("", "DepartureDate");
    private final static QName _Source_QNAME = new QName("", "Source");
    private final static QName _FareReference_QNAME = new QName("", "FareReference");
    private final static QName _BasisCode_QNAME = new QName("", "BasisCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: JAXB
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link Extension }
     * 
     */
    public Extension createExtension() {
        return new Extension();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link PricingSystem }
     * 
     */
    public PricingSystem createPricingSystem() {
        return new PricingSystem();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link FlightSupplementalInfo }
     * 
     */
    public FlightSupplementalInfo createFlightSupplementalInfo() {
        return new FlightSupplementalInfo();
    }

    /**
     * Create an instance of {@link BookingClassAvailability }
     * 
     */
    public BookingClassAvailability createBookingClassAvailability() {
        return new BookingClassAvailability();
    }

    /**
     * Create an instance of {@link TerminalInformation }
     * 
     */
    public TerminalInformation createTerminalInformation() {
        return new TerminalInformation();
    }

    /**
     * Create an instance of {@link InventorySystem }
     * 
     */
    public InventorySystem createInventorySystem() {
        return new InventorySystem();
    }

    /**
     * Create an instance of {@link Base }
     * 
     */
    public Base createBase() {
        return new Base();
    }

    /**
     * Create an instance of {@link TaxInfos }
     * 
     */
    public TaxInfos createTaxInfos() {
        return new TaxInfos();
    }

    /**
     * Create an instance of {@link TaxInfo }
     * 
     */
    public TaxInfo createTaxInfo() {
        return new TaxInfo();
    }

    /**
     * Create an instance of {@link FeeInfos }
     * 
     */
    public FeeInfos createFeeInfos() {
        return new FeeInfos();
    }

    /**
     * Create an instance of {@link FeeInfo }
     * 
     */
    public FeeInfo createFeeInfo() {
        return new FeeInfo();
    }

    /**
     * Create an instance of {@link Total }
     * 
     */
    public Total createTotal() {
        return new Total();
    }

    /**
     * Create an instance of {@link Taxes }
     * 
     */
    public Taxes createTaxes() {
        return new Taxes();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link Fees }
     * 
     */
    public Fees createFees() {
        return new Fees();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link RemoteSystemPTCs }
     * 
     */
    public RemoteSystemPTCs createRemoteSystemPTCs() {
        return new RemoteSystemPTCs();
    }

    /**
     * Create an instance of {@link FareInfo }
     * 
     */
    public FareInfo createFareInfo() {
        return new FareInfo();
    }

    /**
     * Create an instance of {@link PassengerFare }
     * 
     */
    public PassengerFare createPassengerFare() {
        return new PassengerFare();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link Air }
     * 
     */
    public Air createAir() {
        return new Air();
    }

    /**
     * Create an instance of {@link PricingInfo }
     * 
     */
    public PricingInfo createPricingInfo() {
        return new PricingInfo();
    }

    /**
     * Create an instance of {@link PTCs }
     * 
     */
    public PTCs createPTCs() {
        return new PTCs();
    }

    /**
     * Create an instance of {@link PTC }
     * 
     */
    public PTC createPTC() {
        return new PTC();
    }

    /**
     * Create an instance of {@link PassengerQuantity }
     * 
     */
    public PassengerQuantity createPassengerQuantity() {
        return new PassengerQuantity();
    }

    /**
     * Create an instance of {@link BasisCodes }
     * 
     */
    public BasisCodes createBasisCodes() {
        return new BasisCodes();
    }

    /**
     * Create an instance of {@link FareInfos }
     * 
     */
    public FareInfos createFareInfos() {
        return new FareInfos();
    }

    /**
     * Create an instance of {@link TicketingInfo }
     * 
     */
    public TicketingInfo createTicketingInfo() {
        return new TicketingInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Eticket")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEticket(String value) {
        return new JAXBElement<String>(_Eticket_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "terminal")
    public JAXBElement<BigInteger> createTerminal(BigInteger value) {
        return new JAXBElement<BigInteger>(_Terminal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Carrier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCarrier(String value) {
        return new JAXBElement<String>(_Carrier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DepartureDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDepartureDate(String value) {
        return new JAXBElement<String>(_DepartureDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Source")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FareReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFareReference(String value) {
        return new JAXBElement<String>(_FareReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BasisCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBasisCode(String value) {
        return new JAXBElement<String>(_BasisCode_QNAME, String.class, null, value);
    }

}
