package com.saprika.multimodule.task2;

import com.saprika.multimodule.task2.abstractFactory.Special;
import com.saprika.multimodule.task2.abstractFactory.WindowManufacturingFactoryGomel;
import com.saprika.multimodule.task2.abstractFactory.WindowsFactory;
import com.saprika.multimodule.task2.abstractFactory.WindowsManufacturingFactoryMinsk;
import com.saprika.multimodule.task2.adapter.*;
import com.saprika.multimodule.task2.builder.SpecificUserBuilder;
import com.saprika.multimodule.task2.builder.User;
import com.saprika.multimodule.task2.builder.UserAccount;
import com.saprika.multimodule.task2.builder.UserBuilder;
import com.saprika.multimodule.task2.chainsOfResponsibility.*;
import com.saprika.multimodule.task2.decorator.AdditiveCafeDecorator;
import com.saprika.multimodule.task2.decorator.Cafe;
import com.saprika.multimodule.task2.decorator.Coffee;
import com.saprika.multimodule.task2.decorator.Tea;
import com.saprika.multimodule.task2.facade.Facade;
import com.saprika.multimodule.task2.memento.Bank;
import com.saprika.multimodule.task2.memento.Transaction;

import java.util.logging.Logger;

public class Runner
{
    private static final Logger logger = Logger.getLogger(String.valueOf(Runner.class));

    public static void main( String[] args ) throws InterruptedException {

        /**
         * ABSTRACT FACTORY
         */
        String factory = "Minsk";
        WindowsFactory ifactory;
        ifactory = null;

        if(factory.equals("Gomel")) {
            ifactory = new WindowManufacturingFactoryGomel();
        } else if(factory.equals("Minsk")) {
            ifactory = new WindowsManufacturingFactoryMinsk();
        }

        Special special = ifactory.getSpecialTypes();
        logger.info(special.getSpecialTypes());

        /**
         * ADAPTER
         */
        Client client = new Client();
        BookingSystem bookingSystem = new BookingSystem();
        Ticket ticket = new Ticket();

        client.book(ticket, bookingSystem);

        BookingSystemUpdated bookingSystemUpdated = new BookingSystemUpdated();
        BookingSystemUpdatedAdapter bookingSystemUpdatedAdapter = new BookingSystemUpdatedAdapter(bookingSystemUpdated);

        client.book(ticket, bookingSystemUpdatedAdapter);

        /**
         * BUILDER
         */
        UserAccount userAccount = new UserAccount();
        UserBuilder specificUserBuilder = new SpecificUserBuilder();

        userAccount.setUserBuilder(specificUserBuilder);
        userAccount.constructUser();

        User user = userAccount.getUser();
        logger.info("New user account is generated!");


        /**
         * DECORATOR
         */
        Cafe tea = new Tea();
        tea.toSubmitAnOrder();
        logger.info("\n");

        Cafe coffee = new Coffee();
        coffee.toSubmitAnOrder();
        logger.info("\n");

        Cafe additiveCafeDecorator = new AdditiveCafeDecorator(new Coffee());
        additiveCafeDecorator.toSubmitAnOrder();
        logger.info("\n");

        Tea tea1 = new Tea();
        tea1.costCalculationGreenTea();
        tea1.costCalculationBlackTea();
        logger.info("\n");

        Coffee coffee1 = new Coffee();
        coffee1.costCalculationCappuccinoCoffee();
        coffee1.costCalculationAmericanoCoffee();

        /**
         * FACADE
         */
        Facade facade = new Facade();

        facade.startOrder();

        logger.info("\n");

        /**
         * MEMENTO
         */
        Transaction transaction = new Transaction();
        Bank bank = new Bank();

        logger.info("Creating new transaction. Version 1.0");
        transaction.setVersionAndDate("Version 1.0");

        logger.info(String.valueOf(transaction));

        logger.info("Saving current version to bank...");
        bank.setSave(transaction.save());

        logger.info("Updating transaction to Version 1.1");

        logger.info("Wrong request written...");

        Thread.sleep(5000);

        transaction.setVersionAndDate("Version 1.1");

        logger.info(String.valueOf(transaction));

        logger.info("Something went wrong...");

        logger.info("Rolling back to Version 1.0");
        transaction.load(bank.getSave());

        logger.info("Transaction after rollback:");
        logger.info(String.valueOf(transaction));

        /**
         * CHAIN
         */

        ChainsOfResponsibility firstChain = new DoesTheWarehouseWork();
        ChainsOfResponsibility secondChain = new WasThereProduct();
        ChainsOfResponsibility thirdChain = new IsThereAnyPackaging();
        ChainsOfResponsibility fourthChain = new DoesTheTransponderWork();

        firstChain.warehouseInspection(secondChain);
        secondChain.warehouseInspection(thirdChain);
        thirdChain.warehouseInspection(fourthChain);

        firstChain.requestProcess(new Value(true));
        secondChain.requestProcess(new Value(false));
        thirdChain.requestProcess(new Value(false));
        fourthChain.requestProcess(new Value(true));
    }
}