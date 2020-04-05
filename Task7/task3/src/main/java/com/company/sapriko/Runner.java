package com.company.sapriko;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Runner {

    private static final Logger logger = Logger.getLogger(String.valueOf(Runner.class));

    public static void main(String[] args) {
        Random random = new Random();
        List<Temperature> temperatureList = new ArrayList<>();

        List<LocalDateTime> localDateTimes = Stream.iterate(LocalDateTime.of(2019, 1, 1, 1,0,0), dateTime -> dateTime.plusDays(1))
                .limit(365).collect(Collectors.toList());
        localDateTimes.forEach(x->temperatureList.add(new Temperature((-30) + (35 - (-30)) * random.nextDouble(), x)));

        logger.info(Temperature.maxTemperature(temperatureList));
        logger.info(Temperature.minTemperature(temperatureList));
        logger.info(Temperature.averageTemperature(temperatureList));

        Temperature.maxAndMinAndAverageValueTemperatureEveryMonth(temperatureList);
        Temperature.localDateTimes(temperatureList).forEach(x->logger.info(x.toString()));
        Temperature.localDateTimes(temperatureList).stream().parallel().forEachOrdered(x->logger.info(x.toString()));
    }
}