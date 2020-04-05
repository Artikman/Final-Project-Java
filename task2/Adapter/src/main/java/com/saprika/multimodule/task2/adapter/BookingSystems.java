package com.saprika.multimodule.task2.adapter;
/**
 * Interface describes model of BookingSystems
 * @author – Artyom Sapryka.
 */
public interface BookingSystems {
	/**
	 * This method describes logic getPrice
	 *
	 * @param ticketId – name of ticketId
	 */
	int getPrice(int ticketId);
	/**
	 * This method describes logic validate
	 *
	 * @param ticket – name of ticket
	 */
	boolean validate(Ticket ticket);
	/**
	 * This method describes logic bookTicket
	 *
	 * @param ticket – name of ticket
	 */
	Ticket bookTicket(Ticket ticket);
}