package com.saprika.multimodule.task2.adapter;
/**
 * Interface describes model of UpdatedSystem
 * @author – Artyom Sapryka.
 */
public interface UpdatedSystem
{
	/**
	 * This method describes logic calculate
	 *
	 * @param ticketId – name of ticketId
	 */
	int calculate(int ticketId);
	/**
	 * This method describes logic validateTicket
	 *
	 * @param ticket – name of ticket
	 */
	boolean validateTicket(Ticket ticket);
	/**
	 * This method describes logic book
	 *
	 * @param ticket – name of ticket
	 */
	Ticket book(Ticket ticket);
}