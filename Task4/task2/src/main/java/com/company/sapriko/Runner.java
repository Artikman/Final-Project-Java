package com.company.sapriko;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Class describes model of mathematical operations between sets
 * @author - Artyom Sapryka
 */
public class Runner {

    private final Logger logger = Logger.getLogger(String.valueOf(Runner.class));

    private Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 4));
    private Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 2));

    public static void main(String[] args) {

        Runner runner = new Runner();

        runner.methodOfUnionSets();

        runner.methodOfIntersectionSets();

        runner.methodOfDifferenceSets();

        runner.methodOfSymmetricDifferenceSets();
    }

    //This method describes logic combining two sets together
    private void methodOfUnionSets() {
        Set<Integer> set = new HashSet<>();
        //union
        set.addAll(set1);
        set.addAll(set2);

        logger.info("union of two sets " + set);
    }

    //This method describes logic intersection of two sets
    private void methodOfIntersectionSets() {
        Set<Integer> set = new HashSet<>();
        //intersection
        for(Integer i : set1) {
            if(set2.contains(i)) {
                set.add(i);
            }
        }

        logger.info("intersection of two sets " + set);
    }

    //This method describes logic difference between two sets
    private void methodOfDifferenceSets() {
        //difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.addAll(set1);
        difference.removeAll(set2);

        logger.info("difference of two sets " + difference);
    }

    //This method describes logic symmetric difference between two sets
    private void methodOfSymmetricDifferenceSets() {
        //symmetric difference
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);

        Set<Integer> tmp = new HashSet<>(set1);
        tmp.retainAll(set2);
        symmetricDiff.removeAll(tmp);

        logger.info("symmetric difference of two sets " + symmetricDiff);
    }
}