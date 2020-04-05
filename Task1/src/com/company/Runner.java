package com.company;

import com.company.composition.Aviation;
import com.company.heirClasses.Airship;

public class Runner {

    public static void main(String[] args) {

        Airship airship = new Airship("Airship", 5000, 100);

        airship.flight();
        airship.calculationOfTheLiftingForceOfTheWing();
        airship.landing();
        System.out.println(airship.toString());

        Aviation aviation = new Aviation();

        aviation.on();
        aviation.job();
        aviation.off();
    }
}