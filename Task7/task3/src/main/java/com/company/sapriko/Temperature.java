package com.company.sapriko;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

class Temperature implements Comparable<Temperature> {

    private static final Logger logger = Logger.getLogger(String.valueOf(Temperature.class));
    private double temperature;
    private LocalDateTime dateTime;

    Temperature(double temperature, LocalDateTime dateTime) {
        this.temperature = temperature;
        this.dateTime = dateTime;
    }

    double getTemperature() {
        return temperature;
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public int compareTo(Temperature o) {
        if(temperature > o.getTemperature()) {
            return 1;
        } else
            return -1;
    }

    static String maxTemperature(List<Temperature> temperatureList) {
        Temperature temperature = temperatureList.stream().max(Comparator.comparingDouble(Temperature::getTemperature)).get();
        return "maximum temperature : " + temperature.getDateTime() + " " + temperature.getTemperature();
    }

    static String minTemperature(List<Temperature> temperatureList) {
        Temperature temperature = temperatureList.stream().min(Comparator.comparingDouble(Temperature::getTemperature)).get();
        return "minimum temperature : " + temperature.getDateTime() + " " + temperature.getTemperature();
    }

    static String averageTemperature(List<Temperature> temperatureList) {
        double temperature = temperatureList.stream().mapToDouble(Temperature::getTemperature).average().orElse(0.0);
        return "average temperature : " + " " + temperature;
    }

    static void maxAndMinAndAverageValueTemperatureEveryMonth(List<Temperature> temperatureList) {
        for (int i = 1; i < 12; i++) {
            final int count = i;
            Temperature temperature = temperatureList.stream().filter(x->x.getDateTime().getMonth().equals(Month.of(count))).max(Comparator.comparingDouble(Temperature::getTemperature)).get();
            Temperature temperature1 = temperatureList.stream().filter(x->x.getDateTime().getMonth().equals(Month.of(count))).min(Comparator.comparingDouble(Temperature::getTemperature)).get();
            double temperature2 = temperatureList.stream().filter(x->x.getDateTime().getMonth().equals(Month.of(count))).mapToDouble(Temperature::getTemperature).average().orElse(0.0);
            logger.info(temperature.getDateTime().getMonth() + " " + temperature.getTemperature() + " " + temperature1.getDateTime().getMonth() + " " + temperature1.getTemperature() + " " + temperature2);
        }
    }

    static List<LocalDateTime> localDateTimes(List<Temperature> list) {
        return list.stream().collect(new MyCollector());
    }
}