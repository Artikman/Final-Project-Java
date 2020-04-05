package com.saprika.multimodule.task2.adapter;

import java.util.logging.Logger;
/**
 * Class describes model of BookingSystemUpdated
 * - implements – names of UpdatedSystem.
 * @author – Artyom Sapryka.
 */
public class BookingSystemUpdated implements UpdatedSystem {

    private final static Logger logger = Logger.getLogger(String.valueOf(BookingSystemUpdated.class));
    /**
     * This method describes logic calculate
     *
     * @param ticketId – name of ticketId
     * @return – describe return value.
     */
    @Override
    public int calculate(int ticketId) {
        logger.info("Calculate - new booking system");
        return 0;
    }
    /**
     * This method describes logic validateTicket
     *
     * @param ticket – name of ticket
     * @return – describe return value.
     */
    @Override
    public boolean validateTicket(Ticket ticket) {
        logger.info("ValidateTicket - new booking system");
        return true;
    }
    /**
     * This method describes logic book
     *
     * @param ticket – name of ticket
     * @return – describe return value.
     */
    @Override
    public Ticket book(Ticket ticket) {
        logger.info("Book - new booking system");
        return validateTicket(ticket) ? ticket : null;
    }
}