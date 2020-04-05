package com.saprika.multimodule.task2.adapter;

import java.util.logging.Logger;
/**
 * Class describes model of BookingSystemUpdatedAdapter
 * - implements – names of BookingSystems.
 * @author – Artyom Sapryka.
 */
public class BookingSystemUpdatedAdapter implements BookingSystems {

    private final static Logger logger = Logger.getLogger(String.valueOf(BookingSystemUpdatedAdapter.class));
    /**
     * This field contains information about _bookingSystem
     */
    private BookingSystemUpdated _bookingSystem;

    public BookingSystemUpdatedAdapter(BookingSystemUpdated bookingSystem)
    {
        _bookingSystem = bookingSystem;
    }
    /**
     * This method describes logic getPrice
     *
     * @param ticketId – name of ticketId
     * @return – describe return value.
     */
    public int getPrice(int ticketId)
    {
        logger.info("Get Price - booking system adapter");
        return _bookingSystem.calculate(ticketId);
    }
    /**
     * This method describes logic validate
     *
     * @param ticket – name of ticket
     * @return – describe return value.
     */
    public boolean validate(Ticket ticket)
    {
        logger.info("Validate - booking system adapter");
        return _bookingSystem.validateTicket(ticket);
    }
    /**
     * This method describes logic bookTicket
     *
     * @param ticket – name of ticket
     * @return – describe return value.
     */
    public Ticket bookTicket(Ticket ticket)
    {
        logger.info("BookTicket - booking system adapter");
        return _bookingSystem.book(ticket);
    }
}