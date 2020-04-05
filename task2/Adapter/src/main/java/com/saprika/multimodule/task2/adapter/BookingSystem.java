package com.saprika.multimodule.task2.adapter;

import java.util.logging.Logger;
/**
 * Class describes model of BookingSystem
 * - implements – names of BookingSystems.
 * @author – Artyom Sapryka.
 */
public class BookingSystem implements BookingSystems {

    private final static Logger logger = Logger.getLogger(String.valueOf(BookingSystem.class));
    /**
     * This method describes logic getPrice
     *
     * @param ticketId – name of ticketId
     * @return – describe return value.
     */
    @Override
    public int getPrice(int ticketId) {
        logger.info("Get Price - default booking system");
        return 0;
    }
    /**
     * This method describes logic validate
     *
     * @param ticket – name of ticket
     * @return – describe return value.
     */
    @Override
    public boolean validate(Ticket ticket) {
        logger.info("Validate - default booking system");
        return true;
    }
    /**
     * This method describes logic bookTicket
     *
     * @param ticket – name of ticket
     * @return – describe return value.
     */
    @Override
    public Ticket bookTicket(Ticket ticket) {
        logger.info("BookTicket - default booking system");
        return validate(ticket) ? ticket : null;
    }
}