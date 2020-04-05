package com.company.sapriko;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Class describes model of testing mathematical operations between sets
 * @author - Artyom Sapryka
 */
public class RunnerTest {

    private final Logger logger = Logger.getLogger(String.valueOf(Runner.class));

    private Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 2, 4));
    private Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 6, 4, 2));

    @Test
    //This method describes logic combining two sets together
    public void methodOfUnionSets() {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>(Arrays.asList(2, 3, 4, 6));
        //union
        set.addAll(set1);
        set.addAll(set2);

        logger.info("union of two sets " + set);
        Assert.assertEquals(set, commonSet);
    }

    @Test
    //This method describes logic intersection of two sets
    public void methodOfIntersectionSets() {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>(Arrays.asList(2, 3, 4));
        //intersection
        for(Integer i : set1) {
            if(set2.contains(i)) {
                set.add(i);
            }
        }

        logger.info("intersection of two sets " + set);
        Assert.assertEquals(set, commonSet);
    }

    @Test
    //This method describes logic difference between two sets
    public void methodOfDifferenceSets() {
        //difference
        Set<Integer> difference = new HashSet<>(set1);
        HashSet<Object> commonSet = new HashSet<>(Arrays.asList());
        difference.addAll(set1);
        difference.removeAll(set2);

        logger.info("difference of two sets " + difference);
        Assert.assertEquals(difference, commonSet);
    }

    @Test
    //This method describes logic symmetric difference between two sets
    public void methodOfSymmetricDifferenceSets() {
        //symmetric difference

        Set<Integer> tmp = new HashSet<>(set1);
        tmp.retainAll(set2);

        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);
        symmetricDiff.removeAll(tmp);

        Set<Integer> commonSet = new HashSet<>(Arrays.asList(6));

        logger.info("symmetric difference of two sets: " + symmetricDiff);
        Assert.assertEquals(symmetricDiff, commonSet);
    }
}