package com.saprika.multimodule.task2.adapter;
/**
 * Class describes model of Client
 * @author – Artyom Sapryka.
 */
public class Client {
    /**
     * This method describes logic book
     *
     * @param ticket, bookingSystem – name of ticketId, bookingSystem
     */
    public void book(Ticket ticket, BookingSystems bookingSystem) {
        bookingSystem.bookTicket(ticket);
    }
}