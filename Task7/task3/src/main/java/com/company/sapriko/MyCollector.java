package com.company.sapriko;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

class MyCollector implements Collector<Temperature, TreeSet<Temperature>, List<LocalDateTime>> {

    @Override
    public Supplier<TreeSet<Temperature>> supplier() {
        return TreeSet::new;
    }

    @Override
    public BiConsumer<TreeSet<Temperature>, Temperature> accumulator() {
        return TreeSet::add;
    }

    @Override
    public BinaryOperator<TreeSet<Temperature>> combiner() {
        return (o1,o2)->{o1.addAll(o2);
        return o1;};
    }

    @Override
    public Function<TreeSet<Temperature>, List<LocalDateTime>> finisher() {
        return x -> {
            List<LocalDateTime> localDateTimes = new ArrayList<>();
            for (int i = 1; i <= 12; i++) {
                final int count = i;
                localDateTimes.add(x.stream().filter(y->y.getDateTime().getMonth().equals(Month.of(count))).max(Comparator.comparingDouble(Temperature::getTemperature)).get().getDateTime());
            }
            return localDateTimes;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT);
    }
}