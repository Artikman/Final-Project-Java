package com.saprika.multimodule.task2.adapter;
/**
 * Class describes model of Ticket
 * @author – Artyom Sapryka.
 */
public class Ticket {
	/**
	 * This field contains information about id
	 */
	private int id;
	/**
	 * This field contains information about price
	 */
	private int price;
	/**
	 * This field contains information about actionName
	 */
	private String actionName;
	/**
	 * This method describes logic getId
	 *
	 * @return – describe return value.
	 */
	public int getId() {
		return id;
	}
	/**
	 * This method describes logic setId
	 *
	 * @param id – name of id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * This method describes logic getPrice
	 *
	 * @return – describe return value.
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * This method describes logic setPrice
	 *
	 * @param price – name of price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * This method describes logic getActionName
	 *
	 * @return – describe return value.
	 */
	public String getActionName() {
		return actionName;
	}
	/**
	 * This method describes logic setActionName
	 *
	 * @param actionName – name of actionName
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
}