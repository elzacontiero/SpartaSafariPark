package com.sparta.ec.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;

public class CollectionsLabHomeworkTest {

    // Test for MakeFiveSet
    @Test
    @DisplayName("Test if the HashSet is returning 5.")
    public void testCollection5() {
        // Arrange
        int max = 5;
        // Act
        HashSet<Integer> result = CollectionsLabHomework.makeFiveSet(max);
        // Assertion
        Assertions.assertTrue(result.contains(5));
        Assertions.assertEquals(1, result.size());
    }

    @Test
    @DisplayName("Test if the HashSet is returning 10.")
    public void testCollection10() {
        int max = 10;
        HashSet<Integer> result = CollectionsLabHomework.makeFiveSet(max);
        // Test, 5, 10 and 2: proof there are only 2 elements divisible by 5.
        Assertions.assertTrue(result.contains(5));
        Assertions.assertTrue(result.contains(10));
        Assertions.assertEquals(2,result.size());

    }

    @ParameterizedTest
    @DisplayName("Test various numbers and outputs.")
    @CsvSource({
            "10,2,5;10",
            "15,3,5;10;15"
    })
    public void testMultipleValues(int max, int expectedSetSize, String expectedResult) {

        HashSet<Integer> result = CollectionsLabHomework.makeFiveSet(max);

        Assertions.assertEquals(expectedSetSize, result.size());

        for (String sNum : expectedResult.split(";")) {
            Integer num = Integer.parseInt(sNum); // convert from String to Integer.
            Assertions.assertTrue(result.contains(num));// result contains these numbers
        }
    }

    // Test for longWordList
    @ParameterizedTest
    @DisplayName("Test if words contain 5 or more letters.")
    @CsvSource({
            "Practising unit tests is really great,4,Practising;tests;really;great"
    })
    public void testLongWordList(String phrase, int expectedSize, String expectedResult){
        // var or List<String>
        var result  = CollectionsLabHomework.longWordList(phrase);

        Assertions.assertEquals(expectedSize,result.size());

        for(String w : expectedResult.split(";")) {
            Assertions.assertTrue(result.contains(w));
        }

    }

    // Test for countDigits
    @Test
    @DisplayName("Test for the number of characters in the String")
    public void testCountDigits(){
        String input = "There are 3 cats in 5 different boxes inside 1 big container";

        int result = CollectionsLabHomework.countDigits(input);

        Assertions.assertEquals(3,result);
    }

}

