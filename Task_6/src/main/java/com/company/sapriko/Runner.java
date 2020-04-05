package com.company.sapriko;

import JAXB.Itinerary;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.util.logging.Logger;

public class Runner {

    private static final Logger logger = Logger.getLogger(Runner.class.getName());

    private static final String XML = "src/main/resources/schema.xml";
    private static final String XML_OUT = "src/main/resources/conclusion.xml";

    public static void main(String[] args) {

        try {
            //create a Marshaller object that serializes
            JAXBContext jaxbContext = JAXBContext.newInstance(Itinerary.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            Itinerary itineraryType = (Itinerary) unmarshaller.unmarshal(new File(XML));

            logger.info(itineraryType.getAir().toString());

            //serialization itself
            marshaller.marshal(itineraryType, new FileOutputStream(XML_OUT));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}