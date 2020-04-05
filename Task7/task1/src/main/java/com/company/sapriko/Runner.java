package com.company.sapriko;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner implements MyConsumer
{

    private final static Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main( String[] args )
    {

        //1.Собрать объекты класса в коллекцию.
        Stream<Car> carStream = Stream.of(
                new Car("Ford", 2013, 30000, new int[]{5}),
                new Car("Audi", 2012, 25000, new int[]{5}),
                new Car("BMW", 2010, 27500, new int[]{5}),
                new Car("Cadillac", 2008, 27500, new int[]{5}));
        List<Car> cars = carStream.collect(Collectors.toList());
        cars.forEach(car-> logger.info("This car is " + car.getBrand() + ", year " + car.getYearModel() + ", price " + car.getPriceModel() + ", number of gears " + Arrays.toString(car.getNumberOfGears())));

        logger.info("\n");

        //2.С помощью лямбда-выражений создать компаратор: простой, сортирующий по одному полю.
        List<Car> list = new ArrayList<>();

        list.add(new Car("Ford", 2013, 30000, new int[]{5}));
        list.add(new Car("Audi", 2012, 25000, new int[]{5}));
        list.add(new Car("BMW", 2010, 27500, new int[]{5}));
        list.add(new Car("Cadillac", 2008, 27500, new int[]{5}));

        list.sort(Comparator.comparingInt(Car::getPriceModel));
        list.forEach(car -> logger.info("This car is " + car.getBrand() + ", year " + car.getYearModel() + ", price " + car.getPriceModel() + ", number of gears " + Arrays.toString(car.getNumberOfGears())));

        logger.info("\n");

        //2.1 С помощью лямбда-выражений создать компаратор: сложный, сортирующий по двум полям каскадно.
        list.sort((a, b) -> {
            if (a.getPriceModel() == b.getPriceModel()) return a.getYearModel() - b.getYearModel();
            return a.getPriceModel() - b.getPriceModel();
        });
        list.forEach(car -> logger.info("This car is " + car.getBrand() + ", year " + car.getYearModel() + ", price " + car.getPriceModel() + ", number of gears " + Arrays.toString(car.getNumberOfGears())));

        logger.info("\n");

        //3.Имплементировать не менее шести основных функциональных интерфейсов Java 8 при помощи лямбда-выражений.

        //Predicate
        Predicate<Integer> isPositive = x -> x > 0;
        logger.info(String.valueOf(isPositive.test(5)));
        logger.info(String.valueOf(isPositive.test(-7)));

        logger.info("\n");

        //UnaryOperator
        UnaryOperator<Integer> square = x -> x * x;
        logger.info(String.valueOf(square.apply(5)));

        logger.info("\n");

        //BinaryOperator
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        logger.info(String.valueOf(multiply.apply(3, 5)));

        logger.info("\n");

        //Function
        Function<Integer, String> convert = x -> x + " dollars";
        logger.info(convert.apply(5));

        logger.info("\n");

        //Consumer
        Consumer<Integer> printer = x-> logger.info(" dollars" + x);
        printer.accept(600);

        logger.info("\n");

        //Supplier
        Supplier<Car> carFactory = () -> {
            Scanner in = new Scanner(System.in);
            logger.info("Input brand: ");
            String brand = in.nextLine();
            return new Car(brand);
        };

        Car car2 = carFactory.get();
        logger.info("Name car2: " + car2.getBrand());

        logger.info("\n");

        //4.Создать свой функциональный интефейс и описать три его имплементации для независящих случаев (то есть ситуация, при которой просто изменяется какая-то деталь имплементации, не принимается).

        NumberMoreThanAnother numberMoreThanAnother = new NumberMoreThanAnother();
        numberMoreThanAnother.accept(5);

        logger.info("\n");

        SimpleNumber simpleNumber = new SimpleNumber();
        simpleNumber.accept(6);

        logger.info("\n");

        NumbersFibonachi numbersFibonachi = new NumbersFibonachi();
        numbersFibonachi.accept(4);

        logger.info("\n");

        //5.Создать один метод по умолчанию и один статический метод в вышеописанном интерфейсе. Логика, описанная в них не должна носить демонстрационный характер (типа вывода в консоль "Default method!").

        logger.info(String.valueOf(MyConsumer.add(5, 5)));

        MyConsumer myConsumer = new Runner();
        myConsumer.speedCar();
    }

    @Override
    public void accept(Integer value) {
        logger.info(String.valueOf(value));
    }
}