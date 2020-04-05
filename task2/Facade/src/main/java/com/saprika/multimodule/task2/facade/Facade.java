package com.saprika.multimodule.task2.facade;
/**
 * Class describes model of Facade
 * @author – Artyom Sapryka
 */
public class Facade {
    /**
     * This field contains information about goToTheWarehouse
     */
    private GoToTheWarehouse goToTheWarehouse;
    /**
     * This field contains information about packUp
     */
    private PackUp packUp;
    /**
     * This field contains information about toDeliverToTheStore
     */
    private ToDeliverToTheStore toDeliverToTheStore;
    /**
     * This field contains information about toMakePayment
     */
    private ToMakePayment toMakePayment;
    /**
     * This field contains information about deliverToBuyer
     */
    private DeliverToBuyer deliverToBuyer;

    /**
     * constructor
     */
    public Facade() {
        goToTheWarehouse = new GoToTheWarehouse();
        packUp = new PackUp();
        toDeliverToTheStore = new ToDeliverToTheStore();
        toMakePayment = new ToMakePayment();
        deliverToBuyer = new DeliverToBuyer();
    }
    /**
     * This method describes logic startOrder
     */
    public void startOrder() {
        goToTheWarehouse.goToTheWarehouse();
        packUp.packUp();
        toDeliverToTheStore.toDeliverToTheStore();
        toMakePayment.toMakePayment();
        deliverToBuyer.deliverToBuyer();
    }
}